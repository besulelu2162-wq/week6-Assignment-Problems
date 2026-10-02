public class Main{

    public static void main(String[] args) {

        PremiumMember p =
            new PremiumMember(
                "MEM01",
                2000,
                "Coach Riya"
            );

        p.attendSession();
        p.attendSession();

        System.out.println(
            p.getSessionsAttended()
        );

        String[] ids = {
            "MEM1",
            "GM1",
            "MEM2",
            " ",
            "MEM3"
        };

        System.out.println(
            GymMember.signUpBatch(ids, 1000)
        );
    }
}