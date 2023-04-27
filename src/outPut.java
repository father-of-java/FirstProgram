public class outPut {
    public static void main(String[] args) {
        Input input=new Input();
        try {
            input.testOne();
        } catch (Exception e) {
            System.out.println("two");
            throw new ArithmeticException("three");
        }
    }
}
