# Calculadora Simples em Java

Este projeto é uma implementação de uma calculadora básica em Java que permite realizar operações aritméticas como adição, subtração, multiplicação e divisão.

## Funcionalidades

- Adição (+)
- Subtração (-)
- Multiplicação (*)
- Divisão (/), com verificação para divisão por zero.

## Como Usar

1. Ao executar o programa, siga os seguintes passos:
   - Digite o primeiro número.
   - Digite o operador desejado (+, -, *, /).
   - Digite o segundo número.

2. O programa realizará a operação e exibirá o resultado.

### Exemplo

Digite o primeiro número: 10  
Digite a operação (+, -, *, /): *  
Digite o segundo número: 5  
Resultado: 10.0 * 5.0: 50.0

### Tratamento de Erros

- Caso o usuário tente dividir por zero, o programa exibirá a mensagem:  
  **"Não é possível dividir um número por zero"**.
  
- Se um operador inválido for inserido, o programa exibirá:  
  **"Operação Inválida"**.

## Requisitos

- Java JDK 8 ou superior.

## Como Executar

1. Compile o arquivo Java com o seguinte comando:

```bash
javac Main.java
```

2. Execute o programa:

```bash
java Main
```
