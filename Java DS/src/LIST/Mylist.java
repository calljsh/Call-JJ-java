package LIST;

import java.util.Arrays;

public class Mylist implements list
{
    int [] myarray;
    public  static  final int number= 3;
  int  usedsize=0;
    public Mylist()
    {
        this.myarray = new int[number];
    }
private  void checkcap()
{
    if(isfull())
    // 检测一下
    {
        myarray = Arrays.copyOf(myarray,myarray.length*2);
        // 扩容(两倍)
    }
}
@Override
public boolean isfull()
// 检测顺序表是否以及满了
{
    if(usedsize==myarray.length)
        return true;
    else
        return  false;
}
    private  void checkPos (int pos)   throws POSIllegal
    {
        if(pos<0||pos>this.usedsize)
        {
            System.out.println("不合法!");
            throw  new POSIllegal("pos不合法,你的pos是 :"+pos);
        }
    }
@Override
public void display()
{
        // 打印顺序表
        for(int i=0;i<this.usedsize;i++)
        {
            System.out.print(myarray[i]);
            System.out.print(" ");
        }
        System.out.println();

}
    @Override
    public void add(int data)
    {
        checkcap();
            this.myarray[this.usedsize] =data;
            this.usedsize++;
    }
    @Override
    public void add(int pos, int data) {
        checkcap();
        try {
            checkPos(pos);
        } catch (POSIllegal e) {
            e.printStackTrace();
        }
        for (int i = usedsize - 1; i >= pos; i--) {
            this.myarray[i + 1] = this.myarray[i];
        }
        this.myarray[pos] = data;
        usedsize++;
    }
    @Override
    public boolean contains(int toFind) {
        return false;
    }

    @Override
    public int indexOf(int toFind) {
        return 0;
    }

    @Override
    public int get(int pos) {
        try {
            return this.myarray[pos];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("越界了,数组只有"+myarray.length+"这么大");
            return 0; // 或者其他你想返回的默认值
        }
    }
    @Override
    public void set(int pos, int value) {

    }

    @Override
    public void remove(int toRemove) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear()
    {
        for(int i=0;i<this.usedsize;i++)
        {
            this.myarray[i]=0;
        }
        display();
        System.out.println("清空完成");
    }
}
