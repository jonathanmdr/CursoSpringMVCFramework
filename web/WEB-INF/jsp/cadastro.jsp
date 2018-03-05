<%-- 
    Document   : cadastro
    Created on : 05/03/2018, 17:18:41
    Author     : jonat_000
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="resources/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="resources/css/style.css"/>" rel="stylesheet" type="text/css"/>
        <title>Cadastro</title>
    </head>
    <body>                
        <div class="container">
            <div class="col-md-6 cadastro">
                <h1>Tela de Cadastro</h1>
                <form>
                    <div class="form-group">
                        Nome
                        <input type="text" name="nome" id="nome" class="form-control" required="">
                    </div>

                    <div class="form-group">
                        Endereço
                        <input type="text" name="endereco" id="endereco" class="form-control" required="">
                    </div>

                    <div class="form-group">
                        Telefone
                        <input type="number" name="telefone" id="telefone" class="form-control" required="">
                    </div>

                    <div class="form-group">
                        E-mail
                        <input type="email" name="email" id="email" class="form-control" required="">
                    </div>

                    <div class="form-group">
                        <input type="submit" id="submit" class="btn btn-primary" value="Cadastrar">
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
