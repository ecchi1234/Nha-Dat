import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;

public class Main {
    public ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public static void main(String[] args) {
        // Transaction trans = new Transaction(112, "11/10/2020", 10.5, 100);
        HomeTransaction trans2 = new HomeTransaction(11, "11/03/2020", 20, 200, "Luxury", 1);
        // trans.getInformation();
        trans2.getInformation();
    }

    public void inputTransaction() {
        Scanner input = new Scanner(System.in);
        int transactionCode;
        String transactionDate;
        double priceEach;
        double area;
        do {
            System.out.println("Nhap ma giao dich: ");
            transactionCode = input.nextInt();
            System.out.println("Nhap ngay giao dich: ");
            transactionDate = input.nextLine();
            System.out.println("Nhap don gia: ");
            priceEach = input.nextDouble();
            System.out.println("Nhap dien tich: ");
            area = input.nextDouble();
        } while (transactionCode != 0);

    }

    public void getTotalPriceOfEachTransactionType() {
        double landPrices = 0.0;
        double homePrices = 0.0;
        for (Transaction trans : transactions) {
            if (trans.getMonth() == "10" && trans.getYear() == "2018") {
                if (trans instanceof HomeTransaction) {
                    landPrices += trans.calculatePrice();
                } 
                else if (trans instanceof LandTransaction) {
                    homePrices += trans.calculatePrice();
                }
            }
        }
        System.out.printf("Tong tien giao dich dat là: %.2f\n", landPrices);
        System.out.printf("Tong tien giao dich nha la: %.2f\n", homePrices);
    }
}
