package donggoi.kethua;

// - name : string
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

public class Student {
    private String name;
    private double math;
    private double physic;
    private double chemistry;

    public Student() {
    }

    public Student(String name, double math, double physic, double chemistry) {
        this.name = name;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
    }

    public double getMath() {
        return math;
    }

    public double getPhysic() {
        return physic;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Math: " + math);
        System.out.println("Physic: " + physic);
        System.out.println("Chemistry: " + chemistry);
    }

    public double avgPoint() {
        return (math + physic + chemistry) / 3;
    }

    public static Vector<Student> getStudentMaxAvg(Vector<Student> students) {
        // phương thức tĩnh của lớp Student, nhận vào một Vector chứa các đối tượng Student
        // và trả về một Vector chứa các học sinh có điểm trung bình cao nhất
        Vector<Student> maxAvgStudents = new Vector<>();
        // Khởi tạo một Vector mới để lưu trữ các học sinh có điểm trung bình cao nhất
        double maxAvg = 0;
        for (Student student : students) {
            //Vòng lặp duyệt qua từng học sinh trong danh sách được truyền vào
            double avg = student.avgPoint();
            if (avg > maxAvg) {
                maxAvg = avg;
                maxAvgStudents.clear();
                //Xóa tất cả các học sinh trong danh sách maxAvgStudents
                maxAvgStudents.add(student);
                //và thêm học sinh hiện tại vào danh sách
            } else if (avg == maxAvg) {
                maxAvgStudents.add(student);
            }
        }
        return maxAvgStudents;
    }

    public static Vector<Student> getStudentMaxMath(Vector<Student> students) {
        Vector<Student> maxMathStudents = new Vector<>();
        double maxMath = 0;
        for (Student student : students) {
            double math = student.getMath();
            if (math > maxMath) {
                maxMath = math;
                maxMathStudents.clear();
                maxMathStudents.add(student);
            } else if (math == maxMath) {
                maxMathStudents.add(student);
            }
        }
        return maxMathStudents;
    }

    public static Vector<Student> getStudentMaxPhysic(Vector<Student> students) {
        Vector<Student> maxPhysicStudents = new Vector<>();
        double maxPhysic = 0;
        for (Student student : students) {
            double physic = student.getPhysic();
            if (physic > maxPhysic) {
                maxPhysic = physic;
                maxPhysicStudents.clear();
                maxPhysicStudents.add(student);
            } else if (physic == maxPhysic) {
                maxPhysicStudents.add(student);
            }
        }
        return maxPhysicStudents;
    }

    public static Vector<Student> getStudentMaxChemistry(Vector<Student> students) {
        Vector<Student> maxChemistryStudents = new Vector<>();
        double maxChemistry = 0;
        for (Student student : students) {
            double chemistry = student.getChemistry();
            if (chemistry > maxChemistry) {
                maxChemistry = chemistry;
                maxChemistryStudents.clear();
                maxChemistryStudents.add(student);
            } else if (chemistry == maxChemistry) {
                maxChemistryStudents.add(student);
            }
        }
        return maxChemistryStudents;
    }
}