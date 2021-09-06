package com.partition;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.partition.Partition;

public class PartitonTest {

	private static ArrayList<Integer> list;
	private static ArrayList<ArrayList<Integer>> partitionlst;

	/**
	 *  Initialialisation des variables
	 */

	@BeforeClass
	public static void initializeTest() {
		Integer[] sub1 = { 1, 2, 3 };
		Integer[] sub2 = { 4, 5, 6 };
		ArrayList<Integer> subList1 = new ArrayList<Integer>(Arrays.asList(sub1)); // [1, 2, 3]
		ArrayList<Integer> subList2 = new ArrayList<Integer>(Arrays.asList(sub2)); // [4, 5, 6]
		list = new ArrayList<Integer>();
		partitionlst = new ArrayList<ArrayList<Integer>>();
		for (int i = 1; i < 7; i++) {
			list.add(i); // [1 , 2 , 3 , 4 , 5 , 6]
		}

		partitionlst.add(subList1); // [[1, 2, 3]]
		partitionlst.add(subList2); // [[1, 2, 3], [4, 5, 6]

	}

	@Test
	public void test() {

		assertEquals(partitionlst, Partition.partition(list, 3));
	}

	@AfterClass
	public static void cleanup() {

		list.clear(); // Vider List
		partitionlst.clear(); // Vider partitionlst
	}

}
