package homework;

public class DNode <T extends Comparable>{
    public T value;
    public DNode<T> next,prev;

    public DNode(T val){
        this.value=val;
        this.next=null;
        this.prev=null;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

}
