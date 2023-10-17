package HardThirty;

import java.util.*;

// import org.w3c.dom.Node;

public class Trees {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTrees {
        static int index = -1;

        public static node buildTrees(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            node newNodes = new node(nodes[index]);
            newNodes.left = buildTrees(nodes);
            newNodes.right = buildTrees(nodes);
            return newNodes;

        }
    }

    public static void preorder(node root) {
        // root left right
        if (root == null) {
            return;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(node root) {
        // left root right

        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }

    public static void postorder(node root) {
        // left right root

        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }

    public static void levelOrder(node root) {
        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }

            }
        }
    }

    public static int countOfNodes(node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = countOfNodes(root.left);
        int rightSum = countOfNodes(root.right);
        return leftSum + rightSum + 1;
    }

    public static int sumOfNodes(node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;

    }

    public static int heightOfTree(node root) {

        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;

    }

    public static int treeDiameter(node root) {
        if (root == null) {
            return 0;
        }
        int leftDiameter = treeDiameter(root.left);
        int rightDiameter = treeDiameter(root.right);
        int totDiameter = heightOfTree(root.left) + heightOfTree(root.right) +1;

        return Math.max(totDiameter, Math.max(leftDiameter, rightDiameter));
    }
    
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTrees bt = new BinaryTrees();
        node root = bt.buildTrees(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrder(root);
        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(heightOfTree(root));
        System.out.println(treeDiameter(root));

    }
}
