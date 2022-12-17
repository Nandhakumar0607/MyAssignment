package homework.day5;

public class Desktop extends Computer {
	public void DesktopSize()
	{
		System.out.println("The Size of the Computer is 19' ");
	}
	public static void main(String[] args) {
		Desktop s1 = new Desktop();
		s1.ComputerModel();
		s1.DesktopSize();
	}

}


