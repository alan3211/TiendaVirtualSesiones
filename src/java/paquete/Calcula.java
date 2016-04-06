package paquete;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Calcula extends HttpServlet {      
    private String [] atributos = new String[12];
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException { 
        response.setContentType("text/html; charset = UTF-8");          
        HttpSession sesion = request.getSession();
         /*Procesando atributos*/
        for (int i = 0; i < atributos.length; i++) {
            atributos[i] = (String)sesion.getAttribute("pr"+i);
            sesion.setAttribute("pr"+i, atributos[i]);
        }    
        RequestDispatcher rd = request.getRequestDispatcher("Recibo");
        rd.forward(request, response);
    }     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {        
        doGet(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Alan-Server<br>Version:1.0";
    }  
}
