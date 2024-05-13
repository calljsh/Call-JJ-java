package operation;
import Book.booklist;
public class Exitop implements WORK
{
    @Override
    public void work(booklist Booklist)
    {
        System.out.println("退出系统,感谢您的使用");
        System.exit(0);
    }
}
