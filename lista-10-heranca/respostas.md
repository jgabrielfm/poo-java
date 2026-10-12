# Respostas teóricas – Lista 10

## Questão 1 – Herança: vantagens e desvantagens

Herança é um recurso da Programação Orientada a Objetos que permite criar uma classe a partir de outra já existente, numa relação do tipo "é um". A subclasse recebe os atributos e métodos públicos e protegidos da superclasse e pode acrescentar ou sobrescrever o que precisar. Num sistema bancário, por exemplo, uma conta empresarial é uma conta com algo a mais, como um limite e uma operação de empréstimo. A principal vantagem é o reuso: o código comum é escrito e testado uma só vez, e uma correção na superclasse vale para todas as subclasses. A herança também organiza o sistema do mais geral para o mais específico e é a base do polimorfismo. Por outro lado, ela cria um acoplamento forte, já que uma mudança na superclasse pode quebrar as subclasses, e enfraquece o encapsulamento, pois a subclasse passa a depender de detalhes internos da classe mãe. Além disso, em Java cada classe só pode ter uma superclasse direta, e usar herança sem uma relação "é um" verdadeira gera hierarquias confusas. Por isso, muitos recomendam preferir a composição e usar herança só quando a subclasse realmente é um tipo especial da superclasse.

**Fontes:**
- ALVES, Nélio. *Java COMPLETO Programação Orientada a Objetos + Projetos*. Udemy. https://www.udemy.com/course/java-curso-completo/
- HUDSON. Entendendo e Aplicando Herança em Java. *DevMedia*, 2012. https://www.devmedia.com.br/entendendo-e-aplicando-heranca-em-java/24544
- ORACLE. Inheritance. *The Java Tutorials*. https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
- BLOCH, Joshua. *Java Efetivo*. 3. ed. Rio de Janeiro: Alta Books, 2019. Item 18: Prefira a composição à herança.

## Questão 3 – Por que o Template Method é uma solução melhor

Os dois chatbots faziam a mesma coisa: saudar, se apresentar, identificar o cliente e mostrar as opções. A diferença é que cada um fazia do seu jeito, com nomes diferentes e até numa ordem diferente (o da Netflix tinha um método chamado identificar() que, na verdade, fazia a apresentação). Então criei a classe abstrata ChatBot com o iniciarAtendimento() como final, que define a ordem do atendimento num lugar só, e nenhum chatbot consegue pular ou inverter um passo. A saudação e a apresentação, que eram praticamente iguais, ficaram prontas na superclasse, e as subclasses só implementam o que realmente muda: como identificar o cliente e quais opções mostrar. Assim, criar um chatbot novo fica bem mais fácil, e se precisar mudar a saudação, muda em um lugar só.

## Questão 6 – Há duplicação de código nas questões 4 e 5?

Sim, um pouco, mas nas classes, não nos programas. Na questão 4, o sacar da ContaEspecial é quase uma cópia do sacar da ContaCorrente: reescrevi o método inteiro só para mudar a taxa de R$ 1,00 para R$ 0,50. Na questão 5, as quatro subclasses têm o mesmo construtor e o mesmo formato de método, mudando só o sinal da conta. Já nos mains quase não tem repetição, porque usei uma variável do tipo da superclasse que recebe o objeto certo, e aí o saque e a impressão do resultado foram escritos uma vez só.

## Questão 7 – Polimorfismo

Polimorfismo ("muitas formas") é quando a mesma chamada de método faz coisas diferentes dependendo do objeto. Uma variável do tipo da superclasse guarda um objeto da subclasse, e na hora de rodar o Java executa a versão do objeto real. Eu já usei isso nos mains das questões 4 e 5, e foi o que evitou repetição ali. Na questão 4 dava para ir além: criar um método getTaxa() na ContaCorrente retornando 1, deixar o sacar só na mãe com saldo -= valor + getTaxa(), e a ContaEspecial só sobrescreveria o getTaxa() para retornar 0.5f. Assim o sacar não ficaria duplicado. Na questão 5, os construtores repetidos não têm como sair, porque construtor não é herdado em Java, mas o imprimirResultado() já foi escrito uma vez só e funciona para as quatro operações graças ao polimorfismo.
