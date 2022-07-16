<%--
  Created by IntelliJ IDEA.
  User: julio
  Date: 15/07/2022
  Time: 09:25 p. m.
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Registrar sala</title>
    <jsp:include page="../../templates/head.jsp"></jsp:include>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="../../css/style.css">
</head>
<body class="body_login">
<br>
<div class="container2">
    <br>
    <div class="card">
        <div class="card-body ">

            <form class="row needs-validation" id="formulario" novalidate action="add-sala" method="POST">
                <div class="col-12 text-center">
                    <img src="../../assets/imgs/LOGO-SIGUEBU2.png" class="logo_sigebu" alt="">
                    <h1>REGISTRARSE</h1>
                </div>

                <div class="col-6">
                    <label for="nombre_sala" class="form-label fw-bold">Nombre</label>
                    <input type="text" class="form-control" id="nombre_sala" name="nombre_sala" placeholder="nombre_sala" required>
                    <div class="invalid-feedback">Campo Obligatorio</div>
                </div>
                <div class="col-6">
                    <label for="capacidad_sala" class="form-label fw-bold">Capacidad</label>
                    <input type="text" class="form-control" id="capacidad_sala" name="capacidad_sala" placeholder="capacidad_sala" required>
                    <div class="invalid-feedback">Campo Obligatorio</div>
                </div>
                <div class="form-group mb-3">
                    <div class="row">
                        <div class="col-12 text-end">
                            <button type="button" class="btn btn-danger btn-sm">Cancelar</button>
                            <button type="submit" class="btn btn-success btn-sm">Agregar</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="../../js/javascript.js"></script>
</body>
</html>
