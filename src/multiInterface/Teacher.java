package multiInterface;

public interface Teacher {
    void teach();

    default void communicateWithStudent(){

    }

    static boolean isNull(Object object){
        return object == null;
    }
}
