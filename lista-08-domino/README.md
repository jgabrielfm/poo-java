# 🁫 Lista 08 · Dominó

Modelagem de um jogo de dominó com orientação a objetos.

## Classes

| Classe | Responsabilidade |
|---|---|
| `Domino` | Representa uma peça. Os lados só aceitam valores de 0 a 6 (validação no setter). Sabe dizer se encaixa em outra peça (`validarJuncao`) e compara peças independente da ordem dos lados (`equals`). |
| `Jogo` | Cria as 28 peças, embaralha, entrega peças (`puxarPeca`) e controla as pontas da mesa (`conectarPontaEsquerda` / `conectarPontaDireita`). |
| `Unomino` | **Modo solo:** o jogador tem 6 peças e precisa encaixar cada uma na peça da vez. Faz 6 pontos para vencer. |
| `Classico` | **Desafio, 2 jogadores:** cada um joga na ponta esquerda ou direita; quem não conseguir encaixar perde e quem esvaziar a mão primeiro vence. |

## Executar

```bash
javac *.java
java Unomino
java Classico
```
