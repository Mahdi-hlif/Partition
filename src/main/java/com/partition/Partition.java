/**
 * Classe "Partition" contient une fonction « partition » qui prend un paramètre « liste » et un paramètre « taille »
 * et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.
 * 
 * @version 1.0
 * @author Ben Rabia Mehdi
 */

package com.partition;

import java.util.ArrayList;
import java.util.List;

public class Partition {

	public static ArrayList<List<Integer>> partition(ArrayList<Integer> list, Integer size) {
		if (size <= 0 || size > list.size()) { // La zone "size" ne doit pas dépasser la taille de la list

			throw new NumberFormatException();
		}
		ArrayList<List<Integer>> partitionedList = new ArrayList<List<Integer>>(); // Création d'un "ArrayList" qui va contenir la partition de "list"
																					 
		int fromIndex = 0;// L’index de début
		int toIndex = size; // L’index de fin
		
		while (true) {
			List<Integer> subList = list.subList(fromIndex, toIndex);// Récupérer une partie de liste entre l’index «fromIndex » et l’index « toIndex »
																		
			partitionedList.add(subList);// insertion la sous liste "subList" dans "partitionedList"
			if (partitionedList.stream().flatMap(l -> l.stream()).count() == list.size()) {
				break;
			}
			fromIndex += size;
			toIndex += size;
			if (toIndex > list.size()) {
				toIndex = list.size();
			}
		}
		return partitionedList;
	}

	public static void main(String[] args) {
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		for (int i = 1; i < 7; i++) {
			mylist.add(i);
		}
		System.out.println(Partition.partition(mylist, 3));

	}

}
