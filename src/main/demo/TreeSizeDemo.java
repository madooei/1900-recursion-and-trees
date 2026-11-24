package demo;

import tree.Node;
import tree.TreeSize;

/** A demo of TreeSize on the chapter's nine-node tree. */
public final class TreeSizeDemo {

  private TreeSizeDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    Node<Integer> root = buildTree();

    // The tree has nine nodes. Expect 9.
    System.out.println("size: " + TreeSize.size(root));
  }

  // Builds the nine-node tree from the chapter and returns its root.
  private static Node<Integer> buildTree() {
    Node<Integer> five = new Node<>(5);
    Node<Integer> eight = new Node<>(8);
    Node<Integer> two = new Node<>(2);
    Node<Integer> nine = new Node<>(9);
    Node<Integer> one = new Node<>(1);
    Node<Integer> four = new Node<>(4);
    Node<Integer> seven = new Node<>(7);
    Node<Integer> six = new Node<>(6);
    Node<Integer> three = new Node<>(3);

    five.left = eight;
    five.right = two;
    eight.left = nine;
    eight.right = one;
    two.left = four;
    two.right = seven;
    nine.left = six;
    seven.right = three;
    return five;
  }
}
