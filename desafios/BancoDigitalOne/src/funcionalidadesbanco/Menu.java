package funcionalidadesbanco;

import dadosclientes.Cliente;
import dadosclientes.Endereco;
import funcionalidadesAuxiliares.Instanciacao;
import funcionalidadesAuxiliares.Validacao;
import java.util.*;

public class Menu implements MenuInterface {
    //Realiza a validacao das entradas e opcoes selecionadas
    Validacao validacao = new Validacao();

    @Override
    public Cliente iniciarCadastro(List<Cliente> c, Menu menu, String linha) {
        int id = c.size() + 1; //Gerando id automatico para identificar a mesma pessoa

        //Informa as opcoes de conta a serem impressa na tela
        String mensagem = "1 - Abrir conta corrente\n2 - Abrir conta poupanca\n\nR";
        //Valida a entrada de dados e a opcao escolhida, e os armazena
        int opcao = validacao.selecionarOpcao(mensagem, validacao, 1, 2);

        //Abrindo conta
        if (opcao == 1) {
            System.out.println(linha+"\nNOVA CONTA CORRENTE\n\nPor favor, preencha as seguintes informacoes.");
        } else {
            System.out.println(linha+"\nNOVA CONTA POUPANCA\n\nPor favor, preencha as seguintes informacoes.");
        }
        Cliente c1 = menu.abrirConta(opcao, id);

        return c1;
    }

    @Override
    public Cliente abrirConta(int opcao, int id) {
        //Armazena quais dados devem ser informados como entrada
        String[] informacoes = {"Nome","Idade","CPF","Email","Salario","Rua","Numero","Bairro","Cidade","Estado"};

        Map<String, String> dados = new HashMap<>(); //Armazena os dados informados

        for (String info : informacoes) {
            //Verifica o tipo de dado da informacao pedida
            boolean inteiros = info.equals("Idade")|info.equals("Numero");
            boolean decimais = info.equals("Salario");

            if (inteiros) {
                int dado = validacao.lerInt(info); //Valida se a entrada foi do tipo inteiro
                dados.put(info, String.valueOf(dado));
            } else if (decimais) {
                Double dado = validacao.lerDouble(info); //Valida se a entrada foi do tipo decimal
                dados.put(info, String.valueOf(dado));
            } else {
                String dado = validacao.lerString(info);
                dados.put(info, dado);
            }
        }

        Instanciacao instanciacao = new Instanciacao(); //Auxilia no instanciamento dos objetos

        switch (opcao) { //Instanciando contas de acordo com a opcao de conta escolhida
            case 1: //Conta Corrente
                //Instanciando conta corrente e adcionando-a a lista de contas correntes
                ContaCorrente cc = new ContaCorrente(id);

                //Instanciando endereco e adcionando-o a lista de enderecos
                Endereco e1 = instanciacao.instanciarEndereco(dados, id);

                //Instanciando cliente e adcionando-o a lista de clientes
                Cliente c1 = instanciacao.instanciarCliente(dados, id, opcao, e1);
                c1.setContaCorrente(cc);
                c1.setTipoConta("Conta Corrente");
                return c1;
            case 2: //Conta Poupanca
                //Instanciando conta corrente e adcionando-a a lista de contas correntes
                ContaPoupanca cp = new ContaPoupanca(id);

                //Instanciando endereco e adcionando-o a lista de enderecos
                Endereco e2 = instanciacao.instanciarEndereco(dados, id);

                //Instanciando cliente e adcionando-o a lista de clientes
                Cliente c2 = instanciacao.instanciarCliente(dados, id, opcao, e2);
                c2.setContaPoupanca(cp);
                c2.setTipoConta("Conta Poupanca");
                return c2;
            default:
                System.out.println("Opcao invalida!");
                return null;
        }
    }

