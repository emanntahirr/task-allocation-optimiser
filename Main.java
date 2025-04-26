import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1", 120));
        tasks.add(new Task("Task 2" , 60));
        tasks.add(new Task("Task 3", 180));
        tasks.add(new Task("Task 4", 90));

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Alice", 480));
        workers.add(new Worker("Bob", 480));
        workers.add(new Worker("Charlie", 480));

        TaskAllocator.allocateTasks(tasks, workers);

        for (Worker worker : workers) {
            System.out.println(worker.getName() + " has tasks: ");
            for (Task task : worker.getAssignedTasks()) {
                System.out.println("- " + task.getName() + " (" + task.getDuration() + " min)");
            }
            System.out.println("Total time: " + worker.getTotalAssignedTime() + " min\n");
        }
    }
}
