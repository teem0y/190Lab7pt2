import java.util.Arrays;
/**
 * Program Description
 *  1) Writing Class and Method Definitions with a focus on Arrays.
 *  2) Using debugging techniques.
 *  3) Incorporating documentation and style into code.
 *  @author Tobey Agapito
 *  @version v2.0
 *  @since 11/6/2026
 */
public class ArrayMethods {
    private int[] myArray = {7,8,8,3,4,9,8,7};
    /**
     * Computes the number of values in myArray using an enhanced for loop
     * @return the number of elements in myArray
     */
    public int count() {
        int count = 0;
        for (int value : myArray) {
            count++;
        }
        return count;
    }
    
    /**
     * Returns the sum of all the values in myArray
     * @return the sum of all elements in myArray
     */
    public int sum() {
        int total = 0;
        for (int value : myArray) {
            total += value;
        }
        return total;
    }
    
    /**
     * Computes the average of the values in myArray 
     * @return the average of all elements in myArray as a double
     */
    public double average() {
        return (double) sum() / count();
    }
    
    /**
     * Finds the largest value in myArray
     * @return the largest integer in myArray
     */
    public int findMax() {
        int highest = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > highest) {
                highest = myArray[i];
            }        
        }
        return highest;
    }
    
    /**
     * Finds the index of the largest value in myArray
     * @return the index of the largest integer in myArray
     */
    public int findIndexOfMax() {
        int maxIndex = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > myArray[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    
    /**
     * Finds the last (right most) index of key in myArray
     * @param key the value to search for
     * @return the index of the last occurrence of key, or -1 if key is not found
     */
    public int findLast(int key) {
        int index;
        int element;
        boolean found;
        index = myArray.length - 1;
        element = -1;
        found = false;
        while (!found && index >= 0) {
            if (myArray[index] == key) {
                found = true;
                element = index;
            }
            index--;
        }
        return element;
    }
    
    /**
     * Creates and returns a new array containing the index(es) of every 
     * occurence fo a target value
     * @param key the value to search for
     * @return a new array holding the index of every occurrence of key,
     *         or an empty array (length 0) if key is not found
     */
    public int[] findAll(int key) {
        // first loop: count how many times key occurs
        int occurrences = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == key) {
                occurrences++;
            }
        }
        
        // create a new array to hold that many indexes
        int[] indexes = new int[occurrences];
        
        // second loop: put each matching index into the new array
        int next = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == key) {
                indexes[next] = i;
                next++;   // move to the next element of indexes[]
            }
        }
        return indexes;
    }
    
    /**
     * Getter for the myArray instance variable
     * @return myArray
     */
    public int[] getArray() {
        return myArray;
    }
    
    /**
     * Creates a copy of myArray
     * @return a new array with the same values as myArray
     */
    public int[] copyArray() {
        return Arrays.copyOf(myArray, myArray.length);
    }
    
    /**
     * Reverses the order of the values in the array passed in by swapping
     * values from the outside in, using a temp variable
     * @param inArray the int array to reverse
     * @return inArray with its values in reverse order
     */
    public int[] reverseArray(int[] inArray) {
        int left = 0;
        int right = inArray.length - 1;
        while (left < right) {
            int temp = inArray[left];
            inArray[left] = inArray[right];
            inArray[right] = temp;
            left++;
            right--;
        }
        return inArray;
    }
    
    /**
    prints an int array, nicely formatted
    @param inArray int array to print
    */
    public void print(int[] inArray)
    {
        System.out.print("{");
        int i;
        // print elements before the last, separated by commas
        for (i = 0; i < inArray.length - 1; i++)
            System.out.print(inArray[i] + ", ");
        // print last element. Careful here to handle length 0
        if (inArray.length > 0)
            System.out.print(inArray[i]);
        System.out.println("}");
    }
}