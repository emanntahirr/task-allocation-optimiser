import java.util.ArrayList;
import java.util.Comparator;

public class TaskAllocator {
    public static void allocateTasks(ArrayList<Task> tasks, ArrayList<Worker> workers) {
        tasks.sort(Comparator.comparing(Task::getDuration).reversed());

        for (Task task : tasks) {
            Worker leastBusy = workers.get(0);
            for (Worker worker : workers) {
                if (worker.getTotalAssignedTime() < leastBusy.getTotalAssignedTime()) {
                    leastBusy = worker;
                }
            }
            leastBusy.assignTask(task);
        }
    }
}