package cn.tedu.Object;

public class ObjectTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.name = "÷Ì";
		animal.age = 1;
		animal.eat();
		
	}
	
	
}
class Animal{
	String name;
	int age;
	char gender;
	
	public void eat(){
		System.out.println("chifan....");
	}
}
	