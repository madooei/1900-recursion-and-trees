package tree;

import list.ArrayList;
import list.List;

/** The three depth-first traversals of a binary tree. */
public final class Traversals {

  private Traversals() {
    // This class should not be instantiated!
  }

  // Adds the values of the tree rooted at node to result, in pre-order.
  private static <T> void preOrder(Node<T> node, List<T> result) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Returns the values of the tree rooted at root in pre-order. Returns an
  // empty list if root is null.
  public static <T> List<T> preOrder(Node<T> root) {
    List<T> result = new ArrayList<>();
    preOrder(root, result);
    return result;
  }

  // Adds the values of the tree rooted at node to result, in in-order.
  private static <T> void inOrder(Node<T> node, List<T> result) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Returns the values of the tree rooted at root in in-order. Returns an
  // empty list if root is null.
  public static <T> List<T> inOrder(Node<T> root) {
    List<T> result = new ArrayList<>();
    inOrder(root, result);
    return result;
  }

  // Adds the values of the tree rooted at node to result, in post-order.
  private static <T> void postOrder(Node<T> node, List<T> result) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Returns the values of the tree rooted at root in post-order. Returns an
  // empty list if root is null.
  public static <T> List<T> postOrder(Node<T> root) {
    List<T> result = new ArrayList<>();
    postOrder(root, result);
    return result;
  }
}
