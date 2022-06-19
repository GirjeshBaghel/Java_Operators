import java.util.Scanner;
class Student
{
    //  main method
    public static void main(String[] args)
    {
        int roll,hin,eng,math,sci,sst,per;
        String name;
        Scanner sc = new Scanner(System.in);
        
        // asking the name of student
        System.out.println("Write the name of the Student");
        name   = sc.nextLine();
        System.out.println("Stuent name is : "+name);
        System.out.println("Write the Roll no of Student");
        roll = sc.nextInt();
        System.out.println("Your Roll no is : "+roll);

        System.out.println("Write the Marks of Hindi");
        hin = sc.nextInt();
        System.out.println("Hindi : "+hin);

        System.out.println("Write the Marks of English");
        eng = sc.nextInt();
        System.out.println("English : "+eng);

        System.out.println("Write the Marks of Maths");
        math = sc.nextInt();
        System.out.println("Maths : "+math);

        System.out.println("Write the Marks Of Science");
        sci = sc.nextInt();
        System.out.println("Science : "+sci);

        System.out.println("Write the Marks Of SST");
        sst = sc.nextInt();
        System.out.println("SST : "+sst);

        // finding persentage of student 
        per = (hin+math+sci+sst+eng)/5;
        System.out.println("Student Percentage is "+per+"%");

    }
}
