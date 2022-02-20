// Illustrate the execution of constructors in multi-level inheritance with three Java classes – plate(length, width),
//  box(length, width, height), wood box(length, width, height, thick)

class plate {
    int length = 8;
    int width = 12;

    plate() {
        System.out.println("\nThis is constructor of class A");
        int sa = length * width;
        System.out.println("Surface Area of plate : " + sa);
    }
}

class box extends plate {
    int height = 15;

    box() {
        System.out.println("\nThis is constructor of class B");
        int sa = 2 * length * width + 2 * length * height + 2 * width * height;
        System.out.println("Surface Area of box : " + sa);
    }
}

class wood_box extends box {
    int thick = 10;

    wood_box() {
        System.out.println("\nThis is constructor of class C");
        int sa = 2 * (length * width + length * thick + width * thick);
        System.out.println("Surface Area of Wooden box : " + sa);
    }
}

public class multilvl_inh {
    public static void main(String args[]) {
        wood_box ob = new wood_box();
    }
}
