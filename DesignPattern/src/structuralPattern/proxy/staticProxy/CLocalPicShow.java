package structuralPattern.proxy.staticProxy;

public class CLocalPicShow implements IShowPic , Runnable {
    private  IShowPic pic;
    private  String picName;
    @Override
    public void run() {
        pic.showPic(picName);
        System.out.println("载入图片完成");
    }

    @Override
    public void showPic(String picName) {
        pic = new CRemoPic();
        this.picName = picName;
        System.out.println("准备载入图片");
        Thread th = new Thread(this);
        th.start();
    }
}
