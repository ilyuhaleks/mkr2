package mkr2;

public class TeamFactory {

    public static TeamMember createMember(String role, String name, int experience, String[] skillsOrTestTypes) {
        if (role.equalsIgnoreCase("Розробник")) {
            return new Developer(name, experience, skillsOrTestTypes);
        } else if (role.equalsIgnoreCase("Тестувальник")) {
            return new Tester(name, experience, skillsOrTestTypes);
        } else if (role.equalsIgnoreCase("ПМ")) {
            return new ProjectManager(name, experience, Integer.parseInt(skillsOrTestTypes[0]));
        }
        return null; //Роль не знайшлась
    }
}