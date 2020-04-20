package dax.springframework.spring_DI.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
  @Override
  public String getEnglishGreeting() {
    return "Hello World";
  }

  @Override
  public String getSpanishGreeting() {
    return "Hola Mundo";
  }

  @Override
  public String getGermanGreeting() {
    return "Hallo Welt";
  }
}
