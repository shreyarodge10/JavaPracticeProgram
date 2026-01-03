public class MissingNumberintoarray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10, 12};

        
        int missingCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            missingCount += (arr[i + 1] - arr[i] - 1);
        }

        
        int[] newArr = new int[arr.length + missingCount];

        int index = 0;

       
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[index++] = arr[i];

            while (arr[i] + 1 < arr[i + 1]) {
                newArr[index++] = ++arr[i];
            }
        }

      
        newArr[index] = arr[arr.length - 1];


        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
