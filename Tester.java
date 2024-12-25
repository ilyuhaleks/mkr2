package mkr2;

public class Tester implements TeamMember {
    private String name;
    private int experience;
    private String[] testTypes;

    public Tester(String name, int experience, String[] testTypes) {
        this.name = name;
        this.experience = experience;
        this.testTypes = testTypes;
    }

    @Override
    public void performTask(String task) {
        System.out.println(name + " тестує " + task);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Тестер";
    }
}
