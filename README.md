# Binary Search Tree (BST) Implementation

## Task 3: Binary Search Tree (BST) Implementation

**Level:** 3 (Advanced)  
**Language:** Java  
**Type:** Console-Based Application

## Project Description

This project implements a Binary Search Tree (BST) in Java. The application allows users to insert, delete, and search for values. It also supports in-order, pre-order, and post-order tree traversals through a menu-driven console interface.

## Objectives

- Create a `TreeNode` class to represent tree nodes.
- Insert values into a Binary Search Tree.
- Delete nodes from the tree.
- Search for a specific value.
- Perform in-order, pre-order, and post-order traversals.
- Practice recursion and data structure concepts in Java.

## Features

- Insert values into the BST.
- Prevent duplicate values.
- Delete a value from the tree.
- Search for a value.
- Display in-order traversal.
- Display pre-order traversal.
- Display post-order traversal.
- Show messages when values are not found.
- Interactive menu-driven program.

## Technologies Used

- **Programming Language:** Java
- **Input:** `Scanner`
- **Application Type:** Console Application
- **IDE:** Visual Studio Code or any Java-supported IDE

## Java Concepts Used

- Classes and Objects
- Constructors
- Binary Search Tree
- Nodes and References
- Recursion
- Conditional Statements
- Switch Statement
- Do-While Loop
- Tree Traversal
- Searching and Deletion

## Binary Search Tree Rule

- Smaller values are stored in the left subtree.
- Greater values are stored in the right subtree.
- Duplicate values are not allowed.

## Tree Traversals

### In-Order

```text
Left Subtree → Root → Right Subtree
```

In-order traversal displays BST values in sorted order.

### Pre-Order

```text
Root → Left Subtree → Right Subtree
```

### Post-Order

```text
Left Subtree → Right Subtree → Root
```

## Application Menu

```text
===== BINARY SEARCH TREE =====
1. Add Value
2. Remove Value
3. Find Value
4. Inorder Traversal
5. Preorder Traversal
6. Postorder Traversal
7. Exit
```

## How to Run

Save the Java file as:

```text
BSTProgram.java
```

Compile the program:

```bash
javac BSTProgram.java
```

Run the program:

```bash
java BSTProgram
```

## Deletion Cases

The program handles three deletion cases:

1. **Leaf Node:** A node without children is removed.
2. **One Child:** The node is replaced by its child.
3. **Two Children:** The node is replaced with the smallest value from its right subtree.

## Time Complexity

- Average insertion, searching, and deletion: `O(log n)`
- Worst-case insertion, searching, and deletion: `O(n)`
- Tree traversal: `O(n)`

## Learning Outcomes

After completing this project, the learner will understand Binary Search Trees, recursion, node connections, insertion, searching, deletion, and tree traversal methods.
