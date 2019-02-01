
public class Pancakes {


    public final static int addAndSubtractArray(final int[] myArray) {
        int addAndSubtractArray = 0;
        for (int i : myArray) {
            if (i % 2 == 0) {
                addAndSubtractArray += i;
            }

            else {
                addAndSubtractArray -= i;
            }
        }
        return addAndSubtractArray;
    }

    public final static void main(String[] args) {

        int[] arrayOfInts = {1, 3, 6, 7, 5, 7, 2, 0, -5};
        int result = addAndSubtractArray(arrayOfInts);
        System.out.println("Result: " + result);

    }
}




