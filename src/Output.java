public class Output {
    public static void main(String[] args) {
        Input testOne = new Input();
        try {
            testOne.method();
        } catch (NumberFormatException e) {
            System.out.println(2);
        }
        System.out.println(3);
    }
}
