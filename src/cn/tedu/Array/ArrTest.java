package cn.tedu.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrTest {
	public static void main(String[] args) {
		//�����ȡ���ֵ
		/*int[] arr = {12,45,78,23,56,89};
		int max = getmax(arr);
		System.out.println(max);
	}

	private static int getmax(int[] arr) {
		// TODO Auto-generated method stub
		int max = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		return max;*/
		
		
		//����Ԫ�ط�ת����Ԫ�ضԵ���
		/*int[] arr = {48,15,26,59,37,19};
		reverseArray(arr);
		print(arr);
	}

	private static void print(int[] arr) {
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}	
	}

	private static void reverseArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0 ;i<arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;	
		}	*/
		
		
		//�����������ݼ���¼�����������Ҷ�Ӧ���ڣ�
		/*Scanner sc = new Scanner(System.in);
		int week = sc.nextInt();
		System.out.println("����"+getweek(week));
	}

	private static char getweek(int week) {
		char[] arr = {' ','һ','��','��','��','��','��','��'};
		return arr[week];*/
		
		
		//����Ԫ�ز��ң�����ָ��Ԫ�ص�һ���������г��ֵ�������
		/*int[] arr = {11,22,33,44,55,66,77,88,99};
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int index = getIndex(arr,value);
		System.out.println(index);
	}

	private static int getIndex(int[] arr, int value) {
		// TODO Auto-generated method stub
		for(int i = 0;i<arr.length;i++){
			if(arr[i] == value){
				return i+1;
			}
		}
		return -1;*/
		
		
		/*int[] arr = {1,2,3};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = 0;//�仯��
		for( int i = 0 ;i<arr.length;i++){
			if(arr[i] == n){//�ж�n�ڲ���������
				System.out.println(i);
				j++;
				break;
			} 
				
			}if(j == 0){
				System.out.println(-1);
			}*/
		
		
		//����ת��
		/*//ԭ����
		int[][] arr ={{1,2,3},{4,5,6}};
		//������
		int[][] arr1 = new int[arr[0].length][arr.length];
		
		//���θ�ֵ
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				arr1[j][i] = arr[i][j];
			}
		}
		//����
		for(int i = 0;i<arr1.length;i++){
			for(int j = 0;j<arr1[i].length;j++){
			System.out.print(arr1[i][j]);
		}System.out.println();
	}*/
		
		
		//����
		/*int[] arr = {4,5,6,7,8};
		for(int i = 0;i<arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));*/
		
		
		/*//�������
		int[][] arr = new int[5][5];
		
		//����2��ÿһ�е�һ��Ԫ�غ����һ��Ԫ�ض�Ϊ1
		for(int i = 0;i<arr.length;i++){//��������
			//��һ�е�Ԫ��
			arr[i][0] = 1;
			//ÿһ�е����һ��Ԫ��
			arr[i][i] = 1;
		}
		
		//����3������1֮�����������һ��ͬһ������һ��ͬһ�е���
		for(int i = 2;i<arr.length;i++){
			for(int j = 1;j<i;j++){
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			}
		}
		
		//����
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<= i;j++ ){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}*/
		
		//����ѡ����
		/*//��������---��ʾ���ӵ�״̬
		boolean[] bs = new boolean[15];
		
		//��ʼ�� true��ʾδ��̭  false��ʾ��̭
		for(int i = 0;i<bs.length;i++){
			bs[i] = true;
		}
		
		//����ʣ����
		int monkeyleft = 15;
	
		//����
		int num = 0;
		
		//�����±�
		int index = 0;
		//ѭ��
		while(monkeyleft>1){
			//�жϺ����Ƿ��Ѿ�����̭
			if(bs[index]){
				//��ʼ����
				num++;
				//ֱ��num==7ʱ��̭����
				if(num==7){
					//������Ϊ0
					num = 0;
					//����Ԫ��ֵΪfalse
					bs[index] = false;
					//����������
					monkeyleft--;
				}
			}
			//�±������ƶ�һλ
			index++;
			//��֤Χ��һȦ
			if(index == 15){
				index = 0;
			}
		}
		//����Ԫ����
		for(int i = 0;i<bs.length;i++){
			if(bs[i]){
				System.out.println(i+1);
			}
		}*/
		
		//��������
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		//����洢����
		int[][] arr = new int[m][n];
		
		//�У���
		int col = 0;
		int row = 0;
		
		//��һ����Ϊ1
		arr[0][0] = 1;
		
		//���Ʒ��������
		int[][] direction = {{0,1},//����
							 {1,0},//����
							 {0,-1},//����
							 {-1,0}
							 };//����
		
		//���Ʒ����������±�
		int directionIndex = 0;
		
		//ѭ�����θ�ֵ
		for(int i = 2;i<= m*n;i++){//��Ȼ���ĸ�ֵ��Χ
			//�õ��µ�����
			col = col + direction[directionIndex][0];
			row = row + direction[directionIndex][1];
			
			//�ж�Խ������
			if((col>=m||col<0)||(row>=n||row<0)||(arr[col][row] != 0)){
				//�±����
				col = col-direction[directionIndex][0];
				row = row-direction[directionIndex][1];
				//����ת��
				directionIndex++;
				//��֤������ѭ����
				if(directionIndex == 4){
					directionIndex = 0;
				}
				
				//�õ��µ�����ֵ
				col = col+ direction[directionIndex][0];
				row = row+ direction[directionIndex][1];
			}
			
			//��ֵ
			arr[col][row] = i;
		}
		
		//�������
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

