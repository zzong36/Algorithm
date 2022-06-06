package kopo.day09;

import java.util.Scanner;

public class Algorithm2739 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        Solution2739 solution = new Solution2739();

        solution.solution(num);
    }
}

class Solution2739{
    public void solution(int num){

        System.out.printf("%d * 1 = %d%n", num, num*1);
        System.out.printf("%d * 2 = %d%n", num, num*2);
        System.out.printf("%d * 3 = %d%n", num, num*3);
        System.out.printf("%d * 4 = %d%n", num, num*4);
        System.out.printf("%d * 5 = %d%n", num, num*5);
        System.out.printf("%d * 6 = %d%n", num, num*6);
        System.out.printf("%d * 7 = %d%n", num, num*7);
        System.out.printf("%d * 8 = %d%n", num, num*8);
        System.out.printf("%d * 9 = %d%n", num, num*9);
    }
}
