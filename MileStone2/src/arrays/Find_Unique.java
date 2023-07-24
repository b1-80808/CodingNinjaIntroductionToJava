package arrays;
import java.util.*;
public class Find_Unique {
	public static void main(String args[])
	{
		Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr[i]=sr.nextInt();
            }
            System.out.println(findUnique(arr));
           
            t -= 1;
        }
	}
	
	public static int findUnique(int[] arr){
	      int i =0;
			for(;i<arr.length;++i)
	      {
	        int j =0;
	        boolean isUnique = false;
	        for(;j<arr.length;++j)
	        {
	          if(i!=j)
	          {
	              if(arr[i] == arr[j])
	                {
	                  isUnique = true;
	                  break;
	                }
	          } ////
	        }
	        if(!isUnique)
	          return arr[i];
	      }
	      return arr[i];
	    }
}
