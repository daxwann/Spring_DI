package dax.springframework.spring_DI.services;

import org.springframework.stereotype.Service;

@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello World from I18N English";
  }
}
