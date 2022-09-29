package com.durgasoft.BiFunction;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class ExampleOne {

	public static void main(String args[])
	{
		// BiFunction functional Interface
		BiFunction<Integer, Integer, Integer> f1 = (i1, i2) -> i1 + i2;
		System.out.println("Bi functional Interface :  " + f1.apply(10, 12));

		// Binary Operator for the equivalent f1 function
		BinaryOperator<Integer> f2 = (i1, i2) -> i1 * i2;
		System.out.println("Binary Operator : " + f1.apply(10, 12));

		// Primitive Binary Operator for equivalent f1
		IntBinaryOperator f6 = (i1, i2) -> i1 * i2;
		System.out.println("Primitive Binary Operator : " + f6.applyAsInt(10, 12));

		// Simple Function functional Interface
		Function<Integer, Integer> f3 = i -> i * i;
		System.out.println("Simple Functional : " + f3.apply(10));

		// Unary Operator for the equivalent f3 function
		UnaryOperator<Integer> f4 = i -> i * i;
		System.out.println("Unary Operator : " + f4.apply(10));

		// Primitive Unary Operator for the equivalent f3 function
		IntUnaryOperator f7 = i -> i * i;
		System.out.println("Primitive Unary Operator : " + f7.applyAsInt(12));

		// Primitive Function for the equivalent f3 function
		IntFunction f5 = i -> i * i;
		System.out.println("Primitive Function : " + f5.apply(10));
	}
	
}
