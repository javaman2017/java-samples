package arrays;


class X{};
class Y extends X{};
class Z extends X{};

public class ArrayStore {

    public static void main(String[] args) {
        Y[] yArray = new Y[3];
        X[] xArray = yArray;
        xArray[0] = new Y();
        xArray[1] = new Z();
        xArray[2] = new X();

    }

}


