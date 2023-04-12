
public class Duplicatearray {

	public static void main(String[] args) {
	
		int arr[]= {2,1,5,8,4,0};
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0;j<arr.length-1;j++) {
				
				int temp;
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}

	}

}
