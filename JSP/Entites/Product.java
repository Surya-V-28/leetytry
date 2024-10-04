
import java.util.Date;

public class Product {
    private String productId;
    private String productName;
    private String supplierId;
    private int stockAvailable;
    private int openingStock;
    private Date lastSupplyDate;
    private int unitPrice;

    // Constructor
    public Product() {}

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public int getStockAvailable() {
        return stockAvailable;
    }

    public void setStockAvailable(int stockAvailable) {
        this.stockAvailable = stockAvailable;
    }

    public int getOpeningStock() {
        return openingStock;
    }

    public void setOpeningStock(int openingStock) {
        this.openingStock = openingStock;
    }

    public Date getLastSupplyDate() {
        return lastSupplyDate;
    }

    public void setLastSupplyDate(Date lastSupplyDate) {
        this.lastSupplyDate = lastSupplyDate;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Optionally, override the toString method for easy debugging
    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", supplierId='" + supplierId + '\'' +
                ", stockAvailable=" + stockAvailable +
                ", openingStock=" + openingStock +
                ", lastSupplyDate=" + lastSupplyDate +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
