class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character>operators =new Stack<>();
        Stack<Stack<Boolean>> operands=new Stack<>();
        for(char c:expression.toCharArray()){
            if(c=='t' || c=='f'){
                if(operands.isEmpty()){
                    operands.push(new Stack<>());

                }
                operands.peek().push(c=='t');

            } else if(c=='&' || c=='|' || c=='!'){
                operators.push(c);

            } else if(c=='('){
                operands.push(new Stack<>());
            } else if(c==')'){
                char operator=operators.pop();
                Stack<Boolean>
 currentOperands=operands.pop();
 boolean result=evalute(operator, currentOperands);
 if(!operands.isEmpty()){
    operands.peek().push(result);
 } else {
    operands.push(new Stack<>());
    operands.peek().push(result);
 }
             }
        }
        return operands.peek().pop();
    }
    private boolean evalute(char operator, Stack<Boolean>operands){
        if(operator=='!'){
            return !operands.pop();
        } else if(operator =='&'){
            boolean result=true;
            while(!operands.isEmpty()){
                result&=operands.pop();
            }
            return result;

        }
        else if(operator=='|'){
            boolean result=false;
            while(!operands.isEmpty()){
                result|=operands.pop();
            }
            return result;
        }
        return false;
    }
}