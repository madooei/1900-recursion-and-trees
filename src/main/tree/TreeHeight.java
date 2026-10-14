package tree;

/** Measuring the height of a binary tree. */
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
}
