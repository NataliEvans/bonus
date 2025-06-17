//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Начальный баланс клиента
        int initialBalance = 50;
        int topUp1 = 200;   // пополнение 1
        int topUp2 = 2000;  // пополнение 2

        // считаем бонус как целое деление суммы пополнений на 100
        int bonusMiles = (topUp1 + topUp2) / 100;

        int totalBalance = initialBalance + topUp1 + topUp2;

        System.out.println("Бонусные мили: " + bonusMiles);
        System.out.println("Итоговый счет: " + totalBalance);
    }
}