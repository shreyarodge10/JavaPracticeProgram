// public class arraysingle2 {
//    public static void main(String args[]){
//     int a[]={100,200,300,400};
//     int max=a[0];
//     if (int i:a.length){
//         if (max<i)
//         {
//             max=i;
//         }
//         System.out.println(i);
//     }
//    } 
// }
// program to count even and odd in array nad there sum
// public class arraysingle2{
//     public static void main(String args[]){
//         int count=0;
//         int arr[]={10,20,30,40,50};
//    for(int i=0;i<arr.length;i++){
//     if(arr[i]%2==0){
//       count++;  
//     }
//    }
//    System.out.println("even no"+count);
//     }

// }/
public class arraysingle2{
    public static void main(String args[]){
        int ocount=0;
        int ecount=0;
        int arr[]={10,20,30,40,50,3};
   for(int i=0;i<arr.length;i++){
    if(arr[i]%2!=0){
      ocount++;  
    
    }
    else{

       ecount++; 
    }
   }
      System.out.println("odd no is:"+ocount);
 
  
        System.out.println("no is even"+ ecount);
        
    }

}






