import java.util.Arrays;

/**
 * Driver for running and testing ArrayMethodsDemo
 * 
 * @author Rico Cassoni, rcassoni@sdccd.edu
 * @version v2.0
 * @since 7/31/2025
 */
public class ArrayMethodsDemo  //change name to Main and rename file to Main.java for Replit or MyProgram for codeHS
{
    public static void main (String[] args){
        ArrayMethods test = new ArrayMethods();
        System.out.println("Lab7 Pt1 - Let's get ready to rumble :-)");
        System.out.println("========================================");
        System.out.println("myArray[] has " + test.count() + " elements");
        System.out.println("The sum of all elements in myArray[] is: " + test.sum());
        System.out.printf("The avg of all elements in myArray[] is: %.2f\n", test.average());
        System.out.println("The largest number in myArray[] is: " + test.findMax());
        System.out.println("The index of the largest number in myArray[] is: " + test.findIndexOfMax());
        //Part 2
        System.out.println("\n\nLab7 Pt2 - Let's continue to rumble :-)");
        System.out.println("=======================================");
        System.out.println("The last (or right most) index of 8 is: " + test.findLast(8));
        System.out.println("The last (or right most) index of 2 is: " + test.findLast(2));
        int[] findAll8s = test.findAll(8);
        System.out.print("8s were located in the following indices ");
        test.print(findAll8s);
        int[] myArray = test.copyArray();
        System.out.print("myArray[] is: ");
        test.print(myArray);
        int[] copyOfMyArray = test.copyArray();
        System.out.print("copyOfMyArray[] is: ");
        test.print(copyOfMyArray);
        System.out.println("myArray[] and copyOfMyArray[] are equal: " + Arrays.equals(test.getArray(),copyOfMyArray));
        copyOfMyArray = test.reverseArray(copyOfMyArray);
        System.out.print("copyOfMyArray[] reversed is: ");
        test.print(copyOfMyArray);
        System.out.println("myArray[] and copyOfMyArray[] are equal: " + Arrays.equals(test.getArray(),copyOfMyArray));
    }
}