package src.BinarySearch.bs_On_Answers;

import java.util.Arrays;

public class p023Painters_Partition {
    public static int paintersPartition(int []boards, int k ){
        int low = Arrays.stream(boards).max().getAsInt();
        int high =Arrays.stream(boards).sum();
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int partitionCount= partitionCount(boards, mid);
            if(partitionCount>k){
                low=mid+1;
            }else {
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }

    private static int partitionCount(int[] boards, int time) {
        int paintersCount =1;
        int boardPainters=0;
        for(int board:boards){
            if(boardPainters+board<=time){
                boardPainters+=board;
            }else{
                paintersCount++;
                boardPainters=board;
            }
        }
        return paintersCount;
    }

    public static void main(String[] args) {
        int[] boards = {10, 20, 30, 40};
        int k = 2;

        System.out.println(paintersPartition(boards,k));
    }
}
