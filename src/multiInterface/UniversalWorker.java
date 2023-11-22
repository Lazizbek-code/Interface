package multiInterface;

public class UniversalWorker implements Universal{
    @Override
    public void writeCode() {
        System.out.println("Universal worker coding...");
    }

    @Override
    public void teach() {
        System.out.println("Universal worker teaching...");
    }
}
