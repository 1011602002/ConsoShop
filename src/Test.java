import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入你的用户名：");
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        System.out.println("你的用户名为："+name);

        System.out.println("请输入你的密码：");
        String Password=sc.next();
        System.out.println("你的密码是："+Password);

    }
}
