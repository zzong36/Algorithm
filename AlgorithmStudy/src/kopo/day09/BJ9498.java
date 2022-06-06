package kopo.day09;

import java.util.Scanner;

// 시험성적
public class BJ9498 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = Integer.parseInt(sc.nextLine());

        Solution9498 solution = new Solution9498();
        solution.solution(score);
    }

}

class Solution9498 {
    public void solution(int score) {
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}

