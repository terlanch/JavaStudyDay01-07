package cn.tedu.Array;

import java.util.Arrays;

/*
 * 	���������
 * 		1.�������������
 * 			i = 0  0  arr.length-1-0
 * 			i = 1  1  arr.length-1-1
 * 			i = 2  2  arr.length-1-2
 * 		2.
 */

public class NiXu {
	public static void main(String[] args) {
		//����һ������
		int[] arr = {1,2,3,4};
		
		/* //1.
		 * //������
		int[] arr1 = new int[arr.length];
		//����ѭ��һ�θ�ֵ
		for(int i = 0;i<arr.length;i++){
			arr1[arr.length-1-i] = arr[i];
		}
		//��ֵַ��ֵ
		arr = arr1;*/
		
		//2.
		for(int i = 0;i<arr.length/2;i++){
			//�����Ľ���
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-1-i] = temp;
		}
		//����arr
		System.out.println(Arrays.toString(arr));
	}

}
