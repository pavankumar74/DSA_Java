ublic static int storewater(ArrayList<Integer> height)
    // {
    //     // time complexit is O(n^2)
    //     int maxWater=0;
    //     // brute force
    //     for(int i=0;i<height.size();i++)
    //     {
    //         for(int j=i+1;j<height.size();j++)
    //         {
    //             int ht=Math.min(height.get(i),height.get(j));
    //             int width=j-i;
    //             int currwater=ht*width;
    //             maxWater=Math.max(maxWater,currwater);
    //         }
    //     }
    //     return maxWater;
    // }