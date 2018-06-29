package com.prakash.splitarray;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * This class implements an algorithm to break a given the array into k pieces
 * Input:
 * 	- Array with n objects
 * 	- A number k. 
 * Expected output:
 * 	- A list of k arrays sliced out of original array. 
 * @author Prakash
 *
 */
public class SplitArray {
	
	public List<List<Sample>> split(List<Sample> inputList, int numberOfPieces){
		List<List<Sample>> splits = Lists.newArrayList();//inputList.size()/numberOfPieces
		
		
		
		return splits;
	}
	

}


class Sample{
	public int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}