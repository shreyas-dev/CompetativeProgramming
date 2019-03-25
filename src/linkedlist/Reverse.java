package linkedlist;

public class Reverse {
    static class Node{
        int key;
        Node next;
        public Node(int key){
            this.key=key;
        }
    }
    public static Node reverse(Node curr){
        Node next=null;
        Node prev=null;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void printList(Node node){
        while (node!=null){
            System.out.print(node.key+" ");
            node=node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node node1=new Node(1);
        Node head=node1;
        node1.next=new Node(2);
        node1.next.next=new Node(3);
        node1.next.next.next=new Node(4);
        node1.next.next.next.next=null;
        printList(node1);
        node1=reverse(head);
        printList(node1);
    }
}
