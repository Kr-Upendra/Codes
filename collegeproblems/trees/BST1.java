package collegeproblems.trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BST1 {
    static final Scanner sc = new Scanner(System.in);
    public static Node insert(Node root, int key) {
        var node = new Node(key);
        if (root == null) return node;
        if (key < root.data) root.left = insert(root.left, key);
        if (key > root.data) root.right = insert(root.right, key);
        return root;
    }

    public static Node createBST(int[] keys) {
        Node root = null;
        for (int key : keys)
            root = insert(root, key);
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preorderIterative(Node root) {
        if (root == null) return;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            var current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    public static void inorderIterative(Node root) {
        if (root == null) return;
        Stack<Node> queue = new Stack<>();
        var current = root;
        while (!queue.isEmpty() || current != null) {
            if (current != null) {
                queue.push(current);
                current = current.left;
            } else {
                current = queue.pop();
                System.out.print(current.data + " ");
                current = current.right;
            }
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }
        Node root = createBST(values);
        System.out.println("Binary search tree traversal");
        preorder(root);
        System.out.println("\nBinary search tree preorder iterative traversal");
        preorderIterative(root);
        System.out.println("\nBinary search tree inorder iterative traversal");
        inorderIterative(root);
        System.out.println("\nBinary search tree inorder traversal");
        inorder(root);
    }
}
