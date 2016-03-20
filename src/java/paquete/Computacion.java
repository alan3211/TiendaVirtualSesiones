package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Computacion extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset = UTF-8");        
        HttpSession sesion = request.getSession();
          String pr1 = (String) sesion.getAttribute("pr1");    
        String pr2 = (String) sesion.getAttribute("pr2");
        String pr3= (String) sesion.getAttribute("pr3");
        String pr4= (String) sesion.getAttribute("pr4");
       String pr5 = (String) sesion.getAttribute("pr5");
       String pr6 = (String) sesion.getAttribute("pr6");
       String pr7 = (String) sesion.getAttribute("pr7");
       String pr8 = (String) sesion.getAttribute("pr8");
        String pr9 = (String) sesion.getAttribute("pr9");
        String pr10 = (String) sesion.getAttribute("pr10");
        String pr11 = (String) sesion.getAttribute("pr11");
        String pr12 = (String) sesion.getAttribute("pr12");
        //Computacion     
        //Guarda en atributos de sesion
        sesion.setAttribute("pr1", pr1);
        sesion.setAttribute("pr2", pr2);
        sesion.setAttribute("pr3", pr3);
        sesion.setAttribute("pr4", pr4);
        //Electrodomesticos     
        //Recuperarlos en atributos
        sesion.setAttribute("pr5", pr5);
        sesion.setAttribute("pr6", pr6);
        sesion.setAttribute("pr7", pr7);
        sesion.setAttribute("pr8", pr8);
        //Muebleria  
        //Guardarlos en atributos de sesion
        sesion.setAttribute("pr9", pr9);
        sesion.setAttribute("pr10", pr10);
        sesion.setAttribute("pr11", pr11);
        sesion.setAttribute("pr12", pr12);      
        // Proceso de respuesta
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n"
                + "<html lang=\"es\">\n"
                + "        <head>                 \n"
                + "                    <meta name = \"author\" content=\"Alan Hernandez\">\n"
                + "                    <meta name = \"description\" content=\"Tienda de Alan\">\n"
                + "                    <meta name = \"keywords\" content=\"Alan store 2016\">\n"
                + "                    <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0,maximum-scale=1.0, minimum-scale=1.0\">\n"
                + "                    <title>Alan's Market-Computaci&oacute;n</title>\n"
                + "                    <link rel=\"stylesheet\" href=\"./css/estilos.css\" type=\"text/css\">\n"
                + "        </head>\n"
                + "        <body>\n"
                + "        <!--Encabezado-->\n"
                + "                <header>\n"
                + "                        <div id = \"logo\">\n"
                + "                            <img src=\"./img/logo.png\" alt=\"Alan's Market\">\n"
                + "                        </div>\n"
                + "                        <div id=\"titulo\">\n"
                + "                            <p>Departamento de Computaci&oacute;n</p>\n"
                + "                        </div> \n"                                      
                + "                </header> \n"          
                + "        <!--Productos-->\n"
                + "             <form method = \"POST\" action = \"Calcula\" name=\"sig\">\n"     
                +"<div id=\"menu\">\n"
                + "              <input type=\"button\" class = \"boton\" value=\"Computaci&oacute;n\" onClick=\"document.sig.action='Computacion'; document.sig.submit()\";> \n"
                + "              <input type=\"button\" class = \"boton\" value=\"Electrodom&eacute;stico\" onClick=\"document.sig.action='Electrodomestico'; document.sig.submit()\";> \n"
                + "              <input type=\"button\" class = \"boton\" value=\"Muebler&iacute;a\" onClick=\"document.sig.action='Mueble'; document.sig.submit()\";> \n"       
                + "             <input type=\"submit\" id = \"checa\" value=\"Finalizar Compra\">\n"
                +"</div>\n"
                +"<div id = \"Contenedor\">\n"
                + "             <div class=\"Compus\">\n"
                + "                     <p>Computadora MAC</p>\n"
                + "                     <img src=\"./Computadoras/macos.jpg\" alt=\"Mac OSx\">\n"
                + "                     <p>Ideal para las personas muy capacitadas en desarrollo profesional</p>\n"
                + "                     <p>$25,000</p>\n");
        if (pr1 == null) {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr1\" >");
        } else {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr1\" checked>");
        }
        out.println("             </div>\n"
                + "              <div class=\"Compus\">\n"
                + "                     <p>Computadora Alien</p>\n"
                + "                     <img src=\"./Computadoras/alienware.jpg\" alt=\"Alienware\">\n"
                + "                     <p>Experimenta el poder de esta computadora para juegos</p>\n"
                + "                     <p>$29,000</p>\n");
        if (pr2 == null) {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr2\" >");
        } else {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr2\" checked>");
        }
        out.println("             </div>           \n"
                + "              <div class=\"Compus\">\n"
                + "                     <p>Computadora HP</p>\n"
                + "                     <img src=\"./Computadoras/hppav.jpeg\" alt=\"Hp pavilion\">\n"
                + "                     <p>Prueba esta computadora para oficina, o simplemente para casa</p>\n"
                + "                     <p>$12,000</p>\n");
        if (pr3 == null) {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr3\" >");
        } else {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr3\" checked>");
        }
        out.println("             </div>           \n"
                + "              <div class=\"Compus\">\n"
                + "                     <p>Computadora Samsung</p>\n"
                + "                     <img src=\"./Computadoras/samsung.jpg\" alt=\"samsung\">\n"
                + "                     <p>Economica y simple para trabajos de la escuela de los niños</p>\n"
                + "                     <p>$8,000</p>\n");
        if (pr4 == null) {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr4\" >");
        } else {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr4\" checked>");
        }
        out.println("</div>");
        out.println("             </div>                                                        \n");        
           if(pr5 == null) out.println("<input type=\"checkbox\" name=\"pr5\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr5\" checked>\n");
                    if(pr6 == null) out.println("<input type=\"checkbox\" name=\"pr6\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr6\" checked>\n");
                     if(pr7 == null) out.println("<input type=\"checkbox\" name=\"pr7\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr7\" checked>\n");
                      if(pr8 == null) out.println("<input type=\"checkbox\" name=\"pr8\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr8\" checked>\n");
                       if(pr9 == null) out.println("<input type=\"checkbox\" name=\"pr9\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr9\" checked>\n");
                        if(pr10 == null) out.println("<input type=\"checkbox\" name=\"pr10\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr10\" checked>\n");
                         if(pr11 == null) out.println("<input type=\"checkbox\" name=\"pr11\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr11\" checked>\n");           
                          if(pr12 == null) out.println("<input type=\"checkbox\" name=\"pr12\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr12\" checked>\n");     
                out.println(" <script type=\"text/javascript\" >\n"
                + "            document.sig.pr5.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr6.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr7.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr8.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr9.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr10.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr11.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr12.style.visibility=\"hidden\"; \n"
                + "        </script>\n"                
                + "             </form>                                                        \n"
                + "        <!--Pie de pagina-->\n"
                + "        <footer>\n"
                + "            <h3>Copyright &COPY; Todos los derechos reservados</h3>\n"
                + "                <h3>M&eacute;xico ::::: 2016</h3>    \n"
                + "        </footer>\n"
                + "        </body>\n"
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
