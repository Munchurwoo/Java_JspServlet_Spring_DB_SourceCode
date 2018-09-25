package org.kosta.springmvc13.model.vo;

public class PostVO {
	private int no;
	private String title;
	private String content;
	private int hits;
	private String timePosted;
	private MemberVO memberVO;
	public PostVO() {
		super();		
	}	
	public PostVO(int no, String title, String content, int hits,
			String timePosted, MemberVO memberVO) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.hits = hits;
		this.timePosted = timePosted;
		this.memberVO = memberVO;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public String getTimePosted() {
		return timePosted;
	}
	public void setTimePosted(String timePosted) {
		this.timePosted = timePosted;
	}
	public MemberVO getMemberVO() {
		return memberVO;
	}
	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}
	@Override
	public String toString() {
		return "PostVO [no=" + no + ", title=" + title + ", content="
				+ content + ", hits=" + hits + ", timePosted=" + timePosted
				+ ", memberVO=" + memberVO + "]";
	}
	
}
