# spring-boot-command-line-runner

```bash
mvn spring-boot:run
```

## To create a command line runner

1. Spring Boot Application class should extend CommandLineRunner

2. Override the `run` method in the Application class

```java
@SpringBootApplication
public class JavaDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JavaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Hello world");

		List<Integer> scores = new ArrayList<>();
	}
}
```