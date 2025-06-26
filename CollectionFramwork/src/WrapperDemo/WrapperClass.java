package WrapperDemo;

public class WrapperClass {
    public static void main(String[] args) {
        Integer war = Integer.valueOf(33);       //wrapper object
        Integer war2 = Integer.valueOf("345");  //wrapper object
        System.out.println(war);
        System.out.println(war2);

        int obj = Integer.parseInt("2345");
        boolean boll =Boolean.parseBoolean("false");
        System.out.println(obj);
        System.out.println(boll);

        Integer in1 = 56;
        Integer in2= 56;
        System.out.println(in1==in2);

        Integer num1 = 5600;
        Integer num2= 56000;
        System.out.println(num1.equals(num2)); //content compaire
    }
}