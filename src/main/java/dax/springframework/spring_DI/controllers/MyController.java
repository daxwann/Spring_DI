package dax.springframework.spring_DI.controllers;

import dax.springframework.spring_DI.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
  private final GreetingService greetingService;

  public MyController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
