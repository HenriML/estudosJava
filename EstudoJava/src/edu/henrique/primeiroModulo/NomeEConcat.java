package edu.henrique.primeiroModulo;

public class NomeEConcat {
    public static void main(String[] args) {
        String primeiroNome = "Henrique";
        String segundoNome = "Munhoz Leite";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println("O resultado é:" + " " + nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}