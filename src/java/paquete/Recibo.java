package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Recibo extends HttpServlet {
    
    private int precios[] = {
        25000,29000,12000,8000,9000,2000,3000,14000,8000,2800,7000,10000
    };        
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int total = 0;
        response.setContentType("text/html; charset = UTF-8");
        // Proceso de respuesta
        PrintWriter out = response.getWriter();
        HttpSession sesion = request.getSession();
        String pr1 = (String) sesion.getAttribute("pr1");
        String pr2 = (String) sesion.getAttribute("pr2");
        String pr3 = (String) sesion.getAttribute("pr3");
        String pr4 = (String) sesion.getAttribute("pr4");
        String pr5 = (String) sesion.getAttribute("pr5");
        String pr6 = (String) sesion.getAttribute("pr6");
        String pr7 = (String) sesion.getAttribute("pr7");
        String pr8 = (String) sesion.getAttribute("pr8");
        String pr9 = (String) sesion.getAttribute("pr9");
        String pr10 = (String) sesion.getAttribute("pr10");
        String pr11 = (String) sesion.getAttribute("pr11");
        String pr12 = (String) sesion.getAttribute("pr12");        
      out.println("<!DOCTYPE html>\n"
                + "<html lang=\"es\">\n"
                + "        <head>                 \n"
                + "                    <meta name = \"author\" content=\"Alan Hernandez\">\n"
                + "                    <meta name = \"description\" content=\"Tienda de Alan\">\n"
                + "                    <meta name = \"keywords\" content=\"Alan store 2016\">\n"
                + "                    <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0,maximum-scale=1.0, minimum-scale=1.0\">\n"
                + "                    <title>Alan's Market-Recibo</title>\n"
                + "                    <link rel=\"stylesheet\" href=\"./css/estilos.css\" type=\"text/css\">\n"                
                + "        </head>\n"
                + "        <body>\n"
                + "        <!--Encabezado-->\n"
                + "                <header>\n"
                + "                        <div id = \"logo\">\n"
                + "                            <a href=\"Menu\"><img src=\"./img/logo.png\" alt=\"Alan's Market\"></a> \n"
                + "                        </div>\n"
                + "                        <div id=\"titulo\">\n"
                + "                            <p>Ticket de Compra</p>\n"
                + "                        </div> \n"                                      
                + "                </header> \n"                          
                + "            <div id=\"recibo\">\n"
                + "                <p>Ticket-Alan's Market</p>\n"               
                + "                <p>Concepto                           Precio</p>\n");
        if (pr1 == null) {
        } else {
            out.println("<p>MAC OSX                                     $ "+precios[0]+"</p>");
            total+=precios[0];
            sesion.setAttribute("pr1", pr1);
        }
        if (pr2 == null) {
        } else {
            out.println("<p>Alienware                                   $"+precios[1]+"</p>");
            sesion.setAttribute("pr2", pr2);
            total+=precios[1];
        }
        if (pr3 == null) {
        } else {
            out.println("<p>HP Pavilion                                 $"+precios[2]+"</p>");
            sesion.setAttribute("pr3", pr3);
            total+=precios[3];
        }
        if (pr4 == null) {
        } else {
            out.println("<p>Samsung                                     $"+precios[3]+"</p>");
            sesion.setAttribute("pr4", pr4);
            total+=precios[3];
        }
        if (pr5 == null) {
        } else {
            out.println("<p>Lavadora Samsung                 $"+precios[4]+"</p>");
            sesion.setAttribute("pr5", pr5);
            total+=precios[4];
        }
        if (pr6 == null) {
        } else {
            out.println("<p>Licuadora Oster                        $"+precios[5]+"</p>");
            sesion.setAttribute("pr6", pr6);
            total+=precios[5];
        }
        if (pr7 == null) {
        } else {
            out.println("<p>Microondas LG                           $"+precios[6]+"</p>");
            sesion.setAttribute("pr7", pr7);
            total+=precios[6];
        }
        if (pr8 == null) {
        } else {
            out.println("<p>Refrigerador GE                          $"+precios[7]+"</p>");
            sesion.setAttribute("pr8", pr8);
            total+=precios[7];
        }
         if (pr9 == null) {
        } else {
            out.println("<p>Cajonera                                       $"+precios[8]+"</p>");
            sesion.setAttribute("pr9", pr9);
            total+=precios[8];
        }
          if (pr10 == null) {
        } else {
            out.println("<p>Repisa                                             $"+precios[9]+"</p>");
            sesion.setAttribute("pr10", pr10);
            total+=precios[9];
        }
           if (pr11 == null) {
        } else {
            out.println("<p>Sofa Deluxe                                 $"+precios[10]+"</p>");
            sesion.setAttribute("pr11", pr11);
            total+=precios[10];
        }
            if (pr12 == null) {
        } else {
            out.println("<p>Comedor simple                          $"+precios[11]+"</p>");
            sesion.setAttribute("pr12", pr12);
            total+=precios[11];
        } 
         out.println("<p>Total                                                   $"+total+"</p>");
        out.println(" </div>\n"
                + "</body>\n"
                + "</html>");
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
