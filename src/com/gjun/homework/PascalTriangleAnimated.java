package com.gjun.homework;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleAnimated {

	public static void main(String[] args) {
		
		// 帕斯卡三角形
		/*
		1
		1 1
		1 2 1
		1 3 3 1
		1 4 6 4 1
		1 5 10 10 5 1
		*/
		
		int nubmer = 8;
		List<List<Integer>> pascals = createPascalTriangle(nubmer);

		for (List<Integer> i : pascals) {
			for (Integer i2 : i) {
				System.out.print(i2 + " ");
			}
			System.out.println();
		}

	}

	private static List<List<Integer>> createPascalTriangle(int numbers) {
		
		List<List<Integer>> pascals = new ArrayList<>();

		for (int i = 0; i < numbers; i++) {

			List<Integer> ary = new ArrayList();

			ary.add(0, 1);

			for (int j = 1; j < i; j++) {

				ary.add(pascals.get(i - 1).get(j) + pascals.get(i - 1).get(j - 1));

			}

			if (i > 0) {
				ary.add(1);
			}

			pascals.add(ary);

		}

		return pascals;
	}

}
