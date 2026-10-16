// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length()!= t.length()) return false ;
//         char [] arr1 = s.toCharArray();
//         char [] arr2 = t.toCharArray();
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//          for(int i =0;i<arr1.length;i++){
//             if(arr1[i]!=arr2[i]) return false;

//          }
//          return true;
//     }
// }
//method-2

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count [s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
