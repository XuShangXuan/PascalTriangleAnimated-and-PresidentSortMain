package com.gjun.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PresidentSortMain {

	public static void main(String[] args) {

		President p1 = new President(1, "吼友宜", "A123456789", 165, 8000);
		President p2 = new President(2, "賴清得", "B123456789", 175, 9000);
		President p3 = new President(3, "柯文折", "C123456789", 185, 8000);
		President p4 = new President(4, "郭台名", "D123456789", 165, 8000);
		President p5 = new President(5, "李昱賞", "E123456789", 177, 8000);

		List<President> presidents = new ArrayList<>();
		presidents.add(p1);
		presidents.add(p2);
		presidents.add(p3);
		presidents.add(p4);
		presidents.add(p5);

		comparePresident(presidents);

		for (President president : presidents) {
			System.out.println(president);
		}

	}

	private static void comparePresident(List<President> presidents) {
		// 實作比較邏輯
		// 主排序:numberOfVotes(票數多)
		// 次排序:height(身高矮)
		// 次次排序:idNumber(字母愈後面的贏)

		Collections.sort(presidents, new ComparePresident());

	}

}

class President {

	private Integer candidateNo;

	private String name;

	private String idNumber;

	private Integer height;

	// 得票數
	private Integer numberOfVotes;

	public President(Integer candidateNo, String name, String idNumber, Integer height, Integer numberOfVotes) {
		this.candidateNo = candidateNo;
		this.name = name;
		this.idNumber = idNumber;
		this.height = height;
		this.numberOfVotes = numberOfVotes;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getNumberOfVotes() {
		return numberOfVotes;
	}

	public void setNumberOfVotes(Integer numberOfVotes) {
		this.numberOfVotes = numberOfVotes;
	}

	@Override
	public String toString() {
		return "President [candidateNo=" + candidateNo + ", name=" + name + ", idNumber=" + idNumber + ", height="
				+ height + ", numberOfVotes=" + numberOfVotes + "]";
	}

}

class ComparePresident implements Comparator<President> {

	@Override
	public int compare(President p1, President p2) {

		if (p2.getNumberOfVotes().compareTo(p1.getNumberOfVotes()) != 0) {
			return p2.getNumberOfVotes().compareTo(p1.getNumberOfVotes());
		}

		if (p1.getHeight().compareTo(p2.getHeight()) != 0) {
			return p1.getHeight().compareTo(p2.getHeight());
		}

		if (p2.getIdNumber().compareTo(p1.getIdNumber()) != 0) {
			return p2.getIdNumber().compareTo(p1.getIdNumber());
		}

		return 0;
	}

}
