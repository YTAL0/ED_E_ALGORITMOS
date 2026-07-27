package Linked_List;

public class LinkedList {
    private Node first;
    private Node last;
    private int lenght;

    public  LinkedList(){
        this.lenght = 0;
    }
    public void addValue(String value){
        Node node = new Node(value);
        if(this.first == null && this.last == null){
            this.first = node;
            this.last = node;
        }else{
            this.last.setNext(node);
            this.last = node;
        }
        lenght++;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int getLenght() {
        return lenght;
    }
    public Node get(int position){
        Node current = this.first;
        for(int i = 0; i < position; i++){
            if(current.getNext()!=null){
                current = current.getNext();
            }
        }
        return current;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public  void Remove(String content){
        Node current = this.first;
        Node previus = null;
        for(int i = 0; i < this.lenght; i++){
            if(current.getValue().equalsIgnoreCase(content)){
                if(this.lenght == 1){
                    this.first = null;
                    this.last = null;
                }else if(current == this.first){
                    setFirst(current.getNext());
                    current.setNext(null);
                }else if(current == this.last){
                    setLast(previus);
                    current.setNext(null);
                }else{
                    previus.setNext(current.getNext());
                    current = null;
                }
                this.lenght--;
                break;
            }
            previus = current;
            current = current.getNext();
        }
    }

}
