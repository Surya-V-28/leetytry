
import com.example.model.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class ProductDAO {
    static String url = "jdbc:derby://localhost:1527/demo";
    static String uid = "user1";
    static String pwd = "USRER1";
    static Connection con;
    static PreparedStatement ps;
    // Method to add a new product
    public int addProduct(Product product) {
        try {
            con = DriverManager.getConnection(url, uid, pwd);
            // Check for duplicate ProductID
            String checkQuery = "SELECT COUNT(*) FROM Product WHERE ProductID = ?";
            ps = con.prepareStatement(checkQuery);
            ps.setString(1, product.getProductId());
            ResultSet rs = ps.executeQuery();
            rs.next();
            if (rs.getInt(1) > 0) {
                System.out.println("Product ID already exists.");
                return 0; // Duplicate found
            }
            
            // Check if SupplierID exists
            String supplierQuery = "SELECT COUNT(*) FROM Supplier WHERE SupplierID = ?";
            ps = con.prepareStatement(supplierQuery);
            ps.setString(1, product.getSupplierId());
            rs = ps.executeQuery();
            rs.next();
            if (rs.getInt(1) == 0) {
                System.out.println("Supplier ID does not exist.");
                return 0; // Supplier not found
            }

            // Insert new product
            String query = "INSERT INTO Product VALUES (?, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(query);
            ps.setString(1, product.getProductId());
            ps.setString(2, product.getProductName());
            ps.setString(3, product.getSupplierId());
            ps.setInt(4, product.getStockAvailable());
            ps.setInt(5, product.getOpeningStock());
            ps.setDate(6, new java.sql.Date(product.getLastSupplyDate().getTime()));
            ps.setDouble(7, product.getUnitPrice());
            
            int n = ps.executeUpdate();
            if (n == 1) {
                System.out.println("Record inserted successfully.");
                return 1; // Success
            } else {
                System.out.println("Unable to insert record.");
                return 0; // Failure
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -1; // Error
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // Method to fetch product by ID
    public Product fetchProductById(String productId) {
        Product product = null;
        try {
            con = DriverManager.getConnection(url, uid, pwd);
            String query = "SELECT * FROM Product WHERE ProductID = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, productId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                product = new Product();
                product.setProductId(rs.getString("ProductID"));
                product.setProductName(rs.getString("ProductName"));
                product.setSupplierId(rs.getString("SupplierID"));
                product.setStockAvailable(rs.getInt("StockAvailable"));
                product.setOpeningStock(rs.getInt("OpeningStock"));
                product.setLastSupplyDate(rs.getDate("LastSupplyDate"));
                product.setUnitPrice(rs.getDouble("UnitPrice"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return product;
    }
    // Method to view products with stock less than 50
    public List<Product> getLowStockProducts() {
        List<Product> lowStockProducts = new ArrayList<>();
        try {
            con = DriverManager.getConnection(url, uid, pwd);
            String query = "SELECT * FROM Product WHERE StockAvailable < 50";
            ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setProductId(rs.getString("ProductID"));
                product.setProductName(rs.getString("ProductName"));
                product.setSupplierId(rs.getString("SupplierID"));
                product.setStockAvailable(rs.getInt("StockAvailable"));
                product.setOpeningStock(rs.getInt("OpeningStock"));
                product.setLastSupplyDate(rs.getDate("LastSupplyDate"));
                product.setUnitPrice(rs.getDouble("UnitPrice"));
                lowStockProducts.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return lowStockProducts;
    }
}
