package com.full;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.full.bean.Intern;
import com.full.db.InternDB;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
        		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Gson gson = new Gson();
		JsonObject jsonObject = new JsonObject();
		
		Intern intern = InternDB.getInternObject(id);
		
		JsonElement jsonTree = gson.toJsonTree(intern);
		
		if(intern == null) {
			jsonObject.addProperty("success", false);
		} else {
			jsonObject.addProperty("success", true);
		}
		
		jsonObject.add("internDetails", jsonTree);
		
		response.getWriter().println(jsonObject.toString());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
