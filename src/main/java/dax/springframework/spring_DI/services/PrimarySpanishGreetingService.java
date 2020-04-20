package dax.springframework.spring_DI.services;

public class PrimarySpanishGreetingService implements GreetingService {
  private GreetingRepository greetingRepository;

  public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  @Override
  public String sayGreeting() {
    return this.greetingRepository.getSpanishGreeting();
  }
}
