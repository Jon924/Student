
/**
 * Write a description of class StudentTester here.
 *
 * @Jon Grey 
 * @version (a version number or a date)
 */
public class StudentTester
{
    public static void main(String[] args){
        Student theStudent = new Student("Ananya", 17);
        theStudent.accumScore(70, 100);
        theStudent.accumScore(10, 15);
        theStudent.accumScore(86, 100);
        theStudent.accumScore(50, 100);
        theStudent.accumScore(21, 25);
        theStudent.accumScore(100, 100);        
        System.out.println(theStudent);
        System.out.println(theStudent.calcGrade());
        theStudent.dropLowestScore();
        System.out.println(theStudent);
        System.out.println(theStudent.calcGrade());
    }
}


