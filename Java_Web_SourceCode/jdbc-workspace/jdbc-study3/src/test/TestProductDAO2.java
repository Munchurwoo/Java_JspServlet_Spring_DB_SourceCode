package test;

import model.ProductDAO;
import model.ProductVO;

public class TestProductDAO2 {
	public static void main(String[] args) {
		try {
			ProductDAO dao=new ProductDAO();
			ProductVO vo=new ProductVO("d","G6","LG",130);
			if(dao.findProductById(vo.getId())==null) {
				dao.register(vo);
				System.out.println(vo+" ��ϿϷ�");
			}else {
				System.out.println(vo.getId()+" ���̵� �����ϹǷ� ��ϺҰ�");
			}			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}













