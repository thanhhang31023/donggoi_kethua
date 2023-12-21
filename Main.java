package donggoi.kethua;

//- name : string
//-math double
// - physic: double
// - chemistry double
// Student()
//+ Student(name: string, math double. physic: double, chemistry: double)
// + getMath(): double
//+ getPhysic(): double
// + getChemistry(): double
// + display(): void
//avgPoint() double
// getStudentMaxAvg(vt vector<Student>): static vector<Student>
//+ getStudentMaxMath(vt: vector<Student>): static vector<Student>
//getStudentMaxPhysic(vt vector<Student>): static vector<Student>
// getStudentMaxChemistry (vt. vector<Student>); static vector<Student>

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        // Tạo một Vector<Student> để lưu trữ danh sách học sinh
        Vector<Student> students = new Vector<>();

        // Tạo một số đối tượng Student và thêm vào danh sách
        students.add(new Student("Nguyen Van TUan", 10.0, 9.5, 8.5));
        students.add(new Student("Cao Thi Trang", 7.5, 8.0, 7.0));
        students.add(new Student("Tran Dinh Toan", 9.0, 8.5, 9.0));

        // Lấy học sinh thứ nhất trong danh sách
        Student firstStudent = students.get(0);

        // In ra điểm toán của học sinh thứ nhất
        System.out.println("Điểm toán của học sinh thứ nhất là: " + firstStudent.getMath());

        // Lấy học sinh thứ ba trong danh sách
        Student thirdStudent = students.get(2);

        // In ra điểm Hóa của học sinh thứ ba
        System.out.println("Điểm Hóa của học sinh thứ ba là: " + thirdStudent.getChemistry());

        // Lấy học sinh thứ hai trong danh sách
        Student secondStudent = students.get(1);

        // In ra điểm trung bình của học sinh thứ hai
        System.out.println("Điểm trung bình của học sinh thứ hai là: " + secondStudent.avgPoint());


        // Sử dụng các phương thức get để lấy học sinh có điểm cao nhất
        Vector<Student> maxAvgStudents = Student.getStudentMaxAvg(students);
        Vector<Student> maxMathStudents = Student.getStudentMaxMath(students);
        Vector<Student> maxPhysicStudents = Student.getStudentMaxPhysic(students);
        Vector<Student> maxChemistryStudents = Student.getStudentMaxChemistry(students);

        // In thông tin học sinh có điểm trung bình cao nhất
       System.out.println("Học sinh có điểm trung bình cao nhất:"+ maxAvgStudents.get(0).avgPoint());
        for (Student student : maxAvgStudents) {
            student.display();
        }


        // In thông tin học sinh có điểm toán cao nhất
        System.out.println("Học sinh có điểm toán cao nhất:"+maxMathStudents.get(0).getMath());
        for (Student student : maxMathStudents) {
            student.display();
        }

        // In thông tin học sinh có điểm vật lý cao nhất
        System.out.println("Học sinh có điểm vật lý cao nhất:"+maxPhysicStudents.get(0).getPhysic());
        for (Student student : maxPhysicStudents) {
            student.display();
        }

        // In thông tin học sinh có điểm hóa học cao nhất
        System.out.println("Học sinh có điểm hóa học cao nhất:"+maxChemistryStudents.get(0).getChemistry());
        for (Student student : maxChemistryStudents) {
            student.display();
        }
    }
}
