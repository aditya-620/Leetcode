/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    //Approach-1 : T.C.:O(n) & S.C.:O(n)

    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     ArrayList<TreeNode> path1 = new ArrayList<>();
    //     ArrayList<TreeNode> path2 = new ArrayList<>();
            
    //     getPath(root, p.val, path1);
    //     getPath(root, q.val, path2);
            
    //     //lca
    //     int i=0;
    //     for(; i<path1.size() && i<path2.size(); i++){
    //         if(path1.get(i) != path2.get(i)){
    //             break;
    //         }
    //     }
    //     TreeNode lca = path1.get(i-1);
    //     return lca;
    // }

    // public static boolean getPath(TreeNode root, int n, ArrayList<TreeNode> path){
    //     if(root == null){
    //         return false;
    //     }

    //     path.add(root);
    //     if(root.val == n){
    //         return true;
    //     }

    //     boolean foundLeft = getPath(root.left, n, path);
    //     boolean foundRight = getPath(root.right, n, path);

    //     if(foundLeft || foundRight){
    //         return true;
    //     }

    //     path.remove(path.size()-1);

    //     return false;
    // }


    //APPROACH-2 : T.C.:O(n) & S.C.:O(1)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }

        TreeNode leftLca = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLca = lowestCommonAncestor(root.right, p , q);

        if(rightLca == null){
            return leftLca;
        }
        if(leftLca == null){
            return rightLca;
        }

        return root;
    }
}