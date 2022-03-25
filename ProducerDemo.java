package threaddemo;

public class ProducerDemo {
	
	public void producer(Stock stock) {
		
		
		System.out.println("I am inside producer");
		System.out.println(Thread.currentThread().getName()+" is in producerDemo class");
		synchronized (stock) {
			
			stock.setId(101);
			stock.setName("Hair Oil");
			stock.setQuantity(455);
			
			
			for(int i=0; i<=5;i++) {
				System.out.println("Producer is updateing the queue");
				try {
				Thread.sleep(2000);
				}catch(Exception e) {e.printStackTrace();}
			}
			stock.notify();
			
		}
		System.out.println("Producer updated the stock");
		
		
	}

}
