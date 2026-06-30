class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> map= new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        char[] charArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i< s.length();i++){
            char currChar = charArr[i];
            if(map.containsKey(currChar)){
                stack.push(currChar);
            }else{
                if(stack.isEmpty() || (map.get(stack.pop()) != currChar)) {return false;}

                 
            }

        }

        return stack.isEmpty();
        
    }
}
