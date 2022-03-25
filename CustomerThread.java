package threaddemo;

public class CustomerThread extends Thread{
	
	CustomerDemo cd;
	Stock stock;
	
	CustomerThread(Stock stock, CustomerDemo cd) {
		
		this.stock=stock;
		this.cd=cd;		
		System.out.println(Thread.currentThread().getName()+" is inside customerThread");
	}	

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" is in run method");
		cd.m2(stock);	
	}

}
