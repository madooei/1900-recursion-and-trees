package tree;

import list.ArrayList;
import list.List;
import queue.LinkedQueue;
import queue.Queue;

/** Level-order traversal of a binary tree. */
public final class LevelOrder {

  private LevelOrder() {
    // This class should not be instantiated!
  }

  // Returns the values of the tree rooted at root level by level, from the
  // root down, each level from left to right. Returns an empty list if root
  // is null.
  public static <T> List<T> levelOrder(Node<T> root) {
    List<T> result = new ArrayList<>();
    if (root == null) {
      return result;  // an empty tree has nothing to visit
    }
    Queue<Node<T>> queue = new LinkedQueue<>();
    queue.enqueue(root);                 // start with the root waiting
    while (!queue.isEmpty()) {
      Node<T> node = queue.front();      // the oldest node waiting
      queue.dequeue();                   // remove it from the front
      result.add(node.value);            // visit
      if (node.left != null) {
        queue.enqueue(node.left);        // enqueue the children at the back
      }
      if (node.right != null) {
        queue.enqueue(node.right);
      }
    }
    return result;
  }
}
