# Intelligent CPU Scheduler Simulator

## 🚀 Introduction
The **Intelligent CPU Scheduler Simulator** is a Java-based simulation of three popular CPU scheduling algorithms:
- **First-Come, First-Serve (FCFS)**
- **Shortest Job First (SJF)**
- **Round Robin (RR)**

This program allows users to dynamically add processes with random burst times and choose a scheduling algorithm to simulate process execution.

---

## 🛠️ Installation & Setup

### Prerequisites
Ensure you have the following installed on your system:
- Java Development Kit (JDK) 8 or later
- A Java IDE (IntelliJ IDEA, Eclipse, or VS Code) or a terminal with Java support

### Steps to Run
1. **Clone the repository**:
   ```sh
   git clone https://github.com/yourusername/Intelligent-CPU-Scheduler.git
   cd Intelligent-CPU-Scheduler
   ```
2. **Compile the Java files**:
   ```sh
   javac CPUSchedulerSimulator.java
   ```
3. **Run the program**:
   ```sh
   java CPUSchedulerSimulator
   ```

---

## 📌 Features
✅ **Supports three scheduling algorithms** (FCFS, SJF, Round Robin)
✅ **Random burst time generation** for processes
✅ **User input to choose scheduling algorithm**
✅ **Round Robin supports custom time quantum**
✅ **Simple console-based output for clear visualization**

---

## 🖥️ Usage
1. After running the program, you will be prompted to select a scheduling algorithm:
   ```
   Choose Scheduling Algorithm:
   1. FCFS
   2. SJF
   3. Round Robin
   ```
2. If you choose **Round Robin**, you will be prompted to enter a time quantum.
3. The program will then simulate the scheduling process and display the execution details.

---

## 📷 Screenshot
Example output for FCFS Scheduling:
```
Choose Scheduling Algorithm:
1. FCFS
2. SJF
3. Round Robin
1
FCFS Scheduling:
Process 1 started at time 0
Process 1 finished at time 5
Process 2 started at time 5
Process 2 finished at time 9
...
```

---

## 🏗️ Future Improvements
🔹 Implementing **Priority Scheduling**
🔹 Adding **Graphical User Interface (GUI)**
🔹 Improving **statistical analysis of scheduling efficiency**

---

## 📜 License
This project is licensed under the **MIT License**.

---

## 📞 Contact
For questions or suggestions, feel free to reach out!
- GitHub: [yourusername](https://github.com/yourusername)
- Email: your.email@example.com

🚀 Happy Coding!