    @Override
    public Cliente entrarContaCorrente(Cliente c, String linha, Menu menu, List<Cliente> ls, int tipoConta) {
        //Mensagem com as opcoes de funcionalidades da conta a serem impressa na tela
        String mensagem = "\n1 - Depositar\n2 - Sacar\n3 - Transferir\n4 - Solicitar Emprestimo\n5 - Solicitar Cartao\n6 - Abrir Nova Conta\n7 - Ver Meus Dados\n8 - Ver Minhas Contas\n0 - Sair\n\nR";
        Cliente cliente = null; //Inicializando objeto

        while (true) {
            System.out.println(linha+"\nOLA, "+c.getNome().toUpperCase()+"! BEM VINDO(A) A SUA CONTA CORRENTE!");

            //Valida a entrada de dados e a opcao escolhida, e os armazena
            int opcao = validacao.selecionarOpcao(mensagem, validacao, 0, 8);

            if (opcao != 0){
                System.out.println(linha);
                switch (opcao) {
                    case 1:
                        menu.realizarDeposito(c, tipoConta);
                        break;
                    case 2:
                        menu.realizarSaque(c, tipoConta);
                        break;
                    case 3:
                        menu.realizarTransferencia(c, ls, tipoConta);
                        break;
                    case 4:
                        menu.solicitarEmprestimo(c, linha);
                        break;
                    case 5:
                        menu.solicitarCartao(c, linha);
                        break;
                    case 6:
                        ls = menu.abirNovaConta(ls, menu, linha);
                        break;
                    case 7:
                        menu.verMeusDados(c, linha, tipoConta);
                        break;
                    case 8:
                        cliente = menu.verMinhasContas(ls, menu, linha); //Armazena o retorno

                        //Caso o retorno nao seja nulo, siginifica que ha outra conta para entrar
                        //A opcao de encerramento do laco e ativada para finalizar execucao atual
                        if (cliente != null) {
                           opcao = 0;
                        }
                        break;
                }
            }

            if (opcao == 0){
                //Ocorre quando o laco e finalizado pelo metodo capaz de alterar de conta
                //A conta e retornada ao metodo principal para que ele entre nela

                if (cliente != null) {
                    return cliente;
                } else {
                    menu.encerrarPrograma(linha);
                    return null;
                }
            }
        }
    }

    @Override
    public Cliente entrarContaPoupanca(Cliente c, String linha, Menu menu, List<Cliente> ls, int tipoConta) {
        //Mensagem com as opcoes de funcionalidades da conta a serem impressa na tela
        String mensagem = "\n1 - Depositar\n2 - Sacar\n3 - Transferir\n4 - Abrir Nova Conta\n5 - Ver Rendimento Mensal\n6 - Ver Meus Dados\n7 - Ver Minhas Contas\n0 - Sair\n\nR";
        Cliente cliente = null; //Inicializando objeto

        while (true) {
            System.out.println(linha+"\nOLA, "+c.getNome().toUpperCase()+"! BEM VINDO(A) A SUA CONTA POUPANCA!");

            //Valida a entrada de dados e a opcao escolhida, e os armazena
            int opcao = validacao.selecionarOpcao(mensagem, validacao, 0, 7);

            if (opcao != 0){
                System.out.println(linha);
                switch (opcao) {
                    case 1:
                        menu.realizarDeposito(c, tipoConta);
                        break;
                    case 2:
                        menu.realizarSaque(c, tipoConta);
                        break;
                    case 3:
                        menu.realizarTransferencia(c, ls, tipoConta);
                        break;
                    case 4:
                        ls = menu.abirNovaConta(ls, menu, linha);
                        break;
                    case 5:
                        menu.verRendimentoMental(c);
                        break;
                    case 6:
                        menu.verMeusDados(c, linha, tipoConta);
                        break;
                    case 7:
                        cliente = menu.verMinhasContas(ls, menu, linha); //Armazena o retorno

                        //Caso o retorno nao seja nulo, siginifica que ha outra conta para entrar
                        //A opcao de encerramento do laco e ativada para finalizar execucao atual
                        if (cliente != null) {
                            opcao = 0;
                        }
                        break;
                }
            }

            if (opcao == 0){
                //Ocorre quando o laco e finalizado pelo metodo capaz de alterar de conta
                //A conta e retornada ao metodo principal para que ele entre nela

                if (cliente != null) {
                    return cliente;
                } else {
                    menu.encerrarPrograma(linha);
                    return null;
                }
            }
        }
    }

