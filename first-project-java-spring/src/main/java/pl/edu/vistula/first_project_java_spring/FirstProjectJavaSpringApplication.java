package pl.edu.vistula.first_project_java_spring;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestParam;



@SpringBootApplication
public class FirstProjectJavaSpringApplication {


    @GetMapping("/")
    public String hello() {
        return "hello"; // should map to a hello.html file in /resources/templates/
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
                           Model model) {
        model.addAttribute("name", name);
        return "greeting"; // should map to greeting.html in /resources/templates/
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstProjectJavaSpringApplication.class, args);
    }
}







