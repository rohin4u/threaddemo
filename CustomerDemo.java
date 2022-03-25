package threaddemo;

public class CustomerDemo {
	
	public void m2(Stock stock) {
		
		System.out.println("Customer found stock empty");
		System.out.println(Thread.currentThread().getName()+" is in customerdemo class");

		
		
		synchronized (stock) {
			try {
				
			 stock.wait();
			 for(int i=0; i<=5; i++) {
				 System.out.println("Customer is waiting for the stock");
					Thread.sleep(2000);
			 }
			}catch(Exception e) {}
		}
		System.out.println("Customer got the stock");
		
		
	}

}
