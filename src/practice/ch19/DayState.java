package practice.ch19;

public class DayState implements State {
    // 싱글톤 객체 생성 (자기자신)
    private static DayState singleton = new DayState();

    // 싱글톤, 생성자 private
    private DayState() {
    }

    // 싱글톤 객체를 얻는 메소드
    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {   // 야간 시간이 되면 
            context.changeState(NightState.getInstance());  // 야간 상태로 전환
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("금고사용(주간)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(주간)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("일반 통화(주간)");
    }

    @Override
    public String toString() {
        return "[주간]";
    }
}
