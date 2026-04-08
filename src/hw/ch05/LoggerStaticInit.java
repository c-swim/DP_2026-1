package hw.ch05;

// 기본적인 Singleton의 형태
public class LoggerStaticInit {
    private static final LoggerStaticInit instance = new LoggerStaticInit();
    private StringBuilder logBuffer;

    // 생성자 private -> Singleton 클래스가 외부에서 생성되는 것을 막음
    private LoggerStaticInit() {
        System.out.println("[LoggerStaticInit] 인스턴스를 생성했습니다.");
        logBuffer = new StringBuilder();
    }

    // 인스턴스 반환 메서드
    public static LoggerStaticInit getInstance() {
        return instance;
    }

    // 로그 기록 메서드
    public void log(String message) {
        logBuffer.append("[").append(System.currentTimeMillis()).append("] ")
                .append(message).append("\n");
        System.out.println("[LoggerStaticInit] " + message);
    }

    // 로그 반환 메서드
    public String getLog() {
        return logBuffer.toString();
    }
}
