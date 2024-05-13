package Collectionframework;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Abhishek");
        arrList.add("Abhinav");
        arrList.add("Ayush");
        arrList.add(1, "Rahul");

        
        for (String element : arrList) {
            System.out.print(arrList.indexOf(element)+"-"+element+" ");
        }

    }
}
