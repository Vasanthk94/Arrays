import java.util.Arrays;
class ZigZag
{
	public static int[] test(int[]arr1,int[]arr2)
	{
		int[]arr3=new int[arr1.length+arr2.length];
		int j=0,k=0,i=0;
		while(i<arr3.length)
		{
			if(j<arr1.length)
			{
				arr3[i++]=arr1[j++];
			}
			if(k<arr2.length)
			{
				arr3[i++]=arr2[k++];
			}
		}
		return arr3;
	}
	public static void main(String[] args) {
		int[]arr1={10,20,30,40,50,60,70,80,90};
		int[]arr2={200,100};
		System.out.println(Arrays.toString(test(arr1,arr2)));
	}
}