 

/**
 * Created by Yang on 1/23/20.
 */
import java.util.*; 
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++){
            if(array[i] == value){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        int count = 0;
        for (int i = array.length - 1; i > -1; i--){
            result[count] = array[i];
            count = count + 1;
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] result = new String[array.length];
        int count = 0;
        for (int i = array.length - 1; i > -1; i--){
            result[count] = array[i];
            count = count + 1;
        }
        return (Arrays.deepEquals(result,array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String s = array[0];
        
        for (int i = 1; i < array.length; i++){
            s += array[i];
        }
        
        s = s.toLowerCase();
        char temp_array[] = s.toCharArray();
        Arrays.sort(temp_array);
        int count;
        if (s.contains(" ")){
            count = 0;
        }
        else {
            count = 1;
        }

        for (int i = 1; i < temp_array.length; i++){
            if(temp_array[i] != temp_array[i - 1]){
                count = count + 1;
            }
        }
        return (count == 26);
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] == value){
                count = count + 1;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] result = new String[array.length-1];
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == valueToRemove){
                continue;
            }
            else{
                result[count] = array[i];
                count = count + 1;
            }
        }
        
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> str = Arrays.asList(array);
        List<String> result = new ArrayList<String>();
        
        result.add(str.get(0));
        for (int i = 1; i < str.size(); i++){
            if (str.get(i - 1) != str.get(i)){
                result.add(str.get(i));
            }
        }

        return result.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> str = Arrays.asList(array);
        List<String> result = new ArrayList<String>();
        int count = 0;
        result.add(str.get(0));
        for (int i = 1; i < str.size(); i++){
            if (str.get(i - 1) == str.get(i)){
                result.set(count, result.get(count) + str.get(i));
            }
            else{
                result.add(str.get(i));
                count = count + 1;
            }
        }
        return result.toArray(new String[0]);
    }


}
