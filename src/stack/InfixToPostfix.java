package stack;

import helpers.InputReader;

public class InfixToPostfix {
    Stack<Character> postFixStack=new Stack<>();
    Stack<Character> opStack=new Stack<>();

    public int getPrecedence(char c){
        switch (c){
            case '-':
            case '+':return 1;
            case '*':
            case '/':return 2;
            case '^':return 3;
            default:return -1;
        }
    }
    public boolean isDigit(char c){
        return c>='0'&&c<='9';
    }
    public boolean isOps(char c){
        return (c=='-'||c=='+'||c=='*'||c=='/'||c=='^');
    }
    public void infixToPostfix(String infix){
        int val=0;
        for(char c:infix.toCharArray()){
            if(isDigit(c)){
                val=val*10+(int)c;
            }
            else if(isOps(c)){
                postFixStack.push((char)val);
                val=0;
                postFixStack.push('|');
                if(opStack.isEmpty()){
                    opStack.push(c);
                }
                if(!opStack.isEmpty()&&getPrecedence(c)>getPrecedence(opStack.peek())){
                    postFixStack.push(c);
                    while(!opStack.isEmpty()&&getPrecedence(c)>getPrecedence(opStack.peek())){
                        postFixStack.push(opStack.pop());
                    }
                }
                if(getPrecedence(c)<=getPrecedence(opStack.peek())){
                    opStack.push(c);
                }
            }
        }

        postFixStack.printAll();
    }

    public static void main(String[] args) {
        InfixToPostfix infixToPostfix=new InfixToPostfix();
        InputReader inputReader=new InputReader(System.in);
        String infix=inputReader.readString();
        infixToPostfix.infixToPostfix(infix);
    }

}
