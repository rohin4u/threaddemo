package threaddemo;

public class TestMain {

	public static void main(String[] args) {
		
		CustomerDemo cd = new CustomerDemo();
		ProducerDemo pd = new ProducerDemo();
		Stock stock = new Stock();
		
		CustomerThread ct = new CustomerThread(stock, cd);
		ProducerThread pt = new ProducerThread(stock, pd);
		
		ct.start();
		pt.start();
		
		
	}

}
