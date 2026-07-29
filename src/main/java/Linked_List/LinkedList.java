package Linked_List;

public class LinkedList <T> {
    private Node <T> first;
    private Node <T> last;
    private int lenght;

    public  LinkedList(){
        this.lenght = 0;
    }
    public void addValue(T value){
        Node<T> node = new Node<T>(value);
        if(this.first == null && this.last == null){
            this.first = node;
            this.last = node;
        }else{
            this.last.setNext(node);
            this.last = node;
        }
        lenght++;
    }

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
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

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public  void Remove(T content){
        Node<T> current = this.first;
        Node<T> previus = null;
        for(int i = 0; i < this.lenght; i++){
            if(current.getValue().equals(content)){
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
