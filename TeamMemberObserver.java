package mkr2;

public class TeamMemberObserver implements Observer {
    private String name;

    public TeamMemberObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskStatus) {
        System.out.println(name + " отримав оновлення: " + taskStatus);
    }
}
