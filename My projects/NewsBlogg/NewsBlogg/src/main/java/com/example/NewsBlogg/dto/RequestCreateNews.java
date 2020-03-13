package com.example.NewsBlogg.dto;

public class RequestCreateNews extends RequestPassword{

	private String title;
	private String content;
	
	public RequestCreateNews(){
		super();
	}
	
	public RequestCreateNews(String login, String password) {
		super(login, password);
	}

	public RequestCreateNews(String login, String password, String title, String content) {
		super(login, password);
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	

}
