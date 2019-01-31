# Java Playground

## Exercise 1:
Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes
regras:
- O primeiro número de C é o primeiro número de A;
- O segundo número de C é o primeiro número de B;
- O terceiro número de C é o segundo número de A;
- O quarto número de C é o segundo número de B;
Assim sucessivamente…
- Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante
dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.
- Caso C seja maior que 1.000.000, retornar -1
Desenvolva um algoritmo que atenda a todos os requisitos acima.


## Exercise 2:
Considerando a estrutura de uma árvore binária:
```
public class BinaryTree {
    int valor;
    BinaryTree left;
    BinaryTree right;
}
```
Desenvolva um método que dado um nó da árvore calcule a soma de todos os nós
subsequentes

## Exercise 3:  Verificador de cartão de crédito

Antes de enviar um cartão de crédito para um gateway de pagamento, é importante que façamos algumas validações sobre o número.

Uma verificação comum é realizar antecipadamente a validação do tipo de cartão com base nos dígitos iniciais e seu comprimento. Os principais padrões que validamos são os seguintes:

| Tipo de Cartão | começa com | Número Comprimento |
| -------------- | ---------- | ------------------ |
| AMEX           | 34 ou 37   | 15                 |
| Discover       | 6011       | 16                 |
| MasterCard     | 51-55      | 16                 |
| Visa           | 4          | 13 ou 16           |

Todos esses tipos de cartão podem ser validados pelo [algoritmo Luhn](http://en.wikipedia.org/wiki/Luhn_algorithm). As etapas de verificação são:

1. Tome uma sequência de números inteiros positivos e a inverta.
2. Começando pelo segundo número, dobre o valor de cada número de forma alternada (`"24145...` = `"28185...`).
3. Para dígitos maiores que 9 será necessário que some cada dígito (`"10", 1 + 0 = 1`) ou subtraia por 9 (`"10", 10 - 9 = 1`).
4. Some todos os números da sequência.
3. Se o total for múltiplo de 10, o número é válido.

Por exemplo, dado o número do cartão `4408 0412 3456 7893`:

| 4 | 4  | 0 | 8  | 0 | 4  | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 3 |
|---|----|---|----|---|----|---|---|---|---|---|---|---|---|---|---|
| 3 | 9  | 8 | 7  | 6 | 5  | 4 | 3 | 2 | 1 | 4 | 0 | 8 | 0 | 4 | 4 |
| 3 | 18 | 8 | 14 | 6 | 10 | 4 | 6 | 2 | 2 | 4 | 0 | 8 | 0 | 4 | 8 |
| 3 | 9  | 8 | 5  | 6 | 1  | 4 | 6 | 2 | 2 | 4 | 0 | 8 | 0 | 4 | 8 |

    3 + 9 + 8 + 5 + 6 + 1 + 4 + 6 + 2 + 2 + 4 + 0 + 8 + 0 + 4 + 8 = 70
    70 % 10 == 0

Este cartão é `VÁLIDO`.

Vamos tentar mais uma, `4417 1234 5678 9112`:

| 4 | 4 | 1 | 7  | 1 | 2  | 3 | 4  | 5 | 6 | 7 | 8 | 9 | 1 | 1 | 2 |
|---|---|---|----|---|----|---|----|---|---|---|---|---|---|---|---|
| 2 | 1 | 1 | 9  | 8 | 7  | 6 | 5  | 4 | 3 | 2 | 1 | 7 | 1 | 4 | 4 |
| 2 | 2 | 1 | 18 | 8 | 14 | 6 | 10 | 4 | 6 | 2 | 2 | 7 | 2 | 4 | 8 |
| 2 | 2 | 1 | 9  | 8 | 5  | 6 | 1  | 4 | 6 | 2 | 2 | 7 | 2 | 4 | 8 |

    2 + 2 + 1 + 9 + 8 + 5 + 6 + 1 + 4 + 6 + 2 + 2 + 7 + 2 + 4 + 8 = 69
    69 % 10 != 0

Este cartão é `INVÁLIDO`.

Seu objetivo é escrever um programa em C# que valide números de cartão de crédito. Quando o usuário informar um número de cartão, o programa deverá imprimir a resposta no seguinte formato `"TIPO: NÚMEROS (válido/inválido)"`.

Para os seguintes cartões de crédito:

    4111111111111111
    4111111111111
    4012888888881881
    378282246310005
    6011111111111117
    5105105105105100
    5105 1051 0510 5106
    9111111111111111

Espera-se o seguinte resultado:

    VISA: 4111111111111111 (válido)
    VISA: 4111111111111 (inválido)
    VISA: 4012888888881881 (válido)
    AMEX: 378282246310005 (válido)
    Discover: 6011111111111117 (válido)
    MasterCard: 5105105105105100 (válido)
    MasterCard: 5105105105105106 (inválido)
    Desconhecido: 9111111111111111 (inválido)
