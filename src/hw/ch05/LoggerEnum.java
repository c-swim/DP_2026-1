package hw.ch05;

public enum LoggerEnum {
    INSTANCE; // 상수 : 객체 생성과 저장
    private StringBuilder logBuffer; // 로그를 저장할 버퍼

    // 생성자 enum: private 생성
    LoggerEnum() {
        System.out.println("[LoggerEnum] 인스턴스를 생성했습니다.");
        logBuffer = new StringBuilder();
    }

    // 로그 기록 메서드
    public void log(String message) {
        logBuffer.append("[").append(System.currentTimeMillis()).append("] ")
                 .append(message).append("\n");
        System.out.println("[LoggerEnum] " + message);
    }

    // 로그 반환 메서드
    public String getLog() {
        return logBuffer.toString();
    }
}