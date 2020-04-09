package behavioralPattern.state;

public class NewState extends  ThreadState {
    public  NewState(){
        this.state = State.New;
        System.out.println("线程开始了");
    }

    public void start(ThreadContext th){
        System.out.println("调用了start方法");
        if(state==State.New){
            th.setThreadState(new RunnableState());
        }else{
            System.out.println("当前线程不是新建状态");
        }
    }

}
