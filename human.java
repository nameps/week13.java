package week13;

public class human{
	String name;
	int age;
	
	human(){
		super();
		System.out.println("Hi");
	}
	human(String a,int b){
		name = a;
		age =  b;	
		System.out.println(name+" "+age);
	}
}