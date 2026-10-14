package tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Tests for the depth of a node in a binary tree. */
public class TreeDepthTest {

  @Test
  public void emptyTreeDoesNotContainTarget() {
    Node<Integer> target = new Node<>(7);
    assertEquals(-1, TreeDepth.depth(null, target));
  }

  @Test
  public void singleLeafHasDepthZero() {
    Node<Integer> leaf = new Node<>(7);
    assertEquals(0, TreeDepth.depth(leaf, leaf));
  }

  @Test
  public void rootHasDepthZero() {
    Node<Integer> root = smallTree();
    assertEquals(0, TreeDepth.depth(root, root));
  }

  @Test
  public void leftChildHasDepthOne() {
    Node<Integer> root = smallTree();
    assertEquals(1, TreeDepth.depth(root, root.left));
  }

  @Test
  public void rightChildHasDepthOne() {
    Node<Integer> root = smallTree();
    assertEquals(1, TreeDepth.depth(root, root.right));
  }

  @Test
  public void deepestNodeHasDepthTwo() {
    Node<Integer> root = smallTree();
    assertEquals(2, TreeDepth.depth(root, root.left.left));
  }

  @Test
  public void depthOfSubtreeRootIsMeasuredFromThatNode() {
    Node<Integer> root = smallTree();
    assertEquals(1, TreeDepth.depth(root.left, root.left.left));
  }

  @Test
  public void nodeNotInTreeHasDepthNegativeOne() {
    Node<Integer> other = new Node<>(42);
    assertEquals(-1, TreeDepth.depth(smallTree(), other));
  }

  @Test
  public void nodeWithSameValueIsNotTarget() {
    Node<Integer> copy = new Node<>(8);
    assertEquals(-1, TreeDepth.depth(smallTree(), copy));
  }

  @Test
  public void depthFindsNodeDeepInLeftSubtree() {
    Node<Integer> root = largeTree();
    assertEquals(3, TreeDepth.depth(root, root.left.left.left));
  }

  @Test
  public void depthFindsNodeDeepInRightSubtree() {
    Node<Integer> root = largeTree();
    assertEquals(3, TreeDepth.depth(root, root.right.right.right));
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
