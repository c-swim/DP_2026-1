package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서
        //list.sort( /* 미구현 */ 1 );    // Comparator: Functional 인터페이스, compare 메서드 하나만 존재
        list.sort(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println(list);

        list.sort((s1, s2) -> s1.compareTo(s2));    // 람다 표현식


        // 사전순으로 큰 순서 (내림차순)
        list.sort(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });        // 내림차순 Comparator
        System.out.println(list);
    }
}
