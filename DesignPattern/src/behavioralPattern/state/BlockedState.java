package behavioralPattern.state;

public class BlockedState extends ThreadState {
    public  BlockedState(){
        this.state = State.Blocked;
        System.out.println("线程阻塞了");
    }

    public void resume(ThreadContext th){
        System.out.println("调用了resume方法");
        if(state==State.Blocked){
            th.setThreadState(new RunnableState());
        }else{
            System.out.println("当前线程不是阻塞状态");
        }
    }
}
