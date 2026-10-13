package tree;

/** Measuring the height of a binary tree and the depth of a node in it. */
public final class TreeHeight {

  private TreeHeight() {
    // This class should not be instantiated!
  }

  // Counts edges, so a leaf has height 0 and the empty tree has height -1.
  public static <T> int height(Node<T> node) {
    if (node == null) {
      return -1;  // base case: an empty tree has height -1
    }
    return 1 + Math.max(height(node.left), height(node.right));
  }

  // Returns the number of edges from the root down to target, where nodeDepth
  // is the depth of node. Call it as depth(root, target, 0). Returns -1 if
  // target is not in the tree.
  public static <T> int depth(Node<T> node, Node<T> target, int nodeDepth) {
    if (node == null) {
      return -1;  // this branch does not contain the target
    }
    if (node == target) {
      return nodeDepth;  // found it: nodeDepth edges down from the root
    }
    int left = depth(node.left, target, nodeDepth + 1);  // carry the count one step down
    if (left != -1) {
      return left;
    }
    return depth(node.right, target, nodeDepth + 1);
  }
}
