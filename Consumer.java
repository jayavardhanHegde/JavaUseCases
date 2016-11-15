package in.java.general.java.problems.producer.consumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	
	private BlockingQueue<Message> queue;
	
	public Consumer(BlockingQueue<Message> q) {
		queue=q;
	}
	
	@Override
	public void run() {
		try {
			if(queue.isEmpty()){
				System.out.println("Queue is empty");
			}
			while(!queue.take().getMsg().equals("Exit")){
				Thread.sleep(1000);
				//queue.take();
				System.out.println("Consumption " + queue.take().getMsg());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