    @Override
    public void realizarDeposito(Cliente c, int tipoConta) {
        //Valida se a entrada foi do tipo decimal e armazena o valor
        String mensagem = "REALIZAR DEPOSITO\n\nValor do deposito";
        double deposito = validacao.lerDouble(mensagem);

        if (tipoConta == 1) { //Realiza o deposito do valor informado de acordo com o tipo de conta
            c.getContaCorrente().depositar(deposito);

            System.out.println("Deposito de R$"+String.format("%.2f", deposito)+" realizado com sucesso!");
            c.getContaCorrente().verSaldo(); //Mostra  uma mensagem de sucesso e o saldo atual
        } else {
            c.getContaPoupanca().depositar(deposito);

            System.out.println("Deposito de R$"+String.format("%.2f", deposito)+" realizado com sucesso!");
            c.getContaPoupanca().verSaldo(); //Mostra  uma mensagem de sucesso e o saldo atual
        }
    }

    @Override
    public void realizarSaque(Cliente c, int tipoConta) {
        //Valida se a entrada foi do tipo decimal e armazena o valor
        String mensagem = "REALIZAR SAQUE\n\nValor do saque (maximo R$1000,00)";
        double saque = validacao.lerDouble(mensagem);

        int valorSaqueMaximo = 1000; //Delimita o valor maximo do saque

        if (tipoConta == 1) { //Realiza o saque de acordo com o tipo da conta
            if (saque > c.getContaCorrente().getSaldoDisponivel()) {
                //Verifica que o valor do saque e maior que o saldo disponivel
                System.out.println("Impossível realizar saque. Saldo indisponível!");
            } else if(saque > valorSaqueMaximo) {
                //Verifica que o valor do saque e maior que o valor maximo permitido
                System.out.println("Impossível realizar saque. Valor excede o permitido!");
            } else {
                //Realiza o saque
                c.getContaCorrente().sacar(saque);
                System.out.println("Saque de R$"+String.format("%.2f", saque)+" realizado com sucesso!");
                c.getContaCorrente().verSaldo(); //Mostra  uma mensagem de sucesso e o saldo atual
            }
        } else {
            if (saque > c.getContaPoupanca().getSaldoDisponivel()) {
                //Verifica que o valor do saque e maior que o saldo disponivel
                System.out.println("Impossível realizar saque. Saldo indisponível!");
            } else if(saque > valorSaqueMaximo) {
                //Verifica que o valor do saque e maior que o valor maximo permitido
                System.out.println("Impossível realizar saque. Valor excede o permitido!");
            } else {
                //Realiza o saque
                c.getContaPoupanca().sacar(saque);
                System.out.println("Saque de R$"+String.format("%.2f", saque)+" realizado com sucesso!");
                c.getContaPoupanca().verSaldo(); //Mostra  uma mensagem de sucesso e o saldo atual
            }
        }
    }

