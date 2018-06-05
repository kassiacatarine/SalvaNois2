/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;
import models.usuario.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author César
 */
@WebServlet(urlPatterns = {"/CadastroUsu"},name = "CadastroUsu")
public class CadastroUsu extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        Usuario usu = new Usuario(req.getParameter("login"),req.getParameter("senha"),req.getParameter("email"),req.getParameter("endereco"),req.getParameter("nome"),false);
        UsuarioDAO dao = new UsuarioDAO();
        dao.cadastrar(usu);
        
        res.sendRedirect("./html/login.html");
       
    }
}
