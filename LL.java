 class LL {
    Node head;
    private int size;
    LL(){
        this.size =0;
    }
  
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data =data;
            this.next = null;
            size++;
        }
    }
    
    // add = first nad last
    public void addFirst (String data){
        Node newNode =new Node (data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node (data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head ;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next =newNode;

    }
    // print
    public void printList(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head ;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        // currNode.next =newNode;
        System.out.println("Null");
        
    }
    // delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;

        head = head.next;
    }
    // delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        if (head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;// head.next = null-> lastNode =null;
        while(lastNode.next !=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
       secondLast.next = null; 
      }
       public int getSize() {
        return size;

       }
    
    public static void main(String [] args){
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

     list.deleteFirst();
     list.printList();

     list.deleteLast();
     list.printList();

      System.out.println(list.getSize());
      list.addFirst("this");
      System.out.println(list.getSize());
    
    } 
    
    
}
