package dax.springframework.spring_DI.services;

public class GreetingServiceFactory {
  private GreetingRepository greetingRepository;

  public GreetingServiceFactory(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  public GreetingService createGreetingService(String lang) {
    switch (lang) {
      case "es":
        return new PrimarySpanishGreetingService(greetingRepository);
      case "de":
        return new PrimaryGermanGreetingService(greetingRepository);
      default:
        return new PrimaryGreetingService(greetingRepository);
    }
  }
}
