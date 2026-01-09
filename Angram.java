import java.util.Scanner;
import java.util.Arrays;
class  Angram{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		System.out.print("enter String:");
		String str=sc.nextLine();
		System.out.print("enter String:");
		String str2=sc.nextLine();

		char[] arr1=str.toLowerCase().toCharArray();
		char[] arr2=str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1,arr2)){
		    System.out.println("anagram");
		}else {
		    System.out.println("not anagaram");
		}

sc.close();
	}
}