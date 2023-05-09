import javax.print.attribute.HashAttributeSet;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.SimpleFormatter;

public class Main {
    public  static void main(String[] args) {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Set<Map<String,Object>> mapSet =new HashSet<Map<String, Object>>();
        Map<String,Object> map =new HashMap<String,Object>();
        map.put("1","test1");
        map.put("2","test2");
        map.put("3","");
        map.put("","test4");
        Map<String,Object> mapOne =new HashMap<String,Object>();
        mapOne.put("11","test11");
        mapOne.put("22","test22");
        mapOne.put("33","");
        mapOne.put("","test44");
        mapSet.add(map);
        String timeOne = formatter.format(System.currentTimeMillis());
        System.out.println("现在时间为："+timeOne);
        ThreadTest threadTest =new ThreadTest();
        Thread thread =new Thread(threadTest);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String timeTwo = formatter.format(System.currentTimeMillis());
        System.out.println("现在时间为："+timeTwo);
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> myself("测试开始:"));
        try {
            future.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println(future.toCompletableFuture());
        ThreadTest2 threadTest2 =new ThreadTest2();
        Thread thread1 =new Thread(threadTest2);
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
            
        }
        System.out.println(future);
        mapSet.add(mapOne);
        System.out.println(mapSet.toString());
    }
    private static String myself(String str){
        ThreadTest threadTestMyself =new ThreadTest();
        Thread threadMyself =new Thread(threadTestMyself);
        threadMyself.start();
        try {
            threadMyself.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String str1 ="测试完成:";
        return str+"5s"+str1;
    }
}