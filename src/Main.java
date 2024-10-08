//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    /**
     * @param tableau une liste de int utilisé dans afficher_tab
     * @return l'affichage de la liste
     */
    public static String afficher_tab(int[] tableau){
        int[] tab = new int[tableau.length];
        String tae ="";
        for (int i = 0; i < tableau.length; i++) {
            tab[i] = tableau[i];
            tae+= tab[i];
            tae+=" ";

        }

        return tae;
    }

    /**
     * @param tableau une liste de int utilisé dans plus_grand
     * @return l'élément le plus grand de la liste
     */
    public static int plus_grand(int[] tableau){
        int nbr = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > tableau[0]){
                    nbr = tableau[i];
            }

        }
        return nbr;
    }

    /**
     * @param tableau une liste de int utilisé dans moins_10
     * @return vrai si un élément est plus petit que 10
     */
    public static boolean moins_10(int[] tableau){
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] < 10){
                return true;
            }
        }
        return false;
    }


    /**
     * @param tableau une liste de int triée utilisé dans recherche_binaire
     * @param element un int utilisé dans recherche_binaire
     * @return l'indice ou se trouve l'élément et si il n'y est pas renvoie -1
     */
    public static int recherche_dichotomie(int[] tableau, int element){
        int idebut= 0;
        int ifin = tableau.length;
        int imilieu = (ifin-idebut)/2;
        while (tableau[imilieu] != element){
            imilieu = idebut +((ifin-idebut)/2);
            if (imilieu == idebut || imilieu == ifin){
                break;
            }
            else if (tableau[imilieu] > element){
                ifin = imilieu;
            }
            else if (tableau[imilieu] < element){
                idebut = imilieu;

            }
        }
        if (tableau[imilieu] == element){
            return imilieu;
        }
        else{
            return -1;
        }
    }



    /**
     * @param tableau une liste de int utilisé dans binaire récursif
     * @param element un int utiisé dans binaire récursif
     * @return la même chose que recherche binaire mais en récursif
     */
//    public static int binaire_recursif(int[] tableau, int element) {
//        if (tableau[imilieu] == element) {
//            return imilieu;
//        } else if (element <) {
//            break;
//
//        }
//    }


        public static void main(String[] args) {

        int[] score = new int[7];
        int num = 0;
        int denom = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = i+5;
            num+=score[i];
            denom= score.length;

            System.out.print(score[i]+" ");
        }




        float moy = num/denom;
        System.out.println(" ");
        System.out.println("Le numérateur est : " +num);
        System.out.println("Le dénominateur est : " +denom);
        System.out.println("La moyenne est : " + moy);


        System.out.println(afficher_tab(score));
        System.out.println(plus_grand(score));
        System.out.println(moins_10(score));
        System.out.println("  ");
        System.out.println(recherche_dichotomie(score, 11));
//        System.out.println(binaire_recursif(score, 10));


        }
    }
