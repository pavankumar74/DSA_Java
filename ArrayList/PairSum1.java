import java.util.*;
public class PairSum1 {

    // using two pointer approch---
    public static boolean pairsum2pointer(ArrayList<Integer> list,int target)
    {
int lp=0;
int rp=list.size()-1;
while(lp<rp)
{
    // case 1:
    if(list.get(lp)+list.get(rp)==target)
    {
        return true;
    }
    // case 2
    else if(list.get(lp)+list.get(rp)<target)
    {
        lp++;
    }
    // case 3
   else {
           rp++;
    }
}
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        // add 1,2,3,4,5,6
        // target sum 5;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        int target=10;
        // int target=50;
        // System.out.println(pairsum(list, target));4
        System.out.println(pairsum2pointer(list,target));

    }
}
