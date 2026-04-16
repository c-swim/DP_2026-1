package practice.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    // 컬렉션, 자식(엔트리)를 보관할 리스트, Entry: 부모 타입(디렉터리와 파일 모두 저장가능)
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {  // 자기 자식들의 크기를 모두 더해서 반환
        int size = 0;
        for (Entry entry: directory) {  // 형식: for(원소변수: 컬렉션) { }
            size += entry.getSize();    // 자기 엔트리의 크기를 얻어서 size에 더하기
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {   // prefix: 상위 디렉터리까지의 경로
        System.out.println(prefix + "/" + this);  // this: 자기 자신, toString()이 호출됨
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name);   // 이전 경로 + 자기 이름을 붙임
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}
