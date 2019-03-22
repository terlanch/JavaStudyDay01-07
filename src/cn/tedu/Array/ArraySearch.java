package cn.tedu.Array;

public class ArraySearch {
	public static void main(String[] args) {
		//数组
		int[] arr = {1,2,3,4,5};
		int num = 1;
		//int count = 0;
		/*for(int i = 0;i< arr.length;i++){
			if(arr[i] == num){
				System.out.println(i);
			}
		}*/
		
		
		//增强for循环
		/*for(int i :arr){
			if(i == num){
				System.out.println(count);
				break;
			}
			count++;*/
		
		
		//二分查找
		//下标值
		int min = 0;
		int max = arr.length;
		int mid = (min+max)/2;
		//标志位
		boolean flag = true;
		//操作循环那种见下表对应的元素值和查找数进行比较
		while(num != arr[mid]){
			//中间下标对应的数组元素值小于查找数
			if(arr[mid]<num){
				min = mid+1;
			}
			//中间下标对应的数组元素值大于查找数
			if(arr[mid]>num){
				max = mid-1;
			}
			
			//判断不在范围之内的数
			if(min>max){
				System.out.println("查无此数");
				flag = false;
				break;
			}
			
			//新的中间下标值
			mid = (min + max)/2; 
		}
		//输出
		if(flag)
		System.out.println(mid);
	}

}
