import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        String[] arr = {"张颜宇", "张三", "张三", "赵五", "刘六", "王七"};
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        list.forEach((String s)->{
            System.out.println(s);
        });
               /* System.out.println(list);
        Stream<String> stream = list.stream();
        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        });*/
        System.out.println(list.stream().filter(num->
                num.contains("三")).collect(Collectors.toSet()));

       // System.out.println(list);




    }
}
