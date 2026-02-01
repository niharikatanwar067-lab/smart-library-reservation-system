# 📚 Smart Library Reservation System (Java + DSA)

## 📌 Overview
The Smart Library Reservation System is a Java-based, console-driven application designed to simulate a real-world library workflow using core Data Structures and Algorithms.  
The project focuses on efficient book management, user prioritization, search optimization, and reservation handling rather than UI development.

This project demonstrates strong fundamentals in Java, DSA, and software design, suitable for backend, software development, and entry-level engineering roles.

---

## 🎯 Key Objectives
- Design a modular Java application using proper package structure
- Apply DSA concepts to real-world scenarios
- Practice encapsulation, access control, and clean APIs
- Build a terminal-based project suitable for professional demonstration

---

## 🧠 Core Features
- Add and manage books in the library  
- Register users with priority levels  
- Search books using keyword-based lookup  
- Issue and return books  
- Handle reservations using priority-based logic  
- Recommend available books to users  
- Track book demand (extensible analytics module)

---

## 🏗️ Project Architecture

```
src/
│
├── dsa/
│   └── Trie.java
│
├── model/
│   ├── Book.java
│   └── User.java
│
├── service/
│   ├── LibraryService.java
│   ├── ReservationManager.java
│   └── DemandAnalyzer.java
│
└── Main.java
```

---

## 🧩 Data Structures Used
| Data Structure | Purpose |
|---------------|---------|
| HashMap | Fast lookup for books and users |
| Trie | Efficient prefix-based book search |
| PriorityQueue | Fair reservation handling based on user priority |
| Java Collections | Traversal and data management |

---

## 🛠️ Technologies Used
- Language: Java  
- Concepts: OOP, Encapsulation, Packages, Lambdas  
- Execution: Command Line / Terminal  
- Version Control: Git & GitHub  

---

## ▶️ How to Run the Project

### 1. Clone the repository
```bash
git clone https://github.com/<your-username>/smart-library-reservation-system.git
```

### 2. Navigate to the src directory
```bash
cd smart-library-reservation-system/src
```

### 3. Compile all Java files
```bash
javac dsa/*.java model/*.java service/*.java Main.java
```

### 4. Run the application
```bash
java Main
```

---

## 🖥️ Sample Console Output

```
===== SMART LIBRARY RESERVATION SYSTEM =====

Adding books to library...

Registering users...
User registered: Alice
User registered: Bob
User registered: Charlie

Searching books...
Search results for "Har":
- Harry Potter
Search results for "Lor":
- Lord of the Rings

Issuing books...
Alice borrowed "Harry Potter"
Book unavailable. Added to reservation queue.
Book unavailable. Added to reservation queue.

Returning book...
"Harry Potter" returned successfully.

Demand analysis...
Most demanded books feature coming soon (analytics module).

Recommendations...
Recommendations for Alice:
- Percy Jackson
- Harry Potter
- Lord of the Rings


===== END OF SESSION =====

```

---

## 💡 Learning Outcomes
- Applied data structures to real-world problems
- Designed clean service and model layers in Java
- Gained hands-on experience with encapsulation and access control
- Debugged and resolved compile-time and structural errors
- Learned professional presentation of console-based projects

---

## 🚀 Future Enhancements
- Database integration (SQL / MongoDB)
- REST API using Spring Boot
- Analytics dashboard for demand tracking
- Web-based frontend interface

---

## 👤 Author
**Niharika**  
Student
