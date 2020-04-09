package behavioralPattern.state;

public class ClientClass {
    public static void main(String[] args) {
        ThreadContext threadContext = new ThreadContext();
        threadContext.start();
        threadContext.getCPU();
        threadContext.stop();
    }
}
