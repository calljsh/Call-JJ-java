package operation;

import Book.book;
import Book.booklist;
import java.util.Scanner;
public class Addop implements WORK
{
    @Override
    public void work(booklist BOOKlist)
    {
        System.out.println("增加图书");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您要添加的图书的书名：");
        String name = scanner.nextLine();
        System.out.println("请输入您要添加的图书的作者名：");
        String author = scanner.nextLine();
        System.out.println("请输入您要添加的图书的类型：");
        String type = scanner.nextLine();
        System.out.println("请输入您要添加的图书的价格：");
        int price = scanner.nextInt();
        book Book =new book(name,author,price,type);

        int size=BOOKlist.usedsize;
          for(int i=0;i<size;i++)
          {
              book temp=BOOKlist.getbook(i);
              if(Book.equals(temp))
              {
                  System.out.println("不能增加同样的书籍");
                  return;
              }
          }
        BOOKlist.setbook(size,Book);
        BOOKlist.setUsedsize(size+1);
    }
}



