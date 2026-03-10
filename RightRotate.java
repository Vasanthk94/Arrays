import java.util.*;
class RightRotate{
	public static void main(String[] args) {
		int[]arr={1,2,3,4,5};
		System.out.println(Arrays.toString(rotate(arr)));
	}
	public static int[] rotate(int[]arr){
		int key=2;
		int[]b=new int[arr.length];
		int j=0;
		for (int i=arr.length-key;i<arr.length ;i++ ) 
		{
			b[j++]=arr[i];
		}
		for (int i=0;i<arr.length-key;i++) 
		{
			b[j++]=arr[i];
		}
		return b;
	}
}