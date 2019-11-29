 // Trabalho_Vetores_K_T - RODOLFO PAULINO SILVA

package controleVendas;

import java.util.Scanner;

public class Controle_Vendas {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        //declaração de variáveis
        int opcao, codigo, vendedores = 0;
        int cod[] = new int[4];
        String nome[] = new String[4];
        int meses;
        int vendas1[] = new int[120];
        int vendas2[] = new int[120];
        int vendas3[] = new int[120];
        int vendas4[] = new int[120];  
        int aux = 0;
        int totvendas0 = 0, totvendas1 = 0, totvendas2 = 0, totvendas3 = 0;
        
        //inicio do laço
        do {
            System.out.println("\n>>>>>>>>>>> MENU <<<<<<<<<<<"
                    + "\n1 - Cadastrar vendedores"
                    + "\n2 - Cadastrar vendas"
                    + "\n3 - Consultar vendas por mês"
                    + "\n4 - Consultar total de vendas por vendedor"
                    + "\n5 - Finalizar o programa");
            
            System.out.println("\nDigite a opção desejada:");
            opcao = leia.nextInt();
            
            //Na opção 1: deve-se cadastrar os vendedores, sendo que não pode existir dois vendedores com o mesmo código.
            if (opcao == 1) {
                aux = 0;
                if (vendedores < 4) {
                    System.out.println("Digite o código do Vendedor " + (vendedores + 1) + ": ");
                    codigo = leia.nextInt();
                    for (int i = 0; i < vendedores; i++) {
                        if (codigo == cod[i]) {
                            System.out.println("CÓDIGO DO VENDEDOR JÁ CADASTRADO");
                            aux = 1;
                        }
                    }
                    if (aux == 0) {
                        cod[vendedores] = codigo;
                        System.out.println("Digite o nome do Funcionário: ");
                        nome[vendedores] = leia.next();
                        vendedores ++;
                    }
                } else {
                    System.out.println("QUANTIDADE DE CADASTROS COMPLETO!");
                }
                } //fim do if opcao 1
            
            /*Na opção 2: deve-se cadastrar as vendas (maximo de 10 vendas por mes), informar o código  
            do vendedor existente no cadastro anterior e o mês da venda*/
            if (opcao == 2){
                if (vendedores == 0) {
                    System.out.println("SEM VENDEDORES CADASTRADOS");
                } else{
                System.out.print("Digite o código do Vendedor: ");
                codigo = leia.nextInt();

                if (codigo == cod[0]) {
                    aux = 0;
                    if (aux == 1) {
                        System.out.println("VENDAS JÁ CADASTRADAS!");
                    } else {
                        System.out.println("Código : " + cod[0] + " Vendedor: " + nome[0]);
                        
                        for (int mes = 1; mes < 13; mes++) {
                            do {
                                System.out.print("Digite o Total de vendas (Máximo 10 vendas) do mes " + mes + ": ");
                                vendas1[mes] = leia.nextInt();
                                    if (vendas1[mes] > 10) {
                                        System.out.println("LIMITE MÁXIMO DE 10 VENDAS POR MÊS!");
                                    }
                                totvendas0 = totvendas0 + vendas1[mes];
                            } while (vendas1[mes]< 0 || vendas1[mes]> 10);
                        }
                        aux = 1;
                    }
                } 
                
                if (codigo == cod[1]) {
                    aux = 0;
                    if (aux == 1) {
                        System.out.println("VENDAS JÁ CADASTRADAS!");
                    } else {
                        System.out.println("Código : " + cod[1] + " Vendedor: " + nome[1]);
                        
                        for (int mes = 1; mes < 13; mes++) {
                            do {
                                System.out.print("Digite o Total de vendas (Máximo 10 vendas) do mes " + mes + ": ");
                                vendas2[mes] = leia.nextInt();
                                    if (vendas2[mes] > 10) {
                                        System.out.println("LIMITE MÁXIMO DE 10 VENDAS POR MÊS!");
                                    }
                                totvendas1 = totvendas1 + vendas2[1];
                            } while (vendas2[mes]< 0 || vendas2[mes]> 10);
                        }
                        aux = 1;
                    }
                } 
                
                if (codigo == cod[2]) {
                    aux = 0;
                    if (aux == 1) {
                        System.out.println("VENDAS JÁ CADASTRADAS!");
                    } else {
                        System.out.println("Código : " + cod[2] + " Vendedor: " + nome[2]);
                        
                        for (int mes = 1; mes < 13; mes++) {
                            do {
                                System.out.print("Digite o Total de vendas (Máximo 10 vendas) do mes " + mes + ": ");
                                vendas3[mes] = leia.nextInt();
                                    if (vendas3[mes] > 10) {
                                        System.out.println("LIMITE MÁXIMO DE 10 VENDAS POR MÊS!");
                                    }
                                totvendas2 = totvendas2 + vendas3[2];
                            } while (vendas3[mes]< 0 || vendas3[mes]> 10);
                        }
                        aux = 1;
                    }
                } 
                if (codigo == cod[3]) {
                    aux = 0;
                    if (aux == 1) {
                        System.out.println("VENDAS JÁ CADASTRADAS!");
                    } else {
                        System.out.println("Código : " + cod[3] + " Vendedor: " + nome[3]);
                        
                        for (int mes = 1; mes < 13; mes++) {
                            do {
                                System.out.print("Digite o Total de vendas (Máximo 10 vendas) do mes " + mes + ": ");
                                vendas4[mes] = leia.nextInt();
                                    if (vendas4[mes] > 10) {
                                        System.out.println("LIMITE MÁXIMO DE 10 VENDAS POR MÊS!");
                                    }
                                totvendas3 = totvendas3 + vendas4[3];
                            } while (vendas4[mes]< 0 || vendas4[mes]> 10);
                        }
                        aux = 1;
                    }
                } 
                }
            } //fim do if opcao 2
            
            /*Na opção 3: deve-se informar o código do vendedor e o número do mês que se deseja consultar, 
            para então descobrir e mostrar os dados correspondentes*/
            
            if (opcao == 3) {
                if (vendedores == 0) {
                    System.out.println("SEM VENDEDORES CADASTRADOS");
                } else {
                    System.out.print("Digite o código do vendedor: ");
                    codigo = leia.nextInt();
                    aux = 0;
                    for (int i = 0; i < vendedores; i++) {
                        if (codigo == cod[0]) {
                            System.out.println("Código: " + cod[0] + " Vendedor: " + nome[0]);
                            System.out.print("Digite o mês que deseja consultar: ");
                            meses = leia.nextInt();
                            System.out.println("Total de vendas do mês: " + vendas1[meses]);
                            aux = 1;
                        }
                        if (codigo == cod[1]) {
                            System.out.println("Código: " + cod[1] + " Vendedor: " + nome[1]);
                            System.out.print("Digite o mês que deseja consultar: ");
                            meses = leia.nextInt();
                            System.out.println("Total de vendas do mês: " + vendas2[meses]);
                            aux = 1;
                        }
                        if (codigo == cod[2]) {
                            System.out.println("Código: " + cod[2] + " Vendedor: " + nome[2]);
                            System.out.print("Digite o mês que deseja consultar: ");
                            meses = leia.nextInt();
                            System.out.println("Total de vendas do mês: " + vendas3[meses]);
                            aux = 1;
                        }
                        if (codigo == cod[3]) {
                            System.out.println("Código: " + cod[3] + " Vendedor: " + nome[3]);
                            System.out.print("Digite o mês que deseja consultar: ");
                            meses = leia.nextInt();
                            System.out.println("Total de vendas do mês: " + vendas4[meses]);
                            aux = 1;
                        }
                    }
                    if (aux == 0) {
                        System.out.println("CÓDIGO NÃO CADASTRADO!");
                    }
                }
            } //fim do if opção 3
            
            //Na opção 4: deve-se informar o número do vendedor desejado, calcular e mostrar o total de suas vendas
            if (opcao == 4) {
                System.out.println("Digite o código do vendedor: ");
                codigo = leia.nextInt();
                if (vendedores == 0) {
                    System.out.println("SEM VENDEDORES CADASTRADOS");
                }
                if (codigo == cod[0]){
                    System.out.println("Total de vendas do vendedor " + nome[0]+ ": " + totvendas0);
                }
                if (codigo == cod[1]){
                    System.out.println("Total de vendas do vendedor " + nome[1]+ ": " + totvendas1);
                }
                if (codigo == cod[2]){
                    System.out.println("Total de vendas do vendedor " + nome[2]+ ": " + totvendas2);
                }
                if (codigo == cod[3]){
                    System.out.println("Total de vendas do vendedor " + nome[3]+ ": " + totvendas3);
                }
                
            } //fim do if opção 4
            
            } while (opcao >= 1 && opcao <= 4); //fim do laço
        }
    }

/*
Uma empresa deseja controlar as vendas realizadas por seus vendedores a cada mês, durante um ano inteiro. 
Sabe-se que nessa empresa existem 4 vendedores e podem ser realizadas 10 vendas. Mostrar um menu, contendo as seguintes opções:
1. cadastrar vendedor
2. cadastrar venda
3. consultar as vendas de um vendedor em um determinado mês
4. consultar o total das vendas de um determinado vendedor
5 finalizar o programa

Na opção 1: deve-se cadastrar os vendedores, sendo que não pode existir dois vendedores com o mesmo código.
Na opção 2: deve-se cadastrar as vendas, informar o código do vendedor existe no cadastro anterior e o mês da venda
Na opção 3: deve-se informar o código do vendedor e o número do mês que se deseja consultar, para então descobrir e mostrar 
os dados correspondentes
Na opção 4: deve-se informar o número do vendedor desejado, calcular e mostrar o total de suas vendas
Na opção 5: finalizar o programa

*/
