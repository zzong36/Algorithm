package kopo.day09;

import java.util.Scanner;

// 윤년
public class BJ2753 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = Integer.parseInt(sc.nextLine());

        Solution2753 solution = new Solution2753();

        solution.solution(year);

    }

}

class Solution2753 {

    // 분리하는 습관을 가질 것
    public void solution(int year) {

        if(year%4 == 0 && year%100!=0 || year%400==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

}
