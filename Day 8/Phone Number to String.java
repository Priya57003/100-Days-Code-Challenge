import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String arr[]= sc.nextLine().split(" ");
		for(int i=0;i<arr.length;i++)
		{
		    int limit=1;
		    String str=arr[i];
		    if(str.equals("double"))
		    {
		        limit=2;
		        str=arr[i+1];
		        i++;
		    }
		    else if(str.equals("tripple"))
		    {
		        limit=3;
		        str=arr[i+1];
		        i++;
		    }
		    for(int j=0;j<limit;j++)
		    {
		        switch(str)
		        {
		            case "one":
		                System.out.println(1);
		                break;
		           case "two":
		                System.out.println(2);
		                break;
		           case "three":
		                System.out.println(3);
		                break;
		           case "four":
		                System.out.println(4);
		                break;
		           case "five":
		                System.out.println(5);
		                break;
		           case "six":
		                System.out.println(6);
		                break;
		           case "seven":
		                System.out.println(7);
		                break;
		                
		           case "eight":
		                System.out.println(8);
		                break;
		                
		           case "nine":
		                System.out.println(9);
		                break;
		        }
		    }
		}
	}
}

