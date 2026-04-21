package practice.ch11;

public class Main {
    public static void main(String[] args) {
        // 디렉토리 트리
        Entry root = new Directory("root"); //업 캐스팅
        
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        
        root.add(bin);
        root.add(tmp);
        root.add(usr);

        // 다운 캐스팅
        
        bin.add(new File("vi", 10000));
        bin.add(new File("latex", 20000));

        // 경로 출력
        root.printList();
        
        
    }
}
