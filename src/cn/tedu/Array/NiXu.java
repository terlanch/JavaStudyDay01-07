package cn.tedu.Array;

import java.util.Arrays;

/*
 * 	数组的逆序
 * 		1.用新数组来解决
 * 			i = 0  0  arr.length-1-0
 * 			i = 1  1  arr.length-1-1
 * 			i = 2  2  arr.length-1-2
 * 		2.
 */

public class NiXu {
	public static void main(String[] args) {
		//创建一个数组
		int[] arr = {1,2,3,4};
		
		/* //1.
		 * //新数组
		int[] arr1 = new int[arr.length];
		//操作循环一次赋值
		for(int i = 0;i<arr.length;i++){
			arr1[arr.length-1-i] = arr[i];
		}
		//地址值赋值
		arr = arr1;*/
		
		//2.
		for(int i = 0;i<arr.length/2;i++){
			//整数的交换
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-1-i] = temp;
		}
		//遍历arr
		System.out.println(Arrays.toString(arr));
	}

}
