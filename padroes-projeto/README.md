## Aplicação dos conceitos de Design Pattern
### Singleton
- SingletonLazy : Modo "preguiçoso", instancia apenas quando chamado.
- SingletonEager : Modo "apressado", se instancia no momento que é criado.
- SingletonLazyHolder: Mais Otimizado na execução e consumo. Encapsula a instancia em uma classe estatica interna.  [Referência](https://stackoverflow.com/a/24018148) 
- No Spring Framework: @Bean @Autowired

### Strategy
Simplificar a variação de algoritmos para a resolução de um mesmo problema a partir da utilização do polimorfismo.

- No Spring Framework: @Repository @Service

### Facade
Prover uma interface que reduza a complexidade nas integrações com subsistemas. Que consiga abstrair toda a complexidade a partir de uma interface.

- No Spring Framework: Analoga a API REST, portanto usa-se Spring data JPA