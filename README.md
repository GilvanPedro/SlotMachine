# 🎰 SlotMachine

## Descrição do Projeto

O **SlotMachine** é uma implementação simples de um jogo de máquina caça-níqueis (Slot Machine) em **Java**, desenvolvido para ser executado via linha de comando (CLI). O objetivo do projeto é demonstrar a lógica básica de um jogo de azar, incluindo gerenciamento de saldo, apostas e cálculo de pagamentos com base em combinações aleatórias de símbolos.

O jogo utiliza os seguintes símbolos: 🍒 (Cereja), 🍎 (Maçã), 🍊 (Laranja), 🍁 (Folha de Bordo) e 💎 (Diamante).

## 🛠 Tecnologias Utilizadas

O projeto foi construído utilizando as seguintes tecnologias:

| Tecnologia | Versão | Propósito |
| :--- | :--- | :--- |
| **Java** | 17+ | Linguagem de programação principal. |
| **Maven** | 3.x | Ferramenta de automação de construção e gerenciamento de dependências. |

## ✨ Funcionalidades

*   **Sistema de Saldo:** O jogador começa com um saldo inicial de 100.
*   **Apostas:** Permite que o jogador insira o valor da aposta a cada rodada.
*   **Giro Aleatório:** Três símbolos são sorteados aleatoriamente a cada rodada.
*   **Cálculo de Pagamento:** O pagamento é calculado com base nas seguintes regras:
    *   **Três Símbolos Iguais:** Grande prêmio.
    *   **Dois Símbolos Iguais:** Pequeno prêmio.
    *   **Três Símbolos Diferentes:** Perda da aposta.
*   **Interface CLI:** Interação simples e direta via console.

## ⚙ Pré-requisitos

Para executar este projeto, você precisará ter instalado:

*   **Java Development Kit (JDK)**: Versão 17 ou superior.
*   **Apache Maven**: Para construir e executar o projeto.

## 🚀 Instalação

Siga os passos abaixo para clonar o repositório e configurar o projeto:

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/GilvanPedro/SlotMachine.git
    cd SlotMachine/SlotMachine
    ```

2.  **Compile o projeto com Maven:**
    ```bash
    mvn clean install
    ```
    Este comando irá compilar o código e criar o arquivo JAR na pasta `target`.

## 🕹 Como Usar

Após a instalação, você pode executar o jogo diretamente a partir da linha de comando.

1.  **Execute o arquivo JAR:**
    ```bash
    java -jar target/SlotMachine-1.0-SNAPSHOT.jar
    ```
    *Nota: O nome do arquivo JAR pode variar ligeiramente dependendo da versão do projeto.*

2.  **Interação no Console:**
    O jogo solicitará o valor da sua aposta e, em seguida, exibirá o resultado do giro. Você pode continuar jogando enquanto tiver saldo.

## 📄 Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.

## 🧑‍💻 Autor

Este projeto foi desenvolvido por [Gilvan Pedro](https://github.com/GilvanPedro).
