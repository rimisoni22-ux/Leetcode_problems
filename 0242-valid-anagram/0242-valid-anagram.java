class Solution {
    public boolean isAnagram(String s, String t) {
        // if (s.length() != t.length()) {
        //     return false;
        // }
        // char[] arr1 = s.toCharArray();
        // char[] arr2 = t.toCharArray();   
        // Arrays.sort(arr1);           
        // Arrays.sort(arr2);
        // return Arrays.equals(arr1, arr2); 
         HashMap<Character,Integer> map = new HashMap<>();
          if(s.length()!=t.length()){
            return false;
          }
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
             for(int i=0;i<t.length();i++){
                char ch = t.charAt(i);
                if(map.get(ch)!=null){
                    if(map.get(ch)==1){
                        map.remove(ch);
                    }
                    else{
                        map.put(ch,map.get(ch)-1);
                    }

                } else{
                    return false;
                }
             }
             return map.isEmpty();        
    }
}
