package exam;

public class LinkedListCreationInsertionDeletion {
    Node head,tail,temp;
    int size=0;
    void creation(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
        size++;
    }
    
   Node getindex(int pos)
   {
        int i=1;
        temp=head;
        while(i<pos-1)
        {
            temp=temp.next;
            i++;
        }
        return temp;
   }
   void insertion(int data,int pos)
   {
       Node newnode = new Node(data);
       if(pos==0)
       {
        newnode.next=head;
        head=newnode;
       }
       else if(pos==size)
       {
        temp=head;
        newnode=tail.next;
        tail=newnode;
       }
       else{
        getindex(pos);
        newnode.next=temp.next;
        temp.next=newnode;
       }

   }
   
   void deletion(int pos){
       getindex(pos);
       if(pos==0){
           head = head.next;
       }
       else if(pos==size){
           
           tail = temp;
           tail.next = null;
       }
       else{
           getindex(pos);
           temp.next = temp.next.next;
       }
   }
   
   void display(){
       temp = head;
       while(temp != null){
           System.out.print(temp.data+"->");
           temp = temp.next;
       }
       System.out.println();
               
   }

static class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}




public static void main(String args[]){
    LinkedListCreationInsertionDeletion ll = new LinkedListCreationInsertionDeletion();
    ll.creation(5);
    ll.creation(5);
    ll.creation(5);
    ll.creation(8);
    ll.creation(5);
    ll.display();
    ll.deletion(2);
        ll.display();
}
}
