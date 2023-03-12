package pkg1;

public class Student {
	int rollno, age;
	
	public void print1()	{
		System.out.println("welcome to all of you");
	}
	public void print2()	{
		System.out.println("automation is very easy");
	}
	public static void main (String[] arg) {
		Student stud=new Student();
		stud.print1();
		stud.print2();
		stud.rollno = 33;
		System.out.println("roll no of student: " + stud.rollno);
		stud.age = 45;
		System.out.println("age of student: " + stud.age);
	}

}
