package structuralPattern.facade;

public class Light {
    private  String position;
    public  Light(String position){
        this.position = position;
    }
    public void onLight(){
        System.out.println(position+"灯打开了");
    }

    public  void offLight(){
        System.out.println(position+"灯停了");
    }
}
