package servlets;

import webWorkers.NumberSort;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletSorted")
public class ServletSorted extends HttpServlet {

    NumberSort numberSort;

    public ServletSorted() {
        numberSort = new NumberSort();
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().append(numberSort.sortArray(req.getParameter("numbers")));
    }
}
