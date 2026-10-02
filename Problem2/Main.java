public class Main{

    static String classifyGeneration(
            GymMember member) {

        if (member instanceof EliteMember) {
            return "Multilevel descendant (3 generations deep)";
        }

        if (member instanceof GroupClassMember) {
            return "Hierarchical sibling (independent branch)";
        }

        if (member instanceof PremiumMember) {
            return "Premium member";
        }

        return "Standard member";
    }

    static int getTotalSessionsAttended(
            GymMember[] members) {

        int total = 0;

        for (GymMember member : members) {
            total += member.getSessionsAttended();
        }

        return total;
    }

    public static void main(String[] args) {

        GymMember standard =
            new GymMember("MEM1", 1000);

        PremiumMember premium =
            new PremiumMember(
                "MEM2",
                2000,
                "Coach Riya"
            );

        EliteMember elite =
            new EliteMember(
                "MEM3",
                3000,
                "Coach Arjun",
                "L12"
            );

        GroupClassMember group =
            new GroupClassMember(
                "MEM4",
                1500,
                "Zumba"
            );

        premium.attendSession();
        premium.attendSession();
        premium.attendSession();

        elite.attendSession();
        elite.attendSession();

        group.attendSession();
        group.attendSession();
        group.attendSession();
        group.attendSession();

        System.out.println(
            standard.displayInfo()
        );

        System.out.println(
            premium.displayInfo()
        );

        System.out.println(
            elite.displayInfo()
        );

        System.out.println(
            group.displayInfo()
        );

        System.out.println(
            classifyGeneration(elite)
        );

        System.out.println(
            classifyGeneration(group)
        );

        GymMember[] members = {
            premium,
            elite,
            group
        };

        System.out.println(
            getTotalSessionsAttended(members)
        );
    }
}