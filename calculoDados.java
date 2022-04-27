import java.util.Scanner;
public class Atividade1904{
  public static Scanner leia = new Scanner(System.in);
  // métodos que serão utilizados ao longo do código
  public static float mediaSalario(float salarios[]){
     float soma = 0;
     float media = 0;
     for (int i = 0; i < salarios.length; i++ ) {
       soma += salarios[i];
     }
     media = soma/salarios.length;
     return media;
  }
  public static int mediaFilhos(int filhos[]){
    int soma = 0;
    int media = 0;
    for (int i = 0; i < filhos.length; i++ ) {
      soma += filhos[i];
    }
    media = soma/filhos.length;
    return media;
  }
  public static float maiorSalario(float salarios[]){
    float maiorSalario =  0;
    for (int i = 0; i < salarios.length; i++) {
      if (salarios[i] > maiorSalario) {
        maiorSalario = salarios[i];
      }
    }
    return maiorSalario;
  }
  public static float percentualSalario(float salarios[]){
    int cont = 0;
    float percentual = 0;
    for (int i = 0; i < salarios.length; i++) {
      if (salarios[i] < 150){
        cont += 1;
      }
    }
    percentual = (cont*100)/salarios.length;
    return percentual;
  }
  public static void main(String[] args) {

    float salarios[] = new float[5];
    int filhos[] = new int[5];
    String registrar= "s";
    int opcao;

    while(registrar.equals("s")){
      String resposta = "s";
      for (int i = 0; i <= 4 ; i++) {
        System.out.print("Digite o salário do cidadão: ");
        salarios[i] = leia.nextFloat();
        System.out.print("Digite quantos filhos tem o cidadão: ");
        filhos[i] = leia.nextInt();
      }
      while(resposta.equals("s")){
        System.out.println("-------------------------------------------------------");
        System.out.print("1 - média dos salários\n2 - média de filhos\n3 - maior salário\n4 - salários abaixo de R$:150\nO que você deseja fazer?: ");
        opcao = leia.nextInt();
        switch(opcao){
          case 1: System.out.println("A média dos salários dos cidadãos é: " + mediaSalario(salarios)); break;
          case 2: System.out.println("A média de filhos por cidadão é: " + mediaFilhos(filhos)); break;
          case 3: System.out.println("O maior salário registrado dos cidadãos é: " + maiorSalario(salarios)); break;
          case 4: System.out.println("O percentual de salários abaixo de 150 é: " + percentualSalario(salarios) + "%"); break;
          default: System.out.println("Número inválido"); break;
        }
        System.out.print("Você deseja ver outra opção? (s - sim | n - não): ");
        resposta = leia.next();
      }
      System.out.print("Deseja registrar outros cidadãos? (s - sim | n - não): ");
      registrar = leia.next();
    }
    System.out.println("bye");
  }
}
