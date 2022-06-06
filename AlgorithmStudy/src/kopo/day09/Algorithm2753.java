package kopo.day09;

import java.util.Scanner;

public class Algorithm2753 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = Integer.parseInt(sc.nextLine());

        Solution02 solution = new Solution02();

        solution.solution(year);

    }

}

class Solution02 {

    public void solution(int year) {

        if(year%4 == 0 && year%100!=0 || year%400==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

}
