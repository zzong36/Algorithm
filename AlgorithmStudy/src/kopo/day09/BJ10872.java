package kopo.day09;

import java.util.Scanner;

// 팩토리얼
public class BJ10872 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        Solution10872 solution = new Solution10872();

        solution.solution(num);

    }
}

class Solution10872 {

    public void solution(int num) {
        System.out.println(recursiveFactorial(num));
    }

    public static int recursiveFactorial(int num) {
        // break condition
        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }

}

