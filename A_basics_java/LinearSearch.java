
public class LinearSearch {

    public static int LinearS(int number[],int key)
    {
        for(int i=0;i<=number.length;i++)
        {
            if(number[i]==key)
            {
                 return i;
            }
            else{
                return -1;
            }
               
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={3,5,2,6,89,90,100,78};
        int key=10;
        int index=LinearS(number,key);
        if (index==-1) {
            System.out.println("Not found..");
        }
        else{
            System.out.println("Key is found at index: "+index);
        }
    }
}