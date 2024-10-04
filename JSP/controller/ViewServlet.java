package controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import entities.Product; // Assuming your product entity is in this package
import dao.ProductDAO; // Adjust the package name as necessary

public class ViewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            // Link to go back to the Add Product page
            out.println("<a href='index.html'>Add New Product</a>");  
            out.println("<h1>Product List</h1>");  
            
            // Fetch the list of products from the database
            List<Product> productList = ProductDAO.getAllProducts();  
            
            // Start the table for displaying products
            out.print("<table border='1' width='100%'>");  
            out.print("<tr><th>Product ID</th><th>Product Name</th><th>Supplier ID</th>" +
                       "<th>Stock Available</th><th>Opening Stock</th><th>Last Supply Date</th>" +
                       "<th>Unit Price</th><th>Edit</th><th>Delete</th></tr>");  
            
            // Loop through the list of products and add them to the table
            for(Product product : productList) {  
                out.print("<tr><td>" + product.getProductId() + "</td>" +
                          "<td>" + product.getProductName() + "</td>" +
                          "<td>" + product.getSupplierId() + "</td>" +
                          "<td>" + product.getStockAvailable() + "</td>" +
                          "<td>" + product.getOpeningStock() + "</td>" +
                          "<td>" + product.getLastSupplyDate() + "</td>" +
                          "<td>" + product.getUnitPrice() + "</td>" +
                          "<td><a href='EditProductServlet?productId=" + product.getProductId() + "'>Edit</a></td>" +
                          "<td><a href='DeleteProductServlet?productId=" + product.getProductId() + "'>Delete</a></td></tr>");  
            }  
            out.print("</table>");  
            out.close();  
        } 
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Product View Servlet";
    }
}
