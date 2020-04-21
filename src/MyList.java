import java.util.Arrays;

public class MyList<E> {

    private int size =0;
    static final int DEFAULT_CAPACITY =10;

    Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }

    void ensuraCapacity(){
         if (size>=elements.length){
             E [] newElements =(E[]) new Object[size*2+1];
             System.arraycopy(elements,0,newElements,0,size);
             elements =newElements;
         }

    }

    void  add(int index, E e){
        ensuraCapacity();

        for (int i= size-1;i>=index;i--){
            elements[i+1] =elements[i];
        }
        elements[index] = e;
        ++size;
    }

    E remove(int index){
        if (index>size || index<0){
            throw new IndexOutOfBoundsException("Length False!");
        }
        E e = (E) elements[index];
        for (int i =index ;i<size-1;i++){
            elements[i] =elements[i+1];
        }
        elements [size-1] =null;
        --size;
        return e;
    }

    int size(){
       return size;
        }
    public E clone(){
       return (E) elements;
    }

    boolean contains(E e){
        for (int i= 0;i<size;i++)
            if (e.equals(elements[i]))
                return true;
        return false;
    }

    int indexOf(E e){
        for (int i=0;i<size;i++){
            if (e.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }

    void add(E e){
        ensuraCapacity();

        elements[++size] =e;
    }

    E get(int index){
        if (index<0 || index>size){
            throw new IndexOutOfBoundsException("Index error");
        }
        return (E) elements[index];
    }

    void clear(){
        elements = (E [])new Object[DEFAULT_CAPACITY];
        size =0;
    }
}
