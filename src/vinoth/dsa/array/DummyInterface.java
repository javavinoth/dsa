package vinoth.dsa.array;

public interface DummyInterface {

    default void dum(){
        System.out.println("sdfs");
    }
    default void dum1(){
        System.out.println("sdfs");
        ss();
    }

    static void ss(){
        System.out.println("sds");
    }
}
