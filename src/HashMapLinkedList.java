// Java program to implement 
// a Singly Linked List 
public class HashMapLinkedList { 

    Node head; // head of list 

    public Node get(String key){
        Node currNode = this.head;
        // Traverse through the LinkedList 
        while (currNode != null) { 
                // Go to next node 
            if(currNode.value == key){
                break;
            }
            currNode = currNode.next; 
        } 
        return currNode;
    }

    public void remove(String key){
       Node currNode = this.head;
        // Traverse through the LinkedList 
        while (currNode != null) { 
                // Go to next node 
            if(currNode.next.value == key){
                if(currNode.next.next == null){
                    currNode.next = null;
                }else{
                    currNode.next = currNode.next.next;
                    currNode.next.next = null;
                }
                System.out.println("Node removed ");
                break;
            }
            currNode = currNode.next;
        } 
        
    }
    public void containsKey(String key){

    }
    public int size(){
        Node currNode = this.head;
        int nodesNumber = 0;
        // Traverse through the LinkedList 
        while (currNode != null) { 
                // Go to next node 
            nodesNumber++;
            currNode = currNode.next; 
        } 
        return nodesNumber;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
     
    // Method to insert a new node 
    public HashMapLinkedList put(Node n) 
    { 
            // Create a new node with given data 
            Node new_node = n; 
            new_node.next = null; 

            // If the Linked List is empty, 
            // then make the new node as head 
            if (this.head == null) { 
                    this.head = new_node; 
            } 
            else { 
                    // Else traverse till the last node 
                    // and insert the new_node there 
                    Node last = this.head; 
                    while (last.next != null) { 
                            last = last.next; 
                    } 

                    // Insert the new_node at last node 
                    last.next = new_node; 
            } 

            // Return the list by head 
            return this; 
    } 

    // Method to print the LinkedList. 
    public void printList() 
    { 
            Node currNode = this.head; 

//		System.out.print("LinkedList: "); 

            // Traverse through the LinkedList 
            while (currNode != null) { 
                    // Print the data at current node 
                    System.out.print(currNode.key + " " + currNode.value + " "); 

                    // Go to next node 
                    currNode = currNode.next; 
            } 
    } 
    
} 

class Node {
    public String key;
    public String value;           // data item
    public Node next;              // next link in list
 // -------------------------------------------------------------
    public Node(String data, Node next) // constructor
       {
        this.key = Integer.toString(this.hashCode());
        this.value = data;                 // initialize data
        this.next = next;                 // ('next' is automatically
       }                           //  set to null)
 // -------------------------------------------------------------
    public String displayNode()      // display ourself
       {
            String out = "{" + key + ":"+ value + "} ";

            return out;
       }
    
    @Override
    public String toString() {
      return super.toString() + "key: " + key + " value: " + value + "\n";
    }

    // @Override
    // public int hashCode(){
      
    //   return 1;
    // }

   }  // end class Node