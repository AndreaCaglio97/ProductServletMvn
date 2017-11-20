package org.mycompany.myname;

/**
 * Created by anon on 1/10/2017.
 */

import org.mycompany.myname.models.Category;
import org.mycompany.myname.models.Product;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import static org.mycompany.myname.database.DBManager.*;

public class HelloServlet extends HttpServlet {
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
}