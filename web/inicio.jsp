<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
        <head>                 
                    <meta name = "author" content="Alan Hernandez">
                    <meta name = "description" content="Tienda de Alan">
                    <meta name = "keywords" content="Alan store 2016">
                    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0,maximum-scale=1.0, minimum-scale=1.0">
                    <title>Alan's Market</title>
                    <link rel="stylesheet" href="./css/estilos.css" type="text/css">
        </head>
        <body>
        <!--Encabezado-->
                <header>
                        <div id = "logo">
                                <img src="./img/logo.png" alt="Alan's Market"> 
                        </div>
                        <div id="titulo">
                            <p>Bienvenido a Alan's Market: 
                            <% session.getAttribute("userName"); %>
                            </p>
                        </div>                  
                </header>                                
        </body>
</html>