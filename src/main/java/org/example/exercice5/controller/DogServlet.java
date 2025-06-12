package org.example.exercice5.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.exercice5.controller.dao.DogDAO;
import org.example.exercice5.model.Dog;


import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet(value = "/add")
public class DogServlet extends HttpServlet {
    DogDAO dogDAO = new DogDAO();
    private List<Dog> dogs;

    @Override
    public void init() throws ServletException {
        dogs = dogDAO.getAll();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("dogs", dogs);


        req.getRequestDispatcher("/WEB-INF/dog/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String breed = req.getParameter("breed");
        LocalDate dateBirth = LocalDate.parse(req.getParameter("dateBirth"));

        Dog dog = new Dog(name, breed, dateBirth);

        dogDAO.save(dog);

        doGet(req, resp);

    }
}


