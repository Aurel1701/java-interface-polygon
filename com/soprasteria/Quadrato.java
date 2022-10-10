package com.soprasteria;

public class Quadrato {

	
    public final float lato;
	
	
	public Quadrato (float lato) {
		this.lato = lato;
	}
	
	
	public float calcoloPerimetro() {
		return 4*lato;
	}

	
	public float calcoloArea() {
		return lato*lato;
	}
	

}
