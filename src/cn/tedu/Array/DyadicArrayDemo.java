package cn.tedu.Array;
/*��ά���鶨���ʽ
		int[] x;int x[];��Ч
*/		

import java.util.Arrays;

public class DyadicArrayDemo {
	public static void main(String[] args) {
		
		/*//1.�����ʽ
		int[][] arr  = new int[2][3];
		//[I@15db9742
		System.out.println(arr[0]);
		System.out.println(arr[0][1]);//0
		System.out.println(arr);//[[I@6d06d69c
		
		//2.�����ʽ
		int[][] arr1 = new int[2][];//��������һά����
		//arr1[0] = new int[3];
		//arr1[0] = new int[]{1,2,3};
		System.out.println(arr1[0]);//null
		//System.out.println(arr1[0][0]);//NullpointerExcepetion��ָ���쳣
		
		
		//3.�����ʽ
		int[][] arr2 = {{1,2,3},{4,5},{6,7,8,9}};
		System.out.println(arr2[0][0]);*/
		
		//����
		//��ά����
		int[][] arr = {{1,2,3},{4,5},{7,8,9}};
		//����ѭ��
		 for(int i = 0;i<arr.length;i++){
			 /*for(int j = 0;j<arr[i].length;j++){
				 System.out.print(arr[i][j]+" ");
				 
			 }
			 System.out.println("");*/
			 
			 System.out.println(Arrays.toString(arr[i]));
		 }
		
	}

}
