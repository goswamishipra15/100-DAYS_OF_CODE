//Problem Statment URL: https://leetcode.com/problems/leaf-similar-trees/description/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
    if (root1 == null || root2 == null) return false;
    List<TreeNode> l1 = leafSeq(root1);
    List<TreeNode> l2 = leafSeq(root2);
    if (l1.size() != l2.size()) return false;
    for (int i = 0; i < l1.size(); i++) {
      if (l1.get(i).val != l2.get(i).val) return false;
    }
    return true;
  }
  private List<TreeNode> leafSeq(TreeNode root) {
    List<TreeNode> res = new ArrayList<>();
    if (root == null) return res;
    if (root.left == null && root.right == null) {
      res.add(root);
      return res;
    }
    res.addAll(leafSeq(root.left));
    res.addAll(leafSeq(root.right));
    return res;
        
    }
}
