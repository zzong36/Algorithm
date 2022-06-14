package kopo.day10;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice {

    public static void main(String[] args) {
        String[] input = {"hello", "happy", "habit", "heavy", "hobby"};

        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {

            System.out.print(input[i] + " ");
        }
        System.out.println();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            int cnt = 0;
            for (int j = 0; j < input.length; j++) {
                int k = 0;
                while (k < input[i].length()) {
                    if (input[i].charAt(k) < input[j].charAt(k)) {
                        break;
                    } else if (input[i].charAt(k) == input[j].charAt(k)) {
                        cnt += 0;
                    } else {
                        cnt++;
                        break;
                    }
                    k++;
                }
            }
            list.add(cnt);
        }
        System.out.print(list);
    }
}
