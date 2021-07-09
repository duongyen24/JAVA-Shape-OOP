package com.logigear.oop.datatype;

public class datatype {
	
	//ex1
	
	
	public static char[] turnStringToArray(String input) {
		char[] charArray = new char[input.length()]; //char[] charArray ={ 'a', 'b', 'c', 'd', 'e' }; 
		for( int i =0; i < input.length(); i++) {
			charArray[i] =input.charAt(i);	//tra ve chuoi		
		}
		System.out.print(input+ "\n");
		for( int i =0; i < input.length(); i++) {
			System.out.print(charArray[i] + " ");
		}
		System.out.println();
		return charArray;
	}
	
	public static char[] reverseString(String input) {
		char[] result = new char[input.length()];
		for (int i = 0; i < input.length(); i++)
			result[i] = input.charAt(input.length() - i - 1);
		System.out.println("Reverse a string");
		System.out.println("   Input => " + input);
		System.out.print("   Output => ");
		System.out.println(result);
		return result;
	}

	/**
	 * Get an item in an array by index
	 *
	 * @param index index of item want to get
	 * @return item of array by input index
	 */
	public static char getArrayItem(char[] input, int index) {
		System.out.println("Get an item in an array by index");
		System.out.print("   Input Array => ");
		System.out.println(input);
		System.out.println("   Index => " + index);
		System.out.println("   Output => " + input[index]);
		return input[index];
	}
	
	

	/**
	 * Check if an item is existed in an array or not
	 * 
	 * @param item       input item to check
	 * @param inputArray input array
	 * @return boolean value to know if item exists in array or not
	 */
	public static boolean doesItemExist(char[] inputArray, char item) {
		boolean result = false;
		for (int i = 0; i < inputArray.length; i++)
			if (item == inputArray[i]) {
				result = true;
				break;
			}
		System.out.println("Check item exist in Array");
		System.out.print("   Input Array => ");
		System.out.println(inputArray);
		System.out.println("   Item => " + item);
		System.out.println("   Output => " + result);
		return result;
	}
	

	/**
	 * Count the repetitions of an item in an array
	 * 
	 * @param input input array to count item
	 * @return count the repetitions of an item in an array
	 */
	public static int countArrayItem(char[] input, char item) {
		int result = 0;
		for (int i = 0; i < input.length; i++)
			if (item == input[i])
				result++;
		System.out.println("Count the repetitions of an item in an array");
		System.out.print("   Input Array => ");
		System.out.println(input);
		System.out.println("   Item => " + item);
		System.out.println("   Output => " + result);
		return result;
	}
	

	/**
	 * Sort numbers using Bubble sort
	 * 
	 * @param input Int array which is unsorted
	 * @return Int array sorted
	 */
	public static int[] sortNumbers(int[] input) {
		System.out.println("Bubble sort");
		System.out.print("   Input => ");
		for (int i = 0; i < input.length; i++)
			System.out.print(input[i] + " ");
		System.out.println();
		
		for (int i = 0; i < input.length - 1; i++)
			for (int j = i + 1; j < input.length; j++)
				if (input[i] > input[j]) {
					input[i] = input[i] + input[j];
					input[j] = input[i] - input[j];
					input[i] = input[i] - input[j];
				}
		System.out.print("   Output => ");
		for (int i = 0; i < input.length; i++)
			System.out.print(input[i] + " ");
		System.out.println();
		return input;
	}

	public static int[] test(int[] input) {
		for( int i =0; i < input.length;i++) {
			System.out.print(input[i]);
		}
		//System.out.println();
		
		for( int i =0; i < input.length-1; i++) {
			for( int j = i +1; j < input.length; j++) {
				if(input[i]> input[j]) {
					input[i]= input[i]+ input[j];
					input[j]= input[i]- input[j];
					input[i]= input[i]- input[j];					
				}
			}			
		}
		for( int i =0; i < input.length; i++) {
			System.out.print(input[i]);
		}
	//	System.out.println();
		return input;
	}
	
	/**
	 * Print a Fibonacci Sequence with the input length
	 * 
	 * @param len input length to print the Fibonacci
	 */
	public static int[] printFibo(int len) {
		int[] fibo = new int[len];
		try {
			fibo[0] = 0;
			fibo[1] = 1;
			for (int i = 2; i < len; i++)
				fibo[i] = fibo[i - 2] + fibo[i - 1];
			System.out.println("Print a Fibonacci sequence with input lengh");
			System.out.println("   Input => " + len);
			System.out.print("   Output => ");
			for (int i = 0; i < len; i++)
				System.out.print(fibo[i] + " ");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Length of Fibo should be greater than 1: " + e);
		}
		return fibo;
	}

	/**
	 * Store the series of numbers from the Fibonacci Sequence to a two-dimensional
	 * array
	 * 
	 * @param row,col size of Fibo Array
	 */
	public static void fiboArray(int row, int col) {
		int[][] fiboArr = new int[row][col];
		int[] fibo = printFibo(row * col);
		System.out.println("Store the series of numbers from the Fibonacci Sequence to a two-dimensional array");
		System.out.println("   Input => " + row + ", " + col);
		System.out.print("   Output => { ");
		for (int i = 0; i < row; i++) {
			System.out.print("{ ");
			for (int j = 0; j < col; j++) {
				fiboArr[i][j] = fibo[i * col + j];
				System.out.print(fiboArr[i][j] + " ");
			}
			System.out.print("} ");
		}
		System.out.print("}");
	}

	/**
	 * Count pairs of socks
	 * 
	 * @param n,Array number of socks & socks in Array
	 */
	public static void countSockPair(int n, int[] ar) {
		int typeNo = 0;
		int[][] sockType = new int[n][2];
		int sockPairs = 0;
		for (int i = 0; i < n; i++) {
			boolean def = true;
			for (int j = i + 1; j < n; j++)
				if (ar[i] == ar[j])
					def = false;
			if (def) {
				sockType[typeNo][0] = ar[i];
				typeNo++;
			}
		}
		for (int i = 0; i < typeNo; i++) {
			for (int j = 0; j < n; j++)
				if (ar[j] == sockType[i][0])
					sockType[i][1]++;
			System.out.println(sockType[i][0] + " " + sockType[i][1]);
			sockPairs += sockType[i][1] / 2;
		}
		// return sockPairs;
		System.out.println("Pairs of socks: " + sockPairs);
	}
	
	
		
	
	
	

}
