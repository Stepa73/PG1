package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("první pole");
        byte pole1 = sc.nextByte();
        System.out.println("druhé pole");
        byte pole2 = sc.nextByte();
        int[][] nums = new int[pole1][pole2];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new int[pole2];
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        
        int vys = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                vys += nums[i][j];
            }
        }
        System.out.println(vys);
    }
}

