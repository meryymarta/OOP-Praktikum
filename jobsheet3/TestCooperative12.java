public class TestCooperative12 {
    public static void main(String[] args) {
        Member12 member1 = new Member12("11113334444", "Donny", 5000000, 0);
        System.out.println("Member Name: " + member1.getName());
        System.out.println("Loan Limit: " + member1.getLoanLimit());

        System.out.println("\nBorrowing 10,000,000...");
        member1.borrow(10000000);
        System.out.println("Current Loan Amount: " + member1.getLoanAmount());

        System.out.println("\nBorrowing 4,000,000...");
        member1.borrow(4000000);
        System.out.println("Current Loan Amount: " + member1.getLoanAmount());

        System.out.println("\nRepaying 200,000");
        member1.repay(200000); 
        System.out.println("Current Loan Amount: " + member1.getLoanAmount());

        System.out.println("\nRepaying 3,000,000");
        member1.repay(3000000); 
        System.out.println("Current Loan Amount: " + member1.getLoanAmount());
    }
}
