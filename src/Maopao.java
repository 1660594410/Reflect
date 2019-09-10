public class Maopao {
    //冒泡
    public static void maopao(int[] arr){
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int k:arr){
            System.out.print(k+" ");
        }
    }
    //折半
    public static void zheban(int arr[]){
        //5 3 4 1 2
        int low, high, mid;
        int tmp, j;
        for (int i = 1; i < arr.length; i++) {
            tmp = arr[i];
            low = 0;
            high = i - 1;
            while (low <= high) {
                mid = low + (high - low) / 2;
                System.out.println(mid+"*");
                if (arr[mid] > tmp)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            for (j = i - 1; j > high; j--) {
                arr[j + 1] = arr[j];
            }
            arr[high + 1] = tmp;
        }
        for (int k:arr){
            System.out.print(k+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {5,3,4,1,2};
//        maopao(arr);
        zheban(arr);
    }
}
