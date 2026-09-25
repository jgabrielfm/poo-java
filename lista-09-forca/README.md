# 🔤 Lista 09 · Jogo da Forca

Jogo da forca no terminal com palavras e dicas carregadas de um arquivo.

## Classes

| Classe | Responsabilidade |
|---|---|
| `Palavra` | Guarda a palavra e a dica. A palavra só pode ser definida na criação (setter privado). |
| `JogoDaForca` | Sorteia uma palavra do dicionário, mantém o gabarito (`??a??`), testa letras e remove do dicionário as palavras já acertadas. |
| `Forca` | Programa principal: lê `palavras.txt`, conduz as rodadas e calcula a pontuação (`2 × tamanho da palavra − erros`). |

## Formato do `palavras.txt`

Uma palavra por linha, no formato `palavra,dica` (até 10 palavras):

```
java,Linguagem de programação com uma xícara de café no logo
classe,Molde usado para criar objetos
```

## Executar

```bash
javac *.java
java Forca
```
