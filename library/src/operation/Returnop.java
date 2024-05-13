package operation;
import Book.book;
import Book.booklist;
import java.util.Scanner;
public class Returnop implements WORK
{

    @Override
    public void work(booklist Booklist)
    {
        System.out.println("请输入归还图书的名字");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int size=Booklist.getUsedsize();
        for(int i=0;i<size;i++)
        {
            book temp=Booklist.getbook(i);
            if(temp.getName().equals(name)&&temp.isBorrowed()==true)
            {
                temp.setBorrowed(false);
                System.out.println("归还成功");
                return ;
            }
        }
        System.out.println("归还失败");
    }
}
