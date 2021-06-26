package hello.core.test;

import java.util.*;

public class collection {

    public static void main(String[] args) {
        List<Avengers> list = new ArrayList<Avengers>(); // ArrayList
        list.add(new Avengers("aaa", "ironman", 20)); // 객체 생성 및 저장
        list.add(new Avengers("bbb", "spiderman", 20));
        list.add(new Avengers("ccc", "Hulk", 20));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) { // 반복문
            Avengers av = list.get(i);
            System.out.println("name : " + av.name + "\nID : " + av.id + "\nage : " + av.age);
            System.out.println("--------------------");
        }


        List<String> list2 = new ArrayList();
        list2.add("aa");
        list2.add("bb");
        System.out.println(list2);
    }
}