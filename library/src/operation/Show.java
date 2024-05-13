package operation;
import Book.book;
import Book.booklist;
public class Show implements WORK
{
    @Override
    public void work(booklist Booklist)
    {
        System.out.println("显示图书");
        int currents= Booklist.getUsedsize();
        for(int i=0;i<currents;i++)
        {
            book Book = Booklist.getbook(i);
            System.out.println(Book);
        }
    }
}
