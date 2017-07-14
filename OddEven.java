import java.util.Scanner;

public class OddEven
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int n1, resto;
    
    System.out.print("Ingrese un número: ");
    n1 = input.nextInt();
    
    resto = n1 % 2;
    
    if (resto == 0)
      System.out.printf("%d es par", n1);
     
    if (resto != 0)
      System.out.printf("%d es impar", n1);
  }
}
   
