import java.util.Scanner;
public class Grades{
   
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the temp you want to convert");
    double temp=scanner.nextDouble();
    scanner.nextLine();
    System.out.println("enter the unit of the temp");
    String unit=scanner.nextLine().toLowerCase();

   
    if (unit.equals("celsius")) {
        double kelvin =celciusToKelvin(temp);
        System.out.println("Temperature in Kelvin: " + kelvin);
    } else if (unit.equals("kelvin")) {
        double celsius = kelvinToCelcius(temp);
        System.out.println("Temperature in Celsius: " + celsius);
    } else {
        System.out.println("Invalid unit! Please enter either 'Celsius' or 'Kelvin'.");
    }
    }
    static double celciusToKelvin(double Celcius){
        return Celcius+273;

    }
    static double kelvinToCelcius(double kelvin){
        return  kelvin-273;
    }

}
