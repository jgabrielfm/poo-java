# ☕ POO em Java

Exercícios de **Programação Orientada a Objetos** feitos na faculdade, organizados por lista.

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)

## Listas

| Lista | Projeto | Conceitos praticados |
|---|---|---|
| [08](lista-08-domino) | 🁫 **Dominó**: modelagem das peças, embaralhamento e dois modos de jogo no terminal | Encapsulamento, validação em setters, `equals`/`toString`, arrays de objetos, métodos estáticos |
| [09](lista-09-forca) | 🔤 **Jogo da Forca**: dicionário lido de arquivo, sorteio de palavras e pontuação | Encapsulamento, composição, leitura de arquivo com `Scanner`, manipulação de `String` |
| [10](lista-10-heranca) | 🧬 **Herança**: chatbots, contas bancárias, calculadora e hierarquia de veículos | Herança, classes abstratas, `protected`, polimorfismo, padrão **Template Method** |
| [11](lista-11-padroes-de-projeto) | 🧩 **Padrões de projeto**: batalha de exércitos, home theater, POOkemon e diagrama do Snake | Polimorfismo, interfaces, `List`, padrões **Chain of Responsibility** e **Strategy**, UML |

## Como executar

Cada lista (e, nas listas 10 e 11, cada questão) fica numa pasta própria, compilada separadamente. O README de cada lista explica os detalhes.

```bash
cd lista-08-domino
javac *.java
java Unomino      # modo solo
java Classico     # modo 2 jogadores
```

```bash
cd lista-11-padroes-de-projeto/questao-1-2-exercitos
javac *.java
java Jogo
```
