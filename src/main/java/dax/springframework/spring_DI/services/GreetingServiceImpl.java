package dax.springframework.spring_DI.services;

public class GreetingServiceImpl implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello World";
  }
}
