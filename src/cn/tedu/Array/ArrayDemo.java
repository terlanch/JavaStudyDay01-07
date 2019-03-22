package cn.tedu.Array;
/*
 * new---创建对象，开辟新的内存空间
 */
public class ArrayDemo {
	public static void main(String[] args) {
		/*//1.定义格式
		int[] arr = new int[2];
		//声明
		int[] arr1;
		//赋值
		arr1 = new int[3];
		arr[1] = 10;
		//输出数组名
		System.out.println(arr[1]);*/
		
		/*//2.定义格式
		int[] arr = new int[]{1,2,3};
		//声明
		int [] arr1;
		//赋值
		arr1 = new int[]{2,3,4};*/
		
		/*//3.定义格式
		//底层会自动进行开辟空间的操作
		int[] arr = {1,2,3};
		//ArrayIndexOutOfBoundsException
		//数组下标越界异常
		//arr[3] = 10;
		//声明
		int[] arr1;
		//赋值(错误)
		//没有new，就没有开辟新的内存空间
		//没有开辟空间就无法存储数据
		//arr1 = {2,3,4};*/
		
		
		/*//两个数组的引用指向同一块区域---共享这个区域
		int[] arr = new int[2];
		arr[0] = 10;
		int[] arr1 = {1,3,4};
		arr1[1] = 2;
		int[] arr2 = arr;
		arr2[0] = 11;
		System.out.println(arr[0]);*/
		
		
	
	}

}
