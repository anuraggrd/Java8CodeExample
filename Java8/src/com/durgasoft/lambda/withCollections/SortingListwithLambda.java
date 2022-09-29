package com.durgasoft.lambda.withCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingListwithLambda {
	public static void main(String args[] )
	{
		List<Integer> al = new ArrayList<>(Arrays.asList(5,8,9,6,74,35,44,99,45));
		
		
		Collections.sort(al,(i1,i2)-> (i1<i2)?1:(i1>i2)?-1:0 );
		System.out.println(al);
	}

}
