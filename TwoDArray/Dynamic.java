import java.util.Arrays;
class Dynamic
{
	public static void main(String[] args) {
		int [][] a={{10,20,30},{30,40,40}};
		for (int i=0;i<a.length ;i++ ) 
		{
			for (int j=0;j<a[i].length ;j++) 
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println(">>>>>>>>>>>>>>>");
		for(int[] arr:a){
			for(int element:arr){
				System.out.print(element+" ");
			}
			System.out.println();
		}
		System.out.println(">>>>>>>>>>>>>>>");
		System.out.println(Arrays.deepToString(a));
	}
}