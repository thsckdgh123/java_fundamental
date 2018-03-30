package test;

import java.util.*;

public class Greatest{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	
	int i,j,k;
	int result;

	System.out.println("Input the 1st number : ");
	i = sc.nextInt();
	System.out.println("Input the 2nd number : ");
	j = sc.nextInt();
	System.out.println("Input the 3rd number : ");
	k = sc.nextInt();

	result = i;
	if(i<j)
	result = j;
	if(j<k)
	result = k;	

	System.out.println("The greatest : " + result);
}
}