class MyQueue {
    private Stack<Integer> s;
    private Stack<Integer> helper;
    
    public MyQueue() {
        this.s = new Stack<>();
        this.helper = new Stack();
    }
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        if(!helper.isEmpty()){
            int ele = helper.pop();
            return ele;
        } else {
            while(!s.isEmpty()){
                helper.push(s.pop());
            }
            return helper.pop();
        }
    }
    
    public int peek() {
        if (!helper.isEmpty()) {
            return helper.peek(); 
        } else {
            while (!s.isEmpty()) {
                helper.push(s.pop()); 
            }
            return helper.peek();
        }
    }
    
    public boolean empty() {
        if(s.isEmpty() && helper.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
}


// class MyQueue {
    
//     private Stack<Integer> s1;
//     private Stack<Integer> helper;
//     private int front;
    
//     public MyQueue() {
//         this.s1 = new Stack<>();
//         this.helper = new Stack<>();
//     }
    
//     public void push(int x) {
//         if(s1.empty()){
//             front = x;
//         }
//         while(!s1.isEmpty()){
//             helper.push(s1.pop());
//         }
//         helper.push(x);
        
//         while(!helper.isEmpty()){
//             s1.push(helper.pop());
//         }
//     }
    
//     public int pop() {
//        int res = s1.pop();
//         if (!s1.empty())
//             front = s1.peek();
//         return res; 
//     }
    
//     public int peek() {
//         return front;
//     }
    
//     public boolean empty() {
//         return s1.isEmpty();
//     }
// }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */