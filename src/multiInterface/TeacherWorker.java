package multiInterface;

public class TeacherWorker implements Teacher{
    @Override
    public void teach() {
        System.out.println("Teacher is teaching");
    }
}
