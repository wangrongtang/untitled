package jjj;

public class Ob2 extends Object{
    private String name;
    private int old;

    public Ob2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ob2 ob2 = (Ob2) o;

        if (old != ob2.old) return false;
        return name != null ? name.equals(ob2.name) : ob2.name == null;
    }


}
