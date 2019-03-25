package trees;

public class InterviewQuestion1 {


    /*
        Create a Tree from the parsed string with ADD and SUB are functions in the
        string and then compute the result

        EX 1:
        ADD(SUB(5,4),ADD(2,3))
        OP: 6

     */

    public static void main(String[] args) {
        ExpresssionTree tree=new ExpresssionTree();
        tree.parse("ADD(SUB(2,ADD(1,2)),SUB(1,2))");
        System.out.println(tree.eval());
    }


}
