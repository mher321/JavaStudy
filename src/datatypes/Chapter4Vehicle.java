package datatypes;

// This program creates two Vehicle objects.
class Vehicle {
    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon
}

// This class declares an object of tape Vehicle.
class TwoVehicles {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        //assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        //compute the rages assuming a full tank of gas
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1);

        System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2);

    }
}

class VehicleReturn {
    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon

    //this is constructor of vehicle
    VehicleReturn(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return the range.
    int range() {
        return mpg * fuelcap;
    }

    // Compute fuel needed for a given distance.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

// This class declares an object of tape Vehicle.
class VehConsDemo {
    public static void main(String[] args) {
        // construct complete vehicles.
        VehicleReturn minivan = new VehicleReturn(7, 16, 21);
        VehicleReturn sportscar = new VehicleReturn(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);

        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel:");
        gallons = sportscar.fuelneeded(dist);

        System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel:");
    }
}


// return true if x is even/
class ChkNum {
    boolean isEven(int x) {
        if ((x % 2) == 0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if (e.isEven(10)) System.out.println("10 is even");
        if (e.isEven(9)) System.out.println("9 is even");
        if (e.isEven(8)) System.out.println("8 is even");

    }
}

class HelpClassDemo {
    public static void main(String[] args) throws java.io.IOException {

        char choise, ignore;
        Help hlpobj = new Help();

        for (; ; ) {
            do {
                hlpobj.showmenu();

                choise = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();

                } while (ignore != '\n');
            } while (!hlpobj.isvalid(choise));
            if (choise == 'q') break;
            System.out.println();

            hlpobj.helpon(choise);
        }

    }
}

class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    // called when object is recycled
    protected void finalize() {
        System.out.println("Finalizing " + x);
    }

    // generates an object that is immediately destroyed
    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}


class Finalize {
    public static void main(String[] args) {

        int count;

        FDemo ob = new FDemo(0);
        /* Now generate a large number of objects. At some point,
        garbage collection will occur.
        Note: you might need increase the number
        of objects generated in order to force
        garbage colection
         */
        for (count = 0; count < 900000; count++)
            ob.generator(count);
    }
}

class Pwr {
    double b;
    int e;
    double val;

    Pwr(double base, int exp) {
        this.b = base;
        this.e = exp;

        this.val = 1;
        if (exp == 0) return;
        for (; exp < 0; exp--)
            this.val = this.val * base;
    }

    double get_pwr() {
        return this.val;
    }
}

class DemoPwr {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " raised to the " + x.e + " power is " + x.get_pwr());
        System.out.println(y.b + " raised to the " + y.e + " power is " + y.get_pwr());
        System.out.println(z.b + " raised to the " + z.e + " power is " + z.get_pwr());


    }
}

