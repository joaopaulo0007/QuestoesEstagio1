package questões;
import java.util.Scanner;
public class Quest2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String palavra;
        System.out.println("Digite uma palavra: ");
        palavra = sr.nextLine();
        int num=0;
        for (int index = 0; index < palavra.length(); index++) {
            if (palavra.charAt(index)== 'a' || palavra.charAt(index)=='A') {
                num++;
            }
        }
        if (num>0) {
            System.out.println("A letra a apareceu "+ num+" vezes");
        }
        else{
            System.out.println("A letra a não apareceu na palavra");
        }
    }
}
