/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.Funcionario;
import persistencia.FuncionarioDao;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lab.senac
 */
@WebServlet(name = "ControleFuncionario", urlPatterns = {"/ControleFuncionario"})
public class ControleFuncionario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String cmd = request.getParameter("cmd");
            if(cmd.equals("logar")){
            try{
                HttpSession sessao = request.getSession();
                String login = request.getParameter("login");
                String senha = request.getParameter("senha");
                Funcionario f = new FuncionarioDao().autenticar(login, senha);
                if(f!=null){
                    sessao.setAttribute("usuario", f.getLogin());
                    response.sendRedirect("principal.jsp");
                }else{
                    request.setAttribute("msg", "Acesso Negado!");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
            }catch(Exception e){
                request.setAttribute("msg", e.getMessage());
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }    
          }else if(cmd.equals("sair")){
              HttpSession sessao = request.getSession();
              sessao.invalidate();
               request.getRequestDispatcher("index.jsp").forward(request, response);
              
          }else if(cmd.equals("cadastro")){
              String msg = null;
              HttpSession sessao = request.getSession();
              try{    
              Funcionario f = new Funcionario();
              f.setNome(request.getParameter("nome"));
              f.setLogin(request.getParameter("login"));
              f.setSenha(request.getParameter("senha"));
              FuncionarioDao fd = new FuncionarioDao();
              fd.cadastrar(f);
               if("login".equals(request.getParameter("login"))){
                  String ms = "este login ja existe!";
          
       }
              msg = "Cadastrado com sucesso";
             
              }catch (Exception e){
               msg = e.getMessage();
              }
              request.setAttribute("msg", msg);
            request.getRequestDispatcher("cadastro.jsp").forward(request, response);
             
              
          }else if(cmd.equals("consultar")){
              
          }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
