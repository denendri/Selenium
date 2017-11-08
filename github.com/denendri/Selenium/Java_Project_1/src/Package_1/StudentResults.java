package Package_1;

import java.util.Scanner;

import StudentMarks.Subjects;

public class StudentResults {

                public static void main(String[] args) {
                                
                    Scanner scanner = new Scanner(System.in);       
                    int studentLoop, subjectLoop, numberOfSubjects, totalMarksForStudent;
                    double classGPA = 0.0;
                    boolean flag = false;
                Subjects subject = new Subjects();

                    System.out.print("Enter the number of students in your class:");
                    String [][] studentDetails = new String[scanner.nextInt()][2];
                    
                    for(studentLoop=1; studentLoop <= studentDetails.length ; studentLoop++){    
                                System.out.print("Enter the name of student " + studentLoop + " :");
                                studentDetails[studentLoop - 1][0] = scanner.next();  
                                
                                do{
                                flag = false;
                                System.out.print("Enter the number of subjects for student " + studentLoop + " :");       
                                numberOfSubjects = scanner.nextInt();
                                
                                if (numberOfSubjects > 8){
                                                System.out.println("Maximum number of subject is 8. Please re enter!" );
                                                flag = true;
                                }
                                
                                }while(flag);
                                
                                Subjects listOfSubject [] = new Subjects[numberOfSubjects];
                                totalMarksForStudent = 0;
                                
                                for ( subjectLoop=1; subjectLoop <=listOfSubject.length ; subjectLoop++ ){
                                                System.out.print("Enter the Subject " + subjectLoop + " for student " + studentLoop + " :"); 
                                                System.out.print("Enter the mark for " + scanner.next() + " for student " + studentLoop + " :");                                          
                                                totalMarksForStudent += scanner.nextInt();
                                                listOfSubject [subjectLoop - 1]=subject;                                                
                                }
                                
                                studentDetails[studentLoop - 1][1] = String.valueOf(totalMarksForStudent / 8.0);                                                                                            
                    }
                    
                    scanner.close();
                        
                    for(studentLoop=1; studentLoop <= studentDetails.length ; studentLoop++){
                                classGPA += Double.parseDouble(studentDetails[studentLoop-1][1]);
                                System.out.println("Student " + studentLoop + ": "+ studentDetails[studentLoop-1][0] + " -> GPA = " +studentDetails[studentLoop-1][1] );
                    }
                    
                    System.out.println("Class GPA = " + classGPA/studentDetails.length);
                }

}
