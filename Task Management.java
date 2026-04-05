import java.util.*;
class Task {
    private String name;
    private String description;
    private Date dueDate;
    private boolean isCompleted;

    public Task(String name, String description, Date dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }
}
class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public List<Task> getPendingTasks() {
        List<Task> pendingTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                pendingTasks.add(task);
            }
        }
        return pendingTasks;
    }
}
public class TaskManagement {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Task task1 = new Task("Complete Assignment", "Finish the math assignment", new Date());
        Task task2 = new Task("Grocery Shopping", "Buy groceries for the week", new Date());

        taskManager.addTask(task1);
        taskManager.addTask(task2);

        System.out.println("All Tasks:");
        for (Task task : taskManager.getAllTasks()) {
            System.out.println("- " + task.getName());
        }

        task1.markAsCompleted();

        System.out.println("\nPending Tasks:");
        for (Task task : taskManager.getPendingTasks()) {
            System.out.println("- " + task.getName());
        }
    }
}
public class TaskManager extends Task {
    private List<Task> tasks;



    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }
}
interface TaskManagerInterface {
    void addTask(Task task);
    void removeTask(Task task);
    List<Task> getAllTasks();
}
class TaskManager implements TaskManagerInterface {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void removeTask(Task task) {
        tasks.remove(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }
}