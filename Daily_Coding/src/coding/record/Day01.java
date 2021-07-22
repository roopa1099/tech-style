package coding.record;

//Questtion:Gven an array find the smallest and second smallest element with time 
//complexity of O(n)

public class Day01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,7,8};
		int i,j,k,roopa;
		int smallest1=99999;
		int smallest2=99999;
		
		for(i=0;i<arr.length;i++){
		    if(arr[i]<smallest1){
		        smallest2=smallest1;
		        smallest1=arr[i];
		    }
		    
		    else if(arr[i]>smallest1 && arr[i]<smallest2){
		        smallest2=arr[i];
		    }
		    
		 

	}
		System.out.println(smallest1+" "+smallest2);

	}
}
