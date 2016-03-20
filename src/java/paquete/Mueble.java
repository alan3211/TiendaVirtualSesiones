package paquete;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Mueble extends HttpServlet {   
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
        //Computacion     
        String pr1_1 = (String) sesion.getAttribute("pr1");
        String pr2_1 = (String) sesion.getAttribute("pr2");
        String pr3_1= (String) sesion.getAttribute("pr3");
        String pr4_1= (String) sesion.getAttribute("pr4");
        //Guarda en atributos de sesion
        sesion.setAttribute("pr1", pr1);
        sesion.setAttribute("pr2", pr2);
        sesion.setAttribute("pr3", pr3);
        sesion.setAttribute("pr4", pr4);
        //Electrodomesticos
       String pr5_1 = (String) sesion.getAttribute("pr5");
       String pr6_1 = (String) sesion.getAttribute("pr6");
       String pr7_1 = (String) sesion.getAttribute("pr7");
       String pr8_1 = (String) sesion.getAttribute("pr8");
        //Recuperarlos en atributos
        sesion.setAttribute("pr5", pr5);
        sesion.setAttribute("pr6", pr6);
        sesion.setAttribute("pr7", pr7);
        sesion.setAttribute("pr8", pr8);
        //Muebleria  
        String pr9_1 = (String) sesion.getAttribute("pr9");
        String pr10_1 = (String) sesion.getAttribute("pr10");
        String pr11_1 = (String) sesion.getAttribute("pr11");
        String pr12_1 = (String) sesion.getAttribute("pr12");
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
                + "                    <title>Alan's Market-Muebler&iacute;a</title>\n"
                + "                    <link rel=\"stylesheet\" href=\"./css/estilos.css\" type=\"text/css\">\n"
                + "        </head>\n"
                + "        <body>\n"
                + "        <!--Encabezado-->\n"
                + "                <header>\n"
                + "                        <div id = \"logo\">\n"
                + "                            <a href=\"Menu\"><img src=\"./img/logo.png\" alt=\"Alan's Market\"></a> \n"
                + "                        </div>\n"
                + "                        <div id=\"titulo\">\n"
                + "                            <p>Departamento de  Muebler&iacute;a</p>\n"
                + "                        </div> \n"               
                + "                </header> \n"              
                + "        <!--Productos-->\n"
                + "             <form method = \"POST\" action = \"Calcula\" name=\"sig\">\n"
                +"<div id=\"menu\">\n"
                +"              <input type=\"button\" class = \"boton\" value=\"Computaci&oacute;n\" onClick=\"document.sig.action='Computacion'; document.sig.submit()\";> \n"
                +"              <input type=\"button\" class = \"boton\" value=\"Electrodom&eacute;sticos\" onClick=\"document.sig.action='Electrodomestico'; document.sig.submit()\";> \n"                      
                +"              <input type=\"button\" class = \"boton\" value=\"Muebler&iacute;a\" onClick=\"document.sig.action='Mueble'; document.sig.submit()\";> \n"                      
                + "             <input type=\"submit\" id = \"checa\" value=\"Finalizar Compra\">\n"
                +"</div>\n"
                +"<div id= \"Contenedor\">\n"
                + "             <div class = \"Compus\">\n"
                + "                     <p>Cajonera</p>\n"
                + "                     <img src=\"./Muebles/mueble1.jpg\" alt=\"Cajonera\">\n"
                + "                     <p>Llevatelo para tu Television se vea espectacular</p>\n"
                + "                     <p>$8,000</p>\n");
                                    if(pr9 == null)  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr9\" >");
                                    else  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr9\" checked>");
                out.println("             </div>\n"
                + "              <div  class = \"Compus\">\n"
                + "                     <p>Repisa</p>\n"
                + "                     <img src=\"./Muebles/mueble2.jpg\" alt=\"repisa\">\n"
                + "                     <p>Para guardar tus libros o documentos atu gusto</p>\n"
                + "                     <p>$2,800</p>\n");
                                    if(pr10 == null)  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr10\" >");
                                    else  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr10\" checked>");
                out.println( "             </div>           \n"
                + "              <div  class = \"Compus\">\n"
                + "                     <p>Sofa Deluxe</p>\n"
                + "                     <img src=\"./Muebles/mueble3.jpg\" alt=\"Sofa deluxe\">\n"
                + "                     <p>Ideal para que tu  casa se vea elegante</p>\n"
                + "                     <p>$7,000</p>\n");
                  if(pr11 == null)  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr11\" >");
                                    else  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr11\" checked>");
               out.println( "             </div>           \n"
                + "              <div  class = \"Compus\">\n"
                + "                     <p>Comedor simple</p>\n"
                + "                     <img src=\"./Muebles/mueble4.jpg\" alt=\"comedor simple\">\n"
                + "                     <p>Especialmente para tu sala moderna</p>\n"
                + "                     <p>$10,000</p>\n");
                  if(pr12 == null)  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr12\" >");
                                    else  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr12\" checked>");
                out.println( "             </div>                                                        \n");
                out.println( "             </div>                                                        \n");
                   if(pr1 == null) out.println("<input type=\"checkbox\" name=\"pr1\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr1\" checked>\n");
                    if(pr2 == null) out.println("<input type=\"checkbox\" name=\"pr2\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr2\" checked>\n");
                     if(pr3 == null) out.println("<input type=\"checkbox\" name=\"pr3\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr3\" checked>\n");
                      if(pr4 == null) out.println("<input type=\"checkbox\" name=\"pr4\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr4\" checked>\n");
                       if(pr5 == null) out.println("<input type=\"checkbox\" name=\"pr5\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr5\" checked>\n");
                        if(pr6 == null) out.println("<input type=\"checkbox\" name=\"pr6\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr6\" checked>\n");
                         if(pr7 == null) out.println("<input type=\"checkbox\" name=\"pr7\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr7\" checked>\n");           
                          if(pr8 == null) out.println("<input type=\"checkbox\" name=\"pr8\" >\n");
                   else out.println("<input type=\"checkbox\" name=\"pr8\" checked>\n");     
                out.println(" <script type=\"text/javascript\" >\n"
                + "            document.sig.pr1.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr2.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr3.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr4.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr5.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr6.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr7.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr8.style.visibility=\"hidden\"; \n"
                + "        </script>"                 
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