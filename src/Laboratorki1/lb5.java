package Laboratorki1;

public class lb5 {
    public static void main(String[] args) {
        String[] transactions = {
                "Пополнение через банкомат ~ +1000",
                "Оплата интернета ~ -500",
                "Кафе ~ -300",
                "Зарплата ~ +15000",
                "Штраф за парковку ~ -2500",
                "Подарок ~ +2000"
        };

        int result = 0;

        for (String transaction : transactions) {

            String[] parts = transaction.split(" ~ ");
            String description = parts[0];
            int amount = Integer.parseInt(parts[1]);


            if (amount > 0) {
                result += amount;
            } else {
                result -= Math.abs(amount);
            }
        }

        System.out.println("Итоговая сумма на счету составляет " + result + ".");
    }
}
