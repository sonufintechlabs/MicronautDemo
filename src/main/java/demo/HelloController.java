package demo;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.validation.Validated;

import javax.validation.Valid;

@Controller("/hello")
public class HelloController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        return "Hello World";
    }


    @Post(value = "/save")
    public String save(@Body @Valid Employee employee) {
        System.out.println("Welcome To Employeeee ");
        System.out.println("Welcome To Employeeee " + employee.getName());
        System.out.println("Welcome To Employeeee " + employee.getEmployeId());

        return "okkk";
    }

}
