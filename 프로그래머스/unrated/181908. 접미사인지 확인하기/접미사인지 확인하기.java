class Solution {
    public int solution(String my_string, String is_suffix) {
        int strlength = my_string.length();
        int suflength = is_suffix.length();

        if (strlength >= suflength 
            && my_string.substring(strlength - suflength).equals(is_suffix)) return 1;
        return 0;
    }
}