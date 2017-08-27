/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cHolaMundo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daniela
 */
@WebServlet(name = "cHolaMundoSrv", urlPatterns = {"/cHolaMundoSrv"})
public class cHolaMundoSrv extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<script>\n" +
"            function buttonClick1(url) {\n" +
"                window.location = url;\n" +
"            }\n" +
"            \n" +
"        </script> \n" +
"        \n" +
"        <style>\n" +
"            .button {\n" +
"              display: inline-block;\n" +
"              border-radius: 4px;\n" +
"              background-image: url('4.gif');\n" +
"              border: none;\n" +
"              color: purple;\n" +
"              text-align: center;\n" +
"              font-size: 28px;\n" +
"              padding: 20px;\n" +
"              width: 250px;\n" +
"              transition: all 0.5s;\n" +
"              cursor: pointer;\n" +
"              margin: 5px;\n" +
"            }\n" +
"           \n" +
"            .button span {\n" +
"              cursor: pointer;\n" +
"              display: inline-block;\n" +
"              position: relative;\n" +
"              transition: 0.5s;\n" +
"            }\n" +
"\n" +
"            .button span:after {\n" +
"              content: '\\00bb';\n" +
"              position: absolute;\n" +
"              opacity: 0;\n" +
"              top: 0;\n" +
"              right: -20px;\n" +
"              transition: 0.5s;\n" +
"              \n" +
"            }\n" +
"\n" +
"            .button:hover span {\n" +
"              padding-right: 25px;\n" +
"            }\n" +
"\n" +
"            .button:hover span:after {\n" +
"              opacity: 1;\n" +
"              right: 0;\n" +
"            }\n" + "\n </style>" );
            out.println("<html style='height:100%; weight:100%; margin:0px; background-image: url(2.jpg); font-family: Constantia'  >");
            out.println("<br>");
            out.println("<style type=\"text/css\">   \n" +
"a:link   \n" +
"{   \n" +
" text-decoration:none;   \n" +
"}   \n" +
"</style>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<center>");
            out.println("<h1 style='color:white; face: Verdana'>Hola Mundo con Servlet</h1>");
            out.println("<button class='button' id='HolaMundo' onclick='buttonClick1('http://localhost:8080/HolaMundoconServlet/')' name='Hola mundo'><span><a href='http://localhost:8080/HolaMundoconServlet/'>Regresar</a></span></button>");
            out.println("</center>");
            out.println("<head>");
            out.println("<title>Hola</title>");
            out.println("<link rel='stylesheet' type='text/css' href='/recursos/ext-all.css' />");
            out.println("</head>");
            out.println("<body ");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
