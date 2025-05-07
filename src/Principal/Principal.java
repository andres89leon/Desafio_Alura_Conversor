package Principal;

import ApiConnexion.ApiClient;
import ApiConnexion.ConversorJson;
import Conversiones.Divisor;
import Conversiones.Multiplicador;
import com.google.gson.Gson;
import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {

        boolean mientras = true;
        double resultado;
        double valor1;
        double valor2;


        try {
         String json = ApiClient.getJsonFromApi();

            Gson gson = new Gson();
            ConversorJson obtencionDatos = gson.fromJson(json,ConversorJson.class);

            Scanner scanner = new Scanner(System.in);

            while (mientras){
                Saludo.exibirMenu();
                int option = scanner.nextInt();
                switch (option){
                    case 1:
                        System.out.println("Ingrese el valor que desea convertir");
                        valor1 = scanner.nextDouble();
                        valor2 = obtencionDatos.conversion_rates().get("ARS");
                        resultado =Multiplicador.multiplicar(valor1, valor2);
                        System.out.println("El valor "+valor1+ " [USD] corresponde al valor final de =>>> "+ resultado+ " [ARS]");
                        break;
                    case 2:
                        System.out.println("Ingrese el valor que desea convertir");
                        valor2 = scanner.nextDouble();
                        valor1 = obtencionDatos.conversion_rates().get("ARS");
                        resultado =Divisor.dividir(valor2, valor1);
                        System.out.println("El valor "+valor2+ " [ARS] corresponde al valor final de =>>> "+ resultado+ " [USD]");
                        break;
                    case 3:
                        System.out.println("Ingrese el valor que desea convertir");
                        valor1 = scanner.nextDouble();
                        valor2 = obtencionDatos.conversion_rates().get("BRL");
                        resultado =Multiplicador.multiplicar(valor1, valor2);
                        System.out.println("El valor "+valor1+ " [USD] corresponde al valor final de =>>> "+ resultado+ " [BRL]");
                        break;
                    case 4:
                        System.out.println("Ingrese el valor que desea convertir");
                        valor2 = scanner.nextDouble();
                        valor1 = obtencionDatos.conversion_rates().get("BRL");
                        resultado =Divisor.dividir(valor2, valor1);
                        System.out.println("El valor "+valor2+ " [BRL] corresponde al valor final de =>>> "+ resultado+ " [USD]");
                        break;
                    case 5:
                        System.out.println("Ingrese el valor que desea convertir");
                        valor1 = scanner.nextDouble();
                        valor2 = obtencionDatos.conversion_rates().get("COP");
                        resultado =Multiplicador.multiplicar(valor1, valor2);
                        System.out.println("El valor "+valor1+ " [USD] corresponde al valor final de =>>> "+ resultado+ " [COP]");
                        break;
                    case 6:
                        System.out.println("Ingrese el valor que desea convertir");
                        valor2 = scanner.nextDouble();
                        valor1 = obtencionDatos.conversion_rates().get("COP");
                        resultado =Divisor.dividir(valor2, valor1);
                        System.out.println("El valor "+valor2+ " [COP] corresponde al valor final de =>>> "+ resultado+ " [USD]");
                        break;
                    case 7:
                        System.out.println("¡Adios, vuelva pronto!");
                        mientras = false;
                        break;
                    default:
                        System.out.println("Opción invalida");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
