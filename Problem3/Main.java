public class Main{

    public static void main(String[] args) {

        PremiumMember p =
            new PremiumMember(
                "MEM5",
                2000,
                "Coach Riya"
            );

        p.chargeLateFee(200);

        System.out.println(
            p.getTotalLateFees()
        );

        int[] history =
            p.getLateFeeHistory();

        history[0] = 999;

        System.out.println(
            p.getLateFeeHistory()[0]
        );
    }
}