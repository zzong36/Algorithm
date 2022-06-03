package kopo.day07;

import java.util.*;

public class Algorithm2 {

    public static void main(String[] args) {
//        우선 대문자로 바꿈
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String up = str.toUpperCase();

//        Set을 이용해 중복 없이 문자열에 포함된 알파벳 추출
        Set<String> set = new HashSet<>();
        for (int i = 0; i < up.length(); i++) {
            set.add(String.valueOf(up.charAt(i)));
        }
//        Set에 포함된 문자의 중복값을 모두 세고 그 값을 sum 배열에 저장
        String[] arr = set.toArray(new String[0]);
        int[] sum = new int[set.size()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < up.length(); j++) {
                if (String.valueOf(up.charAt(j)).equals(arr[i])) {
                    sum[i]++;
                }
            }
        }

//        가장 중복이 많은 값(max) 도출
        int max = -1;
        for (int i = 0; i < sum.length; i++) {
            int num = sum[i];
            if (max < num) {
                max = num;
            }
        }

//        가장 많이 사용된 알파벳 추출
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (sum[i] == max) {
                list.add(arr[i]);
            }
        }

        if (list.size() == 1) {
            System.out.println(list.get(0));
        } else {
            System.out.println("?");
        }

    }


}
