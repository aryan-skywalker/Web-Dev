//Program on Dynamic Method Dispatch

class Milky_Way {
    void display() {
        System.out.println("\nWelcome! , you are inside the Milky Way Galaxy");
    }
}

class Solar_System extends Milky_Way {
    void display() {
        System.out.println("\nYou are entering the Solar System with 8 planets and the Sun");
    }
}

class Earth extends Solar_System {
    void display() {
        System.out.println("\nEarth! a planet discovered with life, now u can destroy all its resources.\n");
    }
}

class dynamic_mmy_dspth {
    public static void main(String args[]) {
        Milky_Way a = new Milky_Way();
        Milky_Way b = new Solar_System();
        Milky_Way c = new Earth();

        a.display();
        b.display();
        c.display();
    }
}