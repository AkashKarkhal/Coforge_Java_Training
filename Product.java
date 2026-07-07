public class Product {

    private int proID;
    private String prodname;
    private double prodcost;
    private int nou;

    public Product() {
    }

    public Product(int proID, String prodname, double prodcost, int nou) {
        this.proID = proID;
        this.prodname = prodname;
        this.prodcost = prodcost;
        this.nou = nou;
    }

    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public double getProdcost() {
        return prodcost;
    }

    public void setProdcost(double prodcost) {
        this.prodcost = prodcost;
    }

    public int getNou() {
        return nou;
    }

    public void setNou(int nou) {
        this.nou = nou;
    }

    @Override
    public String toString() {
        return "Product [proID=" + proID + ", prodname=" + prodname
                + ", prodcost=" + prodcost + ", nou=" + nou + "]";
    }
}