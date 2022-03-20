package HW.LabHomeworkCompany;

import java.util.Calendar;

public class Product {
    //projectName: String startDate: java.util.Calendar state: boolean
    private String productName;
    private Calendar saleDate;
    private double price;

    // Product(String sName, java.util.Calendar sDate, double price) getter/setter/toString methods
    public Product(String pName, Calendar sDate, double price) {
        productName = pName;
        saleDate = sDate;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Calendar getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Calendar saleDate) {
        this.saleDate = saleDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDateFormatted(Calendar calendar) {
        return calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) + 1) + "/" + calendar.get(Calendar.YEAR);
    }
    @Override
    public String toString() {
        return "Product [" +
                "productName=" + productName +
                ", transactionDate=" + getDateFormatted(saleDate) +
                ", price=" + price +
                ']';
    }
}



