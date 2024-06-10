package bigint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BigIntegerCustom {

    private ArrayList<Integer> list;

    public BigIntegerCustom(String d) {
        for (char c : d.toCharArray()) {
            if (Character.isLetter(c)) {
                throw new IllegalArgumentException("Illegal character: " + c);
            }
        }
        d = d.replaceAll(" ", "");
        list = new ArrayList<>();
        for (int i = 0; i < d.length(); i++) {
            list.add(d.charAt(i) - '0');
        }
    }

    public static ArrayList<Integer> addBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        ArrayList<Integer> result = new ArrayList<>();
        int itA = aList.size() - 1;
        int itB = bList.size() - 1;
        int carry = 0;

        while (itA >= 0 || itB >= 0) {
            int sum = carry;
            if (itA >= 0) {
                sum += aList.get(itA);
                itA--;
            }
            if (itB >= 0) {
                sum += bList.get(itB);
                itB--;
            }
            carry = sum / 10;
            result.add(sum % 10);
        }
        if (carry > 0) {
            result.add(carry);
        }
        Collections.reverse(result);
        return result;
    }

    public static ArrayList<Integer> subtractBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        ArrayList<Integer> result = new ArrayList<>();
        if (aList.size() < bList.size() || (aList.size() == bList.size() && aList.get(0) < bList.get(0))) {
            throw new IllegalArgumentException("a should be greater than or equal to b");
        }
        int itA = aList.size() - 1;
        int itB = bList.size() - 1;
        int borrow = 0;

        while (itA >= 0 || itB >= 0) {
            int digitA = itA >= 0 ? aList.get(itA) : 0;
            int digitB = itB >= 0 ? bList.get(itB) : 0;
            digitA -= borrow;
            if (digitA < digitB) {
                digitA += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.add(digitA - digitB);
            if (itA >= 0) itA--;
            if (itB >= 0) itB--;
        }
        while (result.size() > 1 && result.get(result.size() - 1) == 0) {
            result.remove(result.size() - 1);
        }
        Collections.reverse(result);
        return result;
    }

    public static ArrayList<Integer> multiplyBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(aList.size() + bList.size(), 0));
        for (int i = aList.size() - 1; i >= 0; i--) {
            for (int j = bList.size() - 1; j >= 0; j--) {
                int product = aList.get(i) * bList.get(j);
                int tempSum = result.get(i + j + 1) + product;
                result.set(i + j + 1, tempSum % 10);
                result.set(i + j, result.get(i + j) + tempSum / 10);
            }
        }
        while (result.size() > 1 && result.get(0) == 0) {
            result.remove(0);
        }
        return result;
    }

    public static ArrayList<Integer> divideBigInt(BigIntegerCustom a, BigIntegerCustom b) {
        ArrayList<Integer> aList = a.getList();
        ArrayList<Integer> bList = b.getList();
        if (bList.size() == 1 && bList.get(0) == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        for (int i = 0; i < aList.size(); i++) {
            current.add(aList.get(i));
            int count = 0;
            while (compareLists(current, bList) >= 0) {
                current = subtractLists(current, bList);
                count++;
            }
            result.add(count);
        }
        while (result.size() > 1 && result.get(0) == 0) {
            result.remove(0);
        }
        return result;
    }

    private static int compareLists(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (a.size() != b.size()) {
            return a.size() - b.size();
        }
        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i))) {
                return a.get(i) - b.get(i);
            }
        }
        return 0;
    }

    private static ArrayList<Integer> subtractLists(ArrayList<Integer> a, ArrayList<Integer> b) {
        int borrow = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            int digitA = a.get(i) - borrow;
            int digitB = i < b.size() ? b.get(i) : 0;
            if (digitA < digitB) {
                digitA += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.add(digitA - digitB);
        }
        while (result.size() > 1 && result.get(result.size() - 1) == 0) {
            result.remove(result.size() - 1);
        }
        return result;
    }

    public ArrayList<Integer> getList() {
        return this.list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        String num1 = scanner.nextLine();
        BigIntegerCustom bigInt1 = new BigIntegerCustom(num1);

        System.out.println("Enter the second number:");
        String num2 = scanner.nextLine();
        BigIntegerCustom bigInt2 = new BigIntegerCustom(num2);

        // Addition
        ArrayList<Integer> additionResult = BigIntegerCustom.addBigInt(bigInt1, bigInt2);
        System.out.println("Addition Result: " + additionResult);

        // Subtraction
        ArrayList<Integer> subtractionResult = BigIntegerCustom.subtractBigInt(bigInt1, bigInt2);
        System.out.println("Subtraction Result: " + subtractionResult);

        // Multiplication
        ArrayList<Integer> multiplicationResult = BigIntegerCustom.multiplyBigInt(bigInt1, bigInt2);
        System.out.println("Multiplication Result: " + multiplicationResult);

        // Division
        ArrayList<Integer> divisionResult = BigIntegerCustom.divideBigInt(bigInt1, bigInt2);
        System.out.println("Division Result: " + divisionResult);

        scanner.close();
    }
}