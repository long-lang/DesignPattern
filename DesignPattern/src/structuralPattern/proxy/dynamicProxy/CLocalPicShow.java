package structuralPattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CLocalPicShow{
    private  Object target;
    public  CLocalPicShow(Object target){
        super();
        this.target = target;
    }

    public  Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("正在加载图片："+args[0].toString());
                        method.invoke(target,args);
                        System.out.println("图片加载完成");
                        return null;
                    }
                }
        );
    }
}
