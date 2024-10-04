package com.mycompany.projetoyoutube;

import java.util.Scanner;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Video v[] = new Video[3];
        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o título do vídeo " + (i + 1) + ": ");
            String titulo = input.nextLine();
            v[i] = new Video(titulo);
        }

        for (Video video : v) {
            System.out.println(video.toString());
        }

        Gafanhoto g[] = new Gafanhoto[2];
        for (int i = 0; i < g.length; i++) {
            System.out.print("Digite o nome do Gafanhoto " + (i + 1) + ": ");
            String nome = input.nextLine();
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = input.nextInt();
            input.nextLine(); 
            System.out.print("Digite o sexo de " + nome + " (M/F): ");
            String sexo = input.nextLine();
            System.out.print("Digite o login de " + nome + ": ");
            String login = input.nextLine();
            g[i] = new Gafanhoto(nome, idade, sexo, login);
        }

        for (Gafanhoto gafanhoto : g) {
            System.out.println(gafanhoto.toString());
        }

        Visualizacao s[] = new Visualizacao[2];
        for (int i = 0; i < s.length; i++) {
            System.out.println("Criando visualização " + (i + 1));
            System.out.print("Escolha o Gafanhoto (0 para " + g[0].getNome() + ", 1 para " + g[1].getNome() + "): ");
            int gafanhotoIndex = input.nextInt();
            System.out.print("Escolha o Vídeo (0 para " + v[0].getTitulo() + ", 1 para " + v[1].getTitulo() + ", 2 para " + v[2].getTitulo() + "): ");
            int videoIndex = input.nextInt();
            input.nextLine(); 
            
            s[i] = new Visualizacao(g[gafanhotoIndex], v[videoIndex]);
            
            System.out.print("Deseja avaliar o vídeo? (1 para Sim, 0 para Não): ");
            int avaliar = input.nextInt();
            if (avaliar == 1) {
                System.out.print("Digite a nota de avaliação (0-100): ");
                int nota = input.nextInt();
                s[i].avaliar(nota);
            } 
            else {
                s[i].avaliar(); 
            }
        }

        for (Visualizacao visualizacao : s) {
            System.out.println(visualizacao.toString());
        }
        
        input.close();
    }
}
