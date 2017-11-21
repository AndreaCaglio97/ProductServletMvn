package it.intre.ProductServletMvn;

/**
 * Created by anon on 1/10/2017.
 */

import it.intre.ProductServletMvn.models.Category;
import it.intre.ProductServletMvn.models.Product;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

import static it.intre.ProductServletMvn.database.DBManager.*;

public class InsertProductServlet extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {
        httpServletResponse.getWriter().print("Hello from servlet");
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
        String htmlResponse = "<html>";
        htmlResponse += "<h2>New Product:<br/>";
        htmlResponse += "Name: " + name + "<br/>";
        htmlResponse += "Imported: " + isImported + "<br/>";
        htmlResponse += "Price: " + price + "<br/>";
        htmlResponse += "category: " + category + "</h2>";
        htmlResponse += "</html>";

        // return response
        writer.println(htmlResponse);

    }
}