<%--
  Created by IntelliJ IDEA.
  User: julio
  Date: 15/07/2022
  Time: 09:02 p. m.
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="head.jsp"></jsp:include>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #009574;">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">
            <img src="../../assets/imgs/LOGO-SIGUEBU2.png" alt="" width="150px">
        </a>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0 navContent">

                <li class="nav-item menus">
                    <a class="nav-link active" aria-current="page" href="#">INICIO</a>
                </li>

                <li class="nav-item dropdown menus">
                    <a class="nav-link dropdown-toggle" href="#" class="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        CATALOGO
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#">LIBROS</a></li>
                        <li><a class="dropdown-item" href="#">SALAS</a></li>
                    </ul>
                </li>
                <li class="nav-item dropdown menus">
                    <a class="nav-link dropdown-toggle" href="#" class="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        PRESTAMOS
                    </a>
                    <ul class="dropdown-menu " aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#">LIBROS</a></li>
                        <li><a class="dropdown-item" href="#">SALAS</a></li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">MI PERFIL</a>
                </li>
            </ul>
            <div class="cerrar">
                <br>
                <a href="../index.jsp" class="cerrarA" style="text-decoration: none; color: black; margin-left: 4px;"><img src="../../assets/imgs/cerrar.png" alt="" width="30px"> Cerrar Sesión</a>
            </div>
        </div>
    </div>
</nav>
