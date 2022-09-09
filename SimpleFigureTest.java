public class SimpleFigureTest {
    public static void main(String[] args) {
        SimpleFigure figure = new SimpleFigure(3);
        int[] location = {2, 3, 4};
        int correctValue = 2;
        int wrongValue = 5;
        String resultCorrect = "!Test with correct values failed!";
        String resultWrong = "!Test with wrong values failed!";

        figure.setLocationCells(location);

        if (figure.checkSelf(correctValue) == "Correct") {
            resultCorrect = "Test with correct values completed successfully!";
        } 
        System.out.println(resultCorrect);

        if (figure.checkSelf(wrongValue) == "Missed") {
            resultWrong = "Test with wrong values completed successfully!";
        }
        System.out.println(resultWrong);
    }
}
