package tasks.classwork.day7;

public class GenericContainer <T> {

    private T[] container;
    private int index;

    public GenericContainer() {
        container = (T[]) new Object[10];
        index = 0;
    }

    public void add(T o) {
        if(index < container.length) {
            this.container[index++] = o;
        }
    }

    public T removeLast() {
        T temp = null;
        if (index > 0) {
            temp = container[index - 1];
            container[--index] = null;
        }
        return temp;
    }

    public boolean isEmpty() {
        return index == 0;
    }
}
