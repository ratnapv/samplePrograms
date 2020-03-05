package JavaExamples;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintNumbers print = new PrintNumbers();
		//Overloaded numbers
		print.printNumbers(2);
		print.printNumbers(2,5);
	}

	int number;
	public void printNumbers(int number)
	{
		
		
		for (int i=0; i<=10; i++)
		{
			if(i%number==0)
			{
				System.out.println("the  numbers are "+ i);
			}
		}
	}
	
	public void printNumbers(int number, int divNumber)
	{
		for (int i=0; i<=divNumber; i++)
		{
			if(i%number==0)
			{
				//print only the numbers that are divisible by given number
				System.out.println("the  numbers are "+ i);
			}
		}
	}

}
