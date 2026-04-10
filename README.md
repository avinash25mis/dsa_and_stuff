# 📚 DSA & Stuff

A personal Java learning repository covering **Data Structures**, **Algorithms**, **Core Java Concepts**, and **LeetCode-style problems** — all written from scratch to build strong fundamentals.

> 💡 **For recruiters & non-coders:** Think of this repo as a study notebook written in code. Each folder focuses on a different area of computer science, with Java programs that demonstrate how things work under the hood.

---

## 🗂️ Repository Structure

```
dsa_and_stuff/
├── DataStructure/   → Implementations of core data structures (LinkedList, Stack, Queue, Tree, etc.)
├── Algo/            → Algorithmic problem-solving patterns (Sliding Window, Dynamic Programming, etc.)
├── Concept/         → Core Java concepts demonstrated via code (OOP, Threads, Java 8 features, etc.)
└── LeetNeet/        → Solutions to popular coding interview problems (LeetCode-style)
```

---

## 🏗️ DataStructure Module

> **What it is:** Building the fundamental "containers" that every software system relies on — written from scratch without using Java's built-in versions, so you can see exactly how they work.

| Topic | What it covers |
|-------|---------------|
| **Linked List** | Singly & doubly linked lists; insert, delete, reverse, merge sorted lists, find Nth node from end |
| **Stack** | Fixed-size and dynamic stack implementations; push/pop/peek operations |
| **Queue** | Custom queue implementation with enqueue/dequeue |
| **Sorting** | Bubble Sort, Merge Sort, Heap Sort — classic sorting algorithms explained through code |
| **Search** | Binary Search — efficient searching in sorted data |
| **Tree** | Binary Tree from scratch; BFS (level-order), DFS (depth-first), tree height, build tree from array |

---

## ⚙️ Algo Module

> **What it is:** Common algorithmic patterns used to solve real-world and interview problems efficiently.

| Category | Problems Covered |
|----------|-----------------|
| **Sliding Window** | Longest non-repeating substring, max sum subarray, target sum in contiguous subarray |
| **Dynamic Programming** | Coin change problem, reach-the-score variations |
| **Recursion** | Factorial, Fibonacci, palindrome check, find word in 2D grid |
| **Palindrome** | Basic and optimized longest palindrome substring |
| **Permutations** | All permutations of array and string |
| **String Problems** | Anagram check, longest common prefix, toggle alphabet case |
| **Math & Numbers** | Armstrong number, reverse a number |
| **Mean & Average** | Compute averages, find forgotten exam roll from mean |
| **Array Problems** | Kth largest element, missing number, majority element |
| **Stack Problems** | Bracket validator, remove character combinations from string |
| **Sum Problems** | Two-sum, target sum, sum of two linked lists, Fibonacci sum |
| **Selling Stocks** | Maximum profit from a single buy/sell transaction |
| **Uncommon** | Decimal ↔ Roman numeral conversion, implement Unix `tail`, burger problem |
| **Minimum Swaps** | Minimum number of swaps to sort an array |

---

## 🧠 Concept Module

> **What it is:** Java language concepts and features demonstrated with small, focused examples — great for understanding how Java works internally.

| Category | What's Demonstrated |
|----------|---------------------|
| **OOP / Inheritance** | Parent-child class relationships, `instanceof`, interface variables, implementing multiple interfaces |
| **Access Modifiers** | How `protected` access works across packages |
| **Exception Handling** | `finally` block behavior, exception rules during method overriding |
| **Enums** | Simple enums, enums with properties, using enums for error codes |
| **Threads & Concurrency** | Even/odd printing with two threads, print sequence with 3 threads, deadlock demos (with String objects and custom classes) |
| **Java 8 Features** | Streams (map, filter, reduce, collect), lambda expressions, `Collectors.toMap`, `groupingBy`, sorting with Comparator |
| **Default & Static Methods** | Interface default and static methods, resolving diamond problem |
| **String internals** | String comparison, immutability, pool behavior |
| **Operators** | Post-increment vs pre-increment behavior |
| **New Java Features** | `var` keyword (Java 10+) |
| **Tricky Questions** | Common Java interview traps and puzzles |

---

## 🧩 LeetNeet Module

> **What it is:** Solutions to popular LeetCode-style coding interview problems, focused on arrays and strings.

| Problem | Approach |
|---------|----------|
| **Two Sum** | Find two numbers that add up to a target |
| **Three Sum** | Find all unique triplets that sum to zero |
| **Binary Search** | Classic and rotated sorted array search |
| **Longest Substring Without Repeat** | Sliding window approach |
| **Product of Array Except Self** | Without using division |
| **Rotated Sorted Array Search** | Modified binary search |

---

## 🛠️ Tech Stack

| Tool | Purpose |
|------|---------|
| **Java 21** | Primary programming language |
| **Maven** | Build tool & project structure (multi-module) |
| **IntelliJ IDEA** | IDE used for development |

---

## 🚀 How to Run

**Prerequisites:** Java 21+ and Maven installed.

```bash
# Clone the repository
git clone https://github.com/avinash25mis/dsa_and_stuff.git
cd dsa_and_stuff

# Build all modules
mvn compile

# Run any specific class (example)
cd Algo
mvn exec:java -Dexec.mainClass="com.algo.slidingWindow.subArray.MaxSumContiguous"
```

Or simply open the project in **IntelliJ IDEA** — it auto-detects the Maven structure and you can run any `main` method directly.

---

## 👤 About

This repository reflects continuous practice in **problem-solving**, **clean code**, and **deep understanding of Java internals** — skills directly applicable to backend engineering roles.

Feel free to browse any folder — each file is a standalone, readable example.
