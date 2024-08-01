package 数组;

/**
 * 条件
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，
 * 找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。
 * 如果不存在符合条件的子数组，返回 0。
 *
 * 例如：
 * 输入：s = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 */
public class 长度最小的子数组 {
    public static void main(String[] args) {
        int  [] num= {2,3,1,2,4,3};
        int s = 7;
        int res = mini(num,s);
        System.out.println("长度最小为"+res);
    }

//    法二，指针滑动窗口思想
    /**
     * 窗口就是 满足其和 ≥ s 的长度最小的 连续 子数组。
     * 窗口的起始位置如何移动：如果当前窗口的值大于等于s了，窗口就要向前移动了（也就是该缩小了）。
     * 窗口的结束位置如何移动：窗口的结束位置就是遍历数组的指针，也就是for循环里的索引。
     *
     */
    public  static  int mini(int[] nums,int s){
//        最终结果长度
        int res = Integer.MAX_VALUE;
//        子数组长度
        int subLong  = 0;
//        起始位置节点
        int i  = 0;
//        数组和
        int sum = 0;
//        末位置
        for(int j =0;j<nums.length;j++){
            sum+=nums[j];
            while (sum >= s){
//                子数组长度,因为j和i是索引下标，从零开始，所以要+1才是数组长度
                subLong = j - i +1;
                res = Math.min(res,subLong);
//                移动起始位置并减去移动前的索引所对应的值
                sum-=nums[i++];

            }
        }
//        是否被赋值没有就返回0，有就返回res
        return res == Integer.MAX_VALUE ? 0:res;
    }
}
