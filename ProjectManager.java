package mkr2;

public class ProjectManager implements TeamMember {
    private String name;
    private int experience;
    private int completedProjects;

    public ProjectManager(String name, int experience, int completedProjects) {
        this.name = name;
        this.experience = experience;
        this.completedProjects = completedProjects;
    }

    @Override
    public void performTask(String task) {
        System.out.println(name + " виконує: " + task);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Менеджер";
    }

    public void planProject(String task) {
        System.out.println(name + " планує завдання  " + task);
    }
}