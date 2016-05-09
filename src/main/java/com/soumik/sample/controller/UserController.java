package com.soumik.sample.controller;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.soumik.sample.faccade.UserServiceFaccadeJson;
@Controller

public class UserController {
	private final UserServiceFaccadeJson userServiceFaccadeJson;
	private static final Type userListType = new TypeToken<ArrayList<String>>(){}.getType();

	private final Gson gson;
	@Autowired
	public UserController(UserServiceFaccadeJson userServiceFaccadeJson) {
		this.userServiceFaccadeJson = userServiceFaccadeJson;
		gson = new GsonBuilder().serializeNulls().create();
	}
	
    @RequestMapping(value = {"/","/welcome"} , method = RequestMethod.GET)
    public String welcomePage(Model model) {
       model.addAttribute("title", "User Information");
       return "WEB-INF/views/welcomePage.jsp";
    }
 
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String getUsers(Model model)  throws Exception 
	{
		String users = userServiceFaccadeJson.getUsers();
		List<String> userList = gson.fromJson(users,userListType);
		model.addAttribute("userList", userList);
		model.addAttribute("title", "User Details");
	    return "WEB-INF/views/show.jsp";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUser(Model model)  throws Exception 
	{
		model.addAttribute("title", "Add User");
		return "WEB-INF/views/add.jsp";
	
	}
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String addUser(@RequestParam(value="userName") String userName, Model model)  throws Exception 
	{   String message = "Errod adding the user as it was blank.";
		if (!userName.trim().isEmpty())
		message = userServiceFaccadeJson.addUser(userName);
		model.addAttribute("message", 
				message);
		model.addAttribute("title", "Result");
	    return "WEB-INF/views/result.jsp";
	
	}
}