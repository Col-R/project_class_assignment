public class ProjectTest {
    public static void main(String[] args) {
        Project p1 = new Project();
        System.out.println(p1.getName());
        System.out.println(p1.getDescription());
        System.out.println(p1.pitch());
        Project p2 = new Project("Yuri");
        System.out.println(p2.getName());
        System.out.println(p2.getDescription());
        System.out.println(p2.pitch());
        Project p3 = new Project("Yuri", "catlike");
        System.out.println(p3.getName());
        System.out.println(p3.getDescription());
        System.out.println(p3.pitch());
    }
}
