<h1>Cadastro</h1>
<hr/>
<form action="ControleFuncionario?cmd=cadastro" method="post">
    Nome:
    <input type="text" name="nome"/>
    <br/><br/>
    Login:
    <input type="text" name="login"/>
    <br/><br/>
    Senha:
    <input type="password" name="senha"/>
    <br/><br/>
    
    <a href="principal.jsp"> Voltar</a> <input type="submit" value="cadastrar"/>
   
    
</form>
<hr/>
${msg}