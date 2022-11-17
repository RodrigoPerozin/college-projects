algoritmo "LE7"
// função : Pré-requisito: LE3. Aplique no resultado obtido a Fórmula de
//          Bhaskara e mostre o valor de x1e x2. Lembrando que: x=-b2a
// Autor :
// Data : 20/03/2019
var
Avalor, Bvalor, Cvalor : inteiro
x1, x2 : real
delta : inteiro
inicio
escreva("insira o valor de A : ")
leia(Avalor)
escreva("insira o valor de B : ")
leia(Bvalor)
escreva("insira o valor de C : ")
leia(Cvalor)
delta <- Bvalor * Bvalor - 4 * Avalor * Cvalor
x1 <- Bvalor * (-1) + RaizQ (delta) / 2 * Avalor
x2 <- Bvalor * (-1) - RaizQ (delta) / 2 * Avalor
limpatela
escreval("o valor de x1 é : ", x1)
escreval("o valor de x1 é : ", x2)
fimalgoritmo
