class square extends shappes {

    private double side;

    public square(double side) {
        this.side = side;
    }

    @Override
    void area() {
        System.out.println("Area : " + side * side);
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter : " + 4 * side);
    }
}