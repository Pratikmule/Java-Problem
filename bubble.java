/*public class bubble {
    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main (String  args[]){
        int arr[]={5,4,1,3,2};
        bubblesort(arr);
        printArr(arr);
    }
}
*/
public class bubble {

    public static void BubbleSort(int[] arr, int n) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 4};
        int n = arr.length;
        
        BubbleSort(arr, n);
        
        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
