//using height and level

class Solution {
    int height;
    int ans;
    public int findBottomLeftValue(TreeNode root) {
        height = -1;
        ans = -1;
        solve(root,0);
        return ans;
    }
    void solve(TreeNode root,int level) {
        if(root == null) return;
        if(level > height) {
            height = level;
            ans = root.val;
        }

        solve(root.left,level+1);
        solve(root.right,level+1);
    }
}
