public class Student
{
    String name;
    String Degree;
    int YOP;
    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="Rahul";s1.Degree="MCA";s1.YOP=2011;
        s2.name="Ronit";s2.Degree="B.tech";s2.YOP=2022;
        System.out.println(s1.name+" "+s1.Degree+" "+s1.YOP);
        System.out.println(s2.name+" "+s2.Degree+" "+s2.YOP);
    }
}