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

// logic 2nd
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