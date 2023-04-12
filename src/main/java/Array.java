
public class Array {

	public static void main(String[] args) {
		int arr[]= {1,5,6,8,9};
	    int temp=0;
	    temp=arr[1];
	    arr[1]=arr[4];
	    arr[4]=temp;
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}

}
