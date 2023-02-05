package Lista02;

import java.util.ArrayList;
import java.util.Scanner;

public class att7 {
    public static void main(String[] args) throws Exception {
        att7 app = new att7();
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> listaIdadesCadastradas = new ArrayList<Integer>();

        ArrayList<String> listaCorOlhosCadastrados = new ArrayList<String>(),
                listaCorCabeloCadastrados = new ArrayList<String>(),
                listaSexoCadastrado = new ArrayList<String>();

        int idade = 0;

        do {
            app.selecionarSexo();
            int opcaoSexo = scanner.nextInt();
            while (opcaoSexo != 1 && opcaoSexo != 2) {
                opcaoSexo = app.receberOpcaoValida();
            }

            app.selecionarCorCabelos();
            int opcaoCorCabelo = scanner.nextInt();
            while (opcaoCorCabelo != 1 && opcaoCorCabelo != 2 && opcaoCorCabelo != 3) {
                opcaoCorCabelo = app.receberOpcaoValida();
            }

            app.selecionarCorOlhos();
            int opcaoCorOlhos = scanner.nextInt();
            while (opcaoCorOlhos != 1 && opcaoCorOlhos != 2 && opcaoCorOlhos != 3) {
                opcaoCorOlhos = app.receberOpcaoValida();
            }

            app.digitarIdade();
            idade = scanner.nextInt();

            if (!app.retornarSeIdadeIgualMenosUm(idade)) {

                if (opcaoCorCabelo == 1) {
                    listaCorCabeloCadastrados.add("Louros");
                } else if (opcaoCorCabelo == 2) {
                    listaCorCabeloCadastrados.add("Castanhos");
                } else {
                    listaCorCabeloCadastrados.add("Pretos");
                }

                if (opcaoCorOlhos == 1) {
                    listaCorOlhosCadastrados.add("Azuis");
                } else if (opcaoCorOlhos == 2) {
                    listaCorOlhosCadastrados.add("Verdes");
                } else {
                    listaCorOlhosCadastrados.add("Castanhos");
                }

                if (opcaoSexo == 1) {
                    listaSexoCadastrado.add("Masculino");
                } else {
                    listaSexoCadastrado.add("Feminino");
                }

                listaIdadesCadastradas.add(idade);
            }

        } while (!app.retornarSeIdadeIgualMenosUm(idade));

        int maiorIdade = 0, menorIdade = 0, quantidadeDeIndividuos = 0;

        for (int i = 1; i < listaIdadesCadastradas.size(); i++) {
            if (maiorIdade < listaIdadesCadastradas.get(i)) {
                maiorIdade = listaIdadesCadastradas.get(i);
            }
            if (menorIdade > listaIdadesCadastradas.get(i)) {
                menorIdade = listaIdadesCadastradas.get(i);
            }
            if (listaSexoCadastrado.get(i) == "Feminino" &&
                    (listaIdadesCadastradas.get(i) > 17 || listaIdadesCadastradas.get(i) < 36) &&
                    listaCorOlhosCadastrados.get(i) == "Verdes" &&
                    listaCorCabeloCadastrados.get(i) == "Louros") {
                quantidadeDeIndividuos += 1;
            }
        }

        System.out.println("a menor idade é: " + menorIdade);
        System.out.println("a maior idade é: " + maiorIdade);
        System.out.println("a quantidade de individuos do sexo feminino cuja idade esta entre 18 e 35 anos inclusive");
        System.out.println("e que tenham olhos verdes e cabelos louros é: " + quantidadeDeIndividuos);
    }

	private Scanner scanner;

    public void selecionarSexo() {
        System.out.println("\n\n");
        System.out.println(" Selecionar sexo");
        System.out.println(" 01 - Masculino");
        System.out.println(" 02 - Feminino");

    }

    public void selecionarCorCabelos() {
        System.out.println("\n\n");
        System.out.println(" Selecionar cor dos cabelos   ");
        System.out.println(" 01 - Louros  ");
        System.out.println(" 02 - Castanhos");
        System.out.println(" 03 - Pretos");

    }

    public void selecionarCorOlhos() {
        System.out.println("\n\n");
        System.out.println(" Selecionar cor dos olhos");
        System.out.println(" 01 - Azuis");
        System.out.println(" 02 - Verdes");
        System.out.println(" 03 - Castanhos");
                 
    }
    
 
    public void digitarIdade() {
        System.out.println("\n\n");
        System.out.println("Caso queira parar o laso, digite -1");
        System.out.println(" Digitar idade");   
    }

    public boolean retornarSeIdadeIgualMenosUm(int idade) {
        return idade == -1;
    }

    public int receberOpcaoValida() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n digite um valor valido");
        return input.nextInt();
    }
}