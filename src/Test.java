import java.util.function.Consumer;

public class Test implements Consumer {
    @Override
    public void accept(Object o) {
        System.out.println(o);
    }
}
