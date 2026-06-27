package src.arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class p028_pascalTriangle {
    public List<List<Integer>> generatePascalTriangle(int N){
        List<List<Integer>> triangle = new ArrayList<>();

        if (N == 0)
            return triangle;

        //first row
        triangle.add(new ArrayList<>(List.of(1)));

        for(int i =1;i<N;i++){
            List<Integer>previousRow= triangle.get(i-1);
            List<Integer>currentRow= new ArrayList<>();

            //first element
            currentRow.add(1);
            for(int j =0;j<previousRow.size()-1;j++){
                currentRow.add(previousRow.get(j)+previousRow.get(j+1));
            }
            //lastElement
            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle;
    }
    public static void main(String[] args) {
        p028_pascalTriangle obj = new p028_pascalTriangle();
        List<List<Integer>> triangle = obj.generatePascalTriangle(5);
        for(List<Integer>row:triangle){
            System.out.println(row);
        }
        int row=3;
        int col=2;
        System.out.println("Element: "+triangle.get(row).get(col));
    }
}
