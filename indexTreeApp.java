import java.io.*;
import java.util.*;

class IndexNode {
    String word;
    int count;
    ArrayList<Integer> lineNumbers;
    IndexNode left, right;

    public IndexNode(String word, int lineNumber) {
        this.word = word;
        this.count = 1;
        this.lineNumbers = new ArrayList<>();
        this.lineNumbers.add(lineNumber);
        this.left = this.right = null;
    }
}

class IndexTree {
    private IndexNode root;

    public IndexTree() {
        root = null;
    }

    public void addRecord(String word, int lineNumber) {
        root = addRecordHelper(root, word, lineNumber);
    }

    private IndexNode addRecordHelper(IndexNode node, String word, int lineNumber) {
        if (node == null) {
            return new IndexNode(word, lineNumber);
        }

        int comparison = word.compareTo(node.word);
        
        if (comparison == 0) {
            // Word already exists, update count and line numbers
            node.count++;
            if (!node.lineNumbers.contains(lineNumber)) {
                node.lineNumbers.add(lineNumber);
            }
        } else if (comparison < 0) {
            node.left = addRecordHelper(node.left, word, lineNumber);
        } else {
            node.right = addRecordHelper(node.right, word, lineNumber);
        }

        return node;
    }

    public IndexNode find(String target) {
        return findHelper(root, target);
    }

    private IndexNode findHelper(IndexNode node, String target) {
        if (node == null || node.word.equals(target)) {
            return node;
        }

        if (target.compareTo(node.word) < 0) {
            return findHelper(node.left, target);
        }
        return findHelper(node.right, target);
    }

    public void printIndex() {
        if (root == null) {
            System.out.println("Index is empty");
            return;
        }
        printOrderedData(root);
    }

    private void printOrderedData(IndexNode node) {
        if (node == null) return;

        // Inorder traversal for alphabetical ordering
        printOrderedData(node.left);
        System.out.printf("%-20s %3d time(s), line(s): %s%n", 
            node.word, 
            node.count, 
            node.lineNumbers.toString());
        printOrderedData(node.right);
    }
}

public class IndexTreeApp {
    public static void main(String[] args) {
        IndexTree index = new IndexTree();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                // Split line into words and normalize them
                String[] words = line.toLowerCase()
                                   .replaceAll("[^a-zA-Z\\s]", "")
                                   .split("\\s+");
                
                for (String word : words) {
                    if (!word.isEmpty()) {
                        index.addRecord(word, lineNumber);
                    }
                }
                lineNumber++;
            }

            System.out.println("\nWord Index (alphabetically ordered):");
            System.out.println("====================================");
            index.printIndex();

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
