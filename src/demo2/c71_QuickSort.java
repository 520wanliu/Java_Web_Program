package demo2;
/**
* 快速排序
* 通过一趟排序将待排序记录分割成独立的两部分，其中一部分记录的关键字比另一部分关键字小
* 则分别对这两部分进行排序，直到整个序列有序
 * @author 橙子
 * 2021-4-19
*/
public class c71_QuickSort {
    public static void main(String[] args) {
        int data[] = {9,-16,30,23,-30,-49,25,21,30};
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        quicksort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));
    }

    public static void quicksort(int[] data) {
        subsort(data,0,data.length - 1);
    }

    private static void subsort(int[] data, int start, int end) {
        if(start < end){
            int base = data[start];
            int low = start;
            int high = end + 1;
            while (true){
                while (low < end && data[++low] - base <= 0);
                while (high > start && data[--high] - base >= 0);
                if (low < high){
                    swap(data,low,high);
                }else break;
            }
            swap(data,start,high);
            subsort(data,start,high - 1);
            subsort(data,high+1,end);
        }
    }

    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
