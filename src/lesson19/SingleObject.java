package lesson19;

public final class SingleObject {

    private static SingleObject instance = null;

    private SingleObject() {
    }

    public synchronized static SingleObject getInstance() {
        if (instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }
}
