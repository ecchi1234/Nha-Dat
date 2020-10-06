public abstract class Transaction{
    protected int transactionCode;
    protected String transactionDate;
    protected double priceEach;
    protected double area;
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
        return transactionDate.substring(7);
    }

}