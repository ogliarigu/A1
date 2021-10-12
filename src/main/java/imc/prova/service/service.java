package imc.prova.service;


import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class service {
    public static String calculadora(Double peso, Double altura) {

        DecimalFormat decimal = new DecimalFormat("###,##0.00");
        Double imc = peso / Math.pow(altura, 2);
        String imcFinal = decimal.format(imc);

        if (imc < 18.5) {
            return "Baixo peso, IMC: " + imcFinal;
        }    else if (imc >= 18.5 && imc <= 24.9){
            return "Intervalo normal, IMC: " + imcFinal;
        }    else if (imc >= 25 && imc <= 29.9){
            return "Sobrepeso, IMC: " + imcFinal;
        }    else if (imc >= 30 && imc <= 34.9){
            return "Obesidade classe I, IMC: " + imcFinal;
        }    else if (imc >= 35 && imc <= 39.9){
            return "Obesidade classe II, IMC: " + imcFinal;
        }    else if (imc >= 40) {
            return "Obesidade classe III, IMC: " + imcFinal;
        }    else {
            return "Informe um valor válido.";
        }
    }
}
