package com.tnsif.comparableinterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class demo {
	public static void main(String[] args) {
		List<laptop> laps=new ArrayList<laptop>();
		laps.add(new laptop("dell" ,15,170000));
		laps.add(new laptop("lenova" ,12,180000));
		laps.add(new laptop("Hp" ,15,870000));
		laps.add(new laptop("apple" ,18,70000));
		
		Collections.sort(laps);
		for (laptop l:laps)
			System.out.println(l);
	}

}
