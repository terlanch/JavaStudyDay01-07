package cn.tedu.Array;

import java.util.Arrays;

/*
 * 	���������
 */

public class KuoRong {
	public static void main(String[] args) {
		//ԭ����
		int[] arr = {1,2,3,5,7};
		//������
		int[] arr1 = new int[arr.length];
		//(ԭ��������ԭ����Ŀ�ʼ���Ƶ���ʼ�±꣬����������
		//�����鿪ʼ���Ƶ���ʼ�±꣬����ԭ���鳤��)
		//System.arraycopy(arr,0,arr1,0,arr.length);
		
		//�ײ㻹�Ǹ���System.arraycopy()����ɵ�
		//���ص���һ��������
		//(ԭ���飬����֮�������ĳ���)
		int[] arr2 = Arrays.copyOf(arr, 2*arr.length);
		//����
		int[] arr3 = Arrays.copyOf(arr, arr.length/2);
		System.out.println(Arrays.toString(arr3));
		
		
		
	}

}
