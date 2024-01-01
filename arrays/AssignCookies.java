


import java.util.*;

public class AssignCookies {
    public static void main(String[] args) {
        System.out.println("working");
        int[] greed = {1,2};
        int[]  stats = {1,2,3};
        Arrays.sort(greed);
        Arrays.sort(stats);


        for(int i =0;i<greed.length;i++) System.out.println(greed[i]);
        int maxstats =0;
        int realans = 0;
        int i=0;

        while(i<greed.length){
            if( maxstats <stats.length && stats[maxstats] >= greed[i]) {
                realans++;
                maxstats++;
            } else if( maxstats <stats.length && stats[maxstats] < greed[i]) {
                maxstats++;
                continue;
            }
            i++;
        }
        System.out.println(realans);
    }
}