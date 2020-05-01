
package switchcase;
import java.util.Scanner;
public class Caixaeletronico {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int Senha = 12345, SENHA, Menu = 0, Deposito, Saldo = 1000, Saque;
        String cpf = "505.503.507-74", CPF;
    do{
        System.out.println("-------------------");
        System.out.println("Bem Vindo Ao Início");
        System.out.println("-------------------");
        System.out.println("Digite Seu CPF: ");
        CPF = ler.next();
      
        if (CPF.equals(cpf)){
           
            System.out.println("Digite Sua Senha: ");
            SENHA = ler.nextInt();
     
        if(SENHA == Senha){
  do{
 System.out.println("Menu:");
 System.out.println("==============");
 System.out.println("1 | Saldo");
 System.out.println("2 | Depósito");
 System.out.println("3 | Saque");
 System.out.println("0 | Sair");
 System.out.println("==============");
 System.out.println("Digite sua opção: ");
 Menu = ler.nextInt();
 
 switch (Menu){
     case 1:
         System.out.println("Seu Saldo Atual é de R$" + Saldo);
      
         break;
     case 2:
         System.out.println("Digite o Valor do Depósito: ");
         Deposito = ler.nextInt();
         Saldo = Deposito + Saldo;
     break;
     case 3:
         System.out.println("Digite o Valor do Saque: ");
         Saque = ler.nextInt();
         Saldo = Saldo - Saque;
     break;
     case 0: 
         break;
     default:
         System.out.println("Opção Incorreta.");
         break;
   }
       }while(Menu == 1 || Menu == 2 || Menu == 3 || Menu > 3 || Menu < 0); 
  
        }else{
            System.out.println("Senha Incorreta, Digite Novamente: ");
            SENHA = ler.nextInt();
            if (SENHA != Senha){
            System.out.println("CONTA BLOQUEADA.");
            System.exit(0);
            }else{
 do{
 System.out.println("Menu:");
 System.out.println("==============");
 System.out.println("1 | Saldo");
 System.out.println("2 | Depósito");
 System.out.println("3 | Saque");
 System.out.println("0 | Sair");
 System.out.println("==============");
 System.out.println("Digite sua opção: ");
 Menu = ler.nextInt();
 switch (Menu){
     case 1:
         System.out.println("Seu Saldo Atual é de R$" + Saldo);
         break;
     case 2:
         System.out.println("Digite o Valor do Depósito: ");
         Deposito = ler.nextInt();
         Saldo = Deposito + Saldo;
     break;
     case 3:
         System.out.println("Digite o Valor do Saque: ");
         Saque = ler.nextInt();
         Saldo = Saldo - Saque;
     break;
     default:
         System.out.println("Opção Incorreta.");
     break;
 
 } 
            }while(Menu == 1 || Menu == 2 || Menu == 3 || Menu > 3 || Menu < 0);
            }
        }
        }else{
            System.out.println("Seu CPF é Invalido.");
                }      
      }while(Menu == 0);
    }
       
   }
    
    
    
