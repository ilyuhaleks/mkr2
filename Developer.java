package mkr2;

public class Developer implements TeamMember {
    private String name;
    private int experience;
    private String[] skills;

    public Developer(String name, int experience, String[] skills) {
        this.name = name;
        this.experience = experience;
        this.skills = skills;
    }

    @Override
    public void performTask(String task) {
        System.out.println(name + " працює над: " + task);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Розробник";
    }
}
