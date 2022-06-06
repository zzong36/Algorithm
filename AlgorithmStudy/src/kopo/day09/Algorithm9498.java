package kopo.day09;

import java.util.Scanner;

public class Algorithm9498 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = Integer.parseInt(sc.nextLine());

        Solution01 solution = new Solution01();
        solution.solution(score);
    }

}

class Solution01 {
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

