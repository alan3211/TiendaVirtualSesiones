package paquete;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Calcula extends HttpServlet {   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException { 
        response.setContentType("text/html; charset = UTF-8");          
        HttpSession sesion = request.getSession();
      String pr1 = (String)request.getParameter("pr1");
      String pr2 = (String)request.getParameter("pr2");
      String pr3 = (String)request.getParameter("pr3");
      String pr4 = (String)request.getParameter("pr4");
      String pr5 = (String)request.getParameter("pr5");
      String pr6 = (String)request.getParameter("pr6");
      String pr7 = (String)request.getParameter("pr7");
      String pr8 = (String)request.getParameter("pr8");
      String pr9 = (String)request.getParameter("pr9");
      String pr10 = (String)request.getParameter("pr10");
      String pr11 = (String)request.getParameter("pr11");
      String pr12 = (String)request.getParameter("pr12");
       sesion.setAttribute("pr1",pr1); 
       sesion.setAttribute("pr2",pr2); 
       sesion.setAttribute("pr3",pr3); 
       sesion.setAttribute("pr4",pr4); 
       sesion.setAttribute("pr5",pr5); 
       sesion.setAttribute("pr6",pr6); 
       sesion.setAttribute("pr7",pr7); 
       sesion.setAttribute("pr8",pr8); 
      sesion.setAttribute("pr9",pr9); 
       sesion.setAttribute("pr10",pr10); 
       sesion.setAttribute("pr11",pr11); 
       sesion.setAttribute("pr12",pr12); 
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
