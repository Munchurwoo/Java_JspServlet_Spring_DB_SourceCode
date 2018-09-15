package test;

import org.springframework.util.StopWatch;

class ProductService{
	public void getList() {
		//spring 함수 
		StopWatch watch = new StopWatch();
		watch.start();
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("상품목록을 조회");
		watch.stop();
		long time = watch.getTotalTimeMillis();
		System.out.println("소요시간:"+time);
	}
}
public class TestStopWatch {
	public static void main(String[] args) {
		ProductService ps=new ProductService();
		ps.getList();
	}
}
