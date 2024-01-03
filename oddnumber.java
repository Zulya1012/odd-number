public class oddnumber {
  public static void main(String[] arg) {
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 4) {
        continue;
      }
      System.out.println(i);
    }
  }
}
