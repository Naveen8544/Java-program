public class PalindromeArray {
    public static boolean isPalindrome(int[] array) {
        int start = 0;                
        int end = array.length - 1;  

        while (start < end) {
            if (array[start] != array[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 2, 1};
        

        System.out.println("Array1 is palindrome: " + isPalindrome(array1));
        
    }
}
