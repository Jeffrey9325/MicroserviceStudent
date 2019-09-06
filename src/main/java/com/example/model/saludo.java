package com.example.model;

public class saludo {
	private final long id;
	private final String content;
	
	public saludo(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
	
}
