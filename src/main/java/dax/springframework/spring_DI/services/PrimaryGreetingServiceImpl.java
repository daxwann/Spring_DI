package dax.springframework.spring_DI.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello World -- from the PRIMARY Bean";
  }
}
