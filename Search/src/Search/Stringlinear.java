package Search;

public class Stringlinear {

	public static void main(String[] args) {
		String []arr= {"abc","cdf","klp","jkl","opi","hny"};
		String item= "acl";
		String temp="aaa";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item)
			{
				System.out.println("the item "+item+" is present in position "+(i+1));
				temp="abc";
			}
		}
	if(temp=="aaa") {
		System.out.println("item "+item+" is not found in the list");
	}
  }

}
