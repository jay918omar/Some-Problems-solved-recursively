import java.util.*;
public class Solution {
	public static int path = 0;
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      int k = scan.nextInt();
      int l = scan.nextInt();
      String str = "";
      String str1 = scan.next();
      char[] arr1 = {'A','B','C'};
      int[] arr2 = {2, 3, 1};
      int m = arr2.length;
      int[] heights = {4,2,7,6,9,14,12};
      int bricks = 5;
      int ladders = 1;
//      consecutive(0, k, str);
//      System.out.print(fibbo(k));
//      System.out.print(fact(k));
//      natural_no(k);
//      System.out.print(natural_sum(k));
//      pattern1(k);
//      System.out.print(ques1(k));
//      System.out.print(ques2(k));
//      System.out.print(power1(k, l));
//      System.out.print(power2(k, l));
//      pattern2(k, 0);
//      pattern3(k, 0);
//      subset(arr, 0, arr.length, str);
//      System.out.print(sorted(arr2, 0, m));
//      matrix(0,0,k,l,str);
//      cell(0,k,str);
//      nSteps(k);
//      System.out.print(path);
//      lexico(k, 0);
//      permut(str1, str);
//  	permut1(str1, str);
//      permut2(str1, 0, str1.length()-1);
      building(heights, bricks, ladders, 1);
  	}
    public static void consecutive(int i, int n, String osf) {
		if(i==n) {
			System.out.println(osf);
			return;
		}
		consecutive(i+1, n, osf+"0");
		consecutive(i+1, n, osf+"1");
	}
    public static int fibbo(int n) {
    	if(n==0 || n==1) {
    		return n;
    	}
    	return fibbo(n-1)+fibbo(n-2);
    }
    public static int fact(int n) {
    	if(n==0 || n==1) {
    		return 1;
    	}
    	return n*fact(n-1);
    }
    public static void natural_no(int n) {
    	if(n==0) {
    		return;
    	}
    	natural_no(n-1);
    	System.out.print(n+" ");
    }
    public static int natural_sum(int n) {
    	if(n==1) {
    		return 1;
    	}
    	return n+natural_sum(n-1);
    }

    //To print the pattern 5,4,3,2,1,2,3,4,5
    public static void pattern1(int n) {
    	if(n==1) {
    		System.out.print("1 ");
    		return;
    	}
    	System.out.print(n+" ");
    	pattern1(n-1);
    	System.out.print(n+" ");
    }
    
    //To print the number of binary strings of length n with no consecutive ones.
    //for n=1, 0 & 1 so output is 2.
    //for n=2, 00 & 01 & 10 so output is 3.
    //for n=3, 000 & 001 & 010 & 100 & 101 so output is 5.
    public static int ques1(int n) {
    	if(n==1) {
    		return 2;
    	}
    	if(n==2) {
    		return 3;
    	}
    	return ques1(n-1)+ques1(n-2);
    }
    
    //There are n persons who wants to go to a party. There is a constraint that any person can either go
    //alone or can go in a pair. Calculate the number of ways in which n persons will go to party.
    public static int ques2(int n) {
    	if(n==1 || n==2) {
    		return n;
    	}
    	return ques2(n-1)+(n-1)*ques2(n-2);
    }
    
    //calculate a^b recursively
    public static int power1(int a, int b) {
    	if(b==0) {
    		return 1;
    	}
    	return a*power1(a, b-1);
    }
    
    //calculate a^b recursively
    public static int power2(int a, int b) {
    	if(b==0) {
    		return 1;
    	}
    	int temp = power2(a, b/2);
    	if(b%2==0) {
    		return temp*temp;
    	}
    	else {
    		return a*temp*temp;
    	}
    }
    
    //print the simple pattern recursively
    //* * *
    //* *
    //*
    public static void pattern2(int n, int i) {
    	if(n==0) {
    		return;
    	}
    	if(i<n) {
    		System.out.print("* ");
    		pattern2(n, i+1);
    	}
    	else {
    		System.out.println("");
    		pattern2(n-1, 0);
    	}
    }
    
    //to print the above pattern in revese order
    public static void pattern3(int n, int i) {
    	if(n==0) {
    		return;
    	}
    	if(i<n) {
    		pattern3(n, i+1);
    		System.out.print("* ");
    	}
    	else {
    		pattern3(n-1, 0);
    		System.out.println("");
    	}
    }
    
    //print all the subsets of an array
    public static void subset(char[] arr, int i, int n, String osf) {
    	if(i==n) {
    		System.out.println(osf);
    		return;
    	}
    	subset(arr, i+1, n, osf+Character.toString(arr[i]));
    	subset(arr, i+1, n, osf);
    }
    
    //to check if array is sorted
    public static boolean sorted(int[] arr, int i, int n) {
    	if(i==n-1) {
    		return true;
    	}
    	if(arr[i]>arr[i+1]) {
    		return false;
    	}
    	else {
    		return sorted(arr, i+1, n);
    	}
    }
    
    //You are given 2D matrix of dimension(n*m). You will start from top left cell & you want to go to 
    //bottom right. At each point you can move either right or down. Print & count all possible paths.
    public static void matrix(int i, int j, int n, int m, String osf) {
    	int total_path = 0;
    	if(i==n-1 && j==m-1) {
    		total_path+=1;
    		System.out.println(osf);
    		return;
    	}
    	if(i>=n || j>=m) {
    		return;
    	}
    	matrix(i, j+1, n, m, osf+"D ");
    	matrix(i+1, j, n, m, osf+"R ");
    }
    
    
    //There are n cells arranged in linear fashion. You have a dice with six faces [1,2,3,4,5,6]. You are
    //standing at 0th cell & want to reach (n-1)th cell. At each cell you can have six possible jumps to make.
    //In how many ways you can reach to (n-1)th cell.
    public static void cell(int i, int n, String osf) {
    	if(i==n) {
    		path++;
    		System.out.println(osf);
    		return; 
    	}
    	if(i>=n) {
    		return;
    	}
    	for(int j=1;j<=6;j++) {
    		cell(i+j,n,osf+Integer.toString(j)+" ");
    	}
    }
    
    
    //in how many ways a boy can raech nth step if he is allowed to climb only 1 step or 2 steps at a time.
    public static void nSteps(int n) {
    	if(n==0) {
    		path++;
    		return; 
    	}
    	if(n<0) {
    		return;
    	}
    	for(int j=1;j<=2;j++) {
    		nSteps(n-j);
    	}
    }
    
    //You will be given a value n, print first n+1 whole numbers in lexicographical order.
    public static void lexico(int n, int i) {
    	if(n<i) {
    		return;
    	}
    	System.out.print(i+" ");
		for(int j=(i==0)? 1:0; j<=9; j++) {
			lexico(n,10*i+j);
		}
    }
    
    //Given a string with all unique characters, print all permutations.
    public static void permut(String str, String perm) {
    	if(str.length()==0) {
    		System.out.println(perm);
    		return;
    	}
    	for(int i=0;i<str.length();i++) {
    		char ch = str.charAt(i);
    		String ros = str.substring(0, i)+str.substring(i+1);
    		permut(ros, perm+Character.toString(ch));
    	}
    }
    
    //or using swap function
    public static void permut2(String str, int left, int right) {
    	if(left==right) {
    		System.out.println(str);
    		return;
    	}
    	for(int i=left;i<=right;i++) {
    		str = swap(str, left, i);
    		permut2(str, left+1, right);
    		str = swap(str, left, i);
    	}
    }
    public static String swap(String str, int left, int i) {
    	char t;
    	char[] ch = str.toCharArray();
    	t = ch[left];
    	ch[left] = ch[i];
    	ch[i] = t;
    	return String.valueOf(ch);
    }
    
    //if the given string has similar characters
    public static void permut1(String str, String perm) {
    	if(str.length()==0) {
    		System.out.println(perm);
    		return;
    	}
    	HashSet<Character> hs = new HashSet<>();
    	for(int i=0;i<str.length();i++) {
    		char ch = str.charAt(i);
    		if(!hs.contains(ch)) {
    			String ros = str.substring(0,i)+str.substring(i+1);
    			hs.add(ch);
    			permut1(ros, perm+Character.toString(ch));
    		}
    	}
    }
}

