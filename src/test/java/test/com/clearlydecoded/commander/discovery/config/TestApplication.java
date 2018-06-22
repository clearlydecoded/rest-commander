package test.com.clearlydecoded.commander.discovery.config;

import com.clearlydecoded.commander.CommandHandlerRegistry;
import com.clearlydecoded.commander.discovery.SpringCommandHandlerRegistryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestApplication {

  @Autowired
  private ApplicationContext springContext;

  /**
   * Use the Spring-based command handler registry factory to create the registry with automatically
   * discovered command handlers and expose it as a Bean into the Spring Context.
   */
  @Bean
  public CommandHandlerRegistry configureCommandHandlerRegistry() {
    return SpringCommandHandlerRegistryFactory
        .discoverCommandHandlersAndCreateRegistry(springContext);
  }

  public static void main(String[] args) {
    SpringApplication.run(TestApplication.class, args);
  }
}
