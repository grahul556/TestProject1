package Java1;

public class Demo {

	public static void main(String[] args) {
	String s="i love india";
	String rev="";
	 
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	}

}
