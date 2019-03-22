package cn.tedu.Array;
/*二维数组定义格式
		int[] x;int x[];等效
*/		

import java.util.Arrays;

public class DyadicArrayDemo {
	public static void main(String[] args) {
		
		/*//1.定义格式
		int[][] arr  = new int[2][3];
		//[I@15db9742
		System.out.println(arr[0]);
		System.out.println(arr[0][1]);//0
		System.out.println(arr);//[[I@6d06d69c
		
		//2.定义格式
		int[][] arr1 = new int[2][];//声明两个一维数组
		//arr1[0] = new int[3];
		//arr1[0] = new int[]{1,2,3};
		System.out.println(arr1[0]);//null
		//System.out.println(arr1[0][0]);//NullpointerExcepetion空指针异常
		
		
		//3.定义格式
		int[][] arr2 = {{1,2,3},{4,5},{6,7,8,9}};
		System.out.println(arr2[0][0]);*/
		
		//遍历
		//二维数组
		int[][] arr = {{1,2,3},{4,5},{7,8,9}};
		//操作循环
		 for(int i = 0;i<arr.length;i++){
			 /*for(int j = 0;j<arr[i].length;j++){
				 System.out.print(arr[i][j]+" ");
				 
			 }
			 System.out.println("");*/
			 
			 System.out.println(Arrays.toString(arr[i]));
		 }
		
	}

}
