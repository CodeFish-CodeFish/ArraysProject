package Main;


import java.util.Arrays;
import java.util.HashSet;

public class Main {

    /**
     * Write a method that will accept an array as parameter
     * and return maximum value from array.
     * <p>
     * for example:
     * {3,9,55,73,99,2,10} -> return 99
     *
     * @param arrays of numbers
     * @return maximum value from array
     */
    public int maxNum(int[] arrays) {
        if (arrays == null || arrays.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null.");
        }

        int max = arrays[0];

        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
            }
        }

        return max;
    }

    /**
     * Write a method that received an integer array and returns the sum of all
     * odd numbers in the array
     *
     * @param array
     * @return sum of odd numbers in the array
     */

    public int sumOfOdds(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                total += array[i];
            }
        }

        return total;
    }

    /**
     * Write a method that takes an array of integers and returns a boolean. You
     * method should return true if array contains three consecutive even number+
     * or three consecutive odd numbers. Return false otherwise.
     * threeAmigos([2, 1, 3, 5]) -> true
     * threeAmigos([2, 1, 2, 5]) -> false
     * threeAmigos([2, 4, 2, 5]) -> true
     */

    public boolean threeAmigos(int[] array) {
        if (array.length < 3) {
            return false;
        }

        for (int i = 0; i <= array.length - 3; i++) {
            if ((array[i] % 2 == 0 && array[i + 1] % 2 == 0 && array[i + 2] % 2 == 0)
                    || (array[i] % 2 != 0 && array[i + 1] % 2 != 0 && array[i + 2] % 2 != 0)) {
                return true;
            }
        }

        return false;
    }


    /**
     * Write a method that takes an array of ints and returns a boolean.
     * Return true if that array contains two numbers anywhere in the array
     * whose sum is 100
     *
     * @param nums
     * @return boolean
     */
    public boolean make100With2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == 100) {
                    return true;
                }
            }
        }

        return false;
    }


    /**
     * Write a method switchPairs that switches the order of values in an Array of Strings in a pairwise fashion.
     * Your method should switch the order of the first two values,
     * then switch the order of the next two, switch the order of the next two, and so on.
     * <p>
     * {"four", "score", "and", "seven", "years", "ago"}-> return {"score", "four", "seven", "and", "ago", "years"}
     * {"to", "be", "or", "not", "to", "be", "hamlet"} -> return {"be", "to", "not", "or", "be", "to", "hamlet"}
     * <p>
     * Method that is using String[]
     *
     * @param Array
     * @return switched pairs array
     */
    public String[] switchPairs(String[] list) {
        for (int i = 0; i < list.length - 1; i += 2) {
            String temp = list[i];
            list[i] = list[i + 1];
            list[i + 1] = temp;
        }

        return list;
    }

    /**
     * @param array of book pages
     * @return page that is out of order; if all pages in the order return -1;
     * <p>
     * For example you given an array
     * int[]pages={20,100,55,78,44,90}; -> method will return 55
     * int[]pages2={20,21,22,78,44,90};-> method will return 44
     * int[]pages3={20,21,22,78,84,90};-> method will return -1
     */
    public int outOfOrder(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return arr[i];
            }
        }

        return -1;
    }

    /**
     * Write a method that takes an array of integers and returns a boolean.
     * Return true if the array contains 1 and 2 later somewhere in the array,
     * and 1 has to come before 2.
     * <p>
     * contains12([1, 3, 2]) -> true
     * contains12([3, 1, 2]) -> true
     * contains12([3, 1, 4, 5, 2]) -> true
     * contains12([3, 2, 4, 5, 1]) -> false
     *
     * @param nums
     * @return boolean
     */

    public boolean contains12(int[] nums) {
        boolean foundOne = false;
        for (int num : nums) {
            if (num == 1) {
                foundOne = true;
            } else if (num == 2 && foundOne) {
                return true;
            }
        }

        return false;
    }

    /**
     * Write a method that will accept array of integers as parameter
     * and will return one long number of combined numbers.
     * If the number is negative accept it as positive
     * <p>
     * For example:
     * {2,66,3,90,1,-10} -> return int 266390110
     * {0,34,5,3,8} -> return int 34538
     *
     * @param array of numbers
     * @return combined numbers of array
     */
    public long combineNumbers(int[] numbers) {
        long combinedNumber = 0;
        String combinedNumberString = "";

        for (int num : numbers) {
            int num2 = Math.abs(num);
            combinedNumberString = combinedNumberString + num2;
        }
        combinedNumber = Long.valueOf(combinedNumberString);
        return combinedNumber;
    }


    /**
     * Write a method that will accept one array as parameter and will remove duplicates
     * and return will have unique numbers inside
     * <p>
     * for example:
     * {3,6,8,3,2,7,9,9} -> return {3,6,8,2,7,9}
     * {-1,5,8,-1,-55,55,0} -> return {-1,5,8,-55,55,0}
     *
     * @param array of numbers
     * @return array of unique numbers
     */
    public int[] removeDuplicates(int[] nums) {


        String str = ""; //int array in to string array with spaces
        for (int i : nums) {
            str += " " + i;
        }

        String[] arr1 = str.trim().split(" "); //to remove white spaces from start and end
        str = "";

        for (String i : arr1) {
            if (!str.contains(i)) {
                str += " " + i; // make it one string uniq elements in string
            }
        }

        String[] unicArrayString = str.trim().split(" "); // splitting string in to array string
        int[] arr3 = new int[unicArrayString.length]; // same size as string uniq element
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = Integer.parseInt(unicArrayString[i]);
        }

        return arr3;
    }

}
