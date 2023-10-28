package collection;

import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Printuniquenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(3);
		number.add(3);
		number.add(2);
		number.add(1);
		number.add(2);
		
		//System.out.println(number);
		
		
		HashSet<Integer> hs = new HashSet<Integer>(number);
		System.out.println(hs);
	}

}
