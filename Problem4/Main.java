public class Main{

    static String batchPrint(
            GymMember[] members) {

        StringBuilder result =
            new StringBuilder();

        for (GymMember member : members) {

            result.append(
                member.displayInfo()
            );

            if (member instanceof PremiumMember) {

                PremiumMember premium =
                    (PremiumMember) member;

                result.append(
                    " [Trainer via downcast: "
                    + premium.getTrainerName()
                    + "]"
                );
            }

            result.append(" | ");
        }

        return result.toString();
    }

    public static void main(String[] args) {

        GymMember standard =
            new GymMember(
                "MEM6",
                1000
            );

        PremiumMember premium =
            new PremiumMember(
                "MEM7",
                2000,
                "Coach Riya"
            );

        GymMember[] members = {
            standard,
            premium
        };

        System.out.println(
            batchPrint(members)
        );

        GymMember plain =
            new GymMember(
                "MEM8",
                1000
            );

        // This would cause ClassCastException:
        // PremiumMember bad =
        //     (PremiumMember) plain;
    }
}