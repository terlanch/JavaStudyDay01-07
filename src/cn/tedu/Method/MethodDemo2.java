package cn.tedu.Method;
/*
 * 方法的传值
 * 		如果穿入的是基本数据类型就是值的拷贝
 * 		如果传入的是应用数据类型就是地址值的拷贝
 * 		如果这个拷贝的地址值找到了堆内存并进行了改动原值就会改动
 * 		如果没有找到堆内存就不影响
 */


public class MethodDemo2 {
	//所有的方法的 执行 都是在栈中
	public static void main(String[] args) {
		//int i = 2;
		//实参---实际参数
		//如果传入的是基本类型，就是值的拷贝
		//m(i);
		int[] arr = {1,2,3};
		//基本数据类型
		//m(arr[0]);
		//如果传入的是应用数据类型，拷贝地址值
		//mn(arr);
		change(arr);
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		//System.out.println(arr[0]);
	}
	public static void change(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0;i<arr.length;i++){
			arr[i] *= 2;
		}
	}
	//形参---接收值
	private static void m(int i) {
		// TODO Auto-generated method stub
		i++;
		
	}
	public static void n(int[] arr){
		 arr[0] = 10;
	}
	
	public static void mn(int[] arr){
		//拷贝之后的地址值被新的地址值覆盖
		arr = new int[]{2,3,4};
	}
	
}
