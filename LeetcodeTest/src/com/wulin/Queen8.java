package com.wulin;

//八皇后问题
public class Queen8 {
    int max = 8;
    int[] array = new int[max];
    static int count;

    public static void main(String[] args) {
        Queen8 queen8 = new Queen8();
        queen8.check(0);
        System.out.println(count);
    }

    private void check(int n){
        if (n == max){
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            array[n] = i;
            if (judge(n)){
                check(n+1);
            }
        }
    }

    private void print(){
        count++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    private boolean judge(int n){
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n]-array[i])){
                return false;
            }
        }
        return true;
    }
}
