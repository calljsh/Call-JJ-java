package User;

import operation.*;

import java.util.Scanner;

public class Nomaluser extends Users
{
    public Nomaluser(String name)
    {
        super(name);
        this.Work=new WORK[]{new Exitop(),new Findop(),new Borrowop(),new Returnop(),new Show()};
    }
    public int menu ()
    {
        System.out.println("**********用户***********");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
         System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("*********************");
        System.out.println("请输入你的操作:");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        return choice;
    }
}
