class Student {
    int rno;
    String stu1;
    double m1,m2,m3,m4;
    public void average()
    {
        double avg=(m1+m2+m3+m4)/4;
        System.out.println("Average marks is: "+avg);
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		Student s1=new Student();
        System.out.println("Student Name: ");
        s1.stu1=s.nextLine();
        System.out.println("Student roll number: ");
        s1.rno=s.nextInt();
        System.out.println("Student marks1: ");
        s1.m1=s.nextDouble();
        System.out.println("Student marks2: ");
        s1.m2=s.nextDouble();
        System.out.println("Student marks3: ");
        s1.m3=s.nextDouble();
        System.out.println("Student marks4: ");
        s1.m4=s.nextDouble();
        System.out.println("s1 roll number: "+s1.rno);
        System.out.println("s1 Name: "+s1.stu1);
        System.out.println("s1 marks1: "+s1.m1);
        System.out.println("s1 marks2: "+s1.m2);
        System.out.println("s1 marks3: "+s1.m3);
        System.out.println("s1 marks4: "+s1.m4);
        System.out.println("The average of the marks");
        s1.average();
    }
}
	

