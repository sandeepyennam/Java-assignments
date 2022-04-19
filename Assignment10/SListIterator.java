package Assignment10;

public class SListIterator<T> {

    Node head;
    public void insert(T data)
    {

        if(head==null)
        {
            Node n=new Node(data);
            head=n;
        }
        else
        {
            Node temp=head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            Node n=new Node(data);
            temp.next=n;

        }

    }

    public void insert(int pos,T data) throws NullPointerException
    {

        Node temp=head;
        Node temp2=null;
        while (pos-2>=0)
        {
            temp2=temp;
            temp=temp.next;
            if(temp==null)
            {
               throw new NullPointerException();
            }
            pos--;
        }
        Node n=new Node(data);
        n.next=temp2.next;
        temp2.next=n;



    }



   public T delete() throws NullPointerException
   {
       if(head==null)
           throw new NullPointerException();

       if(head.next==null)
       {
           T d= (T) head.data;
           head=null;
           return d;
       }
       Node temp=head;
       while (temp.next.next!=null)
       {
           temp=temp.next;
       }

       T d= (T) temp.next.data;
       temp.next=null;
       return d;


   }


   public T delete(int pos)
   {
       Node temp=head;
       Node temp2=null;
       while (pos-2>=0)
       {
           temp2=temp;
           temp=temp.next;
           if(temp==null)
           {
               System.out.println("Position greter than length of list");
               break;
           }
           pos--;
       }
       T d= (T) temp2.next.data;
       temp2.next=temp2.next.next;

       return d;
   }



}
