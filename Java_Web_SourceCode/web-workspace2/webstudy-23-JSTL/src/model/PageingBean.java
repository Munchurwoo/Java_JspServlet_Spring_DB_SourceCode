package model;

public class PageingBean {
	private int startPage;
	private int endPage;
	private int nowPage;
	public PageingBean(int startPage, int endPage, int nowPage) {
		super();
		this.startPage = startPage;
		this.endPage = endPage;
		this.nowPage = nowPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public PageingBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	@Override
	public String toString() {
		return "PageingBean [startPage=" + startPage + ", endPage=" + endPage + ", nowPage=" + nowPage + "]";
	}
	
	
}
