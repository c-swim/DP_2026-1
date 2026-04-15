package practice.ch10;

public class Main {
    public static void main(String[] args){
        /*
        Hand h1 = Hand.ROCK;
        Had h2 = Hand.SCISSORS;

        if (h1.isStrongerThan(h2)) {
            System.out.println("h1이 h2보다 강하다.");
        } else if (h1.isWeakerThan(h2)) {
            System.out.println("h1이 h2보다 약하다.");
        } else {
            System.out.println("h1과 h2는 비겼다.");
        }
        */

        // 플레이어 2명 생성
        Player player1 = new Player("최승훈", new ProbStrategy(314));   // 하드 코드 되있음
        Player player2 = new Player("손흥민", new WinningStrategy(15)); // 하드 코드 되있음

        // 게임 10번 시키기
        for (int i = 0; i < 1000; i++) {
            Hand h1 = player1.nextHand();
            Hand h2 = player2.nextHand();

            if (h1.isStrongerThan(h2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            }else if (h1.isWeakerThan(h2)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

        // 최종 결과 출력 
        System.out.println("\n===== Total result ===== ");
        System.out.println(player1);
        System.out.println(player2);
    }
}
