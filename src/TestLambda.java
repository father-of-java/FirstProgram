import java.util.ArrayList;

public class TestLambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
            System.out.println("first");
           }
        }).start();
        new Thread(()-> System.out.println("two")).start();
        ArrayList<String> list=new ArrayList<>();
        list.add("AAAAA");
        list.add("BBBBB");
        list.add("CCCCC");
        list.add("DDDDD");

    }
}
