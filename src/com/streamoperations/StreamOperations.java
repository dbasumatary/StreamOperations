package com.streamoperations;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamOperations {

    //UC-2.1: Create a stream and show each element of the stream using forEach()
    public void  createIterateStream() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add((11));

        //Using forEach() to print the stream
        System.out.println("The original elements:");
        arrayList.stream().forEach(a-> System.out.print(a + " "));
    }


    //UC-2.2: Transform each element to double and store the result

    public void elementDouble(){
        ArrayList<Integer> arrayInteger = new ArrayList<>();
        arrayInteger.add(5);
        arrayInteger.add(3);
        arrayInteger.add((11));

        //Using map() to perform an operation to double each element
        Stream<Double> arr_double = arrayInteger.stream().map(a -> a.doubleValue());
        System.out.println("\nThe numbers are transformed to double:");
        arr_double.forEach(a -> System.out.print(a + " "));
    }

    public static void main(String[] args) {
        StreamOperations streamTest = new StreamOperations();
        streamTest.createIterateStream();
        System.out.println();
        streamTest.elementDouble();
    }
}

