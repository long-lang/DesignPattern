package structuralPattern.facade;

public class GeneralSwitchFacade {
    private  Light[] lights = new Light[4];
    private  AirConditioner airConditioner;
    private  Fan fan;
    private  Television television;

    public  GeneralSwitchFacade(){
        lights[0] = new Light("左前");
        lights[1] = new Light("左后");
        lights[2] = new Light("右前");
        lights[3] = new Light("右后");
        airConditioner = new AirConditioner();
        fan = new Fan();
        television = new Television();
    }

    public void on(){
        for (Light light : lights){
            light.onLight();
        }
        airConditioner.onAir();
        fan.onFan();
        television.onTelevision();
    }

    public  void off(){
        for (Light light : lights){
            light.offLight();
        }
        airConditioner.offAir();
        fan.offFan();
        television.offTelevision();
    }
}
