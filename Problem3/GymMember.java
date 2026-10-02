public class GymMember{

    protected String memberId;
    protected int monthlyFee;

    private int[] lateFeeHistory = new int[10];
    private int feeCount = 0;
    private int totalLateFees = 0;

    public GymMember(
            String memberId,
            int monthlyFee) {

        if (memberId == null ||
            memberId.trim().isEmpty() ||
            memberId.length() < 4) {

            throw new IllegalArgumentException(
                "Invalid member ID"
            );
        }

        if (monthlyFee <= 0) {
            throw new IllegalArgumentException(
                "Monthly fee must be positive"
            );
        }

        this.memberId = memberId;
        this.monthlyFee = monthlyFee;
    }

    protected void chargeLateFee(int amount) {

        if (feeCount < lateFeeHistory.length) {
            lateFeeHistory[feeCount] = amount;
            feeCount++;
        }

        totalLateFees += amount;
    }

    public int[] getLateFeeHistory() {

        int[] copy = new int[feeCount];

        for (int i = 0; i < feeCount; i++) {
            copy[i] = lateFeeHistory[i];
        }

        return copy;
    }

    public int getTotalLateFees() {
        return totalLateFees;
    }
}