package atividade1;
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1 extends agenda {
    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);   
    agenda agend = new agenda();    
    
    int opc = 0;
    do{
        System.out.println("----escolha uma opção----");
        System.out.println("1º armazenar pessoa");
        System.out.println("2º remover nome");
        System.out.println("3º busca pessoa");
        System.out.println("4º imprime Agenda");
        System.out.println("5º imprime Pessoa");
        System.out.println("Digite 9 para sair, se não qualquer outro numero");
        opc = scan.nextInt();
        switch(opc){
            case 1:{ 
                System.out.println("----armazena Pessoa----");
                agend.armazenaPessoa();
                System.out.println("-----------------------");
            break;
            }           
            case 2:{
                String nome;
                System.out.println("----remove Nome----");
                System.out.println("informe um nome");
                nome = scan.next();
                agend.removeNome(nome);
                System.out.println("-----------------------");
            break;
            }
            case 3:{
                String nome;
                System.out.println("informe o nome pra saber a posição:");
                nome = scan.next();
                if(agend.buscaPessoa(nome)<0){
                System.out.println("posição não existe");
                }else{
                System.out.println("posição: "+agend.buscaPessoa(nome));
                }
            break;
            }
            case 4:{
                System.out.println("----imprime Agenda----");                
                agend.impirmeAgenda();
                System.out.println("----------------------");                
            break;
            }
            case 5:{
                int i;
                System.out.println("----imprime Pessoa----");
                System.out.println("informe uma posição");
                i = scan.nextInt();
                agend.impirmePessoa(i);
                System.out.println("----------------------");
            break;
            }
            default:{
                System.out.print("opção invalidar"); 
                break;
            }
        }        
    }while(opc !=9);
        
    }
    
}
