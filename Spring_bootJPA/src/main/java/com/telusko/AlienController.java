package com.telusko;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.demo.dao.AlienRepo;

@Controller
public class AlienController 
{

@Autowired
AlienRepo repo;

@RequestMapping("")
public String home()
{
	return "home";
}

// consumes = {"application/json"}
// @RequestBody 

@RequestMapping("/addAlien")
public String addAlien(Alien alien)
{
	repo.save(alien);
	return "home";
}

@RequestMapping("/getAlien")
public ModelAndView getAlien1(@RequestParam int aid)
{
	Alien alien = repo.findById(aid).orElse(new Alien());
	
	ModelAndView model = new ModelAndView("showalien");
	model.addObject(alien);
	
	return model;
}

@RequestMapping("/getAlienbyname")
public ModelAndView getAlienbyname(@RequestParam String aname)
{
	Alien alien = new Alien();
	alien = repo.findByaname(aname);
	
	ModelAndView model = new ModelAndView("showalien");
	model.addObject(alien);
	
	return model;
}

@RequestMapping("/greaterthan")
public ModelAndView getAlienGreaterthan(@RequestParam int aid)
{
	List<Alien> alien = new ArrayList();
	alien = repo.findByaidGreaterThan(aid);
	
	ModelAndView model = new ModelAndView("showalien");
	model.addObject(alien);
	
	return model;
}


//-----------------------------------------------------------------
@GetMapping(path = "/Alien", produces = {"application/xml"})
@ResponseBody
public List<Alien> getAliens()
{
	return repo.findAll();
}

@PutMapping(path = "/alien", consumes = {"application/json"})
public Alien UpdateAlien(@RequestBody Alien alien)
{
	repo.save(alien);
	return alien;
}

@RequestMapping("/Alien/{aid}")
public Optional<Alien> getAlien(@PathVariable("aid") int aid)
{
	return repo.findById(aid);
}

@RequestMapping("/UpdateAlien")
public String updateAlien(Alien alien)
{
	repo.save(alien);
	return "home.jsp";
}

@DeleteMapping("/alien/{aid}")
public String deleteAlien(@PathVariable int aid)
{
	Alien a = repo.getOne(aid);
	repo.delete(a);
	
	return "deleted";
}
}
