import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sarah Salem on 01/13/2020.
 */
public class first {

        String subject;
        double grade;



    public first() {
    }

    ArrayList<first> students=new ArrayList<first>();

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean Addstu(first stu) {
        students.add(stu);
        return true;
    }
    public String avg ()
    {
        int o=0;

        for(first i:students)
        {
            o+=i.getGrade();
        }

        String s="total is "+o+"\navg is:"+o/5;
        return s;

    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        first student=new first();

        for (int i=0; i<5 ;i++)
        {
            System.out.println("Enter grade "+(i+1));
            student.setGrade(input.nextDouble());
            System.out.println("\nEnter Subject "+(i+1));
            student.setSubject(input.next());

            student.Addstu(student);

        }

        System.out.println(student.avg());


    }
}

