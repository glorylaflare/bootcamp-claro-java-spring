# 💵 Projeto - Banco Digital

Projeto desenvolvido na aula de "Criando um Banco Digital com Java e OO", sendo esse um projeto simples de um Banco Digital, utilizando regras de POO, como, abstração, encapsulamento, herança e polimorfismo. Além disso, o foi passado um desafio para implementação do código, adicionando novas funcionalidades para deixar o seu banco mais funcional.

## Algumas melhorias adicionada

- No geral, como recomendado, o projeto teve a adição do Lombok através do Maven Repository.

### Na classe Banco
- Foi adicionado os metodos de adição, busca e remoção de Clientes e Conta, além de um sistema simples de autenticação.
- Também alterei a metodologia utilizada, no projeto base era usado um List, e eu alterei para um HaspMap.
- Além da adição da interface Banco, seguindo os padrões da classe Conta.
  
### Na classe Cliente
- Foi adicionado um sistema mais robusto de criação de cliente, agora utilizando id, nome, endereço, telefone, email e senha. Id esse gerado através de um randomUUID().
- Criado os métodos de atualização de endereço, telefone e email. Com suas respectivas exceptions. Além dos métodos de adição e listagem de contas de um determinado cliente.
- Adição da interface Cliente, seguindo os padrões da classe Conta.

### Na classe Conta
- Foi adicionado algumas verificações de saldo e valor nos métodos sacar() e depoistar(), aplicando também uma taxa para saque e depósitos.

### Na classe ContaPoupança
- Foi adicionado o método de renderJuros(), que verifica o seu salto atual, aplicando a taxa de juros padrão.

## Tecnologias

![Skills](https://skillicons.dev/icons?i=java)