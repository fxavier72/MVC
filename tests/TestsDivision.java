package tests;

import classes.Division;

public class TestsDivision {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Division division = new Division(10, "test");
		System.out.println(division.toString());
		System.out.println(division.getCode()+ " - "+ division.getLibelle());
		
		division.setCode(20);
		division.setLibelle("test2");
		System.out.println(division.toString());
		System.out.println(division.getCode()+ " - "+ division.getLibelle());
	}

}
