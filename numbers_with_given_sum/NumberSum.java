public class NumberSum {

  public int[] findNumbers(int[] numberArray, int s) {
    int index1 = 0;
    int index2 = numberArray.length - 1;

    int[] result = new int[] {-1, -1};

    while (index1 != index2) {
      int number1 = numberArray[index1];
      int number2 = numberArray[index2];

      int sum = number1 + number2;

      if (sum < s) {
        index1++;
      }

      if (sum > s) {
        index2--;
      }

      if (sum == s) {
        System.out.println("Found the two numbers!");
        result[0] = number1;
        result[1] = number2;
        break;
      }
    }

    return result;
  }

  public static void main(String args[]) {
    System.out.println("Hello World!");
    NumberSum ns = new NumberSum();
    int s = 9;

    int[] result = ns.findNumbers(new int[]{1, 2, 3, 4, 5}, s);
    System.out.println("S: " + s);
    System.out.println("Number1: " + result[0]);
    System.out.println("Number2: " + result[1]);
  }

}