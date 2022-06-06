package kopo.day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algorithm8958 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        String[] input = new String[num];
        for (int i = 0; i < num; i++) {
            input[i] = sc.nextLine();
        }

        Solution8958 solution = new Solution8958();

        solution.solution(num, input);
    }
}

class Solution8958 {
    public void solution(int num, String[] input) {

        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String[] inputArr = input[i].split("");
            list.add(inputArr);
        }

        for (int i = 0; i < num; i++) {

            int score;
            int sum;

            if (list.get(i)[0].equals("O")) {
                score = 1;
                sum = 1;
            } else {
                score = 0;
                sum = 0;
            }

            for (int j = 1; j < list.get(i).length; j++) {
                if (list.get(i)[j].equals("O") && list.get(i)[j - 1].equals("O")) {
                    score += 1;
                    sum += score;
                } else if (list.get(i)[j].equals("O") && list.get(i)[j - 1] != "O") {
                    score = 1;
                    sum += score;
                } else {
                    score = 0;
                    sum += score;
                }
            }
            System.out.println(sum);
        }

    }
}
