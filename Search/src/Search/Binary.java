package Search;
public class Binary {

	public static void main(String[] args) {
		int[]a= {2,3,4,5,6,7,8,9,10,12,13};
		int srch=1;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		while(li<=hi) {
			if(a[mi]==srch) {
				System.out.println("element is present in our arr list "+mi+" index position");
				break;
			}
			else if(a[mi]<srch) {
				li=mi+1;
			}
			else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println(srch+" not found in the list");
		}
	}
}
