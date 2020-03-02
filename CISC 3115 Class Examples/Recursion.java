public class Recursion{

	public static long pow(int base, int exp){

		if(exp==0)
			return 1;

		//recusive case
		return base * pow(base, exp-1);
	}

	public static long powFaster(int base, int exp){

		if(exp==0)
			return 1;

		long result = powFaster(base, exp/2);

		if(exp % 2 == 0)
			return result*result;
		else
			return result*result*base;
	}

	public static void print(int[] arr, int n){

		if(n==0)
			return;

		System.out.println(arr[n-1]);

		print(arr, n-1);

		/*

		Different way of doing code above

          if(n==0){
	         System.out.println(arr[n-1]);
	         print(arr, n-1);
          }

		*/
	}

	public static void printIter(int[] arr, int count, int n){

		if(count==n)
			return;

		System.out.println(arr[count]);

		printIter(arr, count+1, n);
	}

	public static hanoi(int n, string source, String dest, String aux){

           if(n==0)
           	return;

           hanoi(n-1, source, aux, dest);
           
           System.out.println(source + "->" + dest);

           hanoi(n-1, aux, dest, source);
	}

	public static void main(String[] args){
		System.out.println(powFaster(5, 500000000));

		int[] array = (1, 2, 3, 4, 5);
		print(array, 5);
	}
}