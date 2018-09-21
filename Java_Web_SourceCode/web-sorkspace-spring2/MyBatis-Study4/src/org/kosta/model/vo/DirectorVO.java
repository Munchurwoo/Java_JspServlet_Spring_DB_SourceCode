package org.kosta.model.vo;

public class DirectorVO {
	private String directorId;
	private String directorName;
	private String intro;
	public DirectorVO() {
		super();
		
	}
	public DirectorVO(String directorId, String directorName, String intro) {
		super();
		this.directorId = directorId;
		this.directorName = directorName;
		this.intro = intro;
	}
	public String getDirectorId() {
		return directorId;
	}
	public void setDirectorId(String directorId) {
		this.directorId = directorId;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	@Override
	public String toString() {
		return "DirectorVO [directorId=" + directorId + ", directorName=" + directorName + ", intro=" + intro + "]";
	}
}
