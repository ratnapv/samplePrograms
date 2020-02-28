package myPackage;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintNumbers print = new PrintNumbers();
		print.printNumbers();

	}

	public void printNumbers()
	{
		for (int i=0; i<=10; i++)
		{
			if(i%3==0)
			{
				System.out.println("the  numbers are "+ i);
				
			}
		}


	}
}
