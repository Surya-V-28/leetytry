import DAO.ProductDAO;
import entities.Product;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddProductServlet extends HttpServlet { 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Product product = new Product();
        product.setProductId(request.getParameter("hproductId"));
        product.setProductName(request.getParameter("hProductName"));
        product.setSupplierId(request.getParameter("hSupplierId"));
        product.setStockAvailable(Integer.parseInt(request.getParameter("hStockAvailable")));
        product.setOpeningStock(Integer.parseInt(request.getParameter("hOpeningStock")));
        product.setLastSupplyDate(java.sql.Date.valueOf(request.getParameter("hLastSupplyDate")));
        product.setUnitPrice(Double.parseDouble(request.getParameter("hUnitPrice")));

        ProductDAO productDAO = new ProductDAO();
        int n = productDAO.addProduct(product);

        // Redirect based on the result of the operation
        if (n == 1) {
            request.setAttribute("id", id);
            request.getRequestDispacter("ServletPage").forward(request,response);
            response.sendRedirect("success.html"); // Redirect to success HTML page 
        } else {
            response.sendRedirect("error.html");   // Redirect to error HTML page
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
        return "Add Product Servlet";
    }
}
