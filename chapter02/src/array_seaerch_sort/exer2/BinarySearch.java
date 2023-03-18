package array_seaerch_sort.exer2;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 5, 8, 12, 15, 19, 26, 37, 49 ,51, 66, 89, 100};
        int valueNum = 5;
        int head = 0;//默认首索引
        int end = arr.length - 1;//默认尾索引
        boolean flag = false;
        while(head <= end){
            int mid = (head + end) / 2;
            if(valueNum < arr[mid]){
                end = mid - 1;
            }else if(valueNum > arr[mid]){
                head = mid + 1;
            }
            else if(valueNum == arr[mid]){
                System.out.println("找到了，其在数组中的位置是:" + mid);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("找不到");
        }
    }
}
