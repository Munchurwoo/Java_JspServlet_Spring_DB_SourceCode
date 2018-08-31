package org.kosta.model;

public class BoardDTO {
	private int post_no ;
	private String id ;
	private String title;
	private String regdate;
	private int hits;
	private String contents;
	public BoardDTO(int post_no, String id, String title, String regdate, int hits, String contents) {
		super();
		this.post_no = post_no;
		this.id = id;
		this.title = title;
		this.regdate = regdate;
		this.hits = hits;
		this.contents = contents;
	}
	public BoardDTO() {
		super();
	}
	public int getPost_no() {
		return post_no;
	}
	public void setPost_no(int post_no) {
		this.post_no = post_no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
}
