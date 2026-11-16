
class Solution {

    static void findLPS(int arr[], String str) {
        int n = str.length();
        int prefix = 0, suffix = 1;

        while (suffix < n) {

            if (str.charAt(prefix) == str.charAt(suffix)) {
                arr[suffix] = prefix + 1;
                prefix++;
                suffix++;
            } 
            else {
                if (prefix == 0) {
                    arr[suffix] = 0;
                    suffix++;
                } 
                else {
                    prefix = arr[prefix - 1];
                }
            }
        }
    }

    public int strStr(String haystack, String needle) {

        int i = 0, j = 0;

        int n1 = haystack.length();
        int n2 = needle.length();

        if (n2 == 0) return 0;

        if (n2 > n1) return -1;

        int arr[] = new int[n2];

        findLPS(arr, needle);

        while (i < n1) {

            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;

                if (j == n2) {
                    return i - j;
                }
            } 
            else {

                if (j == 0) {
                    i++;
                } 
                else {
                    j = arr[j - 1];
                }
            }
        }

        return -1;
    }
}
