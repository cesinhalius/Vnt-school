package jogodavelha;

import java.util.*;

public class Jogo {

    private final Tabuleiro tabuleiro;
    private int rodada = 1, vez = 1;
    private Jogador jogador1;
    private Jogador jogador2;
    

    public Jogo() {
        tabuleiro = new Tabuleiro();
        iniciarJogadores();

        while (Jogar());
    }

    public void iniciarJogadores() {

        this.jogador1 = new Humano(1);

        this.jogador2 = new Humano(2);

    }

    public boolean Jogar() {
        if (ganhou() == 0) {
            System.out.println("----------------------");
            System.out.println("\nRodada " + rodada);
            System.out.println("Eh a vez do jogador " + vez());

            if (vez() == 1) {
                jogador1.jogar(tabuleiro);
            } else {
                jogador2.jogar(tabuleiro);
            }

            if (tabuleiro.tabuleiroCompleto()) {
                System.out.println("Deu velha. Jogo empatado");
                return false;
            }
            vez++;
            rodada++;

            return true;
        } else {
            if (ganhou() == -1) {
                System.out.println("Jogador 1 ganhou!");
            } else {
                System.out.println("Jogador 2 ganhou!");
            }

            return false;
        }

    }

    public int vez() {
        if (vez % 2 == 1) {
            return 1;
        } else {
            return 2;
        }
    }

    public int ganhou() {
        if (tabuleiro.checaLinhas() == 1) {
            return 1;
        }
        if (tabuleiro.checaColunas() == 1) {
            return 1;
        }
        if (tabuleiro.checaDiagonais() == 1) {
            return 1;
        }

        if (tabuleiro.checaLinhas() == -1) {
            return -1;
        }
        if (tabuleiro.checaColunas() == -1) {
            return -1;
        }
        if (tabuleiro.checaDiagonais() == -1) {
            return -1;
        }

        return 0;
    }
}
