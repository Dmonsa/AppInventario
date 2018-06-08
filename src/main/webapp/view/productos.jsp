
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>Menu</title>

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
              rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/jumbotron.css" rel="stylesheet">
    </head>

    <body>

        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="#">APPInventarios</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/view/productos.jsp">Productos<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/view/movimientos.jsp">Movimientos</a>
                    </li>
                </ul>
            </div>
        </nav>

        <main role="main">

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                <div class="container">
                    <form action="${pageContext.servletContext.contextPath}/ProductoServlet" method="post">
                        <div class="form-row">
                            <div class="col">
                                <p>
                                    ID Producto: <input name="txtidProducto" type="text" class="form-control" placeholder="ID Producto">
                                </p>
                            </div>
                            <div class="col"></div>
                        </div>
                        <div class="form-row">
                            <div class="col-md-7">
                                <p>
                                    Nombre: <input name="txtnombre" type="text" class="form-control" placeholder="Nombre">
                                </p>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="col-md-5">
                                <p>
                                    Stock: <input name="txtstock" type="text" class="form-control" placeholder="Stock">
                                </p>
                            </div>
                        </div>
                        <div class="col"></div>

                        <div class="form-row">
                            <div class="col-md-5">
                                <p>
                                    Existencia: <input name="txtexistencia" type="text" class="form-control" placeholder="Existencia">
                                </p>
                            </div>                                       
                        </div>
                        <br>
                        <br>
                        <div class="form-row" >
                            <div class="col">
                                <button name="accion" value="crear" type="submit" 
                                        class="btn btn-primary">
                                    Crear Producto
                                </button>

                                <button name="accion" value="listar" type="submit" 
                                        class="btn btn-primary">
                                    Listar Producto
                                </button>
                            </div>
                        </div>  
                    </form>
                </div>
                <div class="container">

                    <!-- Example row of columns -->
                </div> <!-- /container -->
            </div>
        </main>

        <footer class="container">
            <p>&copy; DAYO 2017-2018</p>
        </footer>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    </body>
</html>