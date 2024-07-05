// package ArrayList;
import java.util.*;
public class ClassRoom {
    public static void swap(ArrayList<Integer> list,int idx1,int idx2)
    {
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(9);
        list.add(5);

        System.out.println(list.get(2));
        System.out.println(list);
        System.out.println("The array  list elements are: ");
        for(int i=0;i<list.size();i++)
        {
          System.out.print(list.get(i)+" "); 
        }
        System.out.println();
        System.out.println("The elements of the array list in reverse order: ");
        // to print the  element in reverse order...

        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }

        // to sort the element in ascending order 
        System.out.println("Before sorting: ");
        for(int i=0;i<list.size();i++)
        {
          System.out.print(list.get(i)+" "); 
        }
System.out.println();
        System.out.println("After sorting in ascending order: ");

            Collections.sort(list);
            // System.out.println();
            for(int i=0;i<list.size();i++)
        {
          System.out.print(list.get(i)+" "); 
        }System.out.println();
        System.out.println("After sorting in decending order: ");
        Collections.sort(list,Collections.reverseOrder());
        for(int i=0;i<list.size();i++)
        {
          System.out.print(list.get(i)+" "); 
        }
System.out.println();

        System.out.println("To swap the elements of the array list");

        // using third variable temp

    int idx1=4;
    int idx2=2;
    swap(list,idx1,idx2);
    System.out.println(list);
    }
    
}
