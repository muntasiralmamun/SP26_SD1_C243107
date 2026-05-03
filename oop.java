import java.util.Scanner;
abstract class Person
{
    
    private String name;
    private int age;
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName(){return name;}
    public int getAge(){return age;}
    public abstract void displayRole();
};
class Student extends Person{
    private String studentId;

    public Student(String name ,int age,String studentId)
    {
        super(name,age);
        this.studentId=studentId;
    }
    @Override
    public void displayRole()
    {
        System.out.println(getName()+" is a student.ID :"+studentId);
    }
}
class Teacher extends Person{
    private String subject;

    public Teacher(String name,int age,String subject)
    {
        super(name,age);
        this.subject=subject;
    }
    @Override
    public void displayRole() 
    {
        System.out.println(getName()+" is a Teacher.Subject :"+subject);
    }
}
public class oop {
    public static void main(String [] args)
    {
        Person s1 = new Student("Muntasir",23,"C243107");
        Person t1 = new Teacher("MAS",60,"SD1");

        s1.displayRole();
        t1.displayRole();
    } 
}
