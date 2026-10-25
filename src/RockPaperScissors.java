import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RockPaperScissors {
    public static void main(String[] args) {
        Random random = new Random();
        String[] varianti = {"Ножницы", "Бумага", "Камень"};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int index = random.nextInt(3);
            String computerMove = varianti[index];
            System.out.println("Введите новое сообщение ");
            String xodusera = scanner.nextLine();
            System.out.println("Ход игрока " + xodusera);
            System.out.println();
            System.out.println("Ход компьютера " + computerMove);
            System.out.println();


            if (xodusera.equals(computerMove)) {
                System.out.println("Ничья");
            } else if ((xodusera.equals("Камень") && computerMove.equals("Ножницы")) ||
                    (xodusera.equals("Бумага") && computerMove.equals("Камень")) ||
                    (xodusera.equals("Ножницы") && computerMove.equals("Бумага"))){
                System.out.println("Пользователь победил!");
            } else {
                System.out.println("Компютер победил");
            }

        }
    }
}