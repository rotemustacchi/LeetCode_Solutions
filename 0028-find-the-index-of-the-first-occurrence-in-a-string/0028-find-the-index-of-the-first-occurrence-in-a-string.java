class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if (needleLength > haystackLength)
            return -1;

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            int j = 0;
            while (j < needleLength && needle.charAt(j) == haystack.charAt(i + j)) {
                j++;
            }
            if (j == needleLength)
                return i;
        }
        return -1;
    }
}