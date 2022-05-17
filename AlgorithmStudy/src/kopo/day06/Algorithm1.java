package kopo.day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Algorithm1 {

	public static void main(String[] args) {
		String[] arr = { "()))())","(((()())()","(()())((()))","((()()(()))(((())))()","()()()()(()()())()","(()((())()("};
		List<Stack> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			Stack st = new Stack();
			for (int j = 0; j < arr[i].length(); j++) {
				if (!st.empty() && st.peek().equals('(') && arr[i].charAt(j) == (')')) {
					st.push(arr[i].charAt(j));
					st.pop();
					st.pop();
				} else {
					st.push(arr[i].charAt(j));
				}
			}
			list.add(st);
		}
		System.out.println(list);
		
		for(int i = 0; i <list.size(); i++) {
			if(list.get(i).empty()) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

	}
}

// 백준 제출용
/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());

		String[] arr = new String[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}

		List<Stack> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			Stack st = new Stack();
			for (int j = 0; j < arr[i].length(); j++) {
				if (!st.empty() && st.peek().equals('(') && arr[i].charAt(j) == (')')) {
					st.push(arr[i].charAt(j));
					st.pop();
					st.pop();
				} else {
					st.push(arr[i].charAt(j));
				}
			}
			list.add(st);
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).empty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}
}

 */


