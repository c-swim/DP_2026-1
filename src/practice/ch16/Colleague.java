package practice.ch16;

// Colleague를 위한 인터페이스
public interface Colleague {
    // Mediator를 설정한다 
    public abstract void setMediator(Mediator mediator);

    // Mediator에서 활성/비활성을 지시한다
    public abstract void setColleagueEnabled(boolean enabled);
}
