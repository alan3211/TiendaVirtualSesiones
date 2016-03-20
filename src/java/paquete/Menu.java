package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Menu extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset = UTF-8");
        //Proceso de respuesta
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n"
                + "<html lang=\"es\">\n"
                + "        <head>                 \n"
                + "                    <meta name = \"author\" content=\"Alan Hernandez\">\n"
                + "                    <meta name = \"description\" content=\"Tienda de Alan\">\n"
                + "                    <meta name = \"keywords\" content=\"Alan store 2016\">\n"
                + "                    <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0,maximum-scale=1.0, minimum-scale=1.0\">\n"
                + "                    <title>Alan's Market</title>\n"
                + "                    <link rel=\"stylesheet\" href=\"./css/estilos.css\" type=\"text/css\">\n"
                + "        </head>\n"
                + "        <body>\n"
                + "        <!--Encabezado-->\n"
                + "                <header>\n"
                + "                        <div id = \"logo\">\n"
                + "                            <a href=\"Menu\"><img src=\"./img/logo.png\" alt=\"Alan's Market\"></a> \n"
                + "                        </div>\n"
                + "                        <div id=\"titulo\">\n"
                + "                            <p>Bienvenido a Alan's Market!                             \n"
                + "                            </p>\n"
                + "                        </div> \n"             
                + "                </header> \n"
                + "                 <!--Navegacion-->\n"
                +"                 <div  id=\"menu1\" >\n"
                + "               <nav>\n"
                + "                       <ul>\n"
                + "                           <li><a href=\"Computacion\">Computaci&oacute;n</a></li>\n"
                + "                           <li><a href=\"Electrodomestico\">Electrodom&eacute;sticos</a></li>\n"
                + "                           <li><a href=\"Mueble\">Muebler&iacute;a</a></li>\n"
                + "                       </ul>                       \n"
                + "               </nav>\n"                
                + "                <!--Descripcion de mi tienda-->\n"
                + "        <section id = \"descripcion\">\n"
                + "                <p>Alan's Market es una tienda que te proporciona<br>\n"
                + "                        los articulos que hoy en d&iacute;a estan de moda\n"
                + "                        en el mercado.<br>Ad&eacute;mas te ofrecemos los precios\n"
                + "                        mas baratos.\n"
                + "                    </p>\n"
                + "                    <img src=\"./img/tienda.jpg\" alt=\"Tienda\">\n"
                + "        </section>\n"
                + "        <!--Pie de pagina-->\n"
                + "        <footer>\n"
                + "            <h3>Copyright &COPY; Todos los derechos reservados</h3>\n"
                + "                <h3>M&eacute;xico ::::: 2016</h3>    \n"
                + "        </footer>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    public String getServletInfo() {
        return "Alan-Server<br>Version:1.0";
    }

}
