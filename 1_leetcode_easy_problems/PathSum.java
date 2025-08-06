
class PathSum {
  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null)
      return false;
    if (root.val == targetSum && isLeaf(root))
      return true;
    int newTargetSum = targetSum - root.val;
    return hasPathSum(root.left, newTargetSum) ||
        hasPathSum(root.right, newTargetSum);
  }

  private boolean isLeaf(TreeNode node) {
    return node != null && node.left == null
        && node.right == null;
  }
}