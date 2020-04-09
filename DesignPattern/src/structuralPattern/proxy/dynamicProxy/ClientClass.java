package structuralPattern.proxy.dynamicProxy;



public class ClientClass {
    public static void main(String[] args) {
        IShowPic pic = new CRemoPic();
        CLocalPicShow localPicShow = new CLocalPicShow(pic);
        IShowPic iShowPic = (IShowPic) localPicShow.getProxyInstance();
        iShowPic.showPic("我亲爱的慧慧");

    }
}
