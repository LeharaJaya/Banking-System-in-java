public class Student {

    private int OOPmarks;
    private int ACDmarks;
    private int totalmarks;


public Student(int OOPmarks, int ACDmarks) {
        this.OOPmarks = OOPmarks;
         this.ACDmarks= ACDmarks;

    }

    public void marksreviwe() {
        if (OOPmarks >= 50 && ACDmarks >= 50) {
            System.out.println("you pass All subjects");
        } else {
            System.out.println("you Fail try again");
        }

    }



    public int totalMarks() {
        totalmarks = OOPmarks + ACDmarks;
        return totalmarks;


    }

}
