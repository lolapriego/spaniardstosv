/*
  class Node
    int data;
    Node left;
    Node right;
*/
static int height(Node root) {
      if (root == null) return 0;
      return Math.max(heightRecursive(root.right), heightRecursive(root.left));
  }

  static int heightRecursive(Node root) {
      if (root == null) return 0; // TODO: case 1.
      return Math.max(height(root.right), height(root.left)) + 1;
  }
