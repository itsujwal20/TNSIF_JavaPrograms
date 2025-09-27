package com.tnsif.streamapi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class withstreamapi {
	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
		List<Integer> result=number.stream()
		.filter(n->n%2==0)
		.map(n->n)
		.sorted()
		.collect(Collectors.toList());
System.out.println(result);
}

	}

