package behavioralPattern.state;

public class RunnableState extends ThreadState{
    public RunnableState(){
        state = State.Runnable;
        System.out.println("线程就绪了");
    }

    public  void  getCPU(ThreadContext th){
        System.out.println("调用了getCPU方法");
        if(state==State.Runnable){
            th.setThreadState(new RunningState());
        }else{
            System.out.println("当前线程不是就绪状态");
        }
    }
}
