# Padrões de Projeto (GOF)

# Resumo

- Dividido em 23 partes

** Dividios em 3 Categorias **

- Padrões de criação: relacionados à criação de objetos, visam abstrair o processo de
  criação de objetos, ou seja, sua instanciação.

- Padrões estruturais: tratam das associações entre objetos, identificando a melhor
  forma de realizar o relacionamento entre as entidades.

- Padrões comportamentais: identificam padrões de comunicação entre objetos,
  implementando-os,

## Solução

Descreve soluções para problemas recorrentes no desenvolvimento de sistemas orientado a objetos. Projetar de uma maneira mais flexivel.

- possui um nome
- define o problema
- define a solução
- quanto aplicar esta solução
- consequências

# Padrões de criação

## Singleton

- Garantir que uma determinada classe tenha uma, e somente uma instância, mantendo um ponto global de acesso para a mesma.
- A primeira regra é sempre deixar o seu construtor privado

## Factory Method

- Definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar.
- Criar uma instância de várias classes derivadas.

## Abstract Factory

- Fornece uma interface para criacao de familias de objetos relacionados ou dependentes sem especificar suas classes concretas.
  -Criar uma instância de varias famílias de classes

## Builder

- Separa a construcao de um objeto compleco da sua representação de modo que o mesmo processo de construção posso criar diferentes representações.

- Separa a construção do objeto de sua representação.

## Prototype

- Especifica os tipos de objetos a serem criados usando uma instância protótipo e crias novos objetos pelo cópia deste protótipo.
- Uma instância inicializada a ser copiada ou clonada
- Construir objetos iguais a si mesmo

# Padrões estruturais

## Adapter

- Converter a interface de uma classe em outra interface, esperada pelos clientes.o Adapter permite que classes com intefaces incompativeis trabalhem em conjunto o que, de outra forma, seria impossivel.

- Equipar interfaces de diferentes classes.

## Bridge

- Desacoplar uma abstração da sua implementação, de modo que as duas possam varias independentemente,
- Sepera a interface do objeto de sua implementação.

## Composite

- Compor objetos em estruturas de árvore para reprensentar hierarquias todo-parte.

## Decorator

- Agregar dinamicamente responsabilidades adicionais a um objeto ja existente em tempod e execução.

## Facade

- Fornece uma interface unificada para um conjunto de interfaces em um subsistema.Facade define um interface
  de nivel mais alto que torna o subsistema mais fácil de ser usado.

- Uma única classe representa um subsistema inteiro.

## Flyweight

- Usar compartilhamento para suportar eficientemente grandes quantidades de objetos de granularidade fina.

## Proxy

- Fornece um substituto ou marcador da localizacao de outro objeto para controlar o acesso ao memso
- Similar ao proxy de internet

# Padrões Comportamentais

## Chain of Responsibility

- Evitar a acoplamente do remetente de uma solicitação

  #Command
  #Interpreter
  #Iterator
  #Mediator
  #Memento
  #Observer
  #State
  #Strategy
  #Template Method
  #Visitor
