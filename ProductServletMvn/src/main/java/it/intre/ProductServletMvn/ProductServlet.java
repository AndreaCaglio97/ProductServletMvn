package it.intre.ProductServletMvn;

import it.intre.ProductServletMvn.models.Category;
import it.intre.ProductServletMvn.models.Product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static it.intre.ProductServletMvn.database.DBManager.*;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside doGet");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		System.out.println("Inside doPost");
		
        // read form fields
		String name = request.getParameter("name");
		boolean isImported = Boolean.parseBoolean(request.getParameter("is_imported"));
		double price = Double.parseDouble(request.getParameter("price"));
		Category category = Category.valueOf(request.getParameter("category"));
		Product product = new Product(name,isImported,price,category,1);
		insertSingleProductToDB(product);
 
        // do some processing here...
         
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>New Product:<br/>"; 
        htmlRespone += "Name: " + name + "<br/>";
        htmlRespone += "Imported: " + isImported + "<br/>";
        htmlRespone += "Price: " + price + "<br/>";
        htmlRespone += "category: " + category + "</h2>";    
        htmlRespone += "</html>";
         
        // return response
        writer.println(htmlRespone);
         
    }
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Inside Init");
	}
	

}
