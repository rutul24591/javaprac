package random;

public class SListNode {

		private SListNode head;
		private int size;    //keeps increasing
		

public SList(){			// Constructs an empty list.
	head = null;
	size = 0;
}

public boolean isEmpty(){
								// indicates whether th elist is empty. returns true if the list is empty else it returns false.
	return size == 0;
	
}

public int length(){
	return size;
}

public void insertFront(){
	head= new SListNode(obj,head);
	size ++;
	
}
public void insertEnd(){
	if(head == null){
		head = new SListNode(obj);
	}
	else{
		SListNode node = head;
		while(node.next != null){
			node= node.next;
		}
		node.next=new SListNode(obj);
	}
	size++;
}
public object nth(int position)
{
	SListNode = currentNode;
	if((position<1) || ( head=null)){
		return null;
	}else{
		currentNode=currentNode.next;
		if(currentNode ==null){
			return null;
		}position --;
	}return currentNode.item;
 }
public void squish(){
	(head ==null)
	return;
	SlistNode node = head;
		while(node.next != null){
			SListNode next= node.next;
		} if (node.item.equals(next.item)) {
            if (next.next != null) {
                							//modify node.next to skip next
               node.next = next.next;
            } else {
            								//next was tail, so chop the tail.
                node.next = null;
            }
            size--;
        } else {
            //move forward
            node = next;
        }
		}

}
