class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack=new Stack<Character>();
       for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }
            else if(c=='{'){
               stack.push('}');
            }
            else if(c=='['){
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop()!=c){
                return false;
            }
       }
       return stack.isEmpty();
    }
}


// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();

//         for (int i = 0; i < s.length(); i++) {
//             char cur = s.charAt(i);
//             if (!stack.isEmpty()) {
//                 char last = stack.peek();
//                 if (isPair(last, cur)) {
//                     stack.pop();
//                     continue;
//                 }
//             }
//             stack.push(cur);
//         }

//         return stack.isEmpty();        
//     }

//     private aboolean isPair(char last, char cur) {
//         return (last == '(' && cur == ')') ||
//                (last == '{' && cur == '}') ||
//                (last == '[' && cur == ']');
//     }    
// }