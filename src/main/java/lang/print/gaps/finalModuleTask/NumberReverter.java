package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String revertedNumber = "";
        while (number != 0) {
            int remainder = number % 10;
            number = number / 10;
            revertedNumber += remainder;
        }
        System.out.println(revertedNumber);
    }
}
