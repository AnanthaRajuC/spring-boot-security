package io.github.anantharajuc.apisecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController 
{
	@GetMapping(path="/")
    public String getEmployees() 
    {
        return "Data from REST Endpoint";
    }
}
