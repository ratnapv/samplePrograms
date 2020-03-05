package myPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEachandForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> gadgets = new ArrayList<>(Arrays.asList("samsung","iphone","motorola"));
		
		for(int i=0; i<gadgets.size();i++)
		{
			String name=gadgets.get(i);
			System.out.println(name);
		}
		System.out.println("======================");
		
		for (String gadget:gadgets)
		{
			System.out.println(gadget);
		}
		
		}
	}


