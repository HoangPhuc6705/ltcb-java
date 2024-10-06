package chuong_1;

import junit.framework.TestCase;

public class test extends TestCase {
	public void test_excercise11() {
		excercise_11 book1 = new excercise_11("Daniel Defoe", "Robinson Crusoe", 15.50, 1719);
		excercise_11 book2 = new excercise_11("Joseph Conrad", "Haert of Darkness", 12.80, 1902);
		excercise_11 book3 = new excercise_11("Pat Conroy", "Beach Music", 9.50, 1996);
	}
	
	public void test_excercise12() {
		excercise12 img1 = new excercise12(5, 10, "small.gif", "low");
		excercise12 img2 = new excercise12(120, 200, "med.gif", "low");
		excercise12 img3 = new excercise12(1200, 1000, "large.gif", "high");
	}
	
	public void text_excersize13() {
		
	}
	
	public void test_14() {
		ex14 time1 = new ex14(4, 12, 32);
	}
	
	public void testConstructor() {
		new house("Ranch", 7, 375000, new address(23, "Maple Street", "Brookline"));
		new book("Frieren", 45000, 2024, new author("Abe Tsukasa", 1993));
	}
	
}
