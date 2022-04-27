package Assignment10;

public class SList<T> {

  SListIterator<T> iterator;

  SListIterator<T> iterator()
  {
      iterator=new SListIterator<>();
      return iterator;
  }


  public String toString()
  {
      Node temp=iterator.head;
      if(temp==null)
          return "List  is empty";
      while (temp!=null)
      {
          System.out.println(temp.data);
          temp=temp.next;
      }
      return null;
  }


}
