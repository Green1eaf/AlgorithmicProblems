package leetcode.theory;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree2 {
    public static void main(String[] args) {
        Tree root = new Tree(20,
                new Tree(7,
                        new Tree(4, null, new Tree(6)), new Tree(9)),
                new Tree(35,
                        new Tree(31, new Tree(28), null),
                        new Tree(40, new Tree(38), new Tree(52))));

        System.out.println("Сумма дерева равна: " + sumWide(root));
    }

    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }
    }

    public static int sumRecursive(Tree root) {
        int sum = root.value;

        if (root.left != null) {
            sum += sumRecursive(root.left);
        }

        if (root.right != null) {
            sum += sumRecursive(root.right);
        }
        return sum;
    }

    public static int sumDeep(Tree root) {
        Stack<Tree> stack = new Stack<>();

        stack.push(root);

        int sum = 0;

        while (!stack.empty()) {
            Tree node = stack.pop();

            System.out.println(node.value);

            sum += node.value;

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return sum;
    }

    public static int sumWide(Tree root) {
        Queue<Tree> queue = new LinkedList<>();

        queue.add(root);

        int sum = 0;

        while (!queue.isEmpty()) {
            Tree node = queue.remove();

            System.out.println(node.value);

            sum += node.value;

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return sum;
    }
}
