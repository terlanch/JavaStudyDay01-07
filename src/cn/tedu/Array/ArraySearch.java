package cn.tedu.Array;

public class ArraySearch {
	public static void main(String[] args) {
		//����
		int[] arr = {1,2,3,4,5};
		int num = 1;
		//int count = 0;
		/*for(int i = 0;i< arr.length;i++){
			if(arr[i] == num){
				System.out.println(i);
			}
		}*/
		
		
		//��ǿforѭ��
		/*for(int i :arr){
			if(i == num){
				System.out.println(count);
				break;
			}
			count++;*/
		
		
		//���ֲ���
		//�±�ֵ
		int min = 0;
		int max = arr.length;
		int mid = (min+max)/2;
		//��־λ
		boolean flag = true;
		//����ѭ�����ּ��±��Ӧ��Ԫ��ֵ�Ͳ��������бȽ�
		while(num != arr[mid]){
			//�м��±��Ӧ������Ԫ��ֵС�ڲ�����
			if(arr[mid]<num){
				min = mid+1;
			}
			//�м��±��Ӧ������Ԫ��ֵ���ڲ�����
			if(arr[mid]>num){
				max = mid-1;
			}
			
			//�жϲ��ڷ�Χ֮�ڵ���
			if(min>max){
				System.out.println("���޴���");
				flag = false;
				break;
			}
			
			//�µ��м��±�ֵ
			mid = (min + max)/2; 
		}
		//���
		if(flag)
		System.out.println(mid);
	}

}
