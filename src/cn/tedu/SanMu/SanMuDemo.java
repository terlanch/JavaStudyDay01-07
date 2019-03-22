package cn.tedu.SanMu;
/*三目（元）运算符
 * 	格式	
 * 		表达式（布尔值）？表达式1：表达式2；
 * 	执行流程：
 * 		先去计算表达式的值，如果这个值是true，就把表达式值1返回，如果是false就把表达式值2进行返回。
 */
public class SanMuDemo {
	public static void main(String[] args) {
		//求两个整数的最大值
		int a = 5;
		int b = 9;
		int c = 20;
		//有另一个变量来接受值的时候
		//要保证这个变量的类型和两个表达式值的类型一样
		int max = a > b?a : b;
		System.out.println(max);
		//两个表达式1 2值的类型可以不一样但是有个前提没有另一个变量来接受返回值。
		System.out.println(a>b?'a':true);
		//求三个整数的最大值
		//1.两两比较
		int max1 = a>b?a:b;
		int max11 = c>max1?c:max1;
		System.out.println("max："+max11);
		//2.三目嵌套
		System.out.println(a>b?(a>c?a:c):(b>c?b:c));
		
		
		
	}

}
