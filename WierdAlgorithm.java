// ARRAYS JAY KISHAN OMAR
// ALL THE SMALL CONCEPTS WITH JAVA CODES


import java.util.*;

// QUES1: REVERSING THE ARRAY

//public class WierdAlgorithm {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		for (int i=0;i<n;i++) {
//			arr[i] = scan.nextInt();
//		}
//		int start = 0;
//		int end = arr.length-1;
//		int temp = 0;
//		while (start<end) {
//			temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//			start++;
//			end--;
//		}
//		for (int i = 0;i<n;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
//}




// QUES2: PRINT A GIVEN MATRIX IN SPIRAL FORM


//public class WierdAlgorithm {

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		int arr[][] = new int[n][m];
//		for (int i = 0;i<n;i++) {
//			for (int j = 0;j<m;j++) {
//				arr[i][j] = scan.nextInt();
//			}
//		}
//		int k = 0;
//		int l = 0;
//		while (k<n && l<m) {
//			for (int i=l;i<m;i++) {
//				System.out.print(arr[k][i]);
//			}
//			k++;
//			for (int i=k;i<n;i++) {
//				System.out.print(arr[i][m-1]);
//			}
//			m--;
//			if(k<n) {
//				for (int i=m-1;i>=l;--i) {
//					System.out.print(arr[n-1][i]);
//				}
//				n--;
//			}
//			if (l<m) {
//				for (int i = n-1;i>=k;--i) {
//					System.out.print(arr[i][l]);
//				}
//				l++;
//			}
//		}
//	}
//}




// QUES3: CONVERTIG ARRAY INTO ZIGZAG FORM


