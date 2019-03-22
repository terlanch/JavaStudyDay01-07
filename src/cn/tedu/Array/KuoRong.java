package cn.tedu.Array;

import java.util.Arrays;

/*
 * 	数组的扩容
 */

public class KuoRong {
	public static void main(String[] args) {
		//原数组
		int[] arr = {1,2,3,5,7};
		//新数组
		int[] arr1 = new int[arr.length];
		//(原数组名，原数组的开始复制的起始下标，新数组名，
		//新数组开始复制的起始下标，复制原数组长度)
		//System.arraycopy(arr,0,arr1,0,arr.length);
		
		//底层还是根据System.arraycopy()来完成的
		//返回的是一个新数组
		//(原数组，操作之后的数组的长度)
		int[] arr2 = Arrays.copyOf(arr, 2*arr.length);
		//缩容
		int[] arr3 = Arrays.copyOf(arr, arr.length/2);
		System.out.println(Arrays.toString(arr3));
		
		
		
	}

}
