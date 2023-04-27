import java.util.HashMap;
import java.util.Map;

public   class ThreadTest2 implements Runnable {
    private String key = "5";
    private Object value ="test5";
    @Override
    public synchronized void run() {
        Map<String,Object> map =new HashMap<String,Object>();
        map.put(key,value);
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
