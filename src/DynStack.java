/** Class used to create a Node, a Node stores a string and a pointer to the next node
 * @author pdawkins
 * @version March 9, 2023
 */
class Node{
    private Node next;
    private String data;

    /** Constructor sets the data field to the supplied data and next to null
     * @param aData: String data for the node
     */
    public Node(String aData){
        data = aData;
        next = null;
    }

    /** Read the next pointer
     * @return The pointer to the next node
     */
    public Node getNext(){return next;}

    /** Sets the next pointer of the node
     * @param newNext : Pointer to set the next Pointer to
    * */
    public void setNext(Node newNext){next = newNext;}

    /** Read the data that is stored in the node
     * @return The data stored in the node
     */
    public String getData(){return data;}

    /** Sets the data of the node
     * @param newData : The data that should be set to the node
    * */
    public void setData(String newData){data = newData;}
}

/** Class DynStack defines the dynamic stack of String
 * @author pdawkins
 * @version March 9, 2023
 */
public class DynStack {
    private Node top;

    /** Constructor for DynStack sets top to null
     */
    public DynStack(){top = null;}

    /** Push takes a new string and pushes it to the LIFO stack
    * @param newData : New string to push onto the stack
    * */
    public void push(String newData){
        // Create a new node with the data
        Node newNode = new Node(newData);

        //Easy case when this is the first node
        if(top == null){
            newNode.setNext(null);
            top = newNode;
        }
        else{
            newNode.setNext(top);
            top = newNode;
        }
    }

    /** Pop returns and remove the value at the top of the stack
    * */
    public String pop(){
        String temp = " ";
        if (top == null)
            System.out.println("Stack is empty !!!");
        else{
            temp = top.getData();
            top = top.getNext();
        }
        return temp;
    }

    /** Peek returns the value at the top of the stack without removing it
     * */
    public String peek(){
        String temp = " ";
        if (top == null)
            System.out.println("Stack is empty !!!");
        else{
            temp = top.getData();
        }
        return temp;
    }

    /** toString() returns a string representation of the stack ...
     * */
    public String toString(){
        String result = "topPointer --> ";

        Node temp = top;
        while(temp != null){
            result += temp.getData() + " --> ";
            temp = temp.getNext();
        }
        return result + " NULL ";
    }
}
