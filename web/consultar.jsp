
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="persistencia.FuncionarioDao"%>

<%
     try{
        request.setAttribute("funcionario", new FuncionarioDao().consultar());
    }catch(Exception e){
        
    }
     
     %>
     
     <h1> Consultar banco</h1>
     <hr/>
     <table border="1">
         <tr>
             <th>Código</th>
             <th>Nome</th>
             <th>Login</th>
             <th>Senha</th>
         </tr>
         
         <c:forEach items="${funcionario}" var="f">
             <tr>
                 <th>${f.id}</th>
                 <th>${f.nome}</th>
                 <th>${f.login}</th>
                 <th>${f.senha}</th>
             </tr>
             
         </c:forEach>
             
         </tr>
         
     </table>
     <br/>
     <br/>
     <a href="principal.jsp"> Voltar </a>