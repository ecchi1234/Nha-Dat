import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;

public class TransactionList {
    private static ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public static void inputTransaction() {
        Scanner input = new Scanner(System.in);
        int transactionCode;
        String transactionDate;
        double priceEach;
        double area;
        int typeOfTransaction = 0;
        while(true) {
            System.out.println("Chon mot trong hai giao dich de them");
            System.out.println("1. Giao dich dat");
            System.out.println("2. Giao dich nha");
            System.out.print("> ");
            typeOfTransaction = input.nextInt();
            if (typeOfTransaction != 1 && typeOfTransaction != 2) {
                System.out.println("Khong co loai giao dich nay!");
                continue;
            }
            System.out.println("Nhap ma giao dich: ");
            transactionCode = input.nextInt();
            if (transactionCode < 0) {
                break;
            }
            System.out.println("Nhap ngay giao dich: ");
            transactionDate = input.next();
            System.out.println("Nhap don gia: ");
            priceEach = input.nextDouble();
            System.out.println("Nhap dien tich: ");
            area = input.nextDouble();
            if (typeOfTransaction == 1) {
                System.out.println("Nhap loai dat: ");
                String typeOfLand = input.next();   
                Transaction newTrans = new LandTransaction(transactionCode, transactionDate, priceEach, area, typeOfLand);
                transactions.add(newTrans);
                System.out.println("Them thanh cong!");
            }
            else if (typeOfTransaction == 2){
                System.out.println("Nhap loai nha: ");
                String typeOfHome = input.next();
                System.out.println("Nhap he so vi tri: ");
                int positionNumber = input.nextInt();
                Transaction newTrans = new HomeTransaction(transactionCode, transactionDate, priceEach, area, typeOfHome, positionNumber);
                transactions.add(newTrans);
                System.out.println("Them thanh cong!");
            }
        }

    }

    public static void getTotalPriceOfEachTransactionType() {
        double landPrices = 0.0;
        double homePrices = 0.0;
        for (Transaction trans : transactions) {
            if (trans.getMonth().equals("10") && trans.getYear().equals("2018")) {
                if (trans instanceof HomeTransaction) {
                    homePrices += trans.calculatePrice();
                } 
                else if (trans instanceof LandTransaction) {
                    landPrices += trans.calculatePrice();
                }
            }
        }
        System.out.printf("Tong tien giao dich dat là: %.2f\n", landPrices);
        System.out.printf("Tong tien giao dich nha la: %.2f\n", homePrices);
    }

    public static void printAll() {
        System.out.println("THONG TIN CAC GIAO DICH HIEN CO");
        for (Transaction t : transactions) {
            t.getInformation();
            System.out.println("==========================");
        }
    }
}
