import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        float tempFahrenheit = 0;
        float tempCelsius = 0;

        System.out.print("Temperatura em Celsius: ");
        tempCelsius = console.nextFloat();

        tempFahrenheit = (tempCelsius * 9 / 5) + 32;
    
        System.out.printf("Temperatura em Fahrenheit é %.1f", tempFahrenheit);
        console.close();
    }
}