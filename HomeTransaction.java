public class HomeTransaction extends Transaction{
    private String typeOfHome;
    private int positionNumber;
    private static String LUXURIOUS_HOME = "Luxury";
    private static String VILLA_HOME = "Villa";
    private static double VAT = 0.05;

    public HomeTransaction() {

    }

    public HomeTransaction(int transactionCode, String transactionDate, double priceEach, double area, String typeOfHome, int positionNumber) {
        super(transactionCode, transactionDate, priceEach, area);
        if (typeOfHome.equals(LUXURIOUS_HOME) || typeOfHome.equals(VILLA_HOME)) {
            this.typeOfHome = typeOfHome;
        }
        else {
            this.typeOfHome = "";
            System.out.println("Co 2 loai nha la Luxury va Villa");
        }
        this.positionNumber = positionNumber;
    }

    public void getInformation() {
        super.getInformation();
        System.out.printf("Loai nha: %s\n", this.typeOfHome);
        System.out.printf("He so vi tri: %d\n", this.positionNumber);
    }

    public double calculatePrice() {
        if (this.typeOfHome.equals(LUXURIOUS_HOME)) {
            return (this.getArea() * this.getPriceEach() * this.positionNumber * VAT);
        }
        else if (this.typeOfHome.equals(VILLA_HOME)) {
            return (this.getArea() * this.getPriceEach() * this.positionNumber * 1.5 * VAT);
        }
        else {
            return 0.0;
        }
    }
}
