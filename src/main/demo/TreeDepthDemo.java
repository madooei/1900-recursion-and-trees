package demo;

import tree.Node;
import tree.TreeDepth;

/** A demo of TreeDepth on the chapter's nine-node tree. */
public final class TreeDepthDemo {

  private TreeDepthDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    // Build the nine-node tree from the chapter, node by node.
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

    Node<Integer> root = five;

    // The path from the root, 5 to 2 to 7 to 3, has 3 edges. Expect 3.
    System.out.println("depth of 3: " + TreeDepth.depth(root, three));
  }
}
