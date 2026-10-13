package tree;

import list.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Tests for the three depth-first traversals of a binary tree. */
public class TraversalsTest {

  @Test
  public void preOrderOfEmptyTreeGivesEmptyList() {
    List<Integer> result = Traversals.preOrder(null);
    assertEquals(0, result.size());
  }

  @Test
  public void inOrderOfEmptyTreeGivesEmptyList() {
    List<Integer> result = Traversals.inOrder(null);
    assertEquals(0, result.size());
  }

  @Test
  public void postOrderOfEmptyTreeGivesEmptyList() {
    List<Integer> result = Traversals.postOrder(null);
    assertEquals(0, result.size());
  }

  @Test
  public void preOrderVisitsNodeBeforeSubtrees() {
    assertContents(new Integer[] {3, 5, 1, 8},
        Traversals.preOrder(smallTree()));
  }

  @Test
  public void inOrderVisitsNodeBetweenSubtrees() {
    assertContents(new Integer[] {1, 5, 3, 8},
        Traversals.inOrder(smallTree()));
  }

  @Test
  public void postOrderVisitsNodeAfterSubtrees() {
    assertContents(new Integer[] {1, 5, 8, 3},
        Traversals.postOrder(smallTree()));
  }

  @Test
  public void preOrderHandlesNodesWithOneChild() {
    assertContents(new Integer[] {5, 8, 9, 6, 1, 2, 4, 7, 3},
        Traversals.preOrder(largeTree()));
  }

  @Test
  public void inOrderHandlesNodesWithOneChild() {
    assertContents(new Integer[] {6, 9, 8, 1, 5, 4, 2, 7, 3},
        Traversals.inOrder(largeTree()));
  }

  @Test
  public void postOrderHandlesNodesWithOneChild() {
    assertContents(new Integer[] {6, 9, 1, 8, 4, 3, 7, 2, 5},
        Traversals.postOrder(largeTree()));
  }

  private static void assertContents(Integer[] expected, List<Integer> actual) {
    assertEquals(expected.length, actual.size());
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual.get(i));
    }
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
