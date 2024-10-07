public class Main {
    public static void main(String[] args) {
        Account myaccount = new Account(1000.00 ,"123456");

        myaccount.withdraw(2000.00);
        myaccount.deposit(2000.00);

        System.out.println(" current blanace " + myaccount.getBalance());
        Student myStudent = new Student(90 ,90);
        myStudent.marksreviwe();
        System.out.println("Total marks "+ myStudent.totalMarks());
    }
}
