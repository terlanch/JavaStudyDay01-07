package cn.tedu.Array;

import java.util.Arrays;

public class BianLi {
	public static void main(String[] args) {
		//����
		int[] arr = {1,2,3,4};
		//���鳤��
		//System.out.println(arr.length);
		//����ѭ��
		
		/*//1.��ͨѭ��
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}*/
		
		//2.��ǿforѭ��---�ײ��ʵ���ǵ���
		//������Ԫ������  ������������������������
		//����������Ԫ�ؿ���һ���ù����������
		//��ǿforѭ��ֻ��������
		/*for(int i:arr){
			System.out.print(i+" ");
		}*/
		
		//3.ת���ַ������
		System.out.println(Arrays.toString(arr));
	}

}
