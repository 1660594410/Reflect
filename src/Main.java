import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {
        DogBean dog = new DogBean("xiao");
        DogBean d1 =new DogBean();
        DogBean d2 =new DogBean();
        Class clazz1=DogBean.class;
        Class<?> clazz2=dog.getClass();
        Class clazz3 = null;
        try {
            clazz3 = Class.forName("DogBean");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("输出clazz1:"+clazz1);
        System.out.println("输出clazz1:"+clazz1.getName());
        System.out.println("输出clazz2:"+clazz2.getName());
        System.out.println("输出clazz3:"+clazz3.getName());
        System.out.println((clazz1==clazz3)+"--"+(d1==d2));
//        System.out.println(Integer.class.getSuperclass());
        DogBean clazz4object = null;
        try {
            clazz4object = (DogBean) clazz2.newInstance();
            clazz4object.setDname("123");
            clazz4object.setDage(2);
            System.out.println("名字："+clazz4object.getDname()+",年龄："+clazz4object.getDage());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
//        Constructor[] constructors=clazz1.getConstructors();
//        for (int i=0;i<constructors.length;i++){
//            System.out.println(" 输出所有构造方法: " + constructors[i]);
//            System.out.println(" 输出所有构造方法name: " + constructors[i].getName());
//        }


//        try {
//            Constructor<?> ct = clazz3.getConstructor(new Class[]{int.class});
//            DogBean dogBean1 = (DogBean) ct.newInstance(13);
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
//        Method [] methods = clazz3.getDeclaredMethods();
//        for (Method method:methods){
//            System.out.println(Modifier.toString(method.getModifiers()) +"--"+method.getName()+"--"+method.getReturnType());
//        }
        try {
            Method method = clazz3.getMethod("getsomething",String.class);
            System.out.println(method.getName());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
