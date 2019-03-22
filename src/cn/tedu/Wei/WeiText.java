package cn.tedu.Wei;
/*交换两个整数的值
 * 效率高低：2.按位异或（只能针对整数）  3.（一般是整数）  1.(简单常用 任意数据都可以)
 * 
 * 
 * 
 * */
public class WeiText {
	public static void main(String[] args) {
	int	a = 4;
	int	b = 5;
	//1.中间变量
	int temp = a;
		a = b;
		b = temp;
	//2.异或	
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	//3.求和
		a = a + b;
		b = a - b;
		a = a - b;
	System.out.println("a:"+a+",b:"+b);
	
	}

}
