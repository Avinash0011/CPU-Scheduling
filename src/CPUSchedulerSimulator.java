import java.util.*;

class Process {
    int pid;
    int burstTime;
    int remainingTime;

    public Process(int pid, int burstTime) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
    }
}

class CPUScheduler {
    List<Process> processes;

    public CPUScheduler() {
        processes = new ArrayList<>();
    }

    public void addProcess(int pid, int burstTime) {
        Process process = new Process(pid, burstTime);
        processes.add(process);
    }

    public void fcfs() {
        System.out.println("FCFS Scheduling:");
        int currentTime = 0;
        for (Process process : processes) {
            System.out.println("Process " + process.pid + " started at time " + currentTime);
            currentTime += process.burstTime;
            System.out.println("Process " + process.pid + " finished at time " + currentTime);
        }
    }

    public void sjf() {
        System.out.println("SJF Scheduling:");
        processes.sort(Comparator.comparingInt(p -> p.burstTime));
        int currentTime = 0;
        for (Process process : processes) {
            System.out.println("Process " + process.pid + " started at time " + currentTime);
            currentTime += process.burstTime;
            System.out.println("Process " + process.pid + " finished at time " + currentTime);
        }
    }

    public void roundRobin(int timeQuantum) {
        System.out.println("Round Robin Scheduling:");
        Queue<Process> queue = new LinkedList<>(processes);
        int currentTime = 0;

        while (!queue.isEmpty()) {
            Process process = queue.poll();
            if (process.remainingTime > timeQuantum) {
                System.out.println("Process " + process.pid + " started at time " + currentTime);
                currentTime += timeQuantum;
                process.remainingTime -= timeQuantum;
                System.out.println("Process " + process.pid + " paused at time " + currentTime);
                queue.add(process); // Re-add to the end of the queue
            } else {
                System.out.println("Process " + process.pid + " started at time " + currentTime);
                currentTime += process.remainingTime;
                System.out.println("Process " + process.pid + " finished at time " + currentTime);
                process.remainingTime = 0;
            }
        }
    }
}

public class CPUSchedulerSimulator {
    public static void main(String[] args) {
        CPUScheduler scheduler = new CPUScheduler();
        Random random = new Random();

        // Adding processes with random burst times
        for (int i = 0; i < 5; i++) {
            int burstTime = random.nextInt(10) + 1; // Random burst time between 1 and 10
            scheduler.addProcess(i + 1, burstTime);
        }

        // Choose scheduling algorithm
        System.out.println("Choose Scheduling Algorithm:");
        System.out.println("1. FCFS");
        System.out.println("2. SJF");
        System.out.println("3. Round Robin");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                scheduler.fcfs();
                break;
            case 2:
                scheduler.sjf();
                break;
            case 3:
                System.out.print("Enter time quantum: ");
                int timeQuantum = scanner.nextInt();
                scheduler.roundRobin(timeQuantum);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}




