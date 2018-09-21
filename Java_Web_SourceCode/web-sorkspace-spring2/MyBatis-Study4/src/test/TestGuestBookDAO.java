package test;

import java.util.List;

import org.kosta.model.dao.GuestBookDAO;
import org.kosta.model.vo.GuestBookVO;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestGuestBookDAO {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container =
				new ClassPathXmlApplicationContext("spring-mybatis.xml");
		GuestBookDAO dao = (GuestBookDAO)container.getBean("guestBookDAO");
		GuestBookVO vo = new GuestBookVO("뭘까.","수고하셨습니다.");
		System.out.println("insert 전"+vo); 	
		dao.insertGuestBook(vo);
		System.out.println("insert 후"+vo); //geuestBookNo -> 등록된 번호 
		System.out.println(vo+"insert ok~");
		//최신순으로 내림차순 정렬
		/*List<GuestBookVO> list = dao.getAllGuestBookList();
		for(GuestBookVO gvo : list)
			System.out.println(gvo);*/
		container.close();
		
	}
}
