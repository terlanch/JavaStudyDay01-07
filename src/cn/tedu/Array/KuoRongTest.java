package cn.tedu.Array;

import java.util.Arrays;

/*
 * 		统计一个字符在字符串中的所有位置
 * 字符串：统计一个字符在字符串中的所有位置
 * 字符：'符'
 */
public class KuoRongTest {
	public static void main(String[] args) {
		
		/*char key = '符';
		String str = "统计一个字符在字符串中的所有位置";
		int[] count = new int[]{};
		for(int i = 0;i<str.length();i++){
			char c = str.charAt(i);
			if(c == key){
				//扩展count数组
				count = Arrays.copyOf(count, count.length+1);
				
				count[count.length-1] = i+1;
			}
		}
		System.out.println(Arrays.toString(count));*/
		
		
		
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6,7};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		int[] arr3 = Arrays.copyOf(arr1, arr1.length+arr2.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
		System.out.println(Arrays.toString(arr3));
	}

}
