package dax.springframework.spring_DI.controllers;

import dax.springframework.spring_DI.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {
  ConstructorInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new ConstructorInjectedController(new GreetingServiceImpl());
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}