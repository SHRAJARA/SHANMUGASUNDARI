public class Factorial{
static int factorial(int n){
  if(n==0)
    return 1;
  else
    return(n*factorial(n-1));
 }
 public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
  int i,fact=1;
  System.out.println("Enter Number:");
  int number=scan.nextINT();//It is the number to calculate factorial
  fact=factorial(number);
  System.out.println("Factorial Of"+number+" is: "+fact);
 }
} 