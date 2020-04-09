package behavioralPattern.state;

public class DeadState extends ThreadState{
    public DeadState(){
        state =State.Dead;
        System.out.println("线程死亡");
    }
}
