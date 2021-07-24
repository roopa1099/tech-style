package coding.record;

public class Day06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int [] arr= {21,56,23,54};
		int r0=0,r1=0,r2=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]%3==0)
					r0++;
			else if (arr[i]%3==1)
				r1++;
			else if (arr[i]%3==2)
				r2++;
		}
		int pairs;
		pairs=(((r0-1)*r0)/2)+(r1*r2);
		System.out.println(pairs);

	}

}
