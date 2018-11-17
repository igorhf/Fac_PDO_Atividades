package atividade1;
import java.util.ArrayList;
import java.util.Scanner;

public class agenda {
    Scanner entrada = new Scanner(System.in);   
    ArrayList<String> agendas = new ArrayList();
    //ArrayList<Object> dados = new ArrayList();

    private String nome;
    private int idade;
    private float altura;
   
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void agenda(String nome,int idade,float altura){
    this.nome=nome;
    this.idade=idade;
    this.altura=altura;
    }
    
    public void armazenaPessoa(){    
    System.out.println("informe o seu nome: ");
    setNome(entrada.next());
    System.out.println("informe sua idade: ");
    setIdade(entrada.nextInt());
    System.out.println("informe sua altura: ");
    setAltura(entrada.nextFloat());
    agendas.add(getNome()); 
    agendas.add(""+getIdade()); 
    agendas.add(""+getAltura());
   // dados.add(agendas);
   // agendas.clear();
    }
    
    public void impirmeAgenda(){ 
        int i = 0;
        for (String item : agendas) {
        System.out.println("posição "+i+" "+item);
        ++i;
        }
    }
    
    public void impirmePessoa(int index){            
        System.out.println(agendas.get(index));       
    }
    
    public void removeNome(String nome){        
        agendas.remove(nome);                
    }
    public int buscaPessoa(String nome){
       return agendas.indexOf(nome);
    }
}
