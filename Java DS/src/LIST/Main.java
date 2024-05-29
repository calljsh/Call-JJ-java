package LIST;
public class Main
{
    public static void main(String[] args) {
        Mylist mylist=new Mylist();
         mylist.add(0,2);
        mylist.add(1,2);
        mylist.add(2,2);
        mylist.add(3,2);
        mylist.add(1,23);
        mylist.add(3,2);
        mylist.add(3,2);
        mylist.add(3,2);
        mylist.display();
        mylist.set(5,2324);
        mylist.set(7,232);
        System.out.println(mylist.size());
        mylist.display();
        mylist. clear();
    }
}
