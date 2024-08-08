package MyArrary;

/**
 * 稀疏数组
 *
 * 题目：五子棋，记录两子的位置，用数组表述
 * 处理方法：
 * 记录数组一共几行几列，有多少个不同的0
 * 把具有不同值的元素的行列及值记录在一个小规模的数组中，从而缩小程序的规模
 *
 */
public class Sparsearry {
    public static void main(String[] args) {
//        创建一个二维数组
        //0表示没有棋子,1:白子,2:蓝子
        int [][] a = new int[11][11];
        a[1][2] = 1;
        a[2][4] = 2;

//        for (int[] ints : a) {
//            for (int i : ints) {
//
//            }
//            System.out.println("");
//        }


//        二维数组转稀疏数组的思路
//        1.遍历 原始的二维数组，得到有效数据的个数sum
//        2.根据sum就可以创建稀疏数组 sparseArr int[sum+1] [3]3.将二维数组的有效数据数据存入到稀疏数组
        int sum = 0;
        for (int i= 0; i< a.length;i++){
            for (int j =0;j<a[i].length;j++){
                if (a[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("有效数为:"+sum);

        int sparsearry[][] = new int[sum + 1][3];
        sparsearry[0][0] = 11;
        sparsearry[0][1] = 11;
        sparsearry[0][2] = sum;
        int count = 0;
        for (int i =0;i< 11;i++){
            for (int j = 0;j<11;j++){
                if (a[i][j] != 0) {
                    count++;
                    sparsearry[count][0] = i;
                    sparsearry[count][1] = j;
                    sparsearry[count][2] = a[i][j];

                }

            }
        }

        System.out.println("稀疏矩阵");
        for (int i= 0; i <sparsearry.length;i++){
            System.out.println(sparsearry[i][0]+"\t"+sparsearry[i][1]+"\t"+sparsearry[i][2]);
        }

//        稀疏数组转原始的二维数组的思路
//        1.先读取稀疏数组的第一行，根据第一行的数据，创建原始的二维数组，比如上面的 chessAr2=int[11][11]2.在读取稀疏数组后几行的数据，并赋给原始的二维数组即可，

        int [][] b = new int[sparsearry[0][0]][sparsearry[0][1]];
//        for (int i =0 ; i<b.length;i++){
//            for (int j = 0;j<b[i].length;j++){
//
//                if (b[i][j] != 0) {
//                    count++;
//                    b[i][j] = sparsearry[count1][j];
//                }
//
//            }
//        }
//        简化写法

        for (int i = 1;i < sparsearry.length;i++){

            b[sparsearry[i][0]][sparsearry[i][1]] =  sparsearry[i][2];
        }
        System.out.println("转换后的普通二维数组");
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.println("\t\n"+anInt);
            }
        }
    }
}
