package com.durgasoft.lambda.withCollections;

import java.util.TreeSet;

public class SortTreesetWithLamda {
// by default element of treeset is in assending  order but we have to make it as decending order 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(451);
		ts.add(52);
		ts.add(34);
		ts.add(44);
		ts.add(11);
		ts.add(33);ts.add(76);
		ts.add(64);ts.add(45);ts.add(66);ts.add(76);ts.add(47);
		System.out.println(ts);
		TreeSet<Integer> tt= new TreeSet<>((i1,i2)-> i2.compareTo(i1));//(i1.i2)-> (i1>i2)?-1:(i1<i2)1:0
		tt.add(451);
		tt.add(52);
		tt.add(34);
		tt.add(44);
		tt.add(11);
		
		tt.add(33);tt.add(76);
		tt.add(64);tt.add(45);tt.add(66);tt.add(76);tt.add(47);
		System.out.println(tt);
		}

}
