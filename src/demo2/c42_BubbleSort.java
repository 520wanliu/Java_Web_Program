package demo2;
/*
数组的冒泡排序
 */
public class c42_BubbleSort {
    public static void main(String[] args) {
        int arr[] = {54,32,-34,46,24,-55,76,97,-47};

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
