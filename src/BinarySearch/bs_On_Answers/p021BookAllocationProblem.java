/*
Problem: Book Allocation Problem
Optimal:
TC: O(N * log(sum(arr[])-max(arr[])+1)),
SC: O(1)
 */

package src.BinarySearch.bs_On_Answers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class p021BookAllocationProblem {
    public static int booksAllocation(ArrayList<Integer>books, int m, int n ){
        if (m>n) return -1;
        int low = Collections.max(books);
        int high =books.stream().mapToInt(Integer::intValue).sum();

        while(low<=high){
            int mid =(low+high)/2;
            int students=countStudent(books,mid);
            if(students>m){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }

    private static int countStudent(ArrayList<Integer> books, int pages) {
        int n =books.size();
        int student=1;
        long pageStudent=0;
        for(int i =0;i<n;i++){
            if(pageStudent+books.get(i)<=pages){
                pageStudent+=books.get(i);
            }else{
                student++;
                pageStudent=books.get(i);
            }
        }
        return student;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
        int n = 5;
        int m = 4;

        System.out.println(booksAllocation(arr,m, n ));
    }
}
