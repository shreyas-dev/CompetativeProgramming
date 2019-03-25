package trees;

public class ExpresssionTree {
    static class Node{
        char data;
        Node left,right;
        public Node(){

        }
        public Node(char data){
            this.data=data;
        }
    }
    private Node root;
    int index;
    public void parse(String parseString){
        index=0;
        root=performTree(parseString);
    }

    public int eval(){
        return computeSum(root);
    }

    private Node performTree(String parseString){
        Node node=new Node();
        if(index<parseString.length()){
            if(isOperator(parseString,index)){
                node.data=getOperator(parseString,index);
                index+=3;
                if(parseString.charAt(index)!='(')
                    throw new RuntimeException("Invalid token at:"+index+" for string:"+parseString+", Expected ( found:"+parseString.charAt(index));
                index++;
                if(isOperator(parseString,index)){
                    node.left=performTree(parseString);
                }
                else if(isDigit(parseString.charAt(index))){
                    node.left=new Node();
                    node.left.data=parseString.charAt(index);
                    index++;
                }
                else {
                    throw new RuntimeException("Invalid token at:"+index+" for string:"+parseString+", Expected digit or operator,found:"+parseString.charAt(index));
                }
                if(parseString.charAt(index)!=',')
                    throw new RuntimeException("Invalid token at:"+index+" for string:"+parseString+", Expected , found:"+parseString.charAt(index));
                index++;
                if(isOperator(parseString,index)){
                    node.right=performTree(parseString);
                }
                else if(isDigit(parseString.charAt(index))){
                    node.right=new Node();
                    node.right.data=parseString.charAt(index);
                    index++;
                }
                else {
                    throw new RuntimeException("Invalid token at:"+index+" for string:"+parseString+", Expected digit or operator ,found:"+parseString.charAt(index));
                }
                if(parseString.charAt(index)!=')')
                    throw new RuntimeException("Invalid token at:"+index+" for string:"+parseString+", Expected ),found:"+parseString.charAt(index));
                index++;
            }
        }
        return node;
    }
    private int computeSum(Node node){
        System.out.println(node.data);
        if(node.data=='+') {
            return computeSum(node.left) + computeSum(node.right);
        }
        else if(node.data=='-')
            return computeSum(node.left) - computeSum(node.right);
        else {
            return (node.data-'0');
        }
    }

    private boolean isOperator(String parseString,int index){
        if(parseString.charAt(index)=='A'||parseString.charAt(index)=='S')
            return true;

        return false;

    }
    private char getOperator(String parseString,int index){
        return parseString.charAt(index)=='A'?'+':'-';
    }
    private boolean isDigit(char c){
        return c>='0'&&c<='9';
    }
}
