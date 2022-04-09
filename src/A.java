interface K{
    public int f();
    public int g(int x, int y);
}

class A implements K{
    private double d;
    private int t;

    public int f(){}
    public int f(double d){}
    public int g(int x, int y){}
}

class B extends A{
    private String s;
    private String t;

    public int f(double d){}
    public String f(String t){}
    public int g(int x, int y, int z){}
}
