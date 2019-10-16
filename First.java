package Version1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		read r = new read();
		try {
			r.test();
		} catch (Exception w) {
			w.printStackTrace();
		}
	}
}

class read {

	public void test() throws FileNotFoundException  {

		Scanner sc = new Scanner(new FileInputStream("G:/student.txt"));   //�����file�ļ����£���Ҫ����file/�ĵ�����.�ļ�����
		int n = sc.nextInt();
		Student[] students = new Student[n];
		for (int i = 0; i < n; i++) {
			String info = sc.next();
			String stuId = info.split(",")[0];
			String stuName = info.split(",")[1];
			String stuClass = info.split(",")[2];
			students[i] = new Student(stuId, stuName, stuClass);
		}
		for (Student student : students) {
			String in = student.toString();
			System.out.println(in);
		}
		sc.close();
	}
}

class Student {
	private String Id;
	private String Name;
	private String StuClass;

	public Student() {

	}

	public Student(String Id, String Name, String StuClass) {
		this.Id = Id;
		this.Name = Name;
		this.StuClass = StuClass;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getStuClass() {
		return StuClass;
	}

	public void setStuClass(String StuClass) {
		this.StuClass = StuClass;
	}

	@Override
	public String toString() {
		return "ѧ���ǣ�" + Id + "   �����ǣ�" + Name + "   �༶��:" + StuClass;
	}
}
