package lang.print.gaps.finalModuleTask;

public class NumberReverter {
  public void revert(int number) {

      int hundreds = number / 100;//извлекаеи сотни
      int tens = (number % 100) / 10;//извлекаеи десятки
      int once =  number % 10;//извлекаеи единицы
      int reverseNumber = once * 100 + tens * 10 + hundreds;//Возвращаем в обратном порядке
      System.out.println(reverseNumber);
  }
}
