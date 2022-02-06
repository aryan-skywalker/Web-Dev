// 2. Write a program to overload subtract method with various parameters in a class in Java

import java.util.*;

class overload {
    void subtract(int x, int y) {
        System.out.println(x - y);
    }

    void subtract(double x, double y) {
        System.out.println(x - y);
    }

    void subtract(float x, float y) {
        System.out.println(x - y);
    }
}

public class mth_ovrl {
    public static void main(String args[]) {
        overload ob = new overload();
        float f = 45.5f;
        ob.subtract(78, 23);
        ob.subtract(34.725, 21.675);
        ob.subtract(f, 12);
    }
}
