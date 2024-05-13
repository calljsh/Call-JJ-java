package Book;
import Book.book;
public class booklist
{
      public   book [] books;
      public   int usedsize;
    public booklist()
    {
        this.books = new book[1000];
        this.books[0]=new book("红楼梦","曹雪芹",20,"小说");
        this.books[1]=new book("水浒传","施耐庵",20,"小说");
        this.books[2]=new book("三国演义","罗贯中",21,"小说");
        this.usedsize=3;
    }
    public int getUsedsize()
    {
        return usedsize;
        // 获得数组大小
    }
    public void setUsedsize(int usedsize)
    {
        this.usedsize = usedsize;
        //改变数组大小
    }
    public book getbook(int pos)
    {
        return books[pos];
        // 负责展示书籍
    }
    public void setbook(int pos,book abook)
    {
        books[pos]=abook;
        //放置书籍
    }
}
