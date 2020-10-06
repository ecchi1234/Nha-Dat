public class LandTransaction extends Transaction{
    private String typeOfLand;
    private static String A_LAND = "A";
    private static String B_LAND = "B";
    private static double VAT = 0.1;

    public LandTransaction() {

    }

    public LandTransaction(int transactionCode, String transactionDate, double priceEach, double area, String typeOfLand) {
        super(transactionCode, transactionDate, priceEach, area);
        if (typeOfLand != A_LAND && typeOfLand != B_LAND) {
            System.out.println("Chi co hai loai giao dich la 'A' và 'B'.");
            this.typeOfLand="";
        }
        else {
            this.typeOfLand = typeOfLand;
        }
        
    }

    public void getInformation() {
        super.getInformation();
        System.out.printf("Loai dat: %s\n", this.typeOfLand);
    }

    public double calculatePrice() {
        if (this.typeOfLand == A_LAND) {
            return (this.area * this.priceEach * VAT);
        }
        else if (this.typeOfLand == B_LAND) {
            return (this.area * this.priceEach * 2.0 * VAT);
        }
        else {
            return 0.0;
        }
    }


}
