package in.java.general.java.problems.producer.consumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	private BlockingQueue<Message> queue;
	
	public Producer(BlockingQueue<Message> q) {
		queue=q;
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			Message message = new Message("Production " + i);
			try {
				Thread.sleep(1000);
				queue.put(message);
				System.out.println("Produced " + message.getMsg());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Message exitMessage = new Message("Exit");
		try {
			queue.put(exitMessage);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
