package org.example;

public class MultiplicationTable {
  public static void main(String[] args) {
    int tableSize = 10;

    // Печатаем заголовок таблицы
    System.out.printf("  |");
    for (int i = 1; i <= tableSize; i++) {
      System.out.printf("%4d", i);
    }
    System.out.println();
    System.out.println("----------------------------------------------");

    // Печатаем таблицу умножения
    for (int i = 1; i <= tableSize; i++) {
      System.out.printf("%2d|", i);
      for (int j = 1; j <= tableSize; j++) {
        System.out.printf("%4d", i * j);
      }
      System.out.println();
    }
  }
}