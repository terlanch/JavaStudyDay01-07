package cn.tedu.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrTest {
	public static void main(String[] args) {
		//数组获取最大值
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
		
		
		//数组元素反转（把元素对调）
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
		
		
		//数组查表法（根据键盘录入索引，查找对应星期）
		/*Scanner sc = new Scanner(System.in);
		int week = sc.nextInt();
		System.out.println("星期"+getweek(week));
	}

	private static char getweek(int week) {
		char[] arr = {' ','一','二','三','四','五','六','日'};
		return arr[week];*/
		
		
		//数组元素查找（查找指定元素第一次在数组中出现的索引）
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
		int j = 0;//变化量
		for( int i = 0 ;i<arr.length;i++){
			if(arr[i] == n){//判断n在不在数组中
				System.out.println(i);
				j++;
				break;
			} 
				
			}if(j == 0){
				System.out.println(-1);
			}*/
		
		
		//矩阵转置
		/*//原数组
		int[][] arr ={{1,2,3},{4,5,6}};
		//新数组
		int[][] arr1 = new int[arr[0].length][arr.length];
		
		//依次赋值
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				arr1[j][i] = arr[i][j];
			}
		}
		//遍历
		for(int i = 0;i<arr1.length;i++){
			for(int j = 0;j<arr1[i].length;j++){
			System.out.print(arr1[i][j]);
		}System.out.println();
	}*/
		
		
		//倒序
		/*int[] arr = {4,5,6,7,8};
		for(int i = 0;i<arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(arr));*/
		
		
		/*//杨辉三角
		int[][] arr = new int[5][5];
		
		//规律2：每一行第一个元素和最后一个元素都为1
		for(int i = 0;i<arr.length;i++){//遍历行数
			//第一列的元素
			arr[i][0] = 1;
			//每一行的最后一个元素
			arr[i][i] = 1;
		}
		
		//规律3：除了1之外的数等于上一行同一列与上一行同一列的数
		for(int i = 2;i<arr.length;i++){
			for(int j = 1;j<i;j++){
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			}
		}
		
		//遍历
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<= i;j++ ){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}*/
		
		//猴子选大王
		/*//布尔数组---表示猴子的状态
		boolean[] bs = new boolean[15];
		
		//初始化 true表示未淘汰  false表示淘汰
		for(int i = 0;i<bs.length;i++){
			bs[i] = true;
		}
		
		//猴子剩余数
		int monkeyleft = 15;
	
		//报数
		int num = 0;
		
		//数组下标
		int index = 0;
		//循环
		while(monkeyleft>1){
			//判断猴子是否已经被淘汰
			if(bs[index]){
				//开始报数
				num++;
				//直到num==7时淘汰猴子
				if(num==7){
					//报数置为0
					num = 0;
					//数组元素值为false
					bs[index] = false;
					//猴子数减少
					monkeyleft--;
				}
			}
			//下标往后移动一位
			index++;
			//保证围成一圈
			if(index == 15){
				index = 0;
			}
		}
		//遍历元素组
		for(int i = 0;i<bs.length;i++){
			if(bs[i]){
				System.out.println(i+1);
			}
		}*/
		
		//螺旋填数
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		//数组存储数据
		int[][] arr = new int[m][n];
		
		//行，列
		int col = 0;
		int row = 0;
		
		//第一个数为1
		arr[0][0] = 1;
		
		//控制方向的数组
		int[][] direction = {{0,1},//往右
							 {1,0},//往下
							 {0,-1},//往左
							 {-1,0}
							 };//往上
		
		//控制方向的数组的下标
		int directionIndex = 0;
		
		//循环依次赋值
		for(int i = 2;i<= m*n;i++){//自然数的赋值范围
			//得到新的坐标
			col = col + direction[directionIndex][0];
			row = row + direction[directionIndex][1];
			
			//判断越界的情况
			if((col>=m||col<0)||(row>=n||row<0)||(arr[col][row] != 0)){
				//下标回退
				col = col-direction[directionIndex][0];
				row = row-direction[directionIndex][1];
				//进行转向
				directionIndex++;
				//保证方向是循环的
				if(directionIndex == 4){
					directionIndex = 0;
				}
				
				//得到新的坐标值
				col = col+ direction[directionIndex][0];
				row = row+ direction[directionIndex][1];
			}
			
			//赋值
			arr[col][row] = i;
		}
		
		//遍历输出
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

