# Hierarquia de veículos (Questão 2)

Classes marcadas com <abstract> não podem ser instanciadas.
Carro, Barco e Submarino foram criadas para organizar a hierarquia.

```
<abstract> Veiculo
├── <abstract> VeiculoTerrestre
│   └── <abstract> Carro
│       ├── CarroDeFormula1
│       └── <abstract> CarroDesportivo
│           └── <abstract> Ferrari
│               └── FerrariF430
├── <abstract> VeiculoAquatico
│   ├── <abstract> Barco
│   │   ├── BarcoARemos
│   │   ├── Veleiro
│   │   ├── Ferry
│   │   └── BarcoDeCruzeiro
│   └── <abstract> Submarino
│       ├── SubmarinoNuclear
│       └── SubmarinoNaoPilotado
├── <abstract> VeiculoAereo
│   ├── <abstract> Aviao
│   │   ├── F16
│   │   ├── AirbusA380
│   │   └── Boeing757
│   └── Balao
└── EspacoNave
```

A EspacoNave fica ligada direto a Veiculo porque não é terrestre, nem aquática,
nem aérea (no espaço não há ar).
