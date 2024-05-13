package operation;
import Book.book;
import Book.booklist;
import java.util.Scanner;
public class Deleteop implements WORK {
    @Override
    public void work(booklist Booklist)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你想删除的书籍的名字");
        String name=scanner.nextLine();
        int size=Booklist.getUsedsize();
        int pd=0;
        int flag=0;
        for(int i=0;i<size;i++)
        {
            book temp= Booklist.getbook(i);
            if(temp.getName().equals(name))
            {
                flag=i;
                pd=-1;
                break;
            }
        }
        if(pd==0)
        {
            System.out.println("没有这本书,删除失败");
            return ;
        }
        else
        {
            for(int j=flag;j<size;j++)
            {
                book temp= Booklist.getbook(j+1);//得到j+1位置的信息
                Booklist.setbook(j,temp);//把信息放入j位置,实现交换
            }
        }
        Booklist.setbook(size-1,null);//位置变成null;
        Booklist.setUsedsize(size-1);//书架少一个位置
    }
}
