package operation;
import Book.book;
import Book.booklist;
import java.util.Scanner;
public class Findop implements  WORK
{
    @Override
    public void work(booklist Booklist)
    {
        System.out.println("输入你要查找的图书的name");
  Scanner scanner=new Scanner(System.in);
  String name=scanner.nextLine();
  int size= Booklist.getUsedsize();
  for(int i=0;i<size;i++)
  {
      book temp=Booklist.getbook(i);
      if(temp.getName().equals(name))
      {
          System.out.println("找到了,信息如下");
          System.out.println(temp);
          return ;
      }
  }
        System.out.println("没有找到!");
    }
}
