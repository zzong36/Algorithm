package kopo.day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 백준 2231번 분해합
public class Algorithm6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		List<Integer> answer = new ArrayList<>();

		// 분해합을 만족하는 수 조합 도출 6중 for문 사용
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					for (int l = 0; l < 10; l++) {
						for (int m = 0; m < 10; m++) {
							for (int n = 0; n < 10; n++) {
								if (num == (100001 * i + 10001 * j + 1001 * k + 101 * l + 11 * m + 2 * n)) {
									answer.add((100000 * i + 10000 * j + 1000 * k + 100 * l + 10 * m + n));
								}

							}
						}
					}
				}
			}
		}

		// 최소값 도출: 오름차순 정렬
		Collections.sort(answer);

		if (answer.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(answer.get(0));
		}

	}

}
