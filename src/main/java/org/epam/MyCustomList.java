package org.epam;

import java.util.Arrays;

public class MyCustomList<E> {
    private static final int DEFAULT_SIZE = 10;
    private int size;
    private Object elements[];
    public MyCustomList(){
        elements = new Object[DEFAULT_SIZE];
    }
    public void add(E element){
        if(size == elements.length){
            increaseCapacity();
        }
        elements[size++] = element;
    }
    public E get(int index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index " + index + ", Size " + index);
        }
        return (E) elements[index];
    }
    public E remove(int index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index " + index + ", Size " + index);
        }
        Object item = elements[index];
        int numberOfElements = elements.length - (index + 1);
        System.arraycopy(elements, index + 1, elements, index, numberOfElements);
        size--;
        return (E) item;
    }
    public int size(){
        return size;
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for(int i = 0; i < size; i++){
            stringBuilder.append(elements[i].toString());
            if(i < size - 1){
                stringBuilder.append(",");
            }
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
    private void increaseCapacity(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}
