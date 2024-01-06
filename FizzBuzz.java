public class FizzBuzz {
    public static void main(String args[]){
        //Se crea el for para ir contando del uno al cien
        for (int i = 0; i <= 100; i++) {
            //Se crean los if para hacer las sustituciones
            if(i%5==0 && i%3==0){
                System.out.println("Fizz Buzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }
        
        }
    }
}
