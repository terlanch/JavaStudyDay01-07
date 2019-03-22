package cn.tedu.Object;

/*
 * 类是对象的的概括，对象是类的具体实现
 * 
 * 构造方法
 * 		与类同名且没有返回值类型修饰的方法用于创建对象
 * 		以及属性初始化。如果类中没有构造方法JVM会自动添加无参构造，
 * 		如果类中已经有了构造方法JVM就不会再自动添加 允许重载
 */
public class ObjectDemo {
	public static void main(String[] args) {
		//创建person类的对象  对象名称---p
		//构造方法---用于构建对象
		Person p = new Person(10);
		//给属性进行赋值
		//.就是“的”的意思
		//p.age = 10;
		p.name = "莉莉";
		p.gender = '女';
		//输出
		//System.out.println(p.age);
		//方法调用
		p.eat();
		//传入的是引用数据类型
		//n(p);		
		//传入的是基本数据类型
		//m(p.age);
		System.out.println(p.age);//0
	}
	public static void m(int i){
		i++;
	}
	
	public static void n(Person p){
		p = new Person(10);
		p.age ++;
		p.eat();
	}
}
	
	//Person类
	class Person{
		//特征---属性
		static String name;//静态属性
		int age  ;
		char gender;
		
		//构造方法---1.与类同名 2.没有类型修饰
		//java规定如果类中没有构造方法，JVM就会在底层自动添加一个无参构造
		//public Person(){}
		
		
		//有参构造---对象属性进行初始化
		//构造方法允许重载
		//如果类中提供了构造方法，JVM就不会自动添加一个无参构造
		public Person(int age){//方法的就近原则
			//java就提供了一个关键字
			//this---代表的是当前类的对象
			this.age = age;	   //在java中所有的非静态的属性和方法都可以通过对象调用
		}
		//与类同名的普通方法
		public void Person(){}
		
		//行为---方法
		public void eat(){
			System.out.println(name+"在吃东西");
		}
		
		public void sleep(){
			System.out.println(name+"在睡觉");
		}
	}


