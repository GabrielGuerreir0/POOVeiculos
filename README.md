# Projeto de Descrição de Veículos

## Descrição do Projeto

Este projeto em Java foi desenvolvido para modelar e descrever veículos, especificamente carros e motos. O programa permite criar instâncias de carros e motos, definir suas características e exibir suas descrições.

## Estrutura do Projeto

O projeto está organizado em três classes principais dentro do pacote `descriçãoveiculo`:

### Classe `Carro`

A classe `Carro` representa um carro e contém os seguintes atributos e métodos:

- **Atributos:**
  - `marca` (String): A marca do carro.
  - `modelo` (String): O modelo do carro.
  - `cor` (String): A cor do carro.
  - `ano` (int): O ano de fabricação do carro.
  - `numero_portas` (int): O número de portas do carro.

- **Métodos:**
  - `public void CarroDesc(String mar, String mod, int fab, String co, int np)`: Define os atributos do carro.
  - `public void Descricao()`: Exibe a descrição do carro.

### Classe `Moto`

A classe `Moto` representa uma moto e contém os seguintes atributos e métodos:

- **Atributos:**
  - `marca` (String): A marca da moto.
  - `modelo` (String): O modelo da moto.
  - `cor` (String): A cor da moto.
  - `ano` (int): O ano de fabricação da moto.
  - `cilindradas` (int): A cilindrada da moto.

- **Métodos:**
  - `public void MotoDesc(String mar, String mod, int fab, String co, int cilin)`: Define os atributos da moto.
  - `public void Descricao()`: Exibe a descrição da moto.

### Classe `Principal`

A classe `Principal` contém o método `main` e é responsável por criar instâncias das classes `Carro` e `Moto`, definir suas características e exibir suas descrições.

## Requisitos

- JDK 8 ou superior
- IDE de sua escolha (Eclipse, IntelliJ, NetBeans, etc.)

## Como Executar o Projeto

1. Clone este repositório para sua máquina local:
    ```bash
    git clone https://github.com/seu-usuario/projeto-descricao-veiculos.git
    ```

2. Abra o projeto em sua IDE de preferência.

3. Compile e execute a classe `Principal` para ver o projeto em ação.

## Exemplo de Uso

A classe `Principal` demonstra a criação de objetos `Carro` e `Moto`, bem como a exibição das informações desses objetos. Aqui está um exemplo de como o código pode ser utilizado:

```java
package descriçãoveiculo;

public class Principal {

    public static void main(String[] args) {
        Carro c = new Carro();
        Moto m = new Moto();
        c.CarroDesc("Toyota", "Corolla", 2020, "preto", 4);
        m.MotoDesc("Honda", "CBR500R", 2021, "Vermelho", 500);
        c.Descricao();
        m.Descricao();
    }
}
