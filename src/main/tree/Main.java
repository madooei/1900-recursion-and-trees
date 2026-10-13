package tree;

import list.List;

/** A demo that builds the chapter's nine-node tree and runs every operation on it. */
public final class Main {

  private Main() {
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

    // Link the nodes through their left and right references.
    five.left = eight;
    five.right = two;
    eight.left = nine;
    eight.right = one;
    two.left = four;
    two.right = seven;
    nine.left = six;
    seven.right = three;

    Node<Integer> root = five;

    // Measurements.
    System.out.println("size:   " + TreeSize.size(root)); // expect 9
    System.out.println("height: " + TreeHeight.height(root)); // expect 3

    System.out.print("pre-order:   ");
    printAll(Traversals.preOrder(root));
    System.out.print("in-order:    ");
    printAll(Traversals.inOrder(root));
    System.out.print("post-order:  ");
    printAll(Traversals.postOrder(root));
    System.out.print("level-order: ");
    printAll(LevelOrder.levelOrder(root));
  }

  // Prints the values on one line, separated by spaces.
  private static void printAll(List<Integer> values) {
    for (int i = 0; i < values.size(); i++) {
      System.out.print(values.get(i) + " ");
    }
    System.out.println();
  }
}
