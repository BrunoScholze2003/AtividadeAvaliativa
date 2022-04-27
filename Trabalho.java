import java.util.Scanner;

public class Trabalho{
    public static void main(String[] args) {
        int matriz[][] = {{2,3},{4,5}};
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe quantos graus vocêgostaria de rotacionar");
        int graus = leitor.nextInt();

        switch(graus){
            case 360:
                imprimir(matriz);
            case 90:
                int[][] noventaRotacao = rotacionarAngulos(matriz);
                imprimir(noventaRotacao);
                break;
            case 180:
                int [][] centoEOitentaRotacao = rotacionarAngulos(matriz);
                int [][] x = rotacionarAngulos(centoEOitentaRotacao);
                imprimir(x);
                break;
            case 270:
                int [][] duzentosESetentaRotacao = rotacionarAngulos(matriz);
                int [][] a = rotacionarAngulos(duzentosESetentaRotacao);
                int [][] y = rotacionarAngulos(a);
                imprimir(y);
                break;
        }   
    }

    public static int[][] rotacionarAngulos(int[][] matriz) {
        int largura = matriz.length;
        int altura = matriz[0].length;
        int[][] ret = new int[altura][largura];
        for (int i=0; i<altura; i++) {
            for (int j=0; j<largura; j++) {
                ret[i][j] = matriz[largura - j - 1][i];
            }
         }
        return ret;
    }

    public static void imprimir(int [][] ret){
        for(int i[] : ret){
            for(int valores : i){
                System.out.print(valores);
            }
            System.out.println("");
        }
    }
    
}
