/**
 *
 * @author IvanAranda
 */
public class HashTable {
    // **************MAIN METHOD************** 
    final static int ARRAY_SIZE = 200;
    static HashMapLinkedList[] hashTableArray = new HashMapLinkedList[ARRAY_SIZE];
	// method to create a Singly linked list with n nodes 
    public static void main(String[] args) 
    { 
        
        HashTable hashTable = new HashTable();
//        HashMapLinkedList[] hashTableArray = new HashMapLinkedList[ARRAY_SIZE];
        for(int i=0; i< hashTableArray.length;i++){
          hashTableArray[i] = new HashMapLinkedList();
        }
        Node[] nodes = {
                            new Node("Maria",null),
                            new Node("Juanita",null),
                            new Node("Mario",null),
                            new Node("Maca",null),
                            new Node("Scraps",null),
                            new Node("Ivan",null),
                            new Node("Ximena",null),
                            new Node("Sonia",null),
                            new Node("Teresa",null),
                            new Node("Anna",null),
                            new Node("Pamela",null),
                            new Node("Jorge",null),
                            new Node("Carlos",null),
                            new Node("Abigail",null),
                            new Node("Alexandra",null),
                            new Node("Alison",null),
                            new Node("Amanda",null),
                            new Node("Amelia",null),
                            new Node("Amy",null),
                            new Node("Andrea",null),
                            new Node("Angela",null),
                            new Node("Anna",null),
                            new Node("Anne",null),
                            new Node("Audrey",null),
                            new Node("Ava",null),
                            new Node("Bella",null),
                            new Node("Bernadette",null),
                            new Node("Carol",null),
                            new Node("Caroline",null),
                            new Node("Carolyn",null),
                            new Node("Chloe",null),
                            new Node("Claire",null),
                            new Node("Deirdre",null),
                            new Node("Diana",null),
                            new Node("Diane",null),
                            new Node("Donna",null),
                            new Node("Dorothy",null),
                            new Node("Elizabeth",null),
                            new Node("Ella",null),
                            new Node("Emily",null),
                            new Node("Emma",null),
                            new Node("Faith",null),
                            new Node("Felicity",null),
                            new Node("Fiona",null),
                            new Node("Gabrielle",null),
                            new Node("Grace",null),
                            new Node("Hannah",null),
                            new Node("Heather",null),
                            new Node("Irene",null),
                            new Node("Jan",null),
                            new Node("Jane",null),
                            new Node("Jasmine",null),
                            new Node("Jennifer",null),
                            new Node("Jessica",null),
                            new Node("Joan",null),
                            new Node("Joanne",null),
                            new Node("Julia",null),
                            new Node("Karen",null),
                            new Node("Katherine",null),
                            new Node("Kimberly",null),
                            new Node("Kylie",null),
                            new Node("Lauren",null),
                            new Node("Leah",null),
                            new Node("Lillian",null),
                            new Node("Lily",null),
                            new Node("Lisa",null),
                            new Node("Madeleine",null),
                            new Node("Maria",null),
                            new Node("Mary",null),
                            new Node("Megan",null),
                            new Node("Melanie",null),
                            new Node("Michelle",null),
                            new Node("Molly",null),
                            new Node("Natalie",null),
                            new Node("Nicola",null),
                            new Node("Olivia",null),
                            new Node("Penelope",null),
                            new Node("Pippa",null),
                            new Node("Rachel",null),
                            new Node("Rebecca",null),
                            new Node("Rose",null),
                            new Node("Ruth",null),
                            new Node("Sally",null),
                            new Node("Samantha",null),
                            new Node("Sarah",null),
                            new Node("Sonia",null),
                            new Node("Sophie",null),
                            new Node("Stephanie",null),
                            new Node("Sue",null),
                            new Node("Theresa",null),
                            new Node("Tracey",null),
                            new Node("Una",null),
                            new Node("Vanessa",null),
                            new Node("Victoria",null),
                            new Node("Virginia",null),
                            new Node("Wanda",null),
                            new Node("Wendy",null),
                            new Node("Yvonne",null),
                            new Node("Zoe",null),
                            new Node("Adam",null),
                            new Node("Adrian",null),
                            new Node("Alan",null),
                            new Node("Alexander",null),
                            new Node("Andrew",null),
                            new Node("Anthony",null),
                            new Node("Austin",null),
                            new Node("Benjamin",null),
                            new Node("Blake",null),
                            new Node("Boris",null),
                            new Node("Brandon",null),
                            new Node("Brian",null),
                            new Node("Cameron",null),
                            new Node("Carl",null),
                            new Node("Charles",null),
                            new Node("Christian",null),
                            new Node("Christopher",null),
                            new Node("Colin",null),
                            new Node("Connor",null),
                            new Node("Dan",null),
                            new Node("David",null),
                            new Node("Dominic",null),
                            new Node("Dylan",null),
                            new Node("Edward",null),
                            new Node("Eric",null),
                            new Node("Evan",null),
                            new Node("Frank",null),
                            new Node("Gavin",null),
                            new Node("Gordon",null),
                            new Node("Harry",null),
                            new Node("Ian",null),
                            new Node("Isaac",null),
                            new Node("Jack",null),
                            new Node("Jacob",null),
                            new Node("Jake",null),
                            new Node("James",null),
                            new Node("Jason",null),
                            new Node("Joe",null),
                            new Node("John",null),
                            new Node("Jonathan",null),
                            new Node("Joseph",null),
                            new Node("Joshua",null),
                            new Node("Julian",null),
                            new Node("Justin",null),
                            new Node("Keith",null),
                            new Node("Kevin",null),
                            new Node("Leonard",null),
                            new Node("Liam",null),
                            new Node("Lucas",null),
                            new Node("Luke",null),
                            new Node("Matt",null),
                            new Node("Max",null),
                            new Node("Michael",null),
                            new Node("Nathan",null),
                            new Node("Neil",null),
                            new Node("Nicholas",null),
                            new Node("Oliver",null),
                            new Node("Owen",null),
                            new Node("Paul",null),
                            new Node("Peter",null),
                            new Node("Phil",null),
                            new Node("Piers",null),
                            new Node("Richard",null),
                            new Node("Robert",null),
                            new Node("Ryan",null),
                            new Node("Sam",null),
                            new Node("Sean",null),
                            new Node("Sebastian",null),
                            new Node("Simon",null),
                            new Node("Stephen",null),
                            new Node("Steven",null),
                            new Node("Stewart",null),
                            new Node("Thomas",null),
                            new Node("Tim",null),
                            new Node("Trevor",null),
                            new Node("Victor",null),
                            new Node("Warren",null),
                            new Node("William",null)
        };
//        get the size()
        System.out.println("The Hash Table Array size is "+hashTable.size());
        for(int i = 0;i<hashTableArray.length;i++){
            //prime HashMapLinkedList array with HashMapLinkedLists
            hashTableArray[i] = new HashMapLinkedList();
        }
        // Print the LinkedList 
        hashTable.put(nodes);
        for(int i = 0;i<hashTableArray.length;i++){
            //view Hash Map with nodes
            System.out.print("List index "+ i +" size: "+hashTableArray[i].size() + " - ");
            hashTableArray[i].printList();
            System.out.println("");
        }
        
        
       
        Node wn = hashTable.get("William");
        System.out.println("Geting node Willliam");
        System.out.println("Info: " + wn.displayNode());
        hashTable.remove("William");
        hashTable.remove("Theresa");
        
        for(int i = 0;i<hashTableArray.length;i++){
            //view Hash Map with nodes
            System.out.print("List index "+ i +" size: "+hashTableArray[i].size() + " - ");
            hashTableArray[i].printList();
            System.out.println("");
        }
        
        //test containsKey
        System.out.println("Is William here?? "+hashTable.containsKey("William"));//this one was deleted
        System.out.println("Is Mario here?? "+hashTable.containsKey("Mario"));//this one was not deleted
        
    } //END OF MAIN
    
    
    void put(Node[] nodes){
    for(Node n: nodes){
        hashTableArray[getIndexByName(n.value)].put(n);
        
      }
    }
    
    public int getIndexByName(String str){
      //ascii value of char in String
      int s = 0;
      for(char c: str.toCharArray()){
        // System.out.println(c + " "+(int)c);
        s = s + (int)c;
      }
      // System.out.println(s);
      int arrayIndex = s % ARRAY_SIZE;
      return arrayIndex;//return mod for index
    }
    
    public  Node get(String str){
        HashMapLinkedList list = hashTableArray[getIndexByName(str)];
        
        return list.get(str);
    }
    
    public void remove(String str){
        HashMapLinkedList list = hashTableArray[getIndexByName(str)];
        list.remove(str);
    }
    
    public boolean containsKey(String str){
       
        return (get(str)!=null);
    }
    
    public int size(){
        
        return ARRAY_SIZE;
    }
}