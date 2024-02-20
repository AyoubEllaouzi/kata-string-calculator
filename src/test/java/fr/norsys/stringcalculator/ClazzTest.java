package fr.norsys.stringcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClazzTest{
    Clazz clazz;
  @Test
    public void shouldAddTowNumbers(){
      clazz = new Clazz();
      int expected =3;
      int result = clazz.add("1,2");
    System.out.println(result);
      assertEquals(result,expected);
    }

  @Test
  public void shouldAddOneNumber(){
    clazz = new Clazz();
    int expected =3;
    int result = clazz.add("3");
    System.out.println(result);

    assertEquals(result,expected);
  }

  @Test void souldAddNoNumbers(){
    clazz = new Clazz();
    int expected = 0;
    int result = clazz.add(",");
    System.out.println(result);

    assertEquals(result,expected);

  }
  @Test
  public void shouldAddNoNumbers2() {
    clazz = new Clazz();
    int expected = 0;
    int result = clazz.add("");
    System.out.println(result);
    assertEquals(expected, result);
  }



//3-1

  @Test
  public void shouldEqual6() {
    clazz = new Clazz();
    int expected = 6;
    int result = clazz.add("1\n2,3");
    System.out.println(result);
    assertEquals(expected, result);
  }
  //5
  @Test
  public void shouldThrowExceptionWithNegativeNumbers() {
    clazz = new Clazz();
    String input = "1,-2,-3";
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
      clazz.add(input);
    });
    assertEquals("The Negative Numbers are: [-2, -3]", exception.getMessage());
  }

  //6
  @Test
  public void shouldIgnoredMoreThan1000() {
    clazz = new Clazz();
    int expected = 2;
    int result = clazz.add("2,1001");
    System.out.println(result);
    assertEquals(expected, result);
  }

}