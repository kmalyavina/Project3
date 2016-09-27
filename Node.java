/* WORD LADDER Main.java
 * EE422C Project 3 submission by
 * Katya Malyavina
 * ym5356
 * 16465
 * Regan Stehle 
 * rms3762
 * 16465
 * Slip days used: 0
 * Git URL: https://github.com/kmalyavina/Project3
 * Fall 2016
 */

package assignment3;

import java.util.*;

/**
 * 
 * @author rstehle
 *Each word in dictionary becomes a Node, to create a graph where edges c
 *connect words that are separated by one letter
 */
public class Node {
	String word;
	int distance; //for BFS & DFS, marked as visited/unvisited
	//possibly just create a linked list of neighbors as an element here, to keep as an adjacency list
	LinkedList<String> neighbors; //if this is the way to parameterize this linked list
	//to create LinkedList of neighbors, change one letter in the word, check if its in the dictionary
	//cycle through alphabet, move to next letter of word, and repeat
	
	public Node (String wordIn){
		word = wordIn; 
		distance = -1; //distance is uninitialized/unvisited
		neighbors = new LinkedList<String>(); 
		for(int i=0; i< word.length() ; i++){
			String tempWord = word; //we can use tempWord to modify each letter in the word and 
									//compare it against dictionary entries
			
		}
	}
	
}
