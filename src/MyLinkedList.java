public class MyLinkedList implements MyList {
    Node head;

    private int listsize=0;


    @Override
    public int size() {
        return listsize;
    }

    @Override
    public boolean isEmpty() {
        if (head==null){
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        head=null;
        listsize=0;
    }

    public void add(Integer data) {
        if (head == null) {
            head = new Node(data);
            listsize++;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;//current has a next node
        }
        current.next = new Node(data);//if current.next is null we will append at the and the new value
        listsize++;
    }

    @Override
    public void add(int index, Integer element) {
//        Node current = head;
//        for (int i=0;i<index;i++){
//            current=current.next;
//        }

    }

    @Override
    public Integer get(int index) throws Exception {
        if (head==null){
            return null;
        }
        Node current = head;
        for (int i=0;i<index;i++){
            current=current.next;
            if(current==null){
                throw new IllegalArgumentException("The index is out of bounds");
            }
        }
        return current.data;
    }

    @Override
    public void set(int index, Integer element) {
        Node current=head;
        for (int i=0;i<index;i++){
            current=current.next;
        }
        current.data=element;
    }

    @Override
    public void remove(int index) {
        int counter=0;
        if (head == null) {
            return;
        }
        Node current=head;
        while (current.next!=null && counter < index){
            current=current.next;
            counter++;
        }
        current.next=current.next.next;
        listsize--;
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
        listsize++;
    }

    public void remove(Integer data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            listsize--;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                listsize--;
                return;
            }
            current = current.next;
        }
    }

    public void show(){
        int count=0;
        Node current = head;
        while (count<listsize){
            System.out.println(current.data);
            current=current.next;
            count++;
        };
    }

}
