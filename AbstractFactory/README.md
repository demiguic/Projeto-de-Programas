## Abstract Factory
### Padrão de Criação

Abstract Factory é um padrão de criação, que como o nome já implica é responsável pela criação de objetos.
A Abstract Factory procura resolver problemas em que há famílias de objetos com variantes que podem ou devem trabalhar juntos.
Para resolver essa questão criamos uma interface para cada objeto dessa família e a partir disso criamos a Abstract Factory, que terá em seus métodos a instanciação desses objetos. A partir da fábrica concreta será garantido que todos os objetos instanciados por uma mesma fábrica pertencerão ao mesmo tipo. Assim possibilitamos que o cliente não seja dependente das classes concretas, apenas usando a interface da Abstract Factory para acessar os produtos. O código é também de fácil manutenção por ter diversos classes com funções bem divididas.
