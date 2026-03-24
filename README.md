# registrador-projeto-nuvem

# Documentação

## Uma breve descrição da aplicação web e back-end desenvolvidas pelo grupo.
Este projeto é uma aplicação desenvolvida para o registro e consulta de camisas de seleções nacionais de futebol. 
O objetivo principal do projeto é demonstrar o processo completo de deploy em ambiente de nuvem, utilizando:

- Containers Docker
- Docker Compose
- Máquina Virtual (VM)
- Configuração de VPC e regras de segurança

O sistema possui um frontend web e um backend API, ambos containerizados e executados em ambiente de nuvem.

## Os Dockerfiles utilizado e uma explicação do processo de criação do container Docker.
### Dockerfile Backend
<img width="420" height="288" alt="image" src="https://github.com/user-attachments/assets/75e405d7-d128-47ed-875f-b1d09ae59ce6" />
Este Dockerfile é responsável por criar a imagem do backend Java.

Etapas realizadas:

1. Utiliza uma imagem base Java.
2. Copia os arquivos do projeto.
3. Compila a aplicação.
4. Expõe a porta do backend.
5. Executa a aplicação na porta 25000.


### Dockerfile Frontend
<img width="363" height="334" alt="image" src="https://github.com/user-attachments/assets/af3f1ac9-5683-4525-9f61-228e975c0c32" />
Este Dockerfile cria a imagem do frontend React.

Etapas realizadas:

1. Utiliza imagem Node.js.
2. Instala dependências.
3. Realiza build da aplicação.
4. Executa a aplicação na porta 8080.


### Docker compose
<img width="313" height="285" alt="image" src="https://github.com/user-attachments/assets/5e925963-dc0e-4f9f-b364-fb2f88b394e1" />
O Docker Compose foi utilizado para subir backend e frontend simultaneamente.


## Instância de VM, a VPC e as regras de segurança.
A VM foi crida via Learner lab da AWS, é uma maquina linux micro T3, onde foi instalado o docker e docker compose, também foi atribuido um IP elastico para reduzir trabalho na hora de rodar a aplicação.
Configuramos 2 portas (8080 e 25000) do protocolo TCP, uma para backend e outra para o frontend.

conectando na VM
<img width="1259" height="323" alt="image" src="https://github.com/user-attachments/assets/c7507a9e-01ad-409b-bc61-1888c27ec745" />

Aplicação iniciada
<img width="1464" height="147" alt="image" src="https://github.com/user-attachments/assets/e63ac344-c1b4-4673-866d-e6a21bdeb006" />

Aplicação rodando na porta 8080
<img width="1706" height="1076" alt="image" src="https://github.com/user-attachments/assets/e8e36262-bb3f-4fe4-93a6-c5e35f75ab68" />

## Uma discussão sobre quaisquer desafios encontrados durante o projeto e como foram superados.
Inicialmente tivemos dificuldade para instalar o docker compose, foi necessario atualizar algumas peças do sistam como o buildx. 
Também tivemos dificuldade etendendo a configuração das portas para configuração do front e back separados, isso foi resolvido com algumas buscas na web.

## Um vídeo de até 3 minutos mostrando a configuração e seu funcionamento.
