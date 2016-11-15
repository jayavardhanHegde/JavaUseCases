package in.java.general.java.problems.producer.consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerService {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Message> queue = new LinkedBlockingQueue<Message>();
		
		Thread producer = new Thread(new Producer(queue));
		Thread consumer = new Thread(new Consumer(queue));
		
		producer.start();
		consumer.start();
		consumer.join();
		
		/*ExecutorService producerService = Executors.newFixedThreadPool(10);
		
		for(int i=0;i<=5;i++){
			producerService.submit(new Thread(new Producer(queue)));
		}
		
		ExecutorService consumerService = Executors.newFixedThreadPool(10);
		for(int j=0;j<=5;j++){
			consumerService.submit(new Thread(new Consumer(queue)));
		}*/
		
		
		System.out.println("Producer and Consumer has been started");
	}

}
