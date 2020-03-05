package myPackage;

import java.util.Arrays;

public class ChangingOfPrivateVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example e = new example();
		e.showdata();
		
		int[] x = e.getdata();
		x[0]=4;
		e.showdata();
				
		
	}

	
}

class example
{
	int[] data = {1,2,3};
	
	public void showdata()
	{
		System.out.println(Arrays.toString(data));
	}
	
	public int[] getdata()
	{
		return data;
	}
}