    @Override
    public void realizarTransferencia(Cliente c, List<Cliente> lc, int tipoConta) {
        //Valida se a entrada foi do tipo decimal e armazena o valor
        String mensagem = "REALIZAR TRANSFERENCIA\n\nValor da tranferencia (maximo R$1000,00)";
        double transferencia = validacao.lerDouble(mensagem);
        boolean saldoNegativo = false; //Declara se o saldo e negativo ou nao

        int valorTransferenciaMaxima = 1000; //Delimita o valor maximo da transferencia

        if (tipoConta == 1) {
            if (c.getContaCorrente().getSaldoDisponivel() < transferencia) {
                //Verifica se o valor da transferencia e maior que o saldo disponivel
                saldoNegativo = true; //O saldo negativo se torna verdade
                System.out.println("Impossível realizar transferencia. Saldo indisponível!");
            }
        } else if (tipoConta == 2) {
            if (c.getContaPoupanca().getSaldoDisponivel() < transferencia) {
                //Verifica se o valor da transferencia e maior que o saldo disponivel
                saldoNegativo = true; //O saldo negativo se torna verdade
                System.out.println("Impossível realizar transferencia. Saldo indisponível!");
            }
        }

        if (!saldoNegativo) { //Se nao houver saldo negativo
            if (transferencia > valorTransferenciaMaxima) {
                //Verifica que o valor da transferencia e maior que o valor permitido
                System.out.println("Impossível realizar transferencia. Valor excede o permitido!");

            } else if (lc.size() <= 1) { //Se nao houver mais contas armazenadas na lista, retorna falha
                System.out.println("Impossivel realizar transferencia! Conta inexistente.");

            } else {
                String mensagem2 = "Id da conta destinataria";
                int id = validacao.lerInt(mensagem2); //Armazena o id da conta para qual se deseja transferir
                Cliente cliente = null; //Armazena a conta solicitada para transferencia, se encontrada

                for (Cliente c1 : lc) { //Percorre a lista de contas, buscando a conta correspondetnte ao id informado
                    //Procura pela conta solicitada atraves do id
                    if (c1.getIdCliente() == id) cliente = c1;
                }
                if (cliente != null) {
                    if (cliente.getTipoConta().equals("Conta Corrente")) {
                        ContaCorrente destinatario = cliente.getContaCorrente();

                        if (tipoConta == 1) { //Transferencia de conta corrente para conta corrente
                            c.getContaCorrente().transferir(transferencia, destinatario); //Realiza a transferencia
                            imprimirMensagem(cliente, transferencia); //Mostra  uma mensagem de sucesso e o saldo atual
                            c.getContaCorrente().verSaldo();

                        } else if (tipoConta == 2) { //Transferencia de conta poupanca para conta corrente
                            c.getContaPoupanca().transferir(transferencia, destinatario); //Realiza a transferencia
                            imprimirMensagem(cliente, transferencia); //Mostra  uma mensagem de sucesso e o saldo atual
                            c.getContaPoupanca().verSaldo();
                        }
                    } else if (cliente.getTipoConta().equals("Conta Poupanca")) {
                        ContaPoupanca destinatario = cliente.getContaPoupanca(); //Se encontrada, armazena-a

                        if (tipoConta == 1) { //Transferencia de conta corrente para conta poupanca
                            c.getContaCorrente().transferir(transferencia, destinatario); //Realiza a transferencia
                            imprimirMensagem(cliente, transferencia); //Mostra  uma mensagem de sucesso e o saldo atual
                            c.getContaCorrente().verSaldo();

                        } else if (tipoConta == 2) { //Transferencia de conta poupanca para conta poupanca
                            c.getContaPoupanca().transferir(transferencia, destinatario); //Realiza a transferencia
                            imprimirMensagem(cliente, transferencia); //Mostra  uma mensagem de sucesso e o saldo atual
                            c.getContaPoupanca().verSaldo(); //Mostra  uma mensagem de sucesso e o saldo atual
                        }
                    }
                } else { //Retorna falha se o id informado nao bater com o de nenhuma conta listada
                    System.out.println("Impossivel realizar transferencia! Conta inexistente.");
                }
            }
        }
    }

    //Imprime mensagem de sucesso de transferencia no metodo de transferencia
    public void imprimirMensagem(Cliente cliente, double transferencia) {
        System.out.println("Transferencia de R$" + String.format("%.2f", transferencia) + " para "+cliente.getNome()+" realizada com sucesso!");
    }

    @Override
    public void solicitarEmprestimo(Cliente c, String linha) {
        /* Processa a possibilidade de realizar um emprestimo baseado no salario do individuo
         * 10% do salario deve ser pago ao banco por no maximo 6 anos (72 meses) para quitar a divida
         * A taxa de juros ao mes varia de acordo com o valor da parcela (0,01% do valor da parcela)
         */

        //Calcula o valor da parcela a ser paga ao banco mensalmente (10% do salario)
        double parcela = c.getSalario() * 0.1;
        //Calcula o valor maximo que o banco pode oferecer para emprestimo (10% do salario por 6 anos)
        double valorMaximo = parcela * 72;
        //Informa quanto o banco pode oferecer
        System.out.println("SOLICITAR EMPRESTIMO\n\nBaseado em sua renda, o banco pode oferecer ate no maximo R$"+String.format("%.2f",valorMaximo)+" para emprestimo.");

        String mensagem = "Informe o valor desejado.\n\nR";
        double emprestimo = validacao.lerDouble(mensagem);

        if (emprestimo > valorMaximo) {
            System.out.println("\nImpossivel conceder emprestimo. Valor solicitado excedido!");
        } else {
            //Processa a solicitacao e retorna uma proposta de emprestimo
            c.getContaCorrente().solicitarEmprestimo(emprestimo, parcela);

            mensagem = "\nAceita a proposta?\n\n1 - Confirmar\n2 - Recusar\n\nR";
            //Armazena a resposta validada da proposta realizada.
            int resposta = validacao.selecionarOpcao(mensagem, validacao, 1, 2);

            //Caso a proposta seja confirmada, efetua-se o emprestimo.
            if (resposta == 1) {
                //Efetua o emprestimo
                c.getContaCorrente().efetuarEmprestimo(emprestimo);

                System.out.println(linha+"\nEmprestimo de "+String.format("%.2f",emprestimo)+" realizado com sucesso!");
                c.getContaCorrente().verSaldo(); //Imprime uma mensagem de sucesso e valor do saldo atual.
            } else {
                System.out.println("Emprestimo nao efetuado. Agradecemos pelo seu tempo!");
            }
        }

    }

