# Programming Assignment - CSIS 3103

## Overview
This project consists of multiple programming tasks involving **Circular Linked Lists**, **Binary Search Trees**, and **Knowledge Graphs**. The objective is to apply data structures and algorithms to solve real-world problems effectively.

## Table of Contents
1. [Question 1: Circular Linked List & Josephus Problem](#question-1-circular-linked-list--josephus-problem)
2. [Question 2: Index Tree Implementation](#question-2-index-tree-implementation)
3. [Question 3: Knowledge Graph Construction](#question-3-knowledge-graph-construction)
4. [Submission Guidelines](#submission-guidelines)

---

## Question 1: Circular Linked List & Josephus Problem
### **Objective:**
- Implement a **generic circular linked list** using a **single-linked list**.
- Use this circular list to solve the **Josephus Problem**.

### **Task Breakdown:**
1. **Implement the CircularList Class**
   - No first or last node, only a reference to a **current node**.
   - Required methods:
     - `add(element)`: Inserts a new element at the current position.
     - `get()`: Returns the value of the current node.
     - `size()`: Returns the number of elements in the list.
     - `iterator()`: Implements Java’s `Iterator` interface, supporting traversal and removal.
   
2. **Solve the Josephus Problem**
   - Prompt the user for **n (number of people)** and **k (count step)**.
   - Use the CircularList to simulate the elimination process.
   - Print the order of eliminations and the final survivor.

---

## Question 2: Index Tree Implementation
### **Objective:**
- Implement a **Binary Search Tree (BST) based IndexTree**.
- Store and retrieve word occurrences in a document file.

### **Task Breakdown:**
1. **Implement the `IndexTree` Class**
   - Each node stores:
     - A **word** (String)
     - A **count** of occurrences
     - A **list of line numbers** where it appears
   - Methods:
     - `addRecord(word, line)`: Adds a word occurrence.
     - `printIndex()`: Prints all words in **alphabetical order**.
     
2. **Modify the `BinarySearchTree` Class**
   - Implement the `find(target)` method to locate words.
   - Modify `printOrderedData()` to correctly format word occurrences.
   
3. **Handle File Input**
   - Read a text file and process words line-by-line.
   - Normalize words (convert to lowercase, strip punctuation for extra credit).

---

## Question 3: Knowledge Graph Construction
### **Objective:**
- Construct and visualize a **knowledge graph** using Linked Lists, Circular Lists, or Binary Search Trees.
- Extract relationships from a **PubMed dataset**.

### **Task Breakdown:**
1. **Understand the Dataset**
   - Data consists of `Entity1 - Relation - Entity2` triplets.
   - Use entities as **nodes** and relations as **edges**.

2. **Graph Construction**
   - Use appropriate data structures to store entities and relationships.
   - Implement features:
     - Display **relations for a given entity**.
     - Show **entities linked by a specific relation**.
     - Query entity-relation pairs dynamically.

3. **Visualization**
   - Create a **GUI or textual representation** of the graph.
   - Enhance features (categorization, filtering, etc.).

### **Extra Credit:**
- Implement punctuation and special character filtering.
- Improve entity-relation visualization.

---

## Submission Guidelines
- Submit all **Java source files**.
- Include **JUnit test cases** for `CircularList` and `IndexTree`.
- Package as **a ZIP file** containing either:
  - The entire Eclipse project, OR
  - Individual `.java` files (excluding unmodified provided files).

---

### **Grading Breakdown**
| Task | Points |
|------|--------|
| Circular Linked List & Josephus Problem | 250 |
| Index Tree Implementation | 250 |
| Knowledge Graph Construction | 500 |
| **Total** | **1000** |

---

## Notes
- **Code must follow Java documentation standards**.
- **Comment complex logic for clarity**.
- The best-performing Knowledge Graph project may be **published in a conference**.
