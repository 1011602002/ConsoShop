import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入你的用户名：");
        Scanner sc= new Scanner(System.in);
        String username=sc.next();
        System.out.println("你的用户名为："+username);

        System.out.println("请输入你的密码：");
        String Password=sc.next();
        System.out.println("你的密码是："+Password);

        File file= new File("C:\\Users\\lenovo\\IdeaProjects\\ConsoShop\\src\\user.xlsx");
        ReadExcel readExcel=new ReadExcel();
        User user[]=readExcel.readExcel(file);
        for (int i=0;i<user.length;i++){
            if (username.equals(user[i].getUsername()) && Password.equals(user[i].getPassword())){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("登录失败");
            }
        }
    }
}
