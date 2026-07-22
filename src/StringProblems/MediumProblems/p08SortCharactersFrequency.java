/*
Problem: Sort Characters by Frequency

Approach:
- Count the frequency of each lowercase character.
- Sort the characters by descending frequency.
- If frequencies are equal, sort alphabetically.
- Collect only characters with non-zero frequency.

Time Complexity: O(n)
Space Complexity: O(1)
*/

package src.StringProblems.MediumProblems;
import java.util.*;

public class p08SortCharactersFrequency {
    public List<Character> characterFrequency(String s){
        Pair[] freq= new Pair[26];
        for(int i =0;i<26;i++){
            freq[i]=new Pair(0,(char)(i+'a'));
        }
        for(char ch:s.toCharArray()){
            freq[ch-'a'].freq++;
        }
        Arrays.sort(freq,(p1,p2)->{
            if(p1.freq!= p2.freq)return p2.freq-p1.freq;
            return p1.ch-p2.ch;
        });
        List<Character> result= new ArrayList<>();
        for(Pair p : freq){
            if(p.freq>0 )result.add(p.ch);
        }
        return result;
    }
    class Pair{
        int freq;
        char ch;
        Pair(int f, char c){
            this.freq=f;
            this.ch=c;
        }
    }
    public static void main(String[] args) {

    }
}
