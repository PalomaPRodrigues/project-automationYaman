#language: pt
#encoding: UTF-8
#Author: Paloma Pedro Rodrigues
#date:02/08/2021
#version: 1.0

Funcionalidade:
Como usuario do site Brilhoso
Quero me cadastrar
Para realizar compras

Esquema do Cenario: Cadastro com sucesso
Dado que estou na pagina home do site
E seleciono cadastre se
E preencho e-mail "<email>"
E seleciono tipo de cadastro "<tipoCadastro>"
E preencho cpf "<cpf>"
E seleciono Uf "<uf>"
E preencho rg "<rg>"
E preencho nome "<nome>"
E preencho sobrenome "<sobrenome>"
E preencho data de nascimento "<dataNascimento>"
E seleciono genero "<genero>"
E clico em receber ofertas
E preencho senha "<senha>"
E preencho confirmar senha "<confirmarSenha>"
Quando clico enviar
Entao valido cadastro com sucesso


Exemplos:
|email									|tipoCadastro |cpf        |uf        |rg       |nome  |sobrenome|dataNascimento|genero  |senha |confirmarSenha|
|paloma.gpedro@gmail.com|Pessoa física|12345678910|SP        |123456789|Paloma|Pedro    |22/07/1994    |Feminino|pwd123|pwd123        |
