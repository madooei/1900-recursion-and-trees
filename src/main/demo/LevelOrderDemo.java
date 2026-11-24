package demo;

import list.List;
import tree.LevelOrder;
import tree.Node;

/** A demo of LevelOrder on the chapter's nine-node tree. */
public final class LevelOrderDemo {

  private LevelOrderDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    Node<Integer> root = buildTree();

    // One level at a time, left to right. Expect 5 8 2 9 1 4 7 6 3.
    System.out.print("level-order: ");
    printAll(LevelOrder.levelOrder(root));
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

  // Prints the values on one line, separated by spaces.
  private static void printAll(List<Integer> values) {
    for (int i = 0; i < values.size(); i++) {
      System.out.print(values.get(i) + " ");
    }
    System.out.println();
  }
}
