package cn.tedu.Array;

public class ZuiZhi {
	public static void main(String[] args) {
		//����һ������
		int[] arr = {12,45,23,56,78,65,85};
		//������
		int max = arr[0];
		//����ѭ��
		for(int i = 1;i<arr.length;i++){
			//�ж�
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
