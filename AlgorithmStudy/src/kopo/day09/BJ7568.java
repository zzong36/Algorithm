package kopo.day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ7568 {

    //    덩치
    public static void main(String[] args) {

        Solution7568 solution = new Solution7568();

        solution.solution();
    }

}

class Solution7568 {

    public void solution() {

        Scanner sc = new Scanner(System.in);

//        int num = Integer.parseInt(sc.nextLine());
        int num = 5;

//        String[] input = new String[num];
//        for(int i = 0; i<num; i++){
//            input[i]=sc.nextLine();
//        }
        String[] input = {"55 185", "58 183", "88 186", "60 175", "46 155"};

        int[] weight = new int[num];
        int[] height = new int[num];

        for (int i = 0; i < num; i++) {
            String[] str = input[i].split(" ");
            weight[i] = Integer.parseInt(str[0]);
            height[i] = Integer.parseInt(str[1]);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < weight.length; i++) {
            int cnt = 1;
            for (int j = 0; j < weight.length; j++) {
                if (weight[i] < weight[j]) {
                    if (height[i] < height[j]) {
                        cnt++;
                    }
                }
            }
            list.add(cnt);
        }
//        List<Integer> rankList = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            int rank = 1;
//            for (int j = 0; j < list.size(); j++) {
//                if (list.get(i) > list.get(j)) {
//                    rank++;
//                }
//            }
//            rankList.add(rank);
//        }
//
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }

}