//public class WierdAlgorithm {

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		for (int i =0;i<n;i++) {
//			arr[i] = scan.nextInt();
//		}
//		boolean flag = false;
//		for (int i = 0 ;i<n-2; i++) {
//			if (flag) {
//				if (arr[i] < arr[i+1]) {
//					int temp = arr[i];
//				arr[i] = arr[i+1];
//					arr[i+1] = temp;
//				}
//			}
//			else {
//				if (arr[i] > arr[i+1]) {
//					int temp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = temp;
//				}
//			}
//			flag =! flag;
//		}
//		for (int i = 0;i<n;i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}
//}



// QUES4: COUNT TRIPLETS WITH SUM SMALLER THAN A GIVEN VALUE
//this code is applicable for the sorted array in increasing order



//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0; i<n ; i++) {
//			arr[i] = scan.nextInt();
//		}
//		int count = 0;
//		int sum = 5;
//		for (int i = 0;i<n-2;i++) {
//			int j = i+1;
//			int k = n-1;
//			while (j<k) {
//				if (arr[i]+arr[j]+arr[k] >= sum) {
//					k--;
//				}
//				
//				else {
//					count = count + (k-j);
//					j++;
//				}
//			}
//		}
//		System.out.print(count);
//	}
//}


// QUES 5: FINDING THE LENGTH OF THE LONGEST SUBARRAY WITH CONTIGUOUS ELEMENTS


//import java.lang.*;
//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int length = 1;
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0;i<n;i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		for (int i = 0;i<n-1;i++) {
//			int mn = arr[i];
//			int mx = arr[i];
//			for (int j = i+1;j<n;j++) {
//				mx = Math.max(mx, arr[j]);
//				mn = Math.min(mn, arr[j]);
//				if ((mx-mn) == j-i) {
//					length = Math.max(length, mx-mn+1);
//				}
//			}
//		}
//		System.out.println(length);
//	}
//}





// QUES 6: STOCK BUY AND SELL PROBLEM TO GET MAXIMUM PROFIT
//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] price = new int[n];
//		for (int i= 0;i<n;i++) {
//			price[i] = scan.nextInt();
//		}
//		int buy = 0;
//		int sell = 0;
//		int count = 0;
//		
//	}
//}





// QUES 7: FINDING COMMON ELEMENTS IN THREE SORTED ARRAY
//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int m = scan.nextInt();
//		int n = scan.nextInt();
//		int o = scan.nextInt();
//		int[] arr1 = new int[m];
//		int[] arr2 = new int[n];
//		int[] arr3 = new int[o];
//		for (int i = 0;i<m;i++) {
//			arr1[i] = scan.nextInt();
//		}
//		for (int i = 0;i<n;i++) {
//			arr2[i] = scan.nextInt();
//		}
//		for (int i = 0;i<o;i++) {
//			arr3[i] = scan.nextInt();
//		}
//		int s=0;
//		int t=0;
//		int u=0;
//		while ((s<m) && (t<n) && (u<o)) {
//			if ((arr1[s] == arr2[t]) && (arr1[s] == arr3[u])) {
//				System.out.print(arr1[s]+ " ");
//				s++;
//				t++;
//				u++;
//			}
//			else if(arr1[s] < arr2[t]) {
//				s++;
//			}
//			else if(arr2[t]<arr3[u]) {
//				t++;
//			}
//		}
//	}
//}





// QUES 8: FIND LARGEST PAIR SUM IN AN SORTED ARRAY(ascending order)

//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		int first = arr[0];
//		int second = 0;
//		for (int i = 0;i<n;i++) {
//			arr[i] = scan.nextInt();
//		}
//		for (int i = 0;i<n;i++) {
//			if (arr[i]>first) {
//				second = first;
//				first = arr[i];
//			}
//			else if (arr[i]>second) {
//				second = arr[i];
//			}
//		}
//			
//		System.out.print(first+second);
//	}
//}




// QUES 9:FINDING THE NUMBER OF OCCURENCE IN AN UNSORTED ARRAY

//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		for (int i = 0;i<n;i++) {
//			arr[i] = scan.nextInt();
//		}
//		int elem = 4;
//		int count = 0;
//		for (int i=1;i<n;i++) {
//			if (elem == arr[i]) {
//				count++;
//			}
//		}
//		System.out.print(count);
//	}
//}





// QUES 10: FIND THE PAIR WITH THE DIFFERENCE GIVEN IN A SORTED ARRAY(ASCENDING ORDER)


//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		Scanner scan =  new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		int a = 0;
//		int b = 1;
//		int diff = 5;
//		boolean flag = false;
//		for (int i=0;i<n;i++) {
//			arr[i] = scan.nextInt();
//		}
//		while (a<n && b<n) {
//			if (a != b && arr[b]-arr[a] == diff) {
//				System.out.println(arr[a]+ " " + arr[b]);
//				flag = true;
//			}
//			else if (arr[b]-arr[a]<diff) {
//				b++;
//			}
//			else {
///				a++;
//			}
//		}
//		if (flag == false) {
//			System.out.print("It does't have any pair of elements");
///		}
//	}
//}




// QUES 11: FIND A PAIR WITH MAXIMUM PRODUCT IN ARRAY
// HAVE TO WRITE CORRECT CODE 

//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		int mx = 0;
//		int mn = 0;
//		int temp1 = 0;
//		int temp2 = 0;
//		for (int i=0;i<n;i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		for (int i = 0;i<n;i++) {
//			temp1 = mx;
//			mx = Math.max(mx, arr[i]);
//			mn = Math.min(mn, arr[i]);
//			temp2 = mn;
//		}
//		int mul1 = mx*temp1;
//		int mul2 = mn*temp2;
//		if (mul1 > mul2) {
//			System.out.print(mx + " " + temp1);
//		}
//		else {
//			System.out.print(mn + " " + temp2);
//		}
//	}
//}





// QUES 11: FIND ALL TRIPLETS WITH GIVEN SUM
// FOR UNSORTED ARRAY
//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int arr[] = new int[n];
//		boolean flag = false;
//		for (int i = 0;i<n;i++) {
//			arr[i] = scan.nextInt();
//		}
//		int sum = 6;
//		for (int i =0;i<n-2;i++) {
//			for(int j=i+1; j<n-1;j++) {
//				for (int k = i+2;k<n;k++) {
//					if(arr[i]+arr[j]+arr[k] == sum) {
//						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
//						flag = true;
//					}
//				}
//			}
//		}
//	}
//}


//FIND THE TRIPLET OF GIVEN SUM FOR A SORTED ARRAY
//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int arr[] = new int[n];
//		boolean flag = false;
//		for (int i = 0;i<n;i++) {
//			arr[i] = scan.nextInt();
//		}
//		int sum = 6;
//		for (int i=0;i<n;i++) {
//			int j = i+1;
//			int k = n-1;
//			while(j<k) {
//				if (arr[i]+arr[j]+arr[k]==sum) {
//					System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
//					flag = true;
//				}
//				else if(arr[i]+arr[j]+arr[k]<sum) {
//					i++;
//				}
//				else {
//					k--;
//				}
//			}
//		}
//		if(flag == false) {
//			System.out.println("there is no such triplet");
//		}
//	}
//}


//FIND THE LENGTH OF UNSORTED 
//public class WierdAlgorithm
//{ 
//    public static void main(String[] args) 
//    { 
//      Scanner scan = new Scanner(System.in);
//      int n = scan.nextInt();
//      int arr[] = new int[n];
//      for (int i=0;i<n;i++) {
//    	  arr[i] = scan.nextInt();
//      }
//      for (int i = 0;i<n;i++) {
//    	  System.out.print(arr[i]+" ");
//      }
//      int j = 0;
//      int k = n-1; 
//      int i = 0;		  
//      int max =0;
//      int min = 0;    
//         
//      for (j = 0; j < n-1; j++) 
//      { 
//        if (arr[j] > arr[j+1]) 
//          break; 
//      } 
//      if (j == n-1) 
//      { 
//        System.out.println("The complete array is sorted"); 
//        return; 
//      } 
//         
//      for(k = n - 1; k > 0; k--) 
//      { 
//        if(arr[k] < arr[k-1]) 
//          break; 
//      }  
//      max = arr[j]; min = arr[j]; 
//      for(i = j + 1; i <= k; i++) 
//      { 
//        if(arr[i] > max) 
//          max = arr[i]; 
//        if(arr[i] < min) 
//          min = arr[i]; 
//      } 
//      for( i = 0; i < j; i++) 
//      { 
//        if(arr[i] > min) 
//        {   
//          j = i; 
//          break; 
//        }       
//      }   
//      for( i = n-1;i>=k+1; i--) 
//      { 
//        if(arr[i] < max) 
//        { 
//          k = i; 
//          break; 
//        }  
//      }    
//      System.out.println(j+" "+k);
//      System.out.print(n);
//      return; 
//    } 
//} 


//FIND THE EQUILIBRIUM INDEX OF AN ARRAY
//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		int arr[] = {-7, 1, 5, 2, -4, 3, 0};
//		int n = arr.length;
//		System.out.println(n);
//		int left_sum=0;
//		int right_sum=0;
//		for (int i=0;i<n;i++) {
//			for (int j=0;j<i;j++) {
//				left_sum += arr[j];
//			}
//			for (int k=i+1;k<n;k++) {
//				right_sum += arr[k];
//			}
//			if (right_sum==left_sum) {
//				System.out.print(i+" ");
//			}
//			left_sum=0;
//			right_sum=0;
//		}
//	}
//}

//EFFICIENT SOLUTION FOR THE ABOVE PROBLEM
//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		int arr[] = {-7, 1, 5, 2, -4, 3, 0};
//		int n = arr.length;
//		System.out.println(n);
//		int left_sum=0;
//		int sum=0;
//		for (int i=0;i<n;i++) {
//			sum += arr[i];
//		}
//		for (int i=0;i<n;i++) {
//			sum -= arr[i];
//			if(left_sum==sum) {
//				System.out.println(i+" ");
//			}
//			left_sum += arr[i];
//		}
//	}
//}


//SORTING AN ARRAY IN WAVE FORM
//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		int arr[] = {10,5,6,3,2,20,100,80};
//		int n = arr.length;
//		for (int i=0;i<n;i+=2) {
//			if(i>0 && arr[i-1]>arr[i]) {
//				int temp = arr[i];
//				arr[i] = arr[i-1];
//				arr[i-1] = temp;
//			}
//			if (i<n-1 && arr[i]<arr[i+1]) {
//				int temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;
//			}
//		}
//		for (int i=0;i<n;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
//}



// FIND THE SMALLEST AND SECOND SMALLEST ELEMENTS OF AN ARRAY
//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		int arr[] = {5,2,5,3,7,9,4,2,5,1,8};
//		int n = arr.length;
//		int first = arr[0];
//		int second = 0;
//		for (int i=0;i<n;i++) {
//			if(arr[i]<first) {
//				second=first;
//				first=arr[i];
//			}
//			else if(arr[i]<second) {
//				second=arr[i];
//			}
//		}
//		System.out.print(first+" "+second);
//	}
//}


//PROGRAM TO CYCLICALLY ROTATE AN ARRAY BY ONE STEP
//public class WierdAlgorithm{
//	public static void rotate(int arr[], int n) {
//		int x=arr[n-1];
//		int i=0;
//		for (i=n-1;i>0;i--) {
//			arr[i]=arr[i-1];
//		}
//		arr[0]=x;
//	}
//	public static void main(String[] args) {
//		int arr[]= {1,2,3,4,5};
//		int n=arr.length;
//		rotate(arr, n);
//		for(int i=0;i<n;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
//}



//PROGRAM TO CYCLICALLY ROTATE AN ARRAY BY M STEP
//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		int arr[]= {1,2,3,4,5,6,7};
//		int n=arr.length;
//		int m = 3;
//		int arr1[] = new int[n];
//		for (int i=n-1;i>=0;i--) {
//			if(i>=m) {
//				arr1[i]=arr[i-m];
//			}
//			if(i<m) {
//				arr1[i]=arr[n-(m-i)];
//			}
//		}
//		for (int i=0;i<n;i++) {
//			System.out.print(arr1[i]+" ");
//		}
//	}
//}



//FIND THE VLUE OF CONCATENATED BINARY NUMBER
//class WierdAlgorithm {
//    public int concatenatedBinary(int n) {
//        String str1 = "";
//        int sum = 0;
//        int modulo = 1000000007;
//        for (int i=1;i<=n;i++){
//            String str = Integer.toBinaryString(i);
//            str1 += str;
//        }
//        System.out.println(str1);
//        int len = str1.length();
//        System.out.println(len);
//        for(int i=0;i<len;i++) {
//        	int a = Character.getNumericValue(str1.charAt(i));
//        	//int b = a%modulo;
//       	int power = (len-i-1);
//        	double mod = Math.pow(2, power)%modulo;
//        	sum += (a*mod)%modulo;
//       	sum = sum%modulo;
//        }
//        return sum;
//    }
//    public static void main(String[] args){
//        int m = 418;
//        WierdAlgorithm wierd = new WierdAlgorithm();
//        System.out.print(wierd.concatenatedBinary(m));
//    }
//}




//THE NUMERIC VALUE OF THE LOWER CASE CHARACTER IS DEFINED AS ITS POSITION LIKE a SHOULD BE 1 AND b IS 2.
//THE NUMERIC VALUE OF THE STRING CONSISTING THE LOWERCASE CHARACTER SI DEFINED AS THE SUM OF THE CHARACTERS
//YPU ARE GIVEN TWO INTEGERS N AND K. RETURN THE LEXICOGRAPHICALLY SMALLEST STRING WITH LEGTH EQUAL TO n
//AND NUMERIC VALUE EQUAL TO K.
//public class WierdAlgorithm {
//    public String getSmallestString(int n, int k) {
//        int arr[] = new int[n];
//        String str = "";
//        int sum = n;
//        for (int m=0;m<n;m++){
//            arr[m] = 1;
//        }
//        for (int m=0;m<n;m++) {
//        	for (int j=2;j<27;j++) {
//        		if(sum==k) {
//        			break;
//        		}
//        		else {
//        			arr[n-m-1]+=1;
//        			sum+=1;
//        		}
//        	}
//        }
//        for (int m=0;m<n;m++){
//            char c = (char)(96+arr[m]);
//            str += Character.toString(c);
//        }
//        return str;
//    }
//    public static void main(String[] args) {
//    	int s = 5;
//    	int t = 73;
//    	WierdAlgorithm weird = new WierdAlgorithm();
//    	String o = weird.getSmallestString(s, t);
//    	System.out.print(o);
//    }
//}



//REVERSAL ALGORITHM OF AN ARRAY ROTATION BY D STEPS
//public class WierdAlgorithm{
//	static void reverse(int arr[], int d, int n) {
//		int temp;
//		while(d<n) {
//			temp=arr[d];
//			arr[d]=arr[n];
//			arr[n]=temp;
//			d++;
//			n--;
//		}
//	}
//	public static void main(String[] args) {
//		int arr[] = {1,2,3,4,5};
//		int n=arr.length;
//		int d=2;
//		d=d%n;
//		reverse(arr,0,d-1);
//		reverse(arr,d,n-1);
//		reverse(arr,0,n-1);
//		for (int i=0;i<n;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
//}



//FIND IF THERE IS A PAIR WITH A GIVEN SUM IN A SORTED AND ROTATED ARRAY
//I HAVE TO SEE IT AGAIN TO CLEAR OUT THE DOUBT
//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		int x = 10;
//		int i;
//		boolean flag=false;
//		int arr[] = {4,6,8,4,2,9,1};
//		int n=arr.length;
//		for (i=0;i<n-1;i++) {
//			if(arr[i]>arr[i+1]) {
//				break;
//			}
//		}
//		int l = (i+1)%n;
//		int r = i;
//		while(l!=r) {
//			if(arr[l]+arr[r]==x) {
//				flag=true;
//			}
//			else if(arr[l]+arr[r]<x) {
//				l=(l+1)%n;
//			}
//			else {
//				r=(n+r-1)%n;
//			}
//		}
//	}
//}





//CONVERT AN ARRAY TO REDUCED FORM
//HAVE TO CREATE EFFICIENT ALGORITHM
//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		int arr[]= {10,20,40,5,1,56,65,83,102};
//		int n = arr.length;
//		int temp[] = new int[n];
//		int ans[] = new int[n];
//		for (int i=0;i<n;i++) {
//			temp[i]=arr[i];
//		}
//		Arrays.sort(temp);
//		for (int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(arr[i]==temp[j]) {
//					ans[i]=j;
//				}
//			}
//		}
//		for(int i=0;i<n;i++) {
//			System.out.print(ans[i]+" ");
//		}
//	}
//}




//FIND THE MINIMUM VALUE SO THAT EVEN SIZE ARRAY BECOME BALANCED
//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		int arr[]= {1,2,1,2,1,3};
//		int n=arr.length;
//		int left_sum=0;
//		int right_sum=0;
//		for (int i=0;i<n;i++) {
//			if(i<n/2) {
//				left_sum+=arr[i];
//			}
//			else {
//				right_sum+=arr[i];
//			}
//		}
//		if(left_sum!=right_sum) {
//			int diff= Math.abs(left_sum-right_sum);
//			System.out.print(diff);
//		}
//		else {
//			System.out.print("The array is already equilibrium");
//		}
//	}
//}





//FIND SUBARRAY WITH GIVEN SUM FOR NON-NEGATIVE NUMBER
//public class WierdAlgorithm{
//	public static void main(String[] args) {
//		int arr[]= {1,4,0,0,3,10,5};
//		int n = arr.length;
//		int sum=1;
//		boolean flag=false;
//		for (int i=0;i<n;i++) {
//			int current_sum=arr[i];
//			for (int j=i+1;j<n;j++) {
//				if(current_sum==sum) {
//					System.out.println(i+" "+(j-1));
//					flag=true;
//				}
//				else if(i==n-1) {
//					break;
//				}
//				current_sum+=arr[j];
//			}
//		}
//		if(!flag) {
//			System.out.print("There is no such subarray");
//		}
//	}
//}



//A drawer contains socks of n different colours. The number of socks available of ith colour
//is given by a[i] where a is an array of n elements. Tony wants to take k pairs of socks out of
//the drawer. However, he cannot see the colour of the sock that he is picking. You have to tell what
//is the minimum number of socks Tony has to pick in one attempt from the drawer such that he can be
//absolutely sure, without seeing their colours, that he will have at least k matching pairs.

//import java.io.*;
//public class WierdAlgorithm {
// public static void main(String args[]) throws IOException {
//     Scanner sc = new Scanner(System.in);
//     int t = sc.nextInt();
//     while (t > 0) {
//         int n, k, ans;
//         n = sc.nextInt();
//         int[] a = new int[n];
//         for (int i = 0; i < n; i++) a[i] = sc.nextInt();
//         k = sc.nextInt();
//         Solution obj = new Solution();
//         ans = obj.find_min(a, n, k);
//         System.out.println(ans);
//         t--;
//     }
// }
//}

//class Solution {
// public int find_min(int[] a, int n, int k) {
//     int count=0;
//     int num=0;
//     int sum1=0;
//     int temp[] = new int[n];
//     for(int i=0;i<n;i++){
//         if(a[i]%2==0){
//             temp[i]=(a[i]-1)/2;
//         }
//         else{
//             temp[i]=a[i]/2;
//         }
//     }
//     for(int i=0;i<n;i++){
//         num=a[i]/2;
//         count+=num;
//         sum1+=temp[i];
//     }
//     System.out.println(count);
//     if(k>count){
//         return -1;
//     }
//     else if(k<=sum1){
//         return 2*(k-1)+n+1;
//     }
//     else{
//         return 2*sum1+n+(k-sum1);
//     }
// }
//}



//class Solution {
//	public int[] kWeakestRows(int[][] mat, int k) {
//		int[] count = new int[mat.length];
//
//		for(int i = 0; i < mat.length; i++){
//			int c = 0;
//			for(int j = 0; j < mat[0].length; j++){
//				if(mat[i][j] != 1) break;
//				c++;
//			}
//			count[i] = c;
//		}
//
//		int[] sorted = new int[count.length];
//
//		for(int i = 0; i < sorted.length; i++){
//			sorted[i] = count[i];
//		}
//
//		Arrays.sort(sorted);
//
//		int index = 0;
//		int[] res = new int[k];
//
//		while(index < k){
//			for(int i = 0; i < count.length; i++){
//				if(sorted[index] == count[i]){
//					res[index++] = i;
//					count[i] = -1;                
//					break;
//				}
//			}
//		}
//		return res;
//	}
//}



public class WierdAlgorithm {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int t = scan.nextInt();
      while(t--!=0){
          long x = scan.nextLong();
          long y = scan.nextLong();
          long ans = 0;
          long max = Math.max(x, y);
          long z = (max-1)*(max-1);
          if(max%2==0) {
        	  if(max == y) {
        		  ans = max + x;
        	  }
        	  else {
        		  ans = z+2*max-y;
        	  }
          }
          else {
        	  if(max == x) {
        		  ans = z+y;
        	  }
        	  else {
        		  ans = z+2*max-x;
        	  }
          }
          System.out.println(ans);
      }
    }
}




