package interface_s;

interface A{
   void testA();
}

interface B{
    void testB();
}

public interface C extends A,B{
    void testC();
}

class CImpl implements C{
    public void testA() {

    }

    public void testB() {

    }

    public void testC() {

    }
}
