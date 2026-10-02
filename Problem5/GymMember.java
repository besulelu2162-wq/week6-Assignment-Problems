public class GymMember{

    private static int membersEnrolled = 0;

    public final String membershipNumber;

    protected int monthlyFee;

    private int feesPaid = 0;
    private String lastPaymentMode;

    public GymMember(int monthlyFee) {

        if (monthlyFee <= 0) {
            throw new IllegalArgumentException(
                "Monthly fee must be positive"
            );
        }

        membersEnrolled++;

        membershipNumber =
            "GYM-" + (2000 + membersEnrolled);

        this.monthlyFee = monthlyFee;
    }

    public void payFee(int amount) {

        if (amount > 0) {
            feesPaid += amount;
        }
    }

    public void payFee(
            int amount,
            String mode) {

        lastPaymentMode = mode;

        payFee(amount);
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public static boolean isValidReferralCode(
            String code) {

        if (code == null || code.length() != 4) {
            return false;
        }

        if (code.charAt(0) != 'G') {
            return false;
        }

        if (!Character.isDigit(code.charAt(1))) {
            return false;
        }

        if (!Character.isDigit(code.charAt(2))) {
            return false;
        }

        if (!Character.isUpperCase(code.charAt(3))) {
            return false;
        }

        return true;
    }

    public static int getMembersEnrolled() {
        return membersEnrolled;
    }
}