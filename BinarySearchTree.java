import java.util.Scanner;

class Node {

    int value;
    Node leftChild;
    Node rightChild;

    Node(int value) {
        this.value = value;
        leftChild = null;
        rightChild = null;
    }
}
class BinaryTree {

    Node root;

    //Insert a value
    Node add(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.leftChild = add(root.leftChild, value);
        } 
        else if (value > root.value) {
            root.rightChild = add(root.rightChild, value);
        } 
        else {
            System.out.println("Value already exists!");
        }
        return root;
    }
    //Search a value
    boolean find(Node root, int value) {

        if (root == null) {
            return false;
        }
        if (root.value == value) {
            return true;
        }
        if (value < root.value) {
            return find(root.leftChild, value);
        }
        return find(root.rightChild, value);
    }
    //Find the smallest value
    Node smallest(Node root) {

        while (root.leftChild != null) {
            root = root.leftChild;
        }
        return root;
    }
    //Delete a value
    Node remove(Node root, int value) {

        if (root == null) {
            return null;
        }
        if (value < root.value) {
            root.leftChild = remove(root.leftChild, value);
        } 
        else if (value > root.value) {
            root.rightChild = remove(root.rightChild, value);
        } 
        else {
            
            if (root.leftChild == null && root.rightChild == null) {
                return null;
            }
            if (root.leftChild == null) {
                return root.rightChild;
            }
            if (root.rightChild == null) {
                return root.leftChild;
            }
            Node minNode = smallest(root.rightChild);

            root.value = minNode.value;

            root.rightChild = remove(root.rightChild, minNode.value);
        }

        return root;
    }
    void inorder(Node root) {

        if (root != null) {
            inorder(root.leftChild);
            System.out.print(root.value + " ");
            inorder(root.rightChild);
        }
    }
    void preorder(Node root) {

        if (root != null) {
            System.out.print(root.value + " ");
            preorder(root.leftChild);
            preorder(root.rightChild);
        }
    }
    void postorder(Node root) {

        if (root != null) {
            postorder(root.leftChild);
            postorder(root.rightChild);
            System.out.print(root.value + " ");
        }
    }
}
public class BinarySearchTree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();

        int choice;

        do {

            System.out.println("\n     BINARY SEARCH TREE     ");
            System.out.println("1. Add Value");
            System.out.println("2. Remove Value");
            System.out.println("3. Find Value");
            System.out.println("4. Inorder Traversal");
            System.out.println("5. Preorder Traversal");
            System.out.println("6. Postorder Traversal");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();

                    if (tree.find(tree.root, value)) {
                        System.out.println("Value already exists!");
                    } 
                    else {
                        tree.root = tree.add(tree.root, value);
                        System.out.println("Value added successfully!");
                    }
                    break;

                case 2:
                    System.out.print("Enter value to remove: ");
                    int removeValue = sc.nextInt();

                    if (tree.find(tree.root, removeValue)) {
                        tree.root = tree.remove(tree.root, removeValue);
                        System.out.println("Value removed successfully!");
                    } 
                    else {
                        System.out.println("Value not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter value to find: ");
                    int findValue = sc.nextInt();

                    if (tree.find(tree.root, findValue)) {
                        System.out.println("Value found!");
                    } 
                    else {
                        System.out.println("Value not found!");
                    }
                    break;

                case 4:
                    System.out.print("Inorder: ");
                    tree.inorder(tree.root);
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Preorder: ");
                    tree.preorder(tree.root);
                    System.out.println();
                    break;

                case 6:
                    System.out.print("Postorder: ");
                    tree.postorder(tree.root);
                    System.out.println();
                    break;

                case 7:
                    System.out.println("Program ended. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);

        sc.close();
    }
}