class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        //create a map of operations
        for(String token : tokens){
            // check if digit ? add to stack : pop last 2 elements and do operation and push back to stack

            if(isDigit(token)){
                stack.push(Integer.parseInt(token));
            }else{
                if(stack.size() < 2) return -1;
                
                int val1 = stack.pop();
                int val2 = stack.pop();
                int result = switch(token){
                    case "+" -> val2 + val1;
                    case "-" -> val2 - val1;
                    case "*" -> val2 * val1;
                    case "/" -> val2 / val1;
                    default -> -1;
                };
                  stack.push(result);
            }
        }
        return stack.pop();
        
    }
    private boolean isDigit(String token){
        return token.matches("-?\\d+");
    }
}
