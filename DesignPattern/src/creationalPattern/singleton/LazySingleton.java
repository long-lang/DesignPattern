package creationalPattern.singleton;

public class LazySingleton {
    //线程安全  懒汉式单例
    private static volatile LazySingleton instance = null;
    private LazySingleton(){

    }
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
