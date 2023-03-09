package exercicio2;

public class Exercicio2 {

    // Responda se verificação é True ou False:
    public static void main(String[] args) {
        // a)verificacao=10==10&&10==20;

        int verificacao = 10;
        String resp = verificacao == 10 && verificacao == 20 ? "true" : "false";
        System.out.println(resp);

        // b)verificacao=11==12&&20==20;
        verificacao = 11;
        String r = verificacao == 12 && 20 == 20 ? "true" : "false";
        System.out.println(r);

        //c)verificacao=15==15&&16==16;
        verificacao = 15;
        String a = verificacao == 15 && 16 == 16 ? "true" : "false";
        System.out.println(a);

        //d)verificacao=12==11&&23==24;
        verificacao = 12;
        String z = verificacao == 12 && 23 == 24 ? "true" : "false";
        System.out.println(z);

        //e)verificacao=10==10||10==20;
        verificacao = 10;
        String x = verificacao == 10 || 10 == 20 ? "true" : "false";
        System.out.println(x);

        //f)verificacao=11==12||20==20;
        verificacao = 11;
        String y = verificacao == 12 || 20 == 20 ? "true" : "false";
        System.out.println(r);

        // g)verificacao=15==15||16==16;
        verificacao = 15;
        String c = verificacao == 15 || 16 == 16 ? "true" : "false";
        System.out.println(c);

        //h)verificacao=12==11||23==24;
        verificacao = 12;
        String d = verificacao == 11 || 23 == 24 ? "true" : "false";
        System.out.println(r);

    }

}
