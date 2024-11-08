package src;
public class Node2<T,V> extends Node<T> {
    
    Node2<T,V> next;
    LinkedList<V> list;

    public Node2(T val){
        super(val);
        next=null;
        list = new LinkedList<>();

    }
}
