package atividade2;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc;
        do{
            System.out.println("----MENU----");
            System.out.println("1º polígono regular");
            System.out.println("2º triângulo equilátero");
            System.out.println("3º quadrado");
            System.out.println("9º PARA SAIR");
            System.out.println("-----------------------");        
            opc = scan.nextInt();
            
            switch(opc){
                case 1:{
                    PoligonoRegular poligono = new PoligonoRegular();
                    int opc1 = 0;
                    int a,b;
                    while(opc1 !=9){
                        System.out.println("----polígono regular----");
                        System.out.println("informer a quantidade de lados");
                        a = scan.nextInt();
                        System.out.println("informer o tamanho dos lados");
                        b = scan.nextInt();
                        poligono.PoligonoRegular(a, b);
                        System.out.println("1º cálculo do perímetro");
                        System.out.println("2º cálculo do ângulo interno");
                        System.out.println("3º cálculo da área");
                        System.out.println("9º PARA SAIR");
                        opc1 = scan.nextInt();
                    switch(opc1){
                        case 1:{
                            System.out.println("----calculo Perimetro----");                                                        
                            System.out.println("O PERIMETRO POLIGONO É: "+poligono.calculoPerimetro(poligono.getNunLados(),poligono.getTamanhoLados()));
                            opc1=0;
                            break;
                            }
                        case 2:{
                            System.out.println("----calculo angulo interno----");                                                        
                            System.out.println("O ANGULO DO POLIGONO É: "+poligono.calculoAnguloInterno(poligono.getNunLados())+"º");
                            opc1=0;
                            break;
                            }
                        case 3:{
                            System.out.println("----calculo area----");                                                        
                            System.out.println("A AREA DO POLIGONO É: "+poligono.calculoArea(poligono.calculoPerimetro(a, b), (int) poligono.calculoAnguloInterno(a)));
                            opc1=0;
                            break;
                            }
                        }
                    }                    
                    break;
                }
                case 2:{
                    TrianguloEq triangulo = new TrianguloEq();
                    int a,b;
                    int opc2 =0;
                    while(opc2 !=9){
                    System.out.println("----triângulo equilátero----");                    
                    System.out.println("informer o tamanho dos lados");
                    b = scan.nextInt();  
                    triangulo.TrianguloEq(3, b);
                    System.out.println("1º cálculo do perímetro");
                    System.out.println("2º cálculo do ângulo interno");
                    System.out.println("3º cálculo da área");
                    System.out.println("9º PARA SAIR");
                    opc2 = scan.nextInt();
                    switch(opc2){
                        case 1:{
                            System.out.println("----calculo Perimetro----");                                                        
                            System.out.println("O PERIMETRO TRIANGULO É: "+triangulo.calculoPerimetro(triangulo.getNunLados(),triangulo.getTamanhoLados()));
                            opc2=0;
                        break;
                        }
                        case 2:{
                            System.out.println("----calculo angulo interno----");                                                        
                            System.out.println("O ANGULO DO TRIANGULO É: "+triangulo.calculoAnguloInterno(triangulo.getNunLados())+"º");
                            opc2=0;
                            break;
                        }
                        case 3:{
                            System.out.println("----calculo area----");                                                        
                            System.out.println("A AREA DO TRIANGULO É: "+triangulo.areaTrianguno(triangulo.getNunLados(), triangulo.getTamanhoLados()));
                            opc2=0;
                            break;
                            }
                        }
                    }
                    break;
                } 
                case 3:{
                    Quadrado quadrado = new Quadrado();
                    int a,b;
                    int opc3 =0;
                    while(opc3 !=9){
                    System.out.println("----Quadrado----");                    
                    System.out.println("informer o tamanho dos lados");
                    b = scan.nextInt();  
                    quadrado.Quadrado(4, b);
                    System.out.println("1º cálculo do perímetro");
                    System.out.println("2º cálculo do ângulo interno");
                    System.out.println("3º cálculo da área");
                    System.out.println("9º PARA SAIR");
                    opc3 = scan.nextInt();
                    switch(opc3){
                        case 1:{
                            System.out.println("----calculo Perimetro----");                                                        
                            System.out.println("O PERIMETRO QUADRADO É: "+quadrado.calculoPerimetro(quadrado.getNunLados(),quadrado.getTamanhoLados()));
                            opc3=0;
                        break;
                        }
                        case 2:{
                            System.out.println("----calculo angulo interno----");                                                        
                            System.out.println("O ANGULO DO QUADRADO É: "+quadrado.calculoAnguloInterno(quadrado.getNunLados())+"º");
                            opc3=0;
                            break;
                        }
                        case 3:{
                            System.out.println("----calculo area----");                                                        
                            System.out.println("A AREA DO QUADRADO É: "+quadrado.areaQuadrado(quadrado.getNunLados()));
                            opc3=0;
                            break;
                            }
                        }
                    }
                    break;
                } 
            }
        }while(opc !=9);
    }
    
}
