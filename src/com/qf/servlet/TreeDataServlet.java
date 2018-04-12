package com.qf.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.qf.pojo.Tree;
import com.qf.utils.Utils;

/**
 * Servlet implementation class TreeDataServlet
 */
public class TreeDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TreeDataServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//接受请求
		 List<Tree> data =null;
		String id =request.getParameter("id");
		if (id==null) {
			data=Utils.getData("root");
		}else{
			data = Utils.getData(id);	
		}
		if(data!=null){
			String json =new Gson().toJson(data);
			response.setContentType("application/json;charset=utf-8");
			response.getWriter().write(json);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
