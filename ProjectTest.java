public class ProjectTest {
    public static void main(String[] args) {
        Project p = new Project("Cole", "Friend");
        String elevatorPitch = p.pitch("Cole", "Friend");
        System.out.println(elevatorPitch);
    }
}
