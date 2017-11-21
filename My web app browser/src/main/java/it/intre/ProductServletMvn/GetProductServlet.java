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

        String[] attributes = new String[6];

        attributes[0] = request.getParameter("id_product");
        attributes[1] = request.getParameter("name");
        attributes[2] = request.getParameter("is_imported");
        attributes[3] = request.getParameter("minimum_price");
        attributes[4] = request.getParameter("maximum_price");
        attributes[5] = request.getParameter("category");

        for(String c : attributes) {
            System.out.println(c);
        }



        // do some processing here...

        // get response writer
        PrintWriter writer = response.getWriter();

        // build HTML code
        String htmlResponse = "<html>";
        htmlResponse += "<h2>Get Product<br/>";
        htmlResponse += "</html>";

        // return response
        writer.println(htmlResponse);

    }
}
