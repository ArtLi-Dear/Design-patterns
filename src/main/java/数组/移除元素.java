package 数组;

/**
 *
 *
 */
public class 移除元素 {
    public static void main(String[] args) {
        int [] nums= {0,1,2,3,3,0,4,2};
        int value = 3;
         int [] a= create(nums,value);
        System.out.println("新数组："+a);
    }
//    方法一：暴力循环解决
    public static int[] create(int[] a, int v){
        int listSize = a.length;
//        先遍历整个数组
        for(int i =0; i< listSize;i++){
//            符合需要移除的元素时，就将整个数组下标索引的值，向前移动一位，覆盖原来的索引值
//            同时数组的长度和下标索引随之减少
            if(a[i] == v){
                for (int j = i+1;j< listSize;j++){
                    a[j-1] = a[j];

                }
                listSize--;
                i--;
            }
        }
        return  a;

    }

//    方法二：双指针法
//    定义两个参数，快指针和慢指针
    public static int Index(int[] nums,int value ){

        int slow =0;
//        当快指针不等于移除的目标值，就将快指针的索引值赋值给slow慢指针，慢指针也随之增加索引
//        当等于需要移除的目标值，就跳过此次传递，进入下一次循环
        for (int fast=0;fast<nums.length;fast++ ){
            if(nums[fast] != value){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
