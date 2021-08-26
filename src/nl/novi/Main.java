package nl.novi;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static ArrayList<Boolean> bin = new ArrayList<>(); //to be filled with bools and converted to string representing a bin

    public static void main(String[] args) {
        //convert int to bin

        // this is the integer to be converted into binary
        int myInt = 33;

        //this while loop will add the first binary or else recursively call the other
        while(myInt > 0){
            if(bin.isEmpty()){
                bin.add(true);
            } else {
                add(0);
            }
            myInt--;
        }

        // this will print out the 1's and 0's
        for(int j = bin.size() - 1; j >= 0; j--){
            if(bin.get(j)) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
    }

    //this will recursively be called until you find a final 1 and change it to 0 and add another 1 and return
    // or find a final 0 and change it to 1 and return
    public static void add(int index){
        try {
            if (bin.get(index) == false) {
                bin.set(index, true);
            } else {
                bin.set(index, false);
                add(index + 1);
            }
        }
        catch(IndexOutOfBoundsException e){
            bin.add(true);
        }
    }
}
