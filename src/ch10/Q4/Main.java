package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서
        list.sort( /* 미구현 */ 1 );    // 오름차순 Comparator
        list.sort(new Comparator<String>(){
            @Override
            // compare를 구현하면 맞는 ..? 문법?
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println(list);

        // 사전순으로 큰 순서 
        list.sort( /* 미구현 */ );        // 내림차순 Comparator
        System.out.println(list);
    }
}
