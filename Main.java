package mkr2;

public class Main {
    public static void main(String[] args) {
        String[] devSkills = {"Python", "Django"};
        String[] testerSkills = {"Unit Testing"};
        String[] pmCompletedProjects = {"32"};

        TeamMember developer = TeamFactory.createMember("Розробник", "Одарка", 5, devSkills);
        TeamMember tester = TeamFactory.createMember("Тестувальник", "Тарас", 3, testerSkills);
        TeamMember pm = TeamFactory.createMember("ПМ", "Раджа", 8, pmCompletedProjects);

        ProjectMediator project = new ProjectMediator();
        project.addMember(developer);
        project.addMember(tester);
        project.addMember(pm);

        Task task1 = new Task();
        task1.addObserver(new TeamMemberObserver("Одарка"));
        task1.addObserver(new TeamMemberObserver("Тарас"));
        task1.addObserver(new TeamMemberObserver("Раджа"));

        project.addTask(task1);

        project.assignTaskToTeamMembers(task1);

        project.updateTaskProgress(task1, 30);
        project.updateTaskStatus(task1, "У процесі");

        project.updateProjectProgress(50);
    }
}
