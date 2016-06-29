package br.com.amorim;

import java.math.BigInteger;

public class Greeting {

	private BigInteger id;
	private String text;
	
	public Greeting() {
		// TODO Auto-generated constructor stub
	}
	
	public Greeting(BigInteger id, String text) {
		super();
		this.id = id;
		this.text = text;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
	
}
