public class SSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }    
    }
    public static void main(String[] args) {
        int arr[]= {2,5,7,3,9,1,8};

        //Selection Sorting
        //Time complexity is =0(n^2)
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i ]>arr[j ]){
                    smallest=j;
                }
            }

            //Swapping
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printArray(arr);
    }
}
