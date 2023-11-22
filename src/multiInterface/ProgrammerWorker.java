package multiInterface;

public class ProgrammerWorker implements Programmer{
    @Override
    public void writeCode() {
        System.out.println("Programmer is coding");
    }
}
