package cn.tedu.Array;

import java.util.Arrays;

public class BianLi {
	public static void main(String[] args) {
		//数组
		int[] arr = {1,2,3,4};
		//数组长度
		//System.out.println(arr.length);
		//操作循环
		
		/*//1.普通循环
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}*/
		
		//2.增强for循环---底层的实质是迭代
		//（数组元素类型  变量名：待遍历的数组名）
		//把所有数组元素拷贝一份拿过来进行输出
		//增强for循环只能做遍历
		/*for(int i:arr){
			System.out.print(i+" ");
		}*/
		
		//3.转成字符串输出
		System.out.println(Arrays.toString(arr));
	}

}
