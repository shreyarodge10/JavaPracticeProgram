// logic 1st 

// public class FirstStringCapital {
//     public static void main(String[] args) {
//         String input = "hello world";
//         String result = capitalizeFirstLetter(input);
//         System.out.println(result); // Output: Hello world
//     }

//     public static String capitalizeFirstLetter(String str) {
//         if (str == null || str.isEmpty()) {
//             return str;
//         }
//         return str.substring(0, 1).toUpperCase() + str.substring(1);
//     }
// }



// 2nd logic
// public class   stringss{
//     public  static  String inputs (String one ,String two ){
//      one = "hello";
//      two="world!";
//       String output=one.substring(0,1).toUpperCase()+one.substring(1)+ " "+two.substring(0,1).toUpperCase() + two.substring(1);
//       return output;
//      }
//      public static void main(String args[]){
//          String result=inputs(" ", " ");
//          System.out.println(result);
//      }
// }

// logic 3rd
public class FirstStringCapital {
 public static void main(String[]args){
     String input1="hello";
     String input2="world";
     String  Output=
     input1.substring(0,1).toUpperCase()+input1.substring(1)+" "
+input2.substring(0,1).toUpperCase()+input2.substring(1);
 System.out.println(Output); // Output: Hello world
 }
}