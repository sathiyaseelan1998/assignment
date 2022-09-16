package com.test;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="schoolloo";
		char dup[]=name.toCharArray();
		for(int i=0;i<dup.length;i++)
		{
			for(int j=i+1;j<dup.length;j++)
			{
				if(dup[i]==dup[j])
				{
					System.out.println(dup);
					
				}
			}
		}
		

	}
}
