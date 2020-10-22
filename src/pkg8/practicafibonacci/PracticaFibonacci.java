package pkg8.practicafibonacci;


public class PracticaFibonacci {

    
    public static void main(String[] args) {
        PracticaFibonacci objfibonacci = new PracticaFibonacci();
        System.out.println("la sucesion con fibonacci recursivo es:" + objfibonacci.fibonacciRecursivo(8));
          System.out.println("la sucesion con fibonacci ciclico es:" + objfibonacci.fibonacciRecursivo(8));
        
        
    }
    
    //metodo recursivo para la susesion de fibonacci
    public int fibonacciRecursivo(int n){
        if (n==1 || n==2 ){
            return 1;
        }else {
            return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
            // numero 1-2-3(2+3)
            // resultado 1-1-3
        }
    }
    

    
    //metodo ciclicio para la sucesion de fibonacci
    public int fibonacciCiclico(int n){
        int fibo=0, primero=1, segundo=0;
        
        while (n>0){
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            n--;
        }
        return fibo;
    }
}
 