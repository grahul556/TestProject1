package Java1;

public class reversedemo {
	
	
	public static void main(String[] args) {
	int no=151;
	int temp=no;
	int rev=0,rem;
	
	while(no!=0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if(no==rev) {
	System.out.println("no is palindrome");
	}
	else {
		System.out.println("no is not palindrome");
	
	}
}

}
