package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Electrodomestico extends HttpServlet {   
    
    private String[] obteneratributos = new String[12];    
    private String [] atributos = new String[12];
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException { 
        response.setContentType("text/html; charset = UTF-8");        
        HttpSession sesion = request.getSession();         
        procesaatrib(sesion); /*Recupera todos los atributos de session*/
        setAtrib(sesion); /*Guarda todos los atributos de sesion*/ 
           // Proceso de respuesta
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n"
                + "<html lang=\"es\">\n"
                + "        <head>                 \n"
                + "                    <meta name = \"author\" content=\"Alan Hernandez\">\n"
                + "                    <meta name = \"description\" content=\"Tienda de Alan\">\n"
                + "                    <meta name = \"keywords\" content=\"Alan store 2016\">\n"
                + "                    <meta name=\"viewport\" content=\"width=device-width, user-scalable=no, initial-scale=1.0,maximum-scale=1.0, minimum-scale=1.0\">\n"
                + "                    <title>Alan's Market-Electrodom&eacute;sticos</title>\n"
                + "                    <link rel=\"stylesheet\" href=\"./css/estilos.css\" type=\"text/css\">\n"
                + "        </head>\n"
                + "        <body>\n"
                + "        <!--Encabezado-->\n"
                + "                <header>\n"
                + "                        <div id = \"logo\">\n"
                + "                            <img src=\"./img/logo.png\" alt=\"Alan's Market\"> \n"
                + "                        </div>\n"
                + "                        <div id=\"titulo\">\n"
                + "                            <p>Departamento de Electrodom&eacute;sticos</p>\n"
                + "                        </div> \n"                                      
                + "                </header> \n"             
                + "        <!--Productos-->\n"
                + "             <form method = \"POST\" action = \"Calcula\" name =\"sig\">\n"
                +"<div id=\"menu\">"
                +"              <input type=\"button\" class = \"boton\" value=\"Computaci&oacute;n\" onClick=\"document.sig.action='Computacion'; document.sig.submit()\";> \n"
                +"              <input type=\"button\"  class = \"boton\"value=\"Electrodom&eacute;sticos\" onClick=\"document.sig.action='Electrodomestico'; document.sig.submit()\";> \n"
                +"              <input type=\"button\"  class = \"boton\"value=\"Muebler&iacute;a\" onClick=\"document.sig.action='Mueble'; document.sig.submit()\";> \n"    
                 + "             <input type=\"submit\" id = \"checa\" value=\"Finalizar Compra\">\n"
                +"</div>\n"
                +"<div id=\"Contenedor\">\n"
                + "             <div class=\"Compus\">\n"
                + "                     <p>Lavadora Samsung</p>\n"
                + "                     <img src=\"./Electrodomestico/lavadorasamsung.jpg\" alt=\"Lavadora\">\n"
                + "                     <p>Llevate esta lavadora  para un lavado increible</p>\n"
                + "                     <p>$9,000</p>\n");
                                    if(atributos[4] == null)  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr5\" >");
                                    else  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr5\" checked>");
                out.println("             </div>\n"
                + "              <div class=\"Compus\">\n"
                + "                     <p>Licuadora Oster</p>\n"
                + "                     <img src=\"./Electrodomestico/licuadoraoster.jpg\" alt=\"Licuadora\">\n"
                + "                     <p>Para realizar tus jugos  tu gusto</p>\n"
                + "                     <p>$2,000</p>\n");
                                    if(atributos[5]== null)  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr6\" >");
                                    else  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr6\" checked>");
                out.println( "             </div>           \n"
                + "              <div class=\"Compus\">\n"
                + "                     <p>Microondas LG</p>\n"
                + "                     <img src=\"./Electrodomestico/microondaslg.jpg\" alt=\"Microondas\">\n"
                + "                     <p>Ideal para oficina o simplemente en casa</p>\n"
                + "                     <p>$3,000</p>\n");
                  if(atributos[6] == null)  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr7\" >");
                                    else  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr7\" checked>");
               out.println( "             </div>           \n"
                + "              <div class=\"Compus\">\n"
                + "                     <p>Refrigerador GE</p>\n"
                + "                     <img src=\"./Electrodomestico/refrige.jpg\" alt=\"refrigerador\">\n"
                + "                     <p>Para guardar tus alimentos con ahorro de energia</p>\n"
                + "                     <p>$14,000</p>\n");
                  if(atributos[4] == null)  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr8\" >");
                                    else  out.println( "                     Agregar: &nbsp;&nbsp;<input type=\"checkbox\" name=\"pr8\" checked>");
                out.println( "             </div>                                                        \n");
                out.println( "             </div>                                                        \n");
                for (int i = 0; i < atributos.length; i++) {
                    if(i >3 && i < 8) continue;
                    else{
                             if(atributos[i] == null) out.println("<input type=\"checkbox\" name=\"pr"+i+"\" >\n");
                            else out.println("<input type=\"checkbox\" name=\"pr"+i+"\" checked>\n");
                        }
                    }                
                out.println(" <script type=\"text/javascript\" >\n"
                + "            document.sig.pr1.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr2.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr3.style.visibility=\"hidden\"; \n"
                + "            document.sig.pr4.style.visibility=\"hidden\"; \n"
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
      private void procesaatrib(HttpSession sesion){
        for (int i = 0; i < atributos.length; i++) {
                atributos[i] = (String)sesion.getAttribute("pr"+i);
        }
    }
    
    private void setAtrib(HttpSession sesion){
        for (int i = 0; i < atributos.length; i++) {
            sesion.setAttribute("pr"+i, atributos[i]);
        }
    }

}
