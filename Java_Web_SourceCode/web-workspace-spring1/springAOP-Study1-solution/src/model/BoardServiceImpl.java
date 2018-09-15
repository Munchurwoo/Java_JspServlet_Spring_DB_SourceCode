package model;

public class BoardServiceImpl implements BoardService {
	@Override
	public void registerInfo(String info) {
		System.out.println("BoardService registerInfo :"+info);
		//공통관심사항
		
	}
	@Override
	public void getContentByNo(String no) {
		System.out.println("BoardService getContentByNo :"+no);
	}
	@Override
	public void deletePostByNo(String no) {
		System.out.println("BoardService deletePostByNo :"+no);
	}
	// 그 외 많은 메서드가 정의되어 있다고 치자 
}


