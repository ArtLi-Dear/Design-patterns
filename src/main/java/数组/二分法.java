package 数组;

public class 二分法 {
    /**
     * 前提是有序数组
     * 二分法查找目标数
     * @param args
     */
    public static void main(String[] args) {
        int [] array= {-1,0,3,5,9,12};
        int target = 0;
        int index = find1(array,target);
        System.out.println("目标索引为"+index);

    }
    public static int find1(int[] a, int t){
//        1.声明左右边界和中间数
        int l=0,r=a.length-1,m;

//        区间默认为左闭右闭的情况下
        while (l <= r){
            //        位运算，可以防止数过大而溢出
            m = (l+r) >>> 1;
            if(t == a[m]){
                return m;
            }
//            目标值落在左区间
            else if (t < a[m]) {
//                条件midlle下标已经小于目标值，在左区间的右边界就不能再等于m了
                r = m-1;
            } else  {
                l = m+1;
            }
        }
//        目标值不存在，就返回-1
        return -1;

    }
    public  static int find2(int [] a,int t ){
//        左闭右开的情况下
        int l=0,r = a.length,middle;
        while (l<r){
            middle = (l+r) >>>1;
            if(a[middle] < t){
                l = middle+1;
            } else if (a[middle] > t) {
                r = middle;

            }else {
                return middle;
            }
        }
        return -1;
    }





}
