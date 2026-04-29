package ch11.A2;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry: directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry: directory) { 
            entry.printList(prefix + "/" + name); // 이전 경로 + 자기 이름을 붙임
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) {
        directory.add(entry);   // 디렉터리에 엔트리를 추가
        entry.setParent(this);  // 현재 디렉토리를 인자로 들어온 자식의 부모로 설정
        return this;
    }
}
