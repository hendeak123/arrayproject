package com.alyssa;

public class Main {

    public static void main(String[] args) {
	    int[][] multiplicationTable = new int[3][3];
	    configureTable(multiplicationTable);
    }

	private static void configureTable(int[][] multiplicationTable){
		multiplicationTable[1][1] = 1;
		multiplicationTable[1][2] = 2;
		multiplicationTable[2][2] = 4;
		System.out.println("2 x 2 = " + multiplicationTable[2][2] + ".");
		System.out.println("1 x 1 = " + multiplicationTable[1][1] + ".");
	}
}
