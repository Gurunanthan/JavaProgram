package HardThirty;

import java.util.*;

public class BinarySearchTree {
    static class node {
        private int data;
        private node left;
        private node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static node buildBST(node root, int values) {

        node currNode = new node(values);
        if (root == null) {
            root = currNode;
        } else if (values > root.data) {
            root.right = buildBST(root.right, values);
        } else {
            root.left = buildBST(root.left, values);
        }

        return root;
    }

    public static void inOrder(node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static boolean binaryTreeSearch(node root, int key) {
        boolean result = true;
        if (root == null) {
            result = false;
        }
        if (root.data > key) {
            binaryTreeSearch(root.left, key);
        } else if (root.data == key) {
            result = true;
        } else {

            binaryTreeSearch(root.right, key);
        }
        return result;
    }

    public static node deleteNodeFromTree(node root, int val) {
        if (root.data > val) {
            root.left = deleteNodeFromTree(root.left, val);
        } else if (root.data < val) {
            root.right = deleteNodeFromTree(root.right, val);
        } else {
            if (root.right == null && root.left == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                node successor = inorderSuccessor(root.right);
                root.data = successor.data;
                root.right = deleteNodeFromTree(root.right, successor.data);
            }
        }
        return root;

    }

    public static node inorderSuccessor(node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    
    public static void printpath(ArrayList<Integer> path)
    
    {
        for (int i = 0; i < path.size(); i++) {

            System.out.print(path.get(i));
        }
        
    }
    
    public static void rootpath(node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printpath(path);
            System.out.println();
        } else {
            rootpath(root.left, path);
            rootpath(root.right, path);
        }
        path.remove(path.size() - 1);
    }
    public static void main(String[] args) {
        int[] nodes = { 5, 1, 3, 4, 2, 6, 7 };
        node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = buildBST(root, nodes[i]);
        }
        inOrder(root);
        System.out.println();
        System.out.println(binaryTreeSearch(root, 6));
        // deleteNodeFromTree(root, 5);
        System.out.println();
        inOrder(root.left);
        ArrayList <Integer> path = new ArrayList<>();
        System.out.println();
        rootpath(root,path);
    }
}
