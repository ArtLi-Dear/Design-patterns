package 数组;

import java.util.ArrayList;

/**
 *  非递减顺序 越来越大
 */
public class 有序数组的平方 {
    public static void main(String[] args) {
        int a [] ={-4,1,2,3,5};
        int[] sum = sum(a);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : sum) {
            list.add(i);
        }
        System.out.println(list);
    }

    /**
     * 双指针法
     *   从小到大排
     * @param nums
     * @return
     */
    public static int[] sum(int nums[]){
        int [] result = new int[nums.length] ;
        int i = 0;
//        索引代指从最后一个索引位置开始加入元素
        int j = nums.length - 1;
        int k = nums.length - 1;

        while (i <= j) {
//            当num[i]平方大于，就将num[j]的平方赋值给新数组
//            然后i指针向右移动一位
//            新数组指针k向左移动一位
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                result[k] = nums[i] * nums[i] ;
                i++;
                k--;
            } else {
                result[k] = nums[j] * nums[j];
            k--;
            j--;
            }
        };
        return result;

    }

}
