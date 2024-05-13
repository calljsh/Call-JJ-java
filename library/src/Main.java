import Book.booklist;
import User.Adminuser;
import User.Nomaluser;
import User.Users;
import sun.security.util.Password;
import java.util.*;
import java.lang.*;
public class Main
{
    public static boolean PassWord()
    {
        System.out.println("请输入密码:");
        Scanner scanner=new Scanner(System.in);
        int password=scanner.nextInt();
        if(password==123456)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static Users login()
            // 向上转型
    {
        System.out.println("请输入你的姓名");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("请输入你的身份:1.管理员 2.用户");
        int chosen =sc.nextInt();
        if(chosen==1)
        {
            if(PassWord()==true)
            {
                System.out.println("正确,已进入");
                return  new Adminuser(name);
            }
            else
            {
                System.out.println("输入错误,请重试");
                return null;
            }
        }
        else
        {
           return new Nomaluser(name);
        }
    }
    public static void main(String[] args)
    {
        booklist Booklist =new booklist();
       Users use=login();
      while(true)
      {
          int choice = use.menu();
          use.Doop(choice, Booklist);
      }
    }
}