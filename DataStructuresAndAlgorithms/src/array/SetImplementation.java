package array;

import java.util.HashSet;
import java.util.Set;

public class SetImplementation<T> {

    private T[] setElements;
    private int[] a = {};
    int setSize = 0;
    int arraySize = 10;

    public SetImplementation(){
        setElements = (T[]) new Object[arraySize];
    }

    public int size(){
        return setSize;
    }

    public boolean containsElement(T value){
        for(T val: setElements){
            if(val == value){
                return true;
            }
        }
        return false;
    }

    public void addElement(T value){
        if(containsElement(value)){
            return;
        }else{
            if(arraySize == setSize){
                increaseArraySize();
            }
            setElements[setSize] = value;
            setSize++;
        }
    }

    public void increaseArraySize(){
        int increaseSize = arraySize + 10;

        T[] tempArray = setElements;

        setElements = (T[]) new Object[increaseSize];
        System.arraycopy(tempArray,0,setElements,0,arraySize);
    }

    public String toString(){
        if(setSize == 0){
            return "[]";
        }else{
            String data = "[";
            for(int i=0; i<setSize; i++){
                data += setElements[i] + ",";
            }
            data += "]";
            return data;
        }
    }

    public boolean isEmpty(){
        if(setSize == 0){
            return true;
        }
        return false;
    }

    public void remove(T value){
        if(!containsElement(value)){
            return;
        }else{
            for(int i=0; i<setSize; i++){
            }
            setSize--;
        }

    }

    public static void main(String[] args){
        SetImplementation<Integer> setImplementation = new SetImplementation<>();
        Set<Integer> set = new HashSet<>();

        set.add(1);
        System.out.println(set.isEmpty());
        setImplementation.addElement(1);
        setImplementation.addElement(2);
        setImplementation.addElement(3);
        setImplementation.addElement(4);
        setImplementation.addElement(5);
        setImplementation.addElement(6);
        setImplementation.addElement(7);
        setImplementation.addElement(8);
        setImplementation.addElement(9);
        setImplementation.addElement(10);
        setImplementation.addElement(11);
        setImplementation.addElement(12);
        setImplementation.addElement(13);
        setImplementation.addElement(14);
        setImplementation.addElement(15);
        setImplementation.addElement(16);
        setImplementation.addElement(17);


        System.out.println(setImplementation.size());
        System.out.println(setImplementation.containsElement(17));
        System.out.println(setImplementation.toString());
        System.out.println(setImplementation.isEmpty());

    }

}
