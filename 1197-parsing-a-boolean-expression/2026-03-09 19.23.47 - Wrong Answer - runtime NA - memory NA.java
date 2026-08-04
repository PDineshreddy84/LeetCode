class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character>optr=new Stack<>();
        Stack<Character>oprand=new Stack<>();
        int n=expression.length();
        for(int i=0;i<n;i++){
            if(expression.charAt(i)=='|' || expression.charAt(i)=='&' || expression.charAt(i)=='!'){
                optr.push(expression.charAt(i));
            }
            else if(expression.charAt(i)=='(' || expression.charAt(i)=='f' || expression.charAt(i)=='t'){
                oprand.push(expression.charAt(i));
            }
            else if(expression.charAt(i)==')'){
                solve(optr,oprand);
            }
        }
        return oprand.peek()=='t';
    }
    void solve(Stack<Character>optr,Stack<Character>operand){
        char op=optr.pop();
        boolean ans=true;
        if(op=='|'){
            ans=false;
            while(operand.peek()!='('){
                if(operand.peek()=='t'){
                    ans=true;
                    break;
                }
                operand.pop();
            }
            operand.pop();
        }
        else if(op=='&'){
            ans=true;
             while(operand.peek()!='('){
                if(operand.peek()=='f'){
                    ans=false;
                    break;
                }
                operand.pop();
            }
            operand.pop();
        }
        else if(op=='!'){
            if(operand.peek()=='t'){
                ans=false;
            }
            else if(operand.peek()=='f'){
                ans=true;
            }
            operand.pop();
            operand.pop();
        }
        if(ans){
            operand.push('t');
        }
        else{
            operand.push('f');
        }
    }
}