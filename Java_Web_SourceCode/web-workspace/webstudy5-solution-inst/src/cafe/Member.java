package cafe;

public class Member {
	private String nick;
	private String address;
	public Member(String nick, String address) {
		super();
		this.nick = nick;
		this.address = address;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Member [nick=" + nick + ", address=" + address + "]";
	}
	
}
