package edu.gemini.callable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Пример использования интерфейса Callable в пуле потоков
 *
 * @author ASaburov
 */
public class CallableExample
{
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        final int COUNT = 20;
        
        List<Callable<String>> tasks = new ArrayList<Callable<String>>();
        for (int i = 0; i < COUNT; i++) {
            Callable c = new Callable<String>()
            {
                @Override
                public String call() throws Exception {
                    System.out.println("Inside 'call' 1");
                    Thread.sleep(5000);
                    System.out.println("Inside 'call' 2");
                    return "Hello world!!!";
                }
            };
            tasks.add(c);
        }

        System.out.println(new Date());
        ExecutorService es = Executors.newFixedThreadPool(COUNT/4);

        List<Future<String>> list = es.invokeAll(tasks);
        
        for(Future<String> s: list) {
            s.get();
        }
        System.out.println(new Date());
        
        es.shutdown();
    }
}
