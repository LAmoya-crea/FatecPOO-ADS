/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fatec
 */
@WebServlet(urlPatterns = {"/mathservlet.html"})
public class FabioMathServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Fabio MathServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h4><a href='index.html'>voltar</a></h4>");
            
            out.println("<h1>Servlet FabioMathServlet at " + request.getContextPath() + "</h1>");
            
            double n1 = 2;
            double n2 = 2;
            String    op = request.getParameter("op");
            
            try{
                 n1 = Double.parseDouble(request.getParameter("n1"));
                 n2 = Double.parseDouble(request.getParameter("n2"));
           
            }catch(Exception ex){
                out.println("<div style='color:red'>" + "Parametro invalido " + "</div>");
            }
            
            switch (op){
                case "+":
                    out.println("<h1>"+n1+" + "+n2+" = "+(n1+n2)+"</h1>");
                    break;
                case "-":
                    out.println("<h1>"+n1+" - "+n2+" = "+(n1-n2)+"</h1>");
                    break;
                case "/":
                    out.println("<h1>"+n1+" / "+n2+" = "+(n1/n2)+"</h1>");
                    break;
                case "*":
                    out.println("<h1>"+n1+" * "+n2+" = "+(n1*n2)+"</h1>");
                    break;
            }
                        
            out.println("        <form action=\"mathservlet.html\"> \n" +
            "            <input type=\"number\" name=\"n1\" step=\"0.1\" value=\'"+n1+"'/><br> \n" +
            "            <select name=\"op\">\n" +
            "                <option value=\"+\">+</option>\n" +
            "                <option value=\"-\">-</option>\n" +
            "                <option value=\"/\">/</option>\n" +
            "                <option value=\"*\">*</option>\n" +
            "            </select><br>\n" +
            "            <input type=\"number\" name=\"n2\"  step=\"0.1\" value=\'"+n2+"'/><br>\n" +
            "            <input type=\"submit\" name=\"somar\" value=\"Calcular\"/><br>"+   
            "        </form>");     
            
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
