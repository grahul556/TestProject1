package Java1;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no1");
     int no1=sc.nextInt();
     
     System.out.println("ENter no2");
     int no2=sc.nextInt();
     
     System.out.println("Select symbol(+,-,*,/)");
     String s=sc.next();
     
     int res;
	switch(s)
     {
	
	case"+":res=no1+no2;
	    System.out.println("Addition is :"+res);
	    break;
	    
	case"-":res=no1+no2;
    System.out.println("Substraction is :"+res);
    break;
    
	case"*":res=no1+no2;
    System.out.println("Multiplication is :"+res);
    break;
    
	case"/":res=no1+no2;
    System.out.println("Division is"+res);
    break;
    
    
    default:System.out.println("invalid symbol");
	    
	
	
	
	
	
     }
     
     }
     
 
 
	
}