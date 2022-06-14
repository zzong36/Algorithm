package kopo.day10;

import java.util.HashSet;
import java.util.Scanner;

public class BJ1181 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < num; i++) {
            set.add(sc.nextLine());
        }
        String[] input = new String[set.size()];
        set.toArray(input);
//        String[] input = {"but", "i", "wont", "hesitate", "no", "more", "it", "cannot", "wait", "im", "yours"};

        Solution1181 solution = new Solution1181();
        solution.solution(input);
    }
}

class Solution1181 {
    public void solution(String[] input) {
        sizeSort(input, rank(input));
    }

    // SelectionSorts로 위치 순위대로 길이+사전식배열로 정렬
    public void sizeSort(String[] input, int[] rank) {
        for (int i = rank.length - 1; i > 0; i--) {
            int max = 0;
            for (int j = 1; j <= i; j++) {
                if (rank[j] > rank[max]) {
                    max = j;
                }
            }
            swapInt(rank, max, i);
            swapString(input, max, i);

        }
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }

    // 각 요소의 순위를 구함
    public int[] rank(String[] input) {
        int[] rank = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            int cnt = 0;
            int letter = 1;
            for (int j = 0; j < input.length; j++) {
                if (input[i].length() > input[j].length()) {
                    cnt++;
                }

                if (input[i].length() == input[j].length()) {
                    int k = 0;
                    while (k < input[i].length()) {
                        if (input[i].charAt(k) < input[j].charAt(k)) {
                            break;
                        } else if (input[i].charAt(k) == input[j].charAt(k)) {
                            letter += 0;
                        } else {
                            letter++;
                            break;
                        }
                        k++;
                    }

                }
            }
            rank[i] = (cnt * 50 + letter);
        }
        return rank;
    }

    // 자리 바꾸는 함수 String 버젼
    public static void swapString(String[] input, int i, int j) {
        if (i == j) {
            return;
        }

        String tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }

    // 서버에서
    public static void swapInt(int[] rank, int i, int j) {
        if (i == j) {
            return;
        }

        int tmp = rank[i];
        rank[i] = rank[j];
        rank[j] = tmp;
    }


}
