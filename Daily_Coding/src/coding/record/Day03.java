package coding.record;


//Question: Search elelemnt in a cyclic sorted array


public class Day03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={12,17,32,36,40,3,6,9,10,11};
	    int element=19;
	    int i,j,k,p=0;
	    int size=arr.length;
	    int l=0;
	    int pos=999;
	    int r=size-1;
	    int mid=(l+r)/2;
	    if(arr[0]<arr[size-1]){
	          while(l<=r){                            //binary search
	            if(element>arr[mid]){
	                l=mid+1;
	            }
	            else if(element<arr[mid]){
	                r=mid-1;
	            }
	            else{
	                p=1;
	                break;
	            }
	            
	            mid=(l+r)/2;
	        }
	    }
	    else{
	        
	        while(l<=r){                            //finding the start of the cclic sorted array 
	           if(arr[mid]>arr[mid+1]){
	                pos=mid+1;
	                break;
	        }
	            else if(arr[mid-1]>arr[mid]){
	                pos=mid;
	                break;
	            }
	        else if(arr[mid]>arr[r])
	            l=mid+1;
	       else if(arr[mid]<arr[l])
	            r=mid-1;
	        
	        mid=(l+r)/2;
	        
	        }
	        
	     //System.out.println(pos);   
	     
	     int l1=0,l2=pos;                   //2 sub arrays
	     int r1=pos-1,r2=size-1;
	     int mid1=(l1+r1)/2;
	     int mid2=(l2+r2)/2;
	     
	      while(l1<=r1){                            //binary search for one array
	            if(element>arr[mid1]){
	                l1=mid1+1;
	            }
	            else if(element<arr[mid1]){
	                r1=mid1-1;
	            }
	            else{
	                p=1;
	                break;
	            }
	            
	            mid1=(l1+r1)/2;
	        }
	     
	     
	      while(l2<=r2){                            //binary search for another aaray
	            if(element>arr[mid2]){
	                l2=mid2+1;
	            }
	            else if(element<arr[mid2]){
	                r2=mid2-1;
	            }
	            else{
	                p=1;
	                break;
	            }
	            
	            mid2=(l2+r2)/2;
	        }
	     
	     
	     
	        
	    }
	    
	    if(p==1){
	        System.out.println("found");
	    }
	    else
	         System.out.println("not found");

	}

}
