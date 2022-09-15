package Search;
public class Linear {

	public static void main(String[] args) {
		int []arr= {1,8,10,6,2,3,4};
		int item= 6;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item)
			{
				System.out.println("the item "+item+" is present in position "+(i+1));
				temp=temp+1;
			}
		}
	if(temp==0) {
		System.out.println("item "+item+" is not found in the list");
	}
  }

}
