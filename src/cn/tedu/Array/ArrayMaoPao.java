package cn.tedu.Array;


import java.util.Arrays;

/*
 * 	�����ð������
 */



public class ArrayMaoPao {
	public static void main(String[] args) {
		
		int[] arr = {7,8,4,2,9,3,6,5};
		//Ƕ��ѭ��
		for(int i = 1;i<arr.length;i++){//���ƱȽϵ�����
			for(int j = 1;j<=arr.length-i;j++){//���Ƶ��ǲ��������Ԫ�صĸ���
			//�����Ƚ�
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
