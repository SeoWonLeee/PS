import java.util.Scanner;

class TreeNode {
    char value;
    TreeNode left;
    TreeNode right;

    TreeNode(char value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class Main {
    static TreeNode[] nodes = new TreeNode[26];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        scanner.nextLine();  

        for (int i = 0; i < 26; i++) {
            nodes[i] = new TreeNode((char)('A' + i));
        }

        for (int i = 0; i < N; i++) {
            char parent = scanner.next().charAt(0);
            char leftChild = scanner.next().charAt(0);
            char rightChild = scanner.next().charAt(0);
            scanner.nextLine();   

            TreeNode parentNode = nodes[parent - 'A'];
            if (leftChild != '.') {
                parentNode.left = nodes[leftChild - 'A'];
            }
            if (rightChild != '.') {
                parentNode.right = nodes[rightChild - 'A'];
            }
        }

        StringBuilder preorderResult = new StringBuilder();
        StringBuilder inorderResult = new StringBuilder();
        StringBuilder postorderResult = new StringBuilder();

        preorderTraversal(nodes[0], preorderResult);
        inorderTraversal(nodes[0], inorderResult);
        postorderTraversal(nodes[0], postorderResult);

        System.out.println(preorderResult.toString());
        System.out.println(inorderResult.toString());
        System.out.println(postorderResult.toString());

        scanner.close();
    }

    private static void preorderTraversal(TreeNode node, StringBuilder result) {
        if (node == null) return;
        result.append(node.value);
        preorderTraversal(node.left, result);
        preorderTraversal(node.right, result);
    }

    private static void inorderTraversal(TreeNode node, StringBuilder result) {
        if (node == null) return;
        inorderTraversal(node.left, result);
        result.append(node.value);
        inorderTraversal(node.right, result);
    }

    private static void postorderTraversal(TreeNode node, StringBuilder result) {
        if (node == null) return;
        postorderTraversal(node.left, result);
        postorderTraversal(node.right, result);
        result.append(node.value);
    }
}
