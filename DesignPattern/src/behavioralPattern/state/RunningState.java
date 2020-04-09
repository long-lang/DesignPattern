package behavioralPattern.state;

public class RunningState extends ThreadState {
    public  RunningState(){
        this.state = State.Running;
        System.out.println("线程运行了");
    }

    public void suspend(ThreadContext th){
        System.out.println("调用了suspend方法");
        if(state==State.Running){
            th.setThreadState(new BlockedState());
        }else{
            System.out.println("当前线程不是运行状态");
        }
    }

    public void stop(ThreadContext th){
        System.out.println("调用了stop方法");
        if(state==State.Running){
            th.setThreadState(new DeadState());
        }else{
            System.out.println("当前线程不是运行状态");
        }
    }
}
