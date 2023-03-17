import java.util.*;
public class ArrayListMethod
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        int a[]={1,2,3,1};
        for(int i=0;i<a.length;i++)
        {
            int b=a[i];
            list.add(b); //Add element in arraylist
        }
        for(int i=0;i<list.size();i++)// list.size() => give size of arraylist
        {
            System.out.print(list.get(i)+" ");// print arraylist 
            // output : 1 2 3 1
        }
        System.out.println();
        list.set(3,5);// add element in 3 index is 5
        for(int i=0;i<list.size();i++)// list.size() => give size of arraylist
        {
            System.out.print(list.get(i)+" ");// print arraylist 
            // output : 1 2 3 5 
        }
        list.remove(1); //index 1 element delete from list
        Collections.sort(list);// sort arraylist element
    }
}