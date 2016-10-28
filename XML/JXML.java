/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XML;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import Actors.Student;
import Actors.Instructor;
import Actors.Evaluation;
import java.time.LocalDateTime;
/**
 *
 * @author Gary Burch
 */
public class JXML 
{
        private static String instructorName;
        private static String instructorID;
        private static String studentName;
        private static String studentPermitNumber;
        private static String studentDOB;
        private static String evaluationDate;
        private static boolean finalGrade;

        
    public JXML(Student student, Instructor instructor, Evaluation evaluation)
    {
        studentName =  student.getStudentName();
        studentDOB = student.getDateOfBirth();
        studentPermitNumber = student.getPermitNumber();
        instructorID = instructor.getIDNumber();
        instructorName = instructor.getInstructorName();
        evaluationDate = LocalDateTime.now().toString();
        finalGrade = evaluation.getHasPassed();
    }
    
    public void CreateXML()
    {

        try 
        {
            Element root=new Element("DriveLessons");
            Document doc=new Document();
            
            Element stdnt = new Element("Student");            
                stdnt.addContent(new Element("StudentName").addContent(studentName) );
                stdnt.addContent(new Element("PermitNumber").addContent(studentPermitNumber) );
                stdnt.addContent(new Element("DateOfBirth").addContent(studentDOB) );
                
            Element instr = new Element("Instructor");
                instr.addContent(new Element("InstructorName").addContent(instructorName));
                instr.addContent(new Element("InstructorID").addContent(instructorID));
                
            Element eval = new Element("Evaluation");
                eval.addContent(new Element("EvaluationDate").addContent(evaluationDate));
                eval.addContent(new Element("Pass").addContent(getFinalGrade()));
            
            root.addContent(stdnt);
            root.addContent(instr);
            root.addContent(eval);
            
            doc.setRootElement(root);
            
            XMLOutputter outter=new XMLOutputter();
            outter.setFormat(Format.getPrettyFormat());    
            outter.output(doc, new FileWriter(new File("C:\\temp\\myxml.xml")));
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(JXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static String getFinalGrade()
    {
        if(finalGrade == true)
            return "YES";
        else
            return "NO";
    }
}
