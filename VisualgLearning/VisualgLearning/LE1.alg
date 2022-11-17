algoritmo "LE1"
// função: Faça um programa simulando um cadastro de uma pessoa.
//         Os dados que devem ser cadastrados são: nome, sobrenome,
//         sexo, estado civil, telefone, e-mail, cidade, bairro, rua,
//         número da casa, complemento. Use os tipos de dados adequados
//         para cada dado e faça uma saída organizada por categorias.
// Autor : rodrigo_perozin
// Data : 18/03/2019
var
nome, sobrenome, sexo, estadoCivil, email, cidade, bairro, rua, apelido : caractere
telefone, numeroCasa : inteiro
inicio
escreval("Bom dia, vou fazer algumas perguntas.")
escreval("")
escreval("Qual seu nome? ")
leia(nome)
escreval("")
limpatela
escreval("Qual seu sobrenome? ")
leia(sobrenome)
escreval("")
limpatela
escreval("Qual o seu sexo? ")
leia(sexo)
escreval("")
limpatela
escreval("Qual seu estado Civil? ")
leia(estadoCivil)
escreval("")
limpatela
escreval("Qual o numero de telefone? ")
leia(telefone)
escreval("")
limpatela
escreval("Qual seu endereço de e-mail? ")
leia(email)
escreval("")
limpatela
escreval("em que cidade você mora? ")
leia(cidade)
escreval("")
limpatela
escreval("em que bairro você vive? ")
leia(bairro)
escreval("")
limpatela
escreval("Em que rua você mora? ")
leia(rua)
escreval("")
limpatela
escreval("Qual o numero da sua residencia? ")
leia(numeroCasa)
escreval("")
limpatela
escreval("Qual seu apelido? ")
leia(apelido)
escreval("")
limpatela
escreval("seus dados são: ")
escreval("seu nome é: ", nome, sobrenome, " mais conhecido como ", apelido)
escreval("seu sexo: ", sexo)
escreval("estado Civil: ", estadoCivil)
escreval("telefone: ", telefone)
escreval("e-mail: ", email)
escreval("local: ", cidade, " ", bairro, " ", rua, " ", "- ", numeroCasa)
escreval("")
escreva("obrigado", apelido)

fimalgoritmo
