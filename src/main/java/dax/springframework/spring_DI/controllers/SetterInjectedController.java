package dax.springframework.spring_DI.controllers;

import dax.springframework.spring_DI.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
  private GreetingService greetingService;

  @Qualifier("setterInjectedGreetingServiceImpl")
  @Autowired
  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
