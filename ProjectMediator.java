package mkr2;

import java.util.ArrayList;
import java.util.List;

public class ProjectMediator {
    private List<TeamMember> members = new ArrayList<>();
    private List<Task> tasks = new ArrayList<>();
    private int progress;

    public void addMember(TeamMember member) {
        members.add(member);
    }

    public void removeMember(TeamMember member) {
        members.remove(member);
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Додано завдання: " + task.getStatus());
        notifyMembers("Сповіщення: додано завдання " + task.getStatus());
    }

    public void assignTaskToTeamMembers(Task task) {
        for (TeamMember member : members) {
            System.out.println("Розподілення " + member.getRole() + ": " + task.getStatus());
        }
    }

    public void updateProjectProgress(int progress) {
        this.progress = progress;
        System.out.println("Прогрес проекту: " + progress + "%");
        notifyMembers("Прогрес проекту тепер становить: " + progress + "%");
    }

    public void updateTaskStatus(Task task, String status) {
        task.setStatus(status);
        notifyMembers("Стан проекту змінено на: " + status);
    }

    public void updateTaskProgress(Task task, int progress) {
        task.setProgress(progress);
    }

    // Повідомляємо всіх членів команди
    private void notifyMembers(String taskStatus) {
        for (TeamMember member : members) {
            System.out.println(member.getName() + " був повідомлений: " + taskStatus);
        }
    }
}