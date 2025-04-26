import java.util.ArrayList;

public class Worker {
    private String name;
    private ArrayList <Task> assignedTasks;
    private int totalAssignedTime;
    private int maxWorkingTime;

    public Worker(String name, int maxWorkingTime) {
        this.name = name;
        this.assignedTasks = new ArrayList<>();
        this.totalAssignedTime = 0;
        this.maxWorkingTime = maxWorkingTime;
    }

    public boolean canTakeTask(Task task) {
        return totalAssignedTime +  task.getDuration() <= maxWorkingTime;
    }
    
    public void assignTask(Task task) {
        if (canTakeTask(task)) {
            assignedTasks.add(task);
            totalAssignedTime += task.getDuration();
        }
    }

    public int getTotalAssignedTime() {
        return totalAssignedTime;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Task> getAssignedTasks() {
        return assignedTasks;
    }
}
    