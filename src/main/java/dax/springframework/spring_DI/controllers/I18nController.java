package dax.springframework.spring_DI.controllers;

import dax.springframework.spring_DI.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

  private final GreetingService greetingService;

  public I18nController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello(){
    return greetingService.sayGreeting();
  }
}
