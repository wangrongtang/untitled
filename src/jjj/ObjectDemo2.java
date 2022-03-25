package jjj;

public class ObjectDemo2 {
    public static void main(String[] args) {
        Ob2 c=new Ob2();
        c.setName("马云");
        c.setOld(50);
        Ob2 a=new Ob2();
        a.setName("马云");
        a.setOld(50);
        System.out.println(c.equals(a));
    }
}
