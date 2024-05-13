package operation;
import Book.book;
import Book.booklist;
import java.util.Scanner;
public class Borrowop implements WORK
{
    @Override
    public void work(booklist BOOKlist)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入借阅图书的书名");
        String name=scanner.nextLine();
        int size=BOOKlist.usedsize;
        for(int i=0;i<size;i++)
        {
            book temp = BOOKlist.getbook(i);
            if(temp.getName().equals(name)&&temp.isBorrowed()==false)
            {
                System.out.println("成功借出");
                temp.setBorrowed(true);
                return ;
            }
        }
        System.out.println("没有找到这本书,应该没借走了");
    }
}
