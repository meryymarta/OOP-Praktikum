public class Member12 {
    private String idNumber;
    private String name;
    private int loanLimit;
    private int loanAmount;

    public Member12(String idNumber, String name, int loanLimit, int loanAmount) {
        this.idNumber = idNumber;
        this.name = name;
        this.loanLimit = loanLimit;
        this.loanAmount = 0;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public int getLoanLimit() {
        return loanLimit;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void borrow(int amount) {
        if (loanAmount + amount > loanLimit) {
            System.out.println("Sorry, the loan amount exceeds the limit.");
        } else {
            loanAmount += amount;
        }
    }

    public void repay(int amount) {
        if (amount < (0.1 * loanAmount)) {
            System.out.println("Sorry, the repayment must be at least 10% of the loan amount.");
        } else {
            loanAmount -= amount;
            if (loanAmount < 0) {
                loanAmount = 0;
            }
        }
    }
}
