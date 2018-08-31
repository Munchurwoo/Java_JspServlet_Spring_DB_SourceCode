package TestArray;

public class Array {

	public static String[] member() {
		String[] member = { "Ã¶¿ì", "¹ÎÁö", "¹Ú¼ö" };
		return member;
	}

	public static void main(String[] args) {
		String[] member = member();
		for (int i = 0; i < member.length; i++) {
			System.out.println(member[i]);

		}
	}
}
