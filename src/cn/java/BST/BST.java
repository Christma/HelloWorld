package cn.java.BST;


import java.util.LinkedList;
import java.util.Queue;

public class BST<E extends Comparable<E>> {

    private class Node {
        public E e;
        public Node left, right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E e) {
        if (root == null) {
            root = new Node(e);
            return;
        } else {
            add(root, e);
        }
    }

    private void add(Node node, E e) {

        if (e.equals(node.e)) {
            return;
        } else if (e.compareTo(node.e) < 0 && node.left == null) {
            node.left = new Node(e);
            return;
        } else if (e.compareTo(node.e) > 0 && node.right == null) {
            node.right = new Node(e);
        }

        if (e.compareTo(node.e) < 0) {
            add(node.left, e);
        } else {
            add(node.right, e);
        }
    }

    public void add1(E e) {
        add1(root, e);
    }

    private Node add1(Node node, E e) {

        if (node == null) {
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0) {
            node.left = add1(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add1(node.right, e);
        }

        return node;
    }

    public void add2(E e) {
        if (root == null) {
            root = new Node(e);
            return;
        }

        Node p = root;
        while (p != null) {
            if (e.compareTo(p.e) < 0) {
                if (p.left == null) {
                    p.left = new Node(e);
                    size++;
                    return;
                }
                p = p.left;
                return;
            } else if (e.compareTo(p.e) > 0) {
                if (p.right == null) {
                    p.right = new Node(e);
                    size++;
                    return;
                }
                p = p.right;
                return;

            } else {
                return;
            }

        }

    }


    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(Node root, E e) {
        if (root == null) {
            return false;
        }
        if (e.compareTo(root.e) == 0) {
            return true;
        } else if (e.compareTo(root.e) < 0) {
            return contains(root.left, e);
        } else {
            return contains(root.right, e);
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.println(node.e);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    public E minimum() {
        if (size == 0) {
            throw new IllegalArgumentException("BST is empty!!");
        }
        return minimum(root).e;
    }

    private Node minimum(Node root) {
        if (root.left == null) {
            return root;
        }
        return minimum(root.left);
    }


    public E maximum() {
        if (size == 0) {
            throw new IllegalArgumentException("BST is empty!!");
        }
        return maximum(root).e;
    }

    private Node maximum(Node root) {
        if (root.right == null) {
            return root;
        }
        return maximum(root.right);
    }


    public Node removeMin() {
        if (size == 0) {
            throw new IllegalArgumentException("BST is empty!!");
        }
        return removeMin(root);
    }

    private Node removeMin(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }
}
