package model;

import java.util.ArrayList;

public class Salad {
	private SaladType saladtype;
	private SaladSize size;
	private ArrayList<Sauces> sauces;
	public Salad(SaladType saladtype, SaladSize size, ArrayList<Sauces> sauces) {
		super();
		this.saladtype = saladtype;
		this.size = size;
		this.sauces = sauces;
	}
	public SaladType getSaladtype() {
		return saladtype;
	}
	public void setSaladtype(SaladType saladtype) {
		this.saladtype = saladtype;
	}
	public SaladSize getSize() {
		return size;
	}
	public void setSize(SaladSize size) {
		this.size = size;
	}
	public ArrayList<Sauces> getSauces() {
		return sauces;
	}
	public void setSauces(ArrayList<Sauces> sauces) {
		this.sauces = sauces;
	}
	@Override
	public String toString() {
		return "Salad [saladtype=" + saladtype + ", size=" + size + ", sauces=" + sauces + "]";
	}
	
	

}
