package model;

public class BoardServiceImpl implements BoardService {
	@Override
	public void registerInfo(String info) {
		System.out.println("BoardService registerInfo :"+info);
		//공통관심사항
		System.out.println(
				"BoardService registerInfo 메서드 실행 후 수행완료시간기록");
	}
	@Override
	public void getContentByNo(String no) {
		System.out.println("BoardService getContentByNo :"+no);
		//공통관심사항
				System.out.println(
						"BoardService getContentByNo 메서드 실행 후 수행완료시간기록");
	}
	@Override
	public void deletePostByNo(String no) {
		System.out.println("BoardService deletePostByNo :"+no);
		//공통관심사항
		System.out.println(
				"BoardService deletePostByNo 메서드 실행 후 수행완료시간기록");
	}
	// 그 외 많은 메서드가 정의되어 있다고 치자 
}


