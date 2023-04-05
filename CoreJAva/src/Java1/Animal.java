package Java1;

public abstract class Animal {
	
    String name;
     int age;
     
   abstract void run();

    public static void main(String[] args) {
		Dog d=new Dog();
		d.run();
		
		cat c=new cat();
		
	}
    

}

