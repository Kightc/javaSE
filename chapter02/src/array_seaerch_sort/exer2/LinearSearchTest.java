package array_seaerch_sort.exer2;

public class LinearSearchTest {
    public static void main(String[] args) {

        //线性查找
        int[] arr1 = new int[]{34, 54, 3, 2, 65, 7, 34, 67, 76, 34, 5};
        //方式1
//        boolean isFlag = true;
//        for (int i = 0; i < arr1.length; i++) {
//            if(arr1[i] == 5){
//                System.out.println("找到了数组中的5对应的位置为:" + i);
//                isFlag = false;
//                break;
//            }
//        }
//        if(isFlag){
//            System.out.println("不好意思，没有找到此元素。");
//        }
        //方式2
        int i = 0;
        for (; i < arr1.length; i++) {
            if(arr1[i] == 5){
                System.out.println("找到了数组中的5对应的位置为:" + i);
                break;//这个break就很有意思了（如果5正好是数组的最后一个元素,这个break加和不加就有区别了）
            }
        }
        if(i == arr1.length){
            System.out.println("没有找到");
        }
    }
}