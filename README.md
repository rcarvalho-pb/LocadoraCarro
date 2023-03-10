## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

Project:

Criar uma aplicação que gerencie o aluguel de veículos, onde cada item abaixo seja considerado:

Itens obrigatórios
Cadastrar os veículos;
Alterar um veículo cadastrado;
Buscar um veículo por parte do nome;
Cadastrar a agência onde o veículo será alugado/devolvido;
Alterar a agência onde o veículo será alugado/devolvido;
Buscar uma agência por parte do nome ou do logradouro do endereço;
Cadastrar o cliente (pessoa fisica/juridica)
Alterar o cliente (pessoa fisica/juridica)
Alugar um veículo para pessoa fisica;
Alugar um veículo para pessoa juridica;
Devolver um veículo para pessoa fisica;
Devolver um veículo para pessoa juridica;
Gerar um comprovante com todos os dados do aluguel (aberto para o grupo decidir o que vai ser demonstrado);
Gerar um comprovante com todos os dados da devolução (aberto para o grupo decidir o que vai ser demonstrado);
Itens bônus
Paginar as listas envolvidas;
Os dados deverão ser gravados em arquivos, simulando uma base de dados;
Regras de negócio
RN1: Os veículos não podem ser repetidos;
RN2: Tipos de veículos que serão considerados: Carro, Moto, Caminhões;
RN3: Os aluguéis e devoluções terão o local, data e horario;
RN4: Os veículos que estiverem alugados não poderão estar disponíveis;
RN5: Agências não podem estar duplicadas;
RN6: Clientes não podem estar duplicados;
RN7: Regras de devolução:
Caso pessoa fisica tenha ficado com o carro mais que 5 dias terá direito a 5% de desconto.
Caso pessoa juridica tenha ficado com o carro mais que 3 dias terá direito a 10% de desconto.
Valores base da diária por tipo de veículo:

Tipo de Veículo	Valor por dia
Moto	R$ 100,00
Carro	R$ 150,00
Caminhão	R$ 200,00

