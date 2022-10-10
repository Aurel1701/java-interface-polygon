package com.soprasteria;

public class Main {
	

     public static void main(String[] args) {
		Cerchio a = new Cerchio(10);
		
		System.out.println(a.calcoloArea());
		System.out.println(a.calcoloPerimetro());
		
		Quadrato b = new Quadrato(5);
		
		System.out.println(a.calcoloArea());
		System.out.println(a.calcoloPerimetro());
	 }
}
