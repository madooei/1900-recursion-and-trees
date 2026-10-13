package tree;

/**
 * A node in a binary tree. A null reference is the empty tree.
 *
 * @param <T> the type of value held in the node.
 */
class Node<T> {
  T value;
  Node<T> left;
  Node<T> right;

  Node(T value) {
    this.value = value;
  }
}
