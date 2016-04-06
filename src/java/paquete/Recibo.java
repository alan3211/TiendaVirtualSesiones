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
    private String [] atributos = new String[12];
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int total = 0;
        response.setContentType("text/html; charset = UTF-8");
        // Proceso de respuesta
        PrintWriter out = response.getWriter();
        HttpSession sesion = request.getSession();
       /*Procesando atributos*/
        for (int i = 0; i < atributos.length; i++) {
            atributos[i] = (String)sesion.getAttribute("pr"+i);
            sesion.setAttribute("pr"+i, atributos[i]);
        }    
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
                + "                            <img src=\"./img/logo.png\" alt=\"Alan's Market\">\n"
                + "                        </div>\n"
                + "                        <div id=\"titulo\">\n"
                + "                            <p>Ticket de Compra</p>\n"
                + "                        </div> \n"                                      
                + "                </header> \n"                          
                + "            <div id=\"recibo\">\n"
                + "                <p>Ticket-Alan's Market</p>\n"               
                + "                <p>Concepto                           Precio</p>\n");
        if (atributos[0] == null) {
        } else {
            out.println("<p>MAC OSX                                     $ "+precios[0]+"</p>");
            total+=precios[0];            
        }
        if (atributos[1] == null) {
        } else {
            out.println("<p>Alienware                                   $"+precios[1]+"</p>");            
            total+=precios[1];
        }
        if (atributos[2] == null) {
        } else {
            out.println("<p>HP Pavilion                                 $"+precios[2]+"</p>");            
            total+=precios[3];
        }
        if (atributos[3] == null) {
        } else {
            out.println("<p>Samsung                                     $"+precios[3]+"</p>");           
            total+=precios[3];
        }
        if (atributos[4] == null) {
        } else {
            out.println("<p>Lavadora Samsung                 $"+precios[4]+"</p>");            
            total+=precios[4];
        }
        if (atributos[5] == null) {
        } else {
            out.println("<p>Licuadora Oster                        $"+precios[5]+"</p>");            
            total+=precios[5];
        }
        if (atributos[6] == null) {
        } else {
            out.println("<p>Microondas LG                           $"+precios[6]+"</p>");            
            total+=precios[6];
        }
        if (atributos[7] == null) {
        } else {
            out.println("<p>Refrigerador GE                          $"+precios[7]+"</p>");            
            total+=precios[7];
        }
         if (atributos[8] == null) {
        } else {
            out.println("<p>Cajonera                                       $"+precios[8]+"</p>");          
            total+=precios[8];
        }
          if (atributos[9] == null) {
        } else {
            out.println("<p>Repisa                                             $"+precios[9]+"</p>");
            
            total+=precios[9];
        }
           if (atributos[10] == null) {
        } else {
            out.println("<p>Sofa Deluxe                                 $"+precios[10]+"</p>");            
            total+=precios[10];
        }
            if (atributos[11] == null) {
        } else {
            out.println("<p>Comedor simple                          $"+precios[11]+"</p>");            
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
