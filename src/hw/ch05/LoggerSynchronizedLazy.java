package hw.ch05;

public class LoggerSynchronizedLazy {
    private static LoggerSynchronizedLazy instance = null;
    private StringBuilder logBuffer;

    // 생성자
    private LoggerSynchronizedLazy() {
        System.out.println("[LoggerSynchronizedLazy] 인스턴스를 생성했습니다.");
        logBuffer = new StringBuilder();
    }

    // synchronized 키워드로 스레드 안전성 보장
    public static synchronized LoggerSynchronizedLazy getInstance() {
        if (instance == null) {
            instance = new LoggerSynchronizedLazy();
        }
        return instance;
    }

    // 로그 기록 메서드
    public void log(String message) {
        logBuffer.append("[").append(System.currentTimeMillis()).append("] ")
                 .append(message).append("\n");
        System.out.println("[LoggerSynchronizedLazy] " + message);
    }

    // 로그 반환 메서드
    public String getLog() {
        return logBuffer.toString();
    }
}