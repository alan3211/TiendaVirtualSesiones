package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Computacion extends HttpServlet {

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
        if (atributos[0] == null) {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr0\" >");
        } else {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr0\" checked>");
        }
        out.println("             </div>\n"
                + "              <div class=\"Compus\">\n"
                + "                     <p>Computadora Alien</p>\n"
                + "                     <img src=\"./Computadoras/alienware.jpg\" alt=\"Alienware\">\n"
                + "                     <p>Experimenta el poder de esta computadora para juegos</p>\n"
                + "                     <p>$29,000</p>\n");
        if (atributos[1] == null) {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr1\" >");
        } else {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr1\" checked>");
        }
        out.println("             </div>           \n"
                + "              <div class=\"Compus\">\n"
                + "                     <p>Computadora HP</p>\n"
                + "                     <img src=\"./Computadoras/hppav.jpeg\" alt=\"Hp pavilion\">\n"
                + "                     <p>Prueba esta computadora para oficina, o simplemente para casa</p>\n"
                + "                     <p>$12,000</p>\n");
        if (atributos[2] == null) {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr2\" >");
        } else {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr2\" checked>");
        }
        out.println("             </div>           \n"
                + "              <div class=\"Compus\">\n"
                + "                     <p>Computadora Samsung</p>\n"
                + "                     <img src=\"./Computadoras/samsung.jpg\" alt=\"samsung\">\n"
                + "                     <p>Economica y simple para trabajos de la escuela de los niños</p>\n"
                + "                     <p>$8,000</p>\n");
        if (atributos[3] == null) {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr3\" >");
        } else {
            out.println("                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr3\" checked>");
        }
        out.println("</div>");
        out.println("             </div>                                                        \n");        
                   for (int i = 4; i < atributos.length; i++) {                               
                            if(atributos[i] == null) out.println("<input type=\"checkbox\" name=\"pr"+i+"\" >\n");
                            else out.println("<input type=\"checkbox\" name=\"pr"+i+"\" checked>\n");
                   }
                out.println(" <script type=\"text/javascript\" >\n"
                + "            document.sig.pr4.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr5.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr6.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr7.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr8.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr9.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr10.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr11.style.visibility=\"hidden\"; \n"
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
