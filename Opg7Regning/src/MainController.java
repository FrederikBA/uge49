public class MainController {

    public void runProgram() {
        Regning regning = new Regning();
        try {
            regning.calc(25, 10);
        } catch (InvalidNumberException e) {
            e.printErrorMessage();
        }
    }

}
