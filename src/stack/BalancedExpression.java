package stack;

import helpers.InputReader;

public class BalancedExpression {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<Character>();
        InputReader inputReader=new InputReader(System.in);
        String str=inputReader.readString();
        for(Character character:str.toCharArray()){
            switch (character){
                case '{':
                case '(':
                case '[':
                        stack.push(character);
                        break;
                case '}':if('{'!=stack.pop()) {
                            exitAndPrint();
                        }
                        break;
                case ')':if('('!=stack.pop()) {
                            exitAndPrint();
                        }
                        break;
                case ']':if('['!=stack.pop()){
                            exitAndPrint();
                        }
                        break;
            }
        }
        if(!stack.isEmpty()){
            System.out.println("1");
            exitAndPrint();
        }
        System.out.println("Balanced");
    }
    public static void exitAndPrint(){
        System.out.println("UnBalanced");
        System.exit(0);
    }
}
