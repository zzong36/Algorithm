package kopo.day09;

import java.util.Scanner;

public class BJ1436 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        Solution1436 solution = new Solution1436();
        solution.solution(input);

    }
}

class Solution1436 {

    public void solution(int input) {
        int cnt = 0;
        int num = 0;
        while (true) {
            cnt++;
            if (String.valueOf(cnt).contains("666")) {
                num++;
            }
            if (num == input) {
                System.out.println(cnt);
                break;
            }
        }
    }

}
