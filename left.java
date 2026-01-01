// public class rightrotation {
//     public static void main(String args[]){
//        int a[]={10,20,30,40,50,60};
//       int n=a.length;
        
    
//         int temp2=a[n-1];
        
//         for(int i=n-1;i>0;i--){
//          a[i]=a[i-1];

//         }
//         a[0]=temp2;
//        System.out.println("right rotation array"); 
//        for (int i=0;i<n;i++){
//         System.out.print(a[i]+" ");
//        }
//     }
    
// }/


public  class left {
    public static void main(String args[]){
        int arr[]={10,20,30,40,50,60};
        int n=arr.length;
        int temp=arr[0];
        for(int i=0;i<n-1;i++){//
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }




    }
}
