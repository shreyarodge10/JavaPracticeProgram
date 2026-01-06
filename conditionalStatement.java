// public class ifelse {
//    public static void main(String args[]){
//     String s1="Hello";
//     String s2="hello";
    
//     if(s1.equals(s2)){
//         System.out.println("string is same");
//     }else {
//      System.out.println("String is not valid");
//     }
//    } 
// }
// public class ifelse{
//     public static void main(String args[]){
//      int i=10;
//      if(i==0){
//         System.out.println("no.is not zero");
//      } 
//      else{
//         System.out.println("")
//      }   
//     }
// }
// public class ifelse{
//     public static void main(String args[]){
//         int marks=78;
//         if (marks>=90){
//             System.out.println("grade A");
//         }else if(marks>=75){
//            System.out.println("grade b"); 

//         }else if (marks>=50){
//            System.out.println("grade C");  
//         }
//         else{
//            System.out.println("fail" );  
//         }
//     }
// }
// public class ifelse {
// public static void main(String[] args) {
//     int number=20;
//     if(number%2==0){
//         System.out.println("the number is even");
//     }else {
//         System.out.println("odd no.");
//     }
// }
// }
// public class ifelse {
//     public static void main(String args[]){
//         int a=10;
//         int b=20;

//         if (a>b){
//             System.out.println("the a is greater");
//         }else{
//             System.out.println("the b is grater");
//         }
//     }
// }


//gratest of three no.
// public class ifelse {
//     public static void main(String args[]){
//         int a=10;
//         int b=20;
//         int c=30;

//         if (a>c){
//             System.out.println("the a is greater");
//         }else if (a<b){
//             System.out.println("the b is grater");
//         }
//         else if (b<c){
//             System.out.println("the c is grater");
//         }
//         else{
//               System.out.println("the b is grater");
//         }
//     }
// }




//  leap year program

// import java.util.Scanner;
// public class ifelse{
// public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter a year:");
//     int year=sc.nextInt();

//     if(year%4==0 ){
//         System.out.println(year+" is a leap year");
//     }else{
//         System.out.println(year+" is not a leap year");
//     }


// }}




//pass or fail program
// import java.util.Scanner;
// public class ifelse{
//     public static void main( String args[]){
//         Scanner sc=new Scanner (System.in);
//          System.out.println("enter marks:");
//         int s =sc.nextInt();
//         // System.out.println("enter marks:");
       
//         if(s>=90){
//             System.out.println( "the student is pass A grade ");
//     }else if (s>=60){
//         System.out.println("the student is pass A grade");
//     }else if ( s>=50){
//         System.out.println("the student is paass  Cgrade");
//     }else{
//          System.out.println("Fail");
//     }
// }
// }/




// voting program
 
// import java .util.Scanner;
// public class ifelse{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter your age:");
//         int age=sc.nextInt();

//         if (age>=18){
//             System.out.println("you are eligible for voting");
//         }else{
//             System.out.println("you are not eligible for voting");
//         }
//     }
// }


// consonant and vowels 
// import java.util.Scanner;
// public class ifelse{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter a character:");
//         char ch=sc.next().charAt(0);
//         if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//             System.out.println(ch+" is vowel");
//         }else{
//             System.out.println(ch+" is consonant");
//         }
//     }
// }




// divisible by 5

// import java.util.Scanner;
// public class ifelse{
//     public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a number");
//         int a=sc.nextInt();
//         if( a%5==0){
//             System.out.println("divisible by 5");
//         }else{
//             System.out.println(" not divisible by 5"); 
//         }
//     }
// }


//no. should be even add divisible by 10 or 12

import java.util.Scanner;
public class conditionalStatement{
public static void main (String args []){
    Scanner sc=new Scanner(System.in);
    System.out.println("eneter a no");
    int a=sc.nextInt();
    if(a%2==0 ||a%10==0|| a%12==0 ){
        System.out.println("the number is divisvle by 10, 12 and it is evem");
}else {
     System.out.println("the number not  is divisvle by 10, 12 and it is evem");
}

}
}