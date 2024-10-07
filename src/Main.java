//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] score = new int[7];
        int num = 0;
        int denom = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = i+5;
            num+=score[i];
            denom= score.length;
        }

        float moy = num/denom;
        System.out.println(num);
        System.out.println(denom);
        System.out.println(moy);





        }
    }
