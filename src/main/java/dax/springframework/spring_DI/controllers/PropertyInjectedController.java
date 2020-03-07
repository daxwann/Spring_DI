package dax.springframework.spring_DI.controllers;

import dax.springframework.spring_DI.services.GreetingService;

public class PropertyInjectedController {
  public GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
