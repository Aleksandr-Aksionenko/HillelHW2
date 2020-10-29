package servlets;

import webWorkers.TextWorker;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletText")
public class ServletText extends HttpServlet {
    TextWorker textWorker;

    public ServletText() {
        textWorker = new TextWorker();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append(textWorker.countWords(request.getParameter("Words")));
    }
}
