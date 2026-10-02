class Solution {
    public String sortString(String s){
        char[] str=s.toCharArray();
        Arrays.sort(str);

        return new String(str);
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        return (sortString(s).equals(sortString(t)));
    }
}
