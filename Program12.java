interface BillCalculations {
    double calculate(int quantity, double unitPrice);
}

class Bill implements BillCalculations {
    private int orderNo;
    private String date;
    private String[][] items;
    private double[] total;

    public Bill(int orderNo, String date, String[][] items) {
        this.orderNo = orderNo;
        this.date = date;
        this.items = items;
        this.total = new double[items.length];
    }

    public double calculate(int quantity, double unitPrice) {
        return quantity * unitPrice;
    }

    public void generateBill() {

        System.out.println("Order No. " + orderNo);
        System.out.println("Date: " + date);
        System.out.println("Product Id\tName\t\tQuantity\tUnit Price\tTotal");

        double netAmount = 0;

        for (int i = 0; i < items.length; i++) {
            String productId = items[i][0];
            String productName = items[i][1];
            int quantity = Integer.parseInt(items[i][2]);
            double unitPrice = Double.parseDouble(items[i][3]);
            double itemTotal = calculate(quantity, unitPrice);
            total[i] = itemTotal;

            System.out.printf("%s\t\t%s\t\t%d\t\t$%.2f\t\t$%.2f\n", productId, productName, quantity, unitPrice,
                    itemTotal);

            netAmount += itemTotal;
        }

        System.out.printf("Net. Amount\t\t\t\t\t\t\t$%.2f\n", netAmount);
    }
}

public class Program12 {
    public static void main(String[] args) {
        int orderNo = 12345;
        String date = "07/06/2023";
        String[][] items = {
                { "101", "A", "2", "25" },
                { "102", "B", "1", "100" }
        };

        Bill bill = new Bill(orderNo, date, items);
        bill.generateBill();
    }
}
