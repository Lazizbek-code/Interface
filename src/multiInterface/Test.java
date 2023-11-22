package multiInterface;

public class Test {
    public static void main(String[] args) {
        Programmer programmer = new ProgrammerWorker();
        programmer.writeCode();

        Teacher teacher = new TeacherWorker();
        teacher.teach();

        Universal universal = new UniversalWorker();
        universal.teach();
        universal.writeCode();
    }
}
