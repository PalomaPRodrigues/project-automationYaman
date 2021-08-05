$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/cadastro.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#encoding: UTF-8"
    },
    {
      "line": 3,
      "value": "#Author: Paloma Pedro Rodrigues"
    },
    {
      "line": 4,
      "value": "#date:02/08/2021"
    },
    {
      "line": 5,
      "value": "#version: 1.0"
    }
  ],
  "line": 7,
  "name": "",
  "description": "Como usuario do site Brilhoso\nQuero me cadastrar\nPara realizar compras",
  "id": "",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Cadastro com sucesso",
  "description": "",
  "id": ";cadastro-com-sucesso",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 13,
  "name": "que estou na pagina home do site",
  "keyword": "Dado "
});
formatter.step({
  "line": 14,
  "name": "seleciono cadastre se",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "preencho e-mail \"\u003cemail\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "seleciono tipo de cadastro \"\u003ctipoCadastro\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "preencho cpf \"\u003ccpf\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "seleciono Uf \"\u003cuf\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "preencho rg \"\u003crg\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "preencho nome \"\u003cnome\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "preencho sobrenome \"\u003csobrenome\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "preencho data de nascimento \"\u003cdataNascimento\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "seleciono genero \"\u003cgenero\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "clico em receber ofertas",
  "keyword": "E "
});
formatter.step({
  "line": 25,
  "name": "preencho senha \"\u003csenha\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 26,
  "name": "preencho confirmar senha \"\u003cconfirmarSenha\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 27,
  "name": "clico enviar",
  "keyword": "Quando "
});
formatter.step({
  "line": 28,
  "name": "valido cadastro com sucesso",
  "keyword": "Entao "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": ";cadastro-com-sucesso;",
  "rows": [
    {
      "cells": [
        "email",
        "tipoCadastro",
        "cpf",
        "uf",
        "rg",
        "nome",
        "sobrenome",
        "dataNascimento",
        "genero",
        "senha",
        "confirmarSenha"
      ],
      "line": 32,
      "id": ";cadastro-com-sucesso;;1"
    },
    {
      "cells": [
        "paloma.gpedro@gmail.com",
        "Pessoa física",
        "12345678910",
        "SP",
        "123456789",
        "Paloma",
        "Pedro",
        "22/07/1994",
        "Feminino",
        "pwd123",
        "pwd123"
      ],
      "line": 33,
      "id": ";cadastro-com-sucesso;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 296200,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Cadastro com sucesso",
  "description": "",
  "id": ";cadastro-com-sucesso;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 13,
  "name": "que estou na pagina home do site",
  "keyword": "Dado "
});
formatter.step({
  "line": 14,
  "name": "seleciono cadastre se",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "preencho e-mail \"paloma.gpedro@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "seleciono tipo de cadastro \"Pessoa física\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "preencho cpf \"12345678910\"",
  "matchedColumns": [
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "seleciono Uf \"SP\"",
  "matchedColumns": [
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "preencho rg \"123456789\"",
  "matchedColumns": [
    4
  ],
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "preencho nome \"Paloma\"",
  "matchedColumns": [
    5
  ],
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "preencho sobrenome \"Pedro\"",
  "matchedColumns": [
    6
  ],
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "preencho data de nascimento \"22/07/1994\"",
  "matchedColumns": [
    7
  ],
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "seleciono genero \"Feminino\"",
  "matchedColumns": [
    8
  ],
  "keyword": "E "
});
formatter.step({
  "line": 24,
  "name": "clico em receber ofertas",
  "keyword": "E "
});
formatter.step({
  "line": 25,
  "name": "preencho senha \"pwd123\"",
  "matchedColumns": [
    9
  ],
  "keyword": "E "
});
formatter.step({
  "line": 26,
  "name": "preencho confirmar senha \"pwd123\"",
  "matchedColumns": [
    10
  ],
  "keyword": "E "
});
formatter.step({
  "line": 27,
  "name": "clico enviar",
  "keyword": "Quando "
});
formatter.step({
  "line": 28,
  "name": "valido cadastro com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastroStep.queEstouNaPaginaHomeDoSite()"
});
formatter.result({
  "duration": 4702281499,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStep.selecionoCadastreSe()"
});
formatter.result({
  "duration": 1871846500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "paloma.gpedro@gmail.com",
      "offset": 17
    }
  ],
  "location": "CadastroStep.preenchoEMail(String)"
});
formatter.result({
  "duration": 621917801,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pessoa física",
      "offset": 28
    }
  ],
  "location": "CadastroStep.selecionoTipoDeCadastro(String)"
});
formatter.result({
  "duration": 607759600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345678910",
      "offset": 14
    }
  ],
  "location": "CadastroStep.preenchoCpf(String)"
});
formatter.result({
  "duration": 904556900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SP",
      "offset": 14
    }
  ],
  "location": "CadastroStep.selecionoEstadoDoRg(String)"
});
formatter.result({
  "duration": 94300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789",
      "offset": 13
    }
  ],
  "location": "CadastroStep.preenchoRg(String)"
});
formatter.result({
  "duration": 620068100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Paloma",
      "offset": 15
    }
  ],
  "location": "CadastroStep.preenchoNome(String)"
});
formatter.result({
  "duration": 607261300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pedro",
      "offset": 20
    }
  ],
  "location": "CadastroStep.preenchoSobrenome(String)"
});
formatter.result({
  "duration": 600944701,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "22/07/1994",
      "offset": 29
    }
  ],
  "location": "CadastroStep.preenchoDataDeNascimento(String)"
});
formatter.result({
  "duration": 606430800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Feminino",
      "offset": 18
    }
  ],
  "location": "CadastroStep.selecionoGenero(String)"
});
formatter.result({
  "duration": 73500,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStep.clicoEmReceberOfertas()"
});
formatter.result({
  "duration": 24700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pwd123",
      "offset": 16
    }
  ],
  "location": "CadastroStep.preenchoSenha(String)"
});
formatter.result({
  "duration": 73700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pwd123",
      "offset": 26
    }
  ],
  "location": "CadastroStep.preenchoConfirmarSenha(String)"
});
formatter.result({
  "duration": 90501,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStep.clicoEnviar()"
});
formatter.result({
  "duration": 18700,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStep.validoCadastroComSucesso()"
});
formatter.result({
  "duration": 17900,
  "status": "passed"
});
formatter.after({
  "duration": 938126000,
  "status": "passed"
});
});