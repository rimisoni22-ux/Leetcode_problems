class Solution {
    public void reverseString(char[] s) {
        int left = 0,right =s.length-1;
        while(left<right){
            char temp = s[left];
            s[left]= s[right];
            s[right]= temp;
            left++;
            right--;
        }
    }
}

        // Stack<Character> stack = new Stack<>();

        // int index = 0;

        // // Push characters into stack
        // while (index < s.length) {
        //     stack.push(s[index]);
        //     index++;
        // }

        // index = 0;

        // // Pop characters back into array
        // while (!stack.isEmpty()) {
        //     s[index] = stack.pop();
        //     index++;
        // }
  
