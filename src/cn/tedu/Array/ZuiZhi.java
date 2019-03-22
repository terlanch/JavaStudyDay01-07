package cn.tedu.Array;

public class ZuiZhi {
	public static void main(String[] args) {
		//创建一个数组
		int[] arr = {12,45,23,56,78,65,85};
		//参照物
		int max = arr[0];
		//操作循环
		for(int i = 1;i<arr.length;i++){
			//判断
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
