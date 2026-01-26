/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package submission6;

public class BST {

    class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
        }
    }

    Node root;

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null)
            return new Node(key);

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.key == key)
            return true;

        return key < root.key
                ? search(root.left, key)
                : search(root.right, key);
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    // MAIN
    public static void main(String[] args) {
        BST tree = new BST();

        int[] values = { 50, 30, 20, 40, 70, 60, 80 };
        for (int v : values)
            tree.insert(v);

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);

        System.out.println("\nSearch 40: " + tree.search(tree.root, 40));
        System.out.println("Search 90: " + tree.search(tree.root, 90));
    }
}
