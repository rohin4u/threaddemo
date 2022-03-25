package threaddemo;

public class ProducerThread extends Thread{
	
	ProducerDemo pd;
	Stock stock;
	
	ProducerThread(Stock stock, ProducerDemo pd) {
		
		this.stock=stock;
		this.pd=pd;	
		System.out.println(Thread.currentThread().getName()+" is in ProducerThread");
	}	

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" is in run method");
		pd.producer(stock);	
	}

}
