package dax.springframework.spring_DI.controllers;

import dax.springframework.spring_DI.services.GreetingService;

public class SetterInjectedController {
  private GreetingService greetingService;

  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
