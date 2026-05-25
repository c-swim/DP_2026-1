package hw.ch19;

public class ClosingState implements State {
    private static final ClosingState singleton = new ClosingState();

    private ClosingState() {}

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        // 17시 미만이면 주간 상태로 전환
        if (hour < 17) {
            context.changeState(DayState.getInstance());
        } 
        // 20시 이상이면 야간 상태로 전환
        else if (20 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("마감 금고 점검");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(마감)");
        context.changeState(UrgentState.getInstance());
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("퇴근 확인 통화(마감)");
    }

    @Override
    public String toString() {
        return "[마감]";
    }
}