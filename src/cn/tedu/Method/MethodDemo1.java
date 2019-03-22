package cn.tedu.Method;
/*
 * 在一个类中，出现了方法名一致的方法---重载
 * 如果有精确匹配就进行精确匹配，如果没有精确匹配就进行相对精确的匹配
 * ，如果出现了多个相对精确的匹配就会报错，尽量提供精确匹配
 */
public class MethodDemo1 {
	public static void main(String[] args) {
		//方法名和参数列表共同作为方法标签
		System.out.println(sum(2,3));	
	}

	public static int sum(int i,int j){
		System.out.println("int int");
		return i+j;
	}
	
	public static double sum(int m,double n){
		System.out.println("int int");
		return m+n;
	}
	
	public static double sum(double d1,double d2){
		System.out.println("int int");
		return d1+d2;
	}
}