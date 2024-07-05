import java.util.*;

public class WaterContainer {
    // public static int storewater(ArrayList<Integer> height)
    // {
    // // time complexit is O(n^2)
    // int maxWater=0;
    // // brute force
    // for(int i=0;i<height.size();i++)
    // {
    // for(int j=i+1;j<height.size();j++)
    // {
    // int ht=Math.min(height.get(i),height.get(j));
    // int width=j-i;
    // int currwater=ht*width;
    // maxWater=Math.max(maxWater,currwater);
    // }
    // }
    // return maxWater;
    // }

    // we can solve this using two pointer approch
    public static int storewater1(ArrayList<Integer> height) {
        // time complexity is O(n)
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            // calculate water area,
           
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currwater = ht * width;
            maxWater = Math.max(maxWater, currwater);
            // update pointer
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }

        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7 //
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // System.out.println("The maximum amount of water stored is:
        // "+storewater(height));
        System.out.println("The maximum amount of water stored is: " + storewater1(height));

    }
}
