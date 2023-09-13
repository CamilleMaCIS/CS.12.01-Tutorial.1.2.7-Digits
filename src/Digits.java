import java.util.ArrayList;

public class Digits {
    //instance variable
    //for ArrayLists, be careful of NullPointerException, make sure to initialize before adding elements
    private ArrayList<Integer> digitList = new ArrayList<>();

    //constructor
    public Digits(int num)
    {
        //negative IllegalArgumentException
        if (num < 0){
            throw new IllegalArgumentException("The number passed to the constructor (-1984) cannot be negative!");
        }

        String numToStr = "" + num;
        for (int i = 0; i < numToStr.length(); i++){
            int charToInt = Character.getNumericValue(numToStr.charAt(i));
            this.digitList.add(charToInt);
        }
    }

    //getter method
    public ArrayList<Integer> getDigitList(){
        return this.digitList;
    }

    //isStrictlyIncreasing method
    public boolean isStrictlyIncreasing(){
        for (int i = 0; i < this.digitList.size() - 1; i++){
            //checks if all elements at index i is less than the next element
            if (this.digitList.get(i) >= this.digitList.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
