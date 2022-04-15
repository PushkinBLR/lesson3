package servlet;


import dao.PersonDAOImpl;
import entity.Person;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Service.PersonService;

import java.io.IOException;

public class RegistrationServlet extends HttpServlet {
    private final PersonService personService = new PersonService();
    private final PersonDAOImpl persondaoimpl = new PersonDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/views/registration.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String section = request.getParameter("section");


        Person person = new Person(id,name,section);
        PersonService personService = new PersonService();
        person.setId(id);
        person.setName(name);
        person.setSection(section);
        personService.savePerson(person);

        response.sendRedirect("/");
            request.setAttribute("message","Person done");
        }

}
