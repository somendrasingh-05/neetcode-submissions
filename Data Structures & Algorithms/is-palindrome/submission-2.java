class Solution {
    public boolean isPalindrome(String str) {
     int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric from left
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric from right
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            // Compare characters
            if (Character.toLowerCase(str.charAt(left)) !=
                Character.toLowerCase(str.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
