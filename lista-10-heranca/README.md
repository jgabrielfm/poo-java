# 🧬 Lista 10 · Herança, Classes Abstratas e Template Method

Três programas sobre herança em Java, mais a modelagem de uma hierarquia de veículos e respostas teóricas sobre herança e polimorfismo.

## Conteúdo

| Pasta / arquivo | O que tem |
|---|---|
| [`q3-chatbot`](q3-chatbot) | Dois chatbots de atendimento (Tim e Netflix) refatorados com o padrão **Template Method** |
| [`q4-conta-corrente`](q4-conta-corrente) | Conta corrente e conta especial com taxas de saque diferentes |
| [`q5-operacao-matematica`](q5-operacao-matematica) | Calculadora com uma superclasse abstrata e uma subclasse por operação |
| [`hierarquia-veiculos.md`](hierarquia-veiculos.md) | Árvore de herança dos veículos (Questão 2) |
| [`respostas.md`](respostas.md) | Respostas teóricas (Questões 1, 3, 6 e 7) |

## Classes

**Q3 · ChatBot (Template Method)**

| Classe | Responsabilidade |
|---|---|
| `ChatBot` | Superclasse abstrata. Faz a saudação e a apresentação e fixa a sequência do atendimento em `iniciarAtendimento()`, que é `final`. |
| `ChatBotTim` | Identifica o cliente pelo telefone e mostra o menu da Tim. |
| `ChatBotNetflix` | Pede email e senha e mostra a lista de programas. |

**Q4 · Conta corrente**

| Classe | Responsabilidade |
|---|---|
| `ContaCorrente` | Titular, número e saldo. Deposita e saca com taxa de R$ 1,00. |
| `ContaEspecial` | Sobrescreve o saque com taxa de R$ 0,50. |
| `Main` | Lê tipo de conta, saldo inicial, titular e valor do saque, e mostra o novo saldo. |

**Q5 · Operação matemática**

| Classe | Responsabilidade |
|---|---|
| `OperacaoMatematica` | Superclasse abstrata com os dois operandos. `retornarResultado()` é abstrato e `imprimirResultado()` é concreto. |
| `Somar`, `Subtrair`, `Multiplicar`, `Dividir` | Cada uma implementa o cálculo da sua operação. |
| `Main` | Lê o nome da operação por extenso e dois números, e imprime o resultado. |

## Conceitos praticados

Herança e relação "é um" · classes e métodos abstratos · `private`, `protected` e `public` · `super(...)` · sobrescrita · **Template Method** com `final` · polimorfismo · cast para `float` · operador ternário encadeado · `Scanner`

## Executar

Cada pasta é compilada separadamente (JDK 8+). A Q3 não tem `main`, porque o enunciado só pedia as classes.

```bash
cd q4-conta-corrente
javac *.java
java Main

cd ../q5-operacao-matematica
javac *.java
java Main
```

## Notas

Esta lista foi feita à mão. Para publicar, apliquei **apenas correções de compilação**, sem mudar a lógica:

- `ChatBotNetflix`: `Arraylist` → `ArrayList` e `()` que faltava em `getProgramas`
- `ContaCorrente`: chaves de fechamento do construtor e da classe
- `Main` da Q4: ordem dos argumentos do construtor `(titular, saldo, numero)`
- `OperacaoMatematica`: `()` em `getOperando1` e remoção de uma declaração duplicada de `imprimirResultado`
- Q5: criação da classe `Subtrair`, usada pelo `Main`

**Limitações conhecidas** (mantidas como no original):

- **Q4:** o titular é lido com `nextLine()` logo depois de um `nextFloat()`, então ele lê o Enter que sobrou e fica vazio. O saque também não confere o saldo disponível.
- **Q5:** a divisão por zero imprime `Infinity` ou `NaN`, e o nome da operação precisa ser digitado com acentos.

**O que eu faria diferente:** um método `getTaxa()` na `ContaCorrente` para não duplicar o `sacar` (veja a [Questão 7](respostas.md#questão-7--polimorfismo)) e um `main` de demonstração para a Q3.
