import java.util.Arrays;
class ReverseArray2
{
	public static int[] test(int[]a)
	{
		int start=0 ,end=a.length-1 ,temp=0;
		while(start<end)
		{
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		return a;
	}
	public static void main(String[] args) {
		int[]a={10,70,60,40,50};
		System.out.println(Arrays.toString(test(a)));
	}
}