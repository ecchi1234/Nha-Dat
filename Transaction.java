public abstract class Transaction{
    private int transactionCode;
    private String transactionDate;
    private double priceEach;
    private double area;
    public Transaction() {

    }

    public Transaction(int transactionCode, String transactionDate, double priceEach, double area) {
        this.transactionCode = transactionCode;
        this.transactionDate = transactionDate;
        this.priceEach = priceEach;
        this.area = area;
    }

    public void getInformation() {
        System.out.printf("Ma giao dich: %d\n", transactionCode);
        System.out.printf("Ngay giao dich: %s\n", transactionDate);
        System.out.printf("Don gia: %.2f\n", priceEach);
        System.out.printf("Dien tich: %.2f\n", area);
    }

    public abstract double calculatePrice();

    public String getMonth() {
        return transactionDate.substring(3, 5);
    }
    
    public String getYear() {
        return transactionDate.substring(6);
    }

    public int getTransactionCode() {
        return this.transactionCode;
    }

    public String getTransactionDate() {
        return this.transactionDate;
    }

    public double getPriceEach() {
        return this.priceEach;
    }

    public double getArea() {
        return this.area;
    }

}