package demo;

import list.List;
import tree.Node;
import tree.Traversals;

/** A demo of the three depth-first traversals on the chapter's nine-node tree. */
public final class TraversalsDemo {

  private TraversalsDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    Node<Integer> root = buildTree();

    // Expect 5 8 9 6 1 2 4 7 3.
    System.out.print("pre-order:  ");
    printAll(Traversals.preOrder(root));

    // Expect 6 9 8 1 5 4 2 7 3.
    System.out.print("in-order:   ");
    printAll(Traversals.inOrder(root));

    // Expect 6 9 1 8 4 3 7 2 5.
    System.out.print("post-order: ");
    printAll(Traversals.postOrder(root));
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
