public class Input {
    String str="str";
    public void method() throws NumberFormatException{
        try {
            Integer num = Integer.valueOf(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            //throw new NumberFormatException("转化异常");
        }finally {
            System.out.println("此处必执行");
        }
        /*Integer num = Integer.valueOf(str);
        System.out.println(num);*/
    }
}
