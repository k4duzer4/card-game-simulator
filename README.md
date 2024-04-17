# Simulador de Jogo de Cartas 🃏

Este projeto é um simulador simples de jogo de cartas desenvolvido em Java, projetado para obter nota na disciplina Paradigmas de Linguagem de Computação.

## Linguagem Java e Componentes Utilizados 🖥️

O projeto foi desenvolvido em Java, utilizando os seguintes componentes:

- **Classes e Objetos**: Conceitos de programação orientada a objetos são utilizados extensivamente, com classes representando `Card` (Carta), `Deck` (Baralho), `Hand` (Mão) e `Player` (Jogador), cada uma responsável por funcionalidades específicas dentro do jogo.

- **ArrayList**: A classe `ArrayList` do pacote `java.util` é usada para armazenar e manipular coleções de cartas no baralho e nas mãos dos jogadores.

- **Random**: A classe `Random` do pacote `java.util` é usada para gerar números aleatórios para embaralhar e selecionar cartas do baralho.

- **Manipulação de Strings**: Técnicas de manipulação de strings são usadas para representar os naipes e valores das cartas, bem como para construir representações de strings de cartas e mãos.

## Principais Recursos 🚀

O simulador de jogo de cartas inclui os seguintes recursos principais:

1. **Criação do Baralho**: A classe `Deck` é responsável por criar um baralho padrão de 52 cartas, composto por quatro naipes (Copas, Ouros, Paus, Espadas) e treze valores (2 a Ás).

2. **Sorteio Aleatório de Cartas**: A classe `Deck` permite que os jogadores tirem uma carta aleatória do baralho, garantindo que cada carta seja tirada apenas uma vez.

3. **Gerenciamento de Mão**: A classe `Hand` gerencia as cartas mantidas por cada jogador, permitindo que cartas sejam adicionadas e removidas da mão. O tamanho máximo da mão é personalizável.

4. **Inicialização do Jogador**: A classe `Player` inicializa um jogador com uma mão de cartas tiradas do baralho.

## Como Usar 📝

1. Compile o código-fonte em um ambiente de desenvolvimento Java.

2. Execute o programa resultante para iniciar o simulador de jogo de cartas.

3. O programa criará automaticamente dois jogadores e exibirá suas mãos de cartas tiradas do baralho.

4. Os jogadores podem visualizar suas mãos e participar do jogo com base nas regras do jogo de cartas sendo simulado.
