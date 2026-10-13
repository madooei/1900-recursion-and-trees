package tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Tests for counting the nodes in a binary tree. */
public class TreeSizeTest {

  @Test
  public void emptyTreeHasSizeZero() {
    assertEquals(0, TreeSize.size(null));
  }

  @Test
  public void singleLeafHasSizeOne() {
    Node<Integer> leaf = new Node<>(7);
    assertEquals(1, TreeSize.size(leaf));
  }

  @Test
  public void sizeCountsNodesInBothSubtrees() {
    assertEquals(4, TreeSize.size(smallTree()));
  }

  @Test
  public void sizeCountsNodesWithOneChild() {
    assertEquals(9, TreeSize.size(largeTree()));
  }

  // The four-node tree: 3 has left child 5 and right child 8; 5 has left child 1.
  private static Node<Integer> smallTree() {
    Node<Integer> root = new Node<>(3);
    Node<Integer> five = new Node<>(5);
    Node<Integer> eight = new Node<>(8);
    Node<Integer> one = new Node<>(1);
    root.left = five;
    root.right = eight;
    five.left = one;
    return root;
  }

  // The nine-node tree: 5 has children 8 and 2; 8 has children 9 and 1; 2 has
  // children 4 and 7; 9 has only a left child 6; 7 has only a right child 3.
  private static Node<Integer> largeTree() {
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