    @Override
    public void solicitarCartao(Cliente c, String linha) {
        System.out.println("SOLICITAR CARTAO\n\n"+c.getEndereco().toString() +"\n"+linha); //Imprime o endereco cadastrado

        String mensagem = "Confirme o endereco para entrega.\n\n1 - Confirmar\n2 - Atualizar\n\nR";
        //Armazena resposta em confirmacao ou atualizacao do endereco
        int resposta = validacao.selecionarOpcao(mensagem, validacao, 1, 2);

        if (resposta == 2) {
            while (true) {
                //Solicita o campo a ser atualizado
                System.out.println(linha +"\nATUALIZAR ENDERECO\n\nCampo a ser atualizado:");
                mensagem = "1 - Numero\n2 - Rua\n3 - Bairro\n4 - Cidade\n5 - Estado\n\nR";
                int opcao = validacao.selecionarOpcao(mensagem, validacao, 1, 5);

                //Solicita o novo valor para o campo selecionado
                mensagem = "\nNovo valor";
                String novoValor = validacao.lerString(mensagem);

                //Atualiza o campo
                c.getEndereco().atualizarEndereco(opcao, novoValor);

                //Da a opccao de atualizar outro campo
                mensagem = "Atualizar outro campo?\n\n1 - Confirmar\n2 - Recusar\n\nR";
                int resposta2 = validacao.selecionarOpcao(mensagem, validacao, 1, 2);

                if (resposta2 == 2) {
                    break;
                }
            }

        }

        System.out.println(linha);
        c.getContaCorrente().solicitarCartao(c.getEndereco());
    }

    @Override
    public void verMeusDados(Cliente c, String linha, int tipoConta) {
        while (true) {
            String mensagem = "";

            if (tipoConta == 1) { //Amrmazena os dados de acordo com o tipo da conta
                mensagem = "MEUS DADOS\n\n" + c.visualizarDadosContaCorrente() + "\n" + linha + "\n1 - Atualizar Informacoes\n2 - Retornar ao Menu\n\nR";
            } else {
                mensagem = "MEUS DADOS\n\n" + c.visualizarDadosContaPoupanca() + "\n" + linha + "\n1 - Atualizar Informacoes\n2 - Retornar ao Menu\n\nR";

            }

            //Valida entrada e opcao escolhida, armazenando a resposta entre atualizar dados ou retornar ao menu
            int resposta = validacao.selecionarOpcao(mensagem, validacao, 1, 2);

            if (resposta == 1) { //Se for escolhido atualizar os dados, da-se a opcao de atualizar dados pessoais ou endereco
                mensagem = "\n1 - Atualizar Informacoes Pessoais\n2 - Atualizar Endereco\n\nR";
                resposta = validacao.selecionarOpcao( mensagem, validacao, 1, 2);

                if (resposta == 1) { //Atualiza dados pessoais
                    while (true) {
                        mensagem = linha + "\nATUALIZAR DADOS PESSOAIS\n\nCampo a ser atualizado:\n1 - Nome\n2 - Idade\n3 - Email\n4 - Salario\n\nR";
                        int opcao = validacao.selecionarOpcao(mensagem, validacao, 1, 4);

                        mensagem = "\nNovo valor";
                        String novoValor = validacao.lerString(mensagem);//Armazena o novo valor

                        //Atualiza o campo selecionado
                        c.atualizarDados(opcao, novoValor);

                        //Da a opccao de atualizar outro campo
                        mensagem = "Atualizar outro campo?\n\n1 - Confirmar\n2 - Recusar\n\nR";
                        int resposta2 = validacao.selecionarOpcao(mensagem, validacao, 1, 2);

                        if (resposta2 == 2) {
                            break;
                        }
                    }
                } else { //Atualiza o endereco
                    while (true) {
                        mensagem = linha + "\nATUALIZAR ENDERECO\n\nCampo a ser atualizado:\n1 - Numero\n2 - Rua\n3 - Bairro\n4 - Cidade\n5 - Estado\n\nR";
                        int opcao = validacao.selecionarOpcao(mensagem, validacao, 1, 5);

                        mensagem = "\nNovo valor";
                        String novoValor = validacao.lerString(mensagem);//Armazena o novo valor

                        //Atualiza o campo selecionado
                        c.getEndereco().atualizarEndereco(opcao, novoValor);

                        //Da a opccao de atualizar outro campo
                        mensagem = "Atualizar outro campo?\n\n1 - Confirmar\n2 - Recusar\n\nR";
                        int resposta2 = validacao.selecionarOpcao(mensagem, validacao, 1, 2);

                        if (resposta2 == 2) {
                            break;
                        }
                    }
                }
            } else {
                break;
            }
        }
    }

