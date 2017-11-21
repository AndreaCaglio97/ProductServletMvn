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

public class GetProductServlet extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {
        httpServletResponse.getWriter().print("Hello from servlet");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Inside doPost");

        // read form fields
        if(request.getParameter("name").equals("")) {
            System.out.println("Stringa vuota");
        }
        String name = request.getParameter("name");
        //boolean isImported = Boolean.parseBoolean(request.getParameter("is_imported"));
        //double price = Double.parseDouble(request.getParameter("price"));
        //Category category = Category.valueOf(request.getParameter("category"));
        //Product product = new Product(name,isImported,price,category,1);



        // do some processing here...

        // get response writer
        PrintWriter writer = response.getWriter();

        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Get Product<br/>";
        htmlRespone += "</html>";

        // return response
        writer.println(htmlRespone);

    }
}
