package dax.springframework.spring_DI.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello World -- Constructor Service Impl";
  }
}
