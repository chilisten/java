package Laboratorki1;

import java.text.DecimalFormat;

public class lb4 {

    public static void main(String[] args) {
        int minutes = 60;
        int messages = 55;

        int includedMinutes = 50;
        int includedMessages = 50;
        double baseCost = 15.00;
        double costExtraMinute = 0.25;
        double costExtraMessage = 0.15;
        double Support = 0.44;
        double taxRate = 0.05;

        int extraMinutes = Math.max(0, minutes - includedMinutes);
        int extraMessages = Math.max(0, messages - includedMessages);

        double costExtraMinutes = extraMinutes * costExtraMinute;
        double costExtraMessages = extraMessages * costExtraMessage;

        double subtotal = baseCost + costExtraMinutes + costExtraMessages + Support;

        double tax = subtotal * taxRate;

        double total = subtotal + tax;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Базовая стоимость: $" + df.format(baseCost));
        if (extraMinutes > 0) {
            System.out.println("Дополнительные минуты: $" + df.format(costExtraMinutes) + " (" + extraMinutes + " минут)");
        }
        if (extraMessages > 0) {
            System.out.println("Дополнительные сообщения: $" + df.format(costExtraMessages) + " (" + extraMessages + " сообщений)");
        }
        System.out.println("Сбор за 911: $" + df.format(Support));
        System.out.println("Налог: $" + df.format(tax) + " (5% от общей суммы $" + df.format(subtotal) + ")");
        System.out.println("Итоговая сумма: $" + df.format(total));
    }
}

