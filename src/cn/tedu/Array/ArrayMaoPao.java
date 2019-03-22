package cn.tedu.Array;


import java.util.Arrays;

/*
 * 	数组的冒泡排序
 */



public class ArrayMaoPao {
	public static void main(String[] args) {
		
		int[] arr = {7,8,4,2,9,3,6,5};
		//嵌套循环
		for(int i = 1;i<arr.length;i++){//控制比较的轮数
			for(int j = 1;j<=arr.length-i;j++){//控制的是参与操作的元素的个数
			//两两比较
				if(arr[j-1]>arr[j]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}	
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
