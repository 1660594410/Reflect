class Father {
    static
    {
        System.out.println("父类静态代码块");
    }
    public Father(){
        System.out.println("父类构造方法");
    }
}

class Son extends Father{
    static {
        System.out.println("子类静态代码块");
    }
    P p = new P();
    public Son(){
        System.out.println("子类构造方法");
    }
}

class P {
    static {
        System.out.println("派生类对象静态代码块");
    }
    public P(){
        System.out.println("派生类对象构造方法");
    }
}