    @Override
    public Cliente verMinhasContas(List<Cliente> ls, Menu menu, String linha) {
        while (true) {
            System.out.println("MINHAS CONTAS\n");

            for (Cliente c : ls) { //Imprime o id, tipo da conta e nome do proprietario de cada conta registrada
                System.out.println("ID " + c.getIdCliente() + ", " + c.getTipoConta() + ". Proprietario(a) " + c.getNome() + ".\n" + linha);
            }

            //Da a opcao de entrar em outra conta ou retornar ao menu
            String mensagem = "1 - Entrar em outra conta\n2 - Retornar ao Menu\n\nR";
            int resposta = validacao.selecionarOpcao(mensagem, validacao, 1, 2);

            if (resposta == 1) {
                if (ls.size() > 1) { //Se houver mais de uma conta cadastrada, pede o id para localizar a mesma
                    mensagem = "\nID da conta";
                    int id = validacao.lerInt(mensagem); //Armazena o id da conta que se deseja entrar
                    Cliente cliente = null; //Armazena a conta correspondente ao id informado, se encontrada

                    for (Cliente c : ls) { //Percorre a lista de contas armazenadas procurante pela correspondente ao id informado
                        if (id == c.getIdCliente()) cliente = c;
                    }

                    if (cliente == null) {
                        System.out.println("\nImpossivel acessar conta! Conta inexistente.\n"+linha);
                    } else {
                        System.out.println("\nRedirecionando...");
                        return cliente;
                    }
                } else {
                    System.out.println("\nImpossivel acessar outra conta! Contas adicionais nao cadastradas .\n"+linha);
                }
            } else {
                break;
            }
        }
        return null;
    }

    @Override
    public List<Cliente> abirNovaConta(List<Cliente> c, Menu menu, String linha) {
        System.out.println("ABRIR NOVA CONTA\n");
        c.add(menu.iniciarCadastro(c, menu, linha)); //Chama o metodo responsavel por iniciar o cadastro

        System.out.println("\nNova "+c.get(c.size() - 1).getTipoConta()+" aberta com sucesso!");

        return c;
    }

    @Override
    public void verRendimentoMental(Cliente c) {
        //Armazena condicoes que informam se a conta corrente ou a conta poupanca estao vazia
        boolean condicao1 = c.getTipoConta().equals("Conta Corrente") && c.getContaCorrente().getSaldoDisponivel() < 1;
        boolean condicao2 = c.getTipoConta().equals("Conta Poupanca") && c.getContaPoupanca().getSaldoDisponivel() < 1;

        if (condicao1 | condicao2) {
            System.out.println("Conta vazia! Faca um deposito para ter rendimentos mensais.");
        } else {
            //Calcula o rendimento mensal baseado no saldo atual
            double rendimento = c.getContaPoupanca().renderAoMes();

            System.out.println("RENDIMENTO MENSAL\n\nBaseado em seu saldo atual, nesse mes seu rendimento sera de RS"+String.format("%.2f", rendimento));
        }
    }

    @Override
    public int encerrarPrograma(String linha) {
        System.out.println(linha+"\nPrograma encerrado com sucesso! Até a proxima!");
        return 0;
    }
}
