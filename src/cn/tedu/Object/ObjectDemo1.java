
package cn.tedu.Object;
/*
 * 	构造代码块
 * 		在方法外类内{}就是构造代码块，可以进行初始化，
 * 		在每个构造方法前优先执行，调用任意的构造方法
 * 		构造方法块都要执行
 * 	匿名对象
 * 		没有名称的对象---可以调用属性和方法，使用一次
 * 		就要重新创建一次，主要用于参数传递
 */


public class ObjectDemo1 {
	public static void main(String[] args) {
		//创建对象
		//匿名对象 同样可以调用属性和方法
		//使用一次就要创建一个对象
		new Baby("lol",12);
		new Baby("lol",12).cry();
		//System.out.println(b.name+","+b.age);
		
		//匿名对象用于参数传递
		m(new Baby());
	}
	
	public static void m(Baby b){
		
	}
}


//婴儿
class Baby{
	
	//属性
	String name;
	int age;
	char gender;
	
	//构造代码块---属性初始化
	//构造代码块会在每个构造方法之前先执行
	{
		this.name = "lili";
		this.age = 1;
		System.out.println("构造代码块");
	}
	
	//无参构造方法
	public Baby() {
		// TODO Auto-generated constructor stub
		/*this.name = "lili";
		this.age = 1;*/
	}
	
	//有参构造
	public Baby(int age) {
		/*this.name = "lili";
		this.age = 1;*/
		//this.age = age;

	}
	
	//
	public Baby(String name,int age) {
		/*this.name = "lili";
		this.age = 1;*/
		//this.name = name;
		//this.age =age;
		System.out.println("有参");
	}
	
	
	//方法
	public void cry(){
		System.out.println(this.name+"在哇哇哇地哭。。。");
	}
	
}