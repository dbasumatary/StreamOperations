package com.streamoperations;
import java.util.ArrayList;

//UC-2.1: Create a stream and show each element of the stream using forEach()
public class StreamOperations {
    public void  createIterateStream() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add((7));

        //Using forEach() to print the stream
        arrayList.stream().forEach(a-> System.out.println(a));
    }
    public static void main(String[] args) {
        StreamOperations streamTest = new StreamOperations();
        streamTest.createIterateStream();
    }
}

