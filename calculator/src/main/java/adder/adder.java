package adder;
import java.util.Scanner; 

public class adder {
//    public static int[] addX(int n, int arr[], int x)
//    {
//        int i;
//  
//        // create a new array of size n+1
//        int newarr[] = new int[n + 1];
//  
//        // insert the elements from
//        // the old array into the new array
//        // insert all elements till n
//        // then insert x at n+1
//        for (i = 0; i < n; i++)
//            newarr[i] = arr[i];
//  
//        newarr[n] = x;
//  
//        return newarr;
//    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("please type a number:");
		Scanner scan = new Scanner(System.in);
		
		int sum = 0 ;
		int count = 0 ;	
		int i = 0;
		int n = 10;
		String expression = "";
		String[] strArr = new String[n]; 
		int[] intArr = new int[n];
		
		while(scan.hasNextInt()) {
			System.out.print("(type any char to stop)\n");
			System.out.print("please type a number:");
			int x = scan.nextInt();
			intArr[count] = x;
			count = count + 1;
			sum = sum + x;
			if(count == n) {
				break;
			}
		} 
		while(i < count) {
			System.out.println(i + 1 + ":" + intArr[i]);
			strArr[i] = Integer.toString(intArr[i]);
			expression = expression + strArr[i];
			if(count - i > 1) {
				expression = expression + "+";
			} else {
				expression = expression + "=";
			}
			i++;
		}
		System.out.println(expression + sum);
		scan.close();
	}
}
