public class Task {
    private String name;
    private int duration;

    public Task (String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }
}