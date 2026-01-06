public class TestFitnessClass {
    public static void main(String[] args) {

        // Constructor 2 มี parameter className, schedule
        FitnessClass c1 = new FitnessClass("Yoga", "Mon 09:00");
        c1.setClassId("C001");
        System.out.println(c1.getClassName());
        System.out.println(c1.getSchedule());

        // Constructor 1 มี parameter classId, className, schedule
        FitnessClass c2 = new FitnessClass("C002", "Boxing", "Tue 17:00");
        c2.setSchedule("Wed 18:00");
        System.out.println(c2.getClassName());
        System.out.println(c2.checkDetails());

    }
}
