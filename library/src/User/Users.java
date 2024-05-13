package User;

import Book.booklist;
import operation.WORK;

public  abstract class Users
{
    protected String name;
    protected WORK[] Work;

    public Users(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                '}';
    }
    public abstract int menu ();
    public  void  Doop(int choice, booklist Booklist)
    {
         Work[choice].work(Booklist);
    }
}
