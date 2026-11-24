# Recursion and Trees

The companion code for the Recursion and Trees chapter: the generic `Node<T>` class, a plain binary-tree node holding a value and references to a left and a right child, and the recursive algorithms the chapter develops over it. These are counting nodes, measuring height, measuring the depth of a node, the three depth-first traversals, and the queue-based level-order traversal. Each has a JUnit suite.

## Prerequisites

- JDK 17+ (JUnit 6 requires it).
- The JUnit jar is already vendored in `lib/`; there is nothing to download.

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  lib/
    junit-platform-console-standalone-6.1.0.jar
  src/
    main/
      tree/
        Node.java                       # a value, a left child, a right child
        TreeSize.java                   # recursive node count
        TreeHeight.java                 # recursive height (edges)
        TreeDepth.java                  # recursive depth of a node (edges)
        Traversals.java                 # pre-, in-, and post-order (recursive)
        LevelOrder.java                 # level-order with a queue
      queue/
        Queue.java                      # the Queue ADT from the queue chapter
        LinkedQueue.java                # the linked implementation LevelOrder uses
      list/
        List.java                       # the List ADT from the list ADT chapter
        ArrayList.java                  # the array implementation the traversals return
      demo/                             # one demo per solution class, on the sample tree
        TreeSizeDemo.java
        TreeHeightDemo.java
        TreeDepthDemo.java
        TraversalsDemo.java
        LevelOrderDemo.java
    test/
      tree/
        TreeSizeTest.java
        TreeHeightTest.java
        TreeDepthTest.java
        TraversalsTest.java
        LevelOrderTest.java
  scripts/
    run.sh                              # compile and run one demo
    test.sh                             # compile and run the JUnit tests
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite.
- `scripts/test.sh tree.TreeSizeTest` — compiles everything and runs only that test class. Use this while you are working on one class and the others are still empty.
- `scripts/run.sh demo.TreeSizeDemo` — compiles everything and runs that one demo. Every class you implement has its own demo, `<Class>Demo`.

## What's here

- `tree.Node<T>` — a binary-tree node: a value and references to its left and right subtrees, with `null` as the empty tree. There is no tree class; every operation is a static recursive method that takes a root node.
- `tree.TreeSize` — `size`, the recursive count of the nodes in a tree.
- `tree.TreeHeight` — `height`, measured in edges.
- `tree.TreeDepth` — `depth`, the number of edges from a node down to a target node. Call it as `depth(root, target)`. It returns `-1` if the target is not in the tree.
- `tree.Traversals` — the recursive pre-order, in-order, and post-order traversals. The notes' traversals print each value; these add each value to a list and return it, so the tests can check the order.
- `tree.LevelOrder` — the level-order traversal, which uses a queue instead of recursion.
- `queue.Queue<T>` and `queue.LinkedQueue<T>` — the Queue ADT and its linked implementation from the queue chapter, included so this code compiles and runs on its own.
- `list.List<T>` and `list.ArrayList<T>` — the List ADT and its array implementation from the list ADT chapter, included for the same reason.
- `demo.TreeSizeDemo`, `demo.TreeHeightDemo`, `demo.TreeDepthDemo`, `demo.TraversalsDemo`, and `demo.LevelOrderDemo` — one demo per solution class, each building the sample tree and running that one class on it.
