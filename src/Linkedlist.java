class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;

    }
}
class LinkedList {
    public static void main(String[] args)
    {
        Node head = new Node(10);
        Node temp1= new Node(20);
        Node temp2=new Node(30);
        Node temp3=new Node(40);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=temp3;
        head= insertBegin(head,50);
        head=insertEnd(head,60);


        print(head);
        head=delhead(head);
        System.out.println();
        print(head);
        head=delhead(head);
        System.out.println();
        print(head);
    }



    public static void print(Node head){
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data + "-->");
            curr=curr.next;

        }
    }

    public static void rprint(Node head){
        if(head==null){return;}
        System.out.print(head.data+"-->");
        rprint(head.next);
    }
    public static Node insertBegin(Node head,int x){
        Node temp = new Node(x);
        temp.next=head;
        return temp;
    }
    public static  Node insertEnd(Node head,int x){
        Node temp = new Node(x);
        if(head==null){
            return temp;
        }
        Node curr =head;
        while(curr.next!=null) {
            curr = curr.next;
        }
            curr.next=temp;
            return head;
    }
    public static Node delhead(Node head){
        if(head==null){return null ;}
        else{return head.next;}
    }
    public static Node LastElement(Node head){
        if(head==null){return null;}
        if(head.next==null){return null;}
        Node curr = head;
        while(curr.next!=null){curr=curr.next;}
        curr.next=null;
        return head;
    }
    public static Node insertAtPos(Node head,int pos,int data){

    }
}