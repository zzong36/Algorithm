package kopo.day07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Algorithm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String str = "The Curious Case of Benjamin Button";
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());

    }
}
