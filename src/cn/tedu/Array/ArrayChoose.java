package cn.tedu.Array;


import java.util.Arrays;

public class ArrayChoose {
	public static void main(String[] args) {
		
		int[] arr = {3,2,1,6,5};
		
		for(int i = 1;i<arr.length;i++){
			for(int j = i-1;j<arr.length;j++){
				
				if(arr[i-1]>arr[j]){
					int temp = arr[i-1];
					arr[i-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//“ªæ‰ª∞≈≈–Ú
		//Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
