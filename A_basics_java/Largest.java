public class Largest {
    public static int  Largest1(int number[]){
int largest=Integer.MIN_VALUE;
for(int i=0;i<number.length;i++)
{
    if(largest<number[i])
    {
        largest=number[i];
    }
}

int smallest=Integer.MAX_VALUE;
for(int i=0;i<number.length;i++)
{
    if(smallest>number[i])
    {
        smallest=number[i];
    }
}
System.out.println("Smallest element in the array is: "+smallest);
return largest;
    }
    public static void main(String[] args) {
        int number[]={2,5,3,1,10,7,6};
        int largest=Largest1(number);
        System.out.println("The largest element in the array is: "+largest);
    }
    
}
