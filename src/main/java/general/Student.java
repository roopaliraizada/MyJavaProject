package main.java.general;

//Java program to demonstrate working of Comparator
//interface
import java.util.Comparator;

//A class to represent a student.
class Student
{
 int rollno;
 String name, address;
 
 

 public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

// Constructor
 public Student(int rollno, String name,
                            String address)
 {
     this.rollno = rollno;
     this.name = name;
     this.address = address;
 }

 // Used to print student details in main()
 public String toString()
 {
     return this.rollno + " " + this.name +
                        " " + this.address;
 }
}

class Sortbyroll implements Comparator<Student>
{
 // Used for sorting in ascending order of
 // roll number
 public int compare(Student a, Student b)
 {
     return a.rollno - b.rollno;
 }
}

class Sortbyname implements Comparator<Student>
{
 // Used for sorting in ascending order of
 // roll name
 public int compare(Student a, Student b)
 {
     return a.name.compareTo(b.name);
 }
}


