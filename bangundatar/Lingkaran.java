package bangundatar;

public class Lingkaran implements BangunDatar {

    private double pi = 3.1415;

    Lingkaran(){}

    @Override
    public double luas(int s1, int s2) {
        return 0;
    }

    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }

    public double luas(int r){ //metode overload
        return (pi * r * r);
    }

    public double keliling(int r){ //methode overload
        return (2 * pi * r);
    }
}
