<h1 align="center">
    <a>Back para App com jogos, títulos e campeonatos Brasileiros</a>
</h1>
<p>
Criação de API utilizando o site https://www.api-futebol.com.br/ <br>
Projeto criado para Mentoria dentro da IBM com o mentor Leonardo Machado</p>
 <br>
<p align="center">
 <a href="#-como-executar-o-projeto">Como Executar</a> • 
 <a href="#-como-rodar-testes">Como Testar</a> • 
 <a href="#tecnologias">Tecnologias</a> • 
 <a href="#autor">Autor</a> •
 <a href="#licenc-a">Licença</a> • 
</p>
<br>
<h4 align="center"> 
	🚧 Aplicação Em construção... 🚧
</h4>

---

## Como executar o projeto

Este projeto tem apenas uma parte até o momento:
1. Backend;

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [Java](https://www.java.com/pt-BR/download/manual.jsp) versão 17.0.3.1, [Spring Boot](https://spring.io/projects/spring-boot) versão 2.7.1 <br>
Além disto é bom ter um editor para trabalhar com o código como [VSCode](https://code.visualstudio.com/)

#### Rodando o Backend (servidor)

```bash
# Clone este repositório
$ git clone https://github.ibm.com/amandalopesct/api-fut-mentoria.git
# Acesse a pasta do projeto no terminal/cmd
$ cd api-fut-mentoria
# Instale as dependências
$ mvn install
# Execute a aplicação
$ mvn spring-boot:run 
# O servidor inciará na porta:8080 - acesse http://localhost:8080
```
---
#### Rodando o Docker
```bash
# Build do docker
$ docker build -t <namedoconteiner> . 
# Run no docker na porta 8080
$ docker run -p 8080:8080 -t <namedoconteiner>
# Docker rodando na porta 8080
```
---

## Como rodar testes
Antes de começar, você vai precisar ter instalado em sua máquina ou em sua IDE alguma ferramenta para testes de API, assim como:
[Thunder Client](https://www.thunderclient.com/)

Feito isso é necessário utilizar as collections para teste, existe já dentro do projeto: [Collections existente](https://github.ibm.com/amandalopesct/api-fut-mentoria/blob/master/thunder-collection_API-Test.json)

---

## Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:
-   **[Java](https://www.java.com/pt-BR/download/manual.jsp)**
-   **[Spring Boot](https://spring.io/projects/spring-boot)**

---

## Autor

<a href="https://www.linkedin.com/in/amanda-lopes-522576191/">
 <b>Amanda Lopes Costa</b></a>
 <sub>Test Specialist at IBM</sub>
 <br />

---

## Licença

Este projeto esta sobe a licença [MIT](./LICENSE).

Feito por Amanda Lopes Costa 👩‍💻 [Entre em contato!](https://www.linkedin.com/in/amanda-lopes-522576191/)
