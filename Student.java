package homework.day5;

public class Student {
	public void getStudentInfo(int id)
	{
		System.out.println("The Id of the Student is : " + id);
	}
	public void getStudentInfo(int id, String Name)
	{
		System.out.println("The Name of the Student is : " + Name);
		System.out.println("The Id of the Student is : " + id);
	}
	public void getStudentInfo(long Phone, String Email)
	{
		System.out.println("The Phone Number of the Student is : " + Phone);
		System.out.println("The Email of the Student is : " + Email);
	}
}
