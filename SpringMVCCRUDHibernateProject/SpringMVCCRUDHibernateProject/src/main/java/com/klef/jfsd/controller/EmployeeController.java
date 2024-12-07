package com.klef.jfsd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.model.Employee;
import com.klef.jfsd.service.EmployeeService;

@Controller
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
  @GetMapping("home")
  public ModelAndView index()
  {
    ModelAndView mv=new ModelAndView();
    mv.setViewName("index");
    return mv;
  }
  
  @GetMapping("addemp")
  public ModelAndView addemp()
  {
    ModelAndView mv=new ModelAndView();
    mv.setViewName("addemp");
    return mv;
  }
  
  @GetMapping("viewempbyid")
  public ModelAndView viewempbyid()
  {
    ModelAndView mv=new ModelAndView();
    mv.setViewName("viewempbyid");
    return mv;
  }
  
  @PostMapping("display")
  public ModelAndView display(HttpServletRequest request)
  {
	  int id = Integer.parseInt(request.getParameter("eid"));
	  
	  ModelAndView mv = new ModelAndView();
	   
	   Employee e = employeeService.viewEmployeebyid(id);
	   if(e!=null)
	   {
		   mv.setViewName("display");
		   mv.addObject("emp", e);
	   }
	   else
	   {
		   mv.setViewName("employeefail");
		   mv.addObject("message", "Employee ID Not Found");
	   }
	   return mv;
  }
  
  @GetMapping("viewallemps")
  public ModelAndView viewallemps()
  {
	   List<Employee > emplist  = employeeService.viewallEmployees();
	   
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("viewallemps");
	   mv.addObject("emplist", emplist);
	   return mv;
  }
  
  @GetMapping("updateemp")
  public ModelAndView updateemp()
  {
    ModelAndView mv=new ModelAndView();
    mv.setViewName("updateemp");
    return mv;
  }
  
  @PostMapping("update")
  public ModelAndView update(HttpServletRequest request)
  {
	  // get the data from HTML form
	   int id = Integer.parseInt(request.getParameter("eid"));
	   String name = request.getParameter("ename");
	   double salary = Double.parseDouble(request.getParameter("esalary"));
	   String email = request.getParameter("eemail");
	   String contact = request.getParameter("econtact");
	   
	   Employee emp = new Employee();
	   emp.setId(id);
	   emp.setName(name);
	   emp.setSalary(salary);
	   emp.setEmail(email);
	   emp.setContact(contact);
	   
	   ModelAndView mv = new ModelAndView();
	   
	   Employee e = employeeService.viewEmployeebyid(id);
	   if(e!=null)
	   {
		   String msg = employeeService.updateemployee(emp);
		   mv.setViewName("updatesuccess");
		   mv.addObject("message", msg);
	   }
	   else
	   {
		   mv.setViewName("updatefail");
		   mv.addObject("message", "Employee ID Not Found");
	   }
	   
	    return mv;
  }
  
  @GetMapping("deleteemp")
  public ModelAndView deleteemp()
  {
	  List<Employee > emplist  = employeeService.viewallEmployees();
	   
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("deleteemp");
	   mv.addObject("emplist", emplist);
	   return mv;
  }
  
  @GetMapping("delete")
  public String delete(@RequestParam("id") int eid)
  {
	 employeeService.deleteemployee(eid);
	 
	 return "redirect:/deleteemp";
  }
  
  @PostMapping("insertemp")
  public ModelAndView insertemp(HttpServletRequest request)
  {
	   // get the data from HTML form
	   int id = Integer.parseInt(request.getParameter("eid"));
	   String name = request.getParameter("ename");
	   String gender = request.getParameter("egender");
	   String dob = request.getParameter("edob");
	   String dept = request.getParameter("edept");
	   double salary = Double.parseDouble(request.getParameter("esalary"));
	   String location = request.getParameter("elocation");
	   String email = request.getParameter("eemail");
	   String contact = request.getParameter("econtact");
	   
	   Employee emp = new Employee();
	   emp.setId(id);
	   emp.setName(name);
	   emp.setGender(gender);
	   emp.setDateofbirth(dob);
	   emp.setDepartment(dept);
	   emp.setSalary(salary);
	   emp.setLocation(location);
	   emp.setEmail(email);
	   emp.setContact(contact);
	   
	   String msg = employeeService.addemployee(emp);
	   
	   ModelAndView mv = new ModelAndView();
	   mv.setViewName("addsuccess");
	   mv.addObject("message", msg);
	   
	   return mv;
  }
  
  
  
  
  
  
  
  
  
}