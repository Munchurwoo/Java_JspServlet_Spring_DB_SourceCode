package org.kosta.model.vo;

public class MovieVO {
	private String movieId;
	private String title;
	private String genre;
	private int attendance;;
	//has a 
	//mybatis mapper xml : #{변수명}
	//					   #{directorVO.directorId}
	private DirectorVO drDirectorVO;
	@Override
	public String toString() {
		return "MovieVO [movieId=" + movieId + ", title=" + title + ", genre=" + genre + ", attendance=" + attendance
				+ ", drDirectorVO=" + drDirectorVO + "]";
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public DirectorVO getDrDirectorVO() {
		return drDirectorVO;
	}
	public void setDrDirectorVO(DirectorVO drDirectorVO) {
		this.drDirectorVO = drDirectorVO;
	}
	public MovieVO(String movieId, String title, String genre, int attendance, DirectorVO drDirectorVO) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.attendance = attendance;
		this.drDirectorVO = drDirectorVO;
	}
	public MovieVO() {
		super();
		
	}
}
