

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import org.jdatepicker.DateModel;
import org.jdatepicker.JDatePanel;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.UtilDateModel;
import XML.JXML;
import Actors.Student;
import Actors.Instructor;
import Actors.Evaluation;

import javax.swing.*;
import javax.swing.text.NumberFormatter;

public class MainWindow {
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
	//Gary 10.27.2016
	//Add following four class objects - must also add imports at the top
        static Student student;
        static Instructor instructor;
        static Evaluation evaluation;
        JXML xml;
        
	static JLabel preentrycheckslabel;
	static JFormattedTextField preentrycheckstext;
	static JLabel prestartlabel;
	static JFormattedTextField prestarttext;
	static JLabel movingforwardlabel;
	static JFormattedTextField movingforwardtext;
	static JLabel movingbackwardlabel;
	static JFormattedTextField movingbackwardtext;
	static JLabel enteringtrafficlabel;
	static JFormattedTextField enteringtraffictext;
	static JLabel rightturnslabel;
	static JFormattedTextField rightturnstext;
	static JLabel leftturnslabel;
	static JFormattedTextField leftturnstext;
	static JLabel intersectionslabel;
	static JFormattedTextField intersectionstext;
	static JLabel changinglaneslabel;
	static JFormattedTextField changinglanestext;
	static JLabel slowinglabel;
	static JFormattedTextField slowingtext;
	static JLabel parkingandsecuringlabel;
	static JFormattedTextField parkingandsecuringtext;
	static JLabel parkingongradeslabel;
	static JFormattedTextField parkingongradestext;
	static JLabel angleparkinglabel;
	static JFormattedTextField angleparkingtext;
	static JLabel parallelparkinglabel;
	static JFormattedTextField parallelparkingtext;
	static JLabel turnaboutslabel;
	static JFormattedTextField turnaboutstext;
	static JLabel assessinglabel;
	static JFormattedTextField assessingtext;
	static JLabel spacemanagementlabel;
	static JFormattedTextField spacemanagementtext;
	static JLabel responsetotrafficcontrolslabel;
	static JFormattedTextField responsetotrafficcontrolstext;
	static JLabel responsetootheruserslabel;
	static JFormattedTextField responsetootheruserstext;
	static JLabel passinglabel;
	static JFormattedTextField passingtext;
	static JLabel commentarydrivinglabel;
	static JFormattedTextField commentarydrivingtext;
	static JLabel speedlabel;
	static JFormattedTextField speedtext;
	static JLabel drivingappropriatelabel;
	static JFormattedTextField drivingappropriatetext;	
	static JLabel adverseweatherlabel;
	static JFormattedTextField adverseweathertext;
	static JLabel nightdrivinglabel;
	static JFormattedTextField nightdrivingtext;
	static JLabel finalevaluationlabel;
	static JLabel passlabel;
	static JLabel faillabel;
	static JRadioButton passbutton;
    static JRadioButton failbutton;
    static ButtonGroup passfailbuttongroup;
    



	private static void createAndShowGUI() {
        //Create and set up the window.
        final JFrame frame = new JFrame("Elite Driving School");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBounds(100, 100, 800, 600);
        frame.setBackground(new Color(0,0,139));
       
        final JPanel mainpanel = new JPanel();
        mainpanel.setLayout(null);
        mainpanel.setBackground(new Color(0, 0, 139));
        
        final JLabel headerlabel = new JLabel("Driver Education Student In-Car Evaluation/Progress Record");
        headerlabel.setForeground(Color.YELLOW);
        headerlabel.setBounds(150,10,600,25);
        headerlabel.setFont(new Font("Serif", Font.BOLD, 20));
        mainpanel.add(headerlabel);
        
        
            
        
        final JLabel studentlabel = new JLabel("Student: ");
        studentlabel.setForeground(Color.YELLOW);
        studentlabel.setBounds(25,35,100,25);
        studentlabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(studentlabel);

        final JTextField studenttext = new JTextField();
        studenttext.setBounds(200, 35, 225, 25);
        mainpanel.add(studenttext);
        studenttext.setColumns(50);

        final JLabel instructorlabel = new JLabel("Instructor: ");
        instructorlabel.setForeground(Color.YELLOW);
        instructorlabel.setBounds(25,60,100,25);
        instructorlabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(instructorlabel);

        final JTextField instructortext = new JTextField();
        instructortext.setBounds(200, 60, 225, 25);
        mainpanel.add(instructortext);
        instructortext.setColumns(50);

        final JLabel datelabel = new JLabel("Date: ");
        datelabel.setForeground(Color.YELLOW);
        datelabel.setBounds(25,85,100,25);
        datelabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(datelabel);

        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        UtilDateModel model = new UtilDateModel();
        final JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        datePanel.setBounds(203,85,225,200);
        mainpanel.add(datePanel);
        
        final JTextField datetext = new JTextField();
        datetext.setBounds(200, 85, 225, 25);
        mainpanel.add(datetext);
        datetext.setColumns(75);
        datetext.setVisible(false);
        mainpanel.add(datetext);

        JButton savedatebutton = new JButton("Save Date");
        savedatebutton.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Save date button pressed");
		        Date selectedDate = (Date) datePanel.getModel().getValue();
		        String date=selectedDate+"";
		        System.out.println("date = " + date);
		        datePanel.setVisible(false);
		        datetext.setText(date);
		        datetext.setVisible(true);
			//Gary 10.27.16
			//****** This code following is where the text from the screen is pulled
                        student = new Student();
                        student.setStudentName(studenttext.getText());
                        instructor = new Instructor();
                        instructor.setInstructorName(instructortext.getText());
                        instructor.setIDNumber("IDNumberVariablegoeshere"); //replace Instructor ID with var when its available on scrn
                        evaluation = new Evaluation();
                        evaluation.setHasPassed(passbutton.isSelected());
			//Gary 10.27.16
			//The next two lines we send the information to the JXML class to produce the XML file
                        JXML xml = new JXML(student, instructor, evaluation);
                        xml.CreateXML();

		        setWidgetVisibility(true);
			}
          });
        savedatebutton.setBounds(425, 85, 100, 25);
        mainpanel.add(savedatebutton);
        
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(1);
        formatter.setMaximum(4);
        formatter.setAllowsInvalid(false);
        // If you want the value to be committed on each keystroke instead of focus lost
        formatter.setCommitsOnValidEdit(true);

        preentrycheckslabel = new JLabel("Pre-Entry Checks:");
        preentrycheckslabel.setForeground(Color.YELLOW);
        preentrycheckslabel.setBounds(25,110,175,25);
        preentrycheckslabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(preentrycheckslabel);

        preentrycheckstext = new JFormattedTextField(formatter);
        preentrycheckstext.setBounds(200, 110, 25, 25);
        mainpanel.add(preentrycheckstext);
        preentrycheckstext.setColumns(1);
        mainpanel.add(preentrycheckstext);

//        final JLabel prestartlabel = new JLabel("Pre-Start and Starting: ");
        prestartlabel = new JLabel("Pre-Start and Starting: ");
        prestartlabel.setForeground(Color.YELLOW);
        prestartlabel.setBounds(25,135,175,25);
        prestartlabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(prestartlabel);

//        final JFormattedTextField prestarttext = new JFormattedTextField(formatter);
        prestarttext = new JFormattedTextField(formatter);
        prestarttext.setBounds(200, 135, 25, 25);
        mainpanel.add(prestarttext);
        prestarttext.setColumns(1);
        mainpanel.add(prestarttext);

//        final JLabel movingforwardlabel = new JLabel("Moving Forward: ");
        movingforwardlabel = new JLabel("Moving Forward: ");
        movingforwardlabel.setForeground(Color.YELLOW);
        movingforwardlabel.setBounds(25,160,175,25);
        movingforwardlabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(movingforwardlabel);

//        final JFormattedTextField movingforwardtext = new JFormattedTextField(formatter);
        movingforwardtext = new JFormattedTextField(formatter);
        movingforwardtext.setBounds(200, 160, 25, 25);
        mainpanel.add(movingforwardtext);
        movingforwardtext.setColumns(1);
        mainpanel.add(movingforwardtext);

//        final JLabel movingbackwardlabel = new JLabel("Moving Backward: ");
        movingbackwardlabel = new JLabel("Moving Forward: ");
        movingbackwardlabel.setForeground(Color.YELLOW);
        movingbackwardlabel.setBounds(25,185,175,25);
        movingbackwardlabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(movingbackwardlabel);

//        final JFormattedTextField movingbackwardtext = new JFormattedTextField(formatter);
        movingbackwardtext = new JFormattedTextField(formatter);
        movingbackwardtext.setBounds(200, 185, 25, 25);
        mainpanel.add(movingbackwardtext);
        movingbackwardtext.setColumns(1);
        mainpanel.add(movingbackwardtext);

//        final JLabel enteringtrafficlabel = new JLabel("Entering Traffic: ");
        enteringtrafficlabel = new JLabel("Entering Traffic: ");
        enteringtrafficlabel.setForeground(Color.YELLOW);
        enteringtrafficlabel.setBounds(25,210,175,25);
        enteringtrafficlabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(enteringtrafficlabel);

//        final JFormattedTextField enteringtraffictext = new JFormattedTextField(formatter);
        enteringtraffictext = new JFormattedTextField(formatter);
        enteringtraffictext.setBounds(200, 210, 25, 25);
        mainpanel.add(enteringtraffictext);
        enteringtraffictext.setColumns(1);
        mainpanel.add(enteringtraffictext);

//        final JLabel rightturnslabel = new JLabel("Right Turns: ");
        rightturnslabel = new JLabel("Right Turns: ");
        rightturnslabel.setForeground(Color.YELLOW);
        rightturnslabel.setBounds(25,235,175,25);
        rightturnslabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(rightturnslabel);

//        final JFormattedTextField rightturnstext = new JFormattedTextField(formatter);
        rightturnstext = new JFormattedTextField(formatter);
        rightturnstext.setBounds(200, 235, 25, 25);
        mainpanel.add(rightturnstext);
        rightturnstext.setColumns(1);
        mainpanel.add(rightturnstext);

//        final JLabel leftturnslabel = new JLabel("Left Turns: ");
        leftturnslabel = new JLabel("Left Turns: ");
        leftturnslabel.setForeground(Color.YELLOW);
        leftturnslabel.setBounds(25,260,175,25);
        leftturnslabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(leftturnslabel);

//        final JFormattedTextField leftturnstext = new JFormattedTextField(formatter);
        leftturnstext = new JFormattedTextField(formatter);
        leftturnstext.setBounds(200, 260, 25, 25);
        mainpanel.add(leftturnstext);
        leftturnstext.setColumns(1);
        mainpanel.add(leftturnstext);

//        final JLabel intersectionslabel = new JLabel("Negotiating Intersections: ");
        intersectionslabel = new JLabel("Negotiating Intersections: ");
        intersectionslabel.setForeground(Color.YELLOW);
        intersectionslabel.setBounds(25,285,200,25);
        intersectionslabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(intersectionslabel);

//        final JFormattedTextField intersectionstext = new JFormattedTextField(formatter);
        intersectionstext = new JFormattedTextField(formatter);
        intersectionstext.setBounds(200, 285, 25, 25);
        mainpanel.add(intersectionstext);
        intersectionstext.setColumns(1);
        mainpanel.add(intersectionstext);

//        final JLabel changinglaneslabel = new JLabel("Changing Lanes: ");
        changinglaneslabel = new JLabel("Changing Lanes: ");
        changinglaneslabel.setForeground(Color.YELLOW);
        changinglaneslabel.setBounds(25,310,200,25);
        changinglaneslabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(changinglaneslabel);

//        final JFormattedTextField changinglanestext = new JFormattedTextField(formatter);
        changinglanestext = new JFormattedTextField(formatter);
        changinglanestext.setBounds(200, 310, 25, 25);
        mainpanel.add(changinglanestext);
        changinglanestext.setColumns(1);
        mainpanel.add(changinglanestext);

//        final JLabel slowinglabel = new JLabel("Slowing and Stopping: ");
        slowinglabel = new JLabel("Slowing and Stopping: ");
        slowinglabel.setForeground(Color.YELLOW);
        slowinglabel.setBounds(250,110,200,25);
        slowinglabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(slowinglabel);

//        final JFormattedTextField slowingtext = new JFormattedTextField(formatter);
        slowingtext = new JFormattedTextField(formatter);
        slowingtext.setBounds(475, 110, 25, 25);
        mainpanel.add(slowingtext);
        slowingtext.setColumns(1);
        mainpanel.add(slowingtext);

//        final JLabel parkingandsecuringlabel = new JLabel("Parking and Securing: ");
        parkingandsecuringlabel = new JLabel("Parking and Securing: ");
        parkingandsecuringlabel.setForeground(Color.YELLOW);
        parkingandsecuringlabel.setBounds(250,135,200,25);
        parkingandsecuringlabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(parkingandsecuringlabel);

//        final JFormattedTextField parkingandsecuringtext = new JFormattedTextField(formatter);
        parkingandsecuringtext = new JFormattedTextField(formatter);
        parkingandsecuringtext.setBounds(475, 135, 25, 25);
        mainpanel.add(parkingandsecuringtext);
        parkingandsecuringtext.setColumns(1);
        mainpanel.add(parkingandsecuringtext);

//        final JLabel parkingongradeslabel = new JLabel("Parking on Grades: ");
        parkingongradeslabel = new JLabel("Parking on Grades: ");
        parkingongradeslabel.setForeground(Color.YELLOW);
        parkingongradeslabel.setBounds(250,160,200,25);
        parkingongradeslabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(parkingongradeslabel);

//        final JFormattedTextField parkingongradestext = new JFormattedTextField(formatter);
        parkingongradestext = new JFormattedTextField(formatter);
        parkingongradestext.setBounds(475, 160, 25, 25);
        mainpanel.add(parkingongradestext);
        parkingongradestext.setColumns(1);
        mainpanel.add(parkingongradestext);

//        final JLabel angleparkinglabel = new JLabel("Angle Parking: ");
        angleparkinglabel = new JLabel("Angle Parking: ");
        angleparkinglabel.setForeground(Color.YELLOW);
        angleparkinglabel.setBounds(250,185,200,25);
        angleparkinglabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(angleparkinglabel);

//        final JFormattedTextField angleparkingtext = new JFormattedTextField(formatter);
        angleparkingtext = new JFormattedTextField(formatter);
        angleparkingtext.setBounds(475, 185, 25, 25);
        mainpanel.add(angleparkingtext);
        angleparkingtext.setColumns(1);
        mainpanel.add(angleparkingtext);

//        final JLabel parallelparkinglabel = new JLabel("Parallel Parking: ");
        parallelparkinglabel = new JLabel("Parallel Parking: ");
        parallelparkinglabel.setForeground(Color.YELLOW);
        parallelparkinglabel.setBounds(250,210,200,25);
        parallelparkinglabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(parallelparkinglabel);

//        final JFormattedTextField parallelparkingtext = new JFormattedTextField(formatter);
        parallelparkingtext = new JFormattedTextField(formatter);
        parallelparkingtext.setBounds(475, 210, 25, 25);
        mainpanel.add(parallelparkingtext);
        parallelparkingtext.setColumns(1);
        mainpanel.add(parallelparkingtext);

//        final JLabel turnaboutslabel = new JLabel("Turnabouts: ");
        turnaboutslabel = new JLabel("Turnabouts: ");
        turnaboutslabel.setForeground(Color.YELLOW);
        turnaboutslabel.setBounds(250,235,200,25);
        turnaboutslabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(turnaboutslabel);

//        final JFormattedTextField turnaboutstext = new JFormattedTextField(formatter);
        turnaboutstext = new JFormattedTextField(formatter);
        turnaboutstext.setBounds(475, 235, 25, 25);
        mainpanel.add(turnaboutstext);
        turnaboutstext.setColumns(1);
        mainpanel.add(turnaboutstext);

//        final JLabel assessinglabel = new JLabel("Assessing Highway Conditions: ");
        assessinglabel = new JLabel("Assessing Highway Conditions: ");
        assessinglabel.setForeground(Color.YELLOW);
        assessinglabel.setBounds(250,260,250,25);
        assessinglabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(assessinglabel);

//        final JFormattedTextField assessingtext = new JFormattedTextField(formatter);
        assessingtext = new JFormattedTextField(formatter);
        assessingtext.setBounds(475, 260, 25, 25);
        mainpanel.add(assessingtext);
        assessingtext.setColumns(1);
        mainpanel.add(assessingtext);

//        final JLabel spacemanagementlabel = new JLabel("Space Management: ");
        spacemanagementlabel = new JLabel("Space Management: ");
        spacemanagementlabel.setForeground(Color.YELLOW);
        spacemanagementlabel.setBounds(250,285,250,25);
        spacemanagementlabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(spacemanagementlabel);

//        final JFormattedTextField spacemanagementtext = new JFormattedTextField(formatter);
        spacemanagementtext = new JFormattedTextField(formatter);
        spacemanagementtext.setBounds(475, 285, 25, 25);
        mainpanel.add(spacemanagementtext);
        spacemanagementtext.setColumns(1);
        mainpanel.add(spacemanagementtext);

//        final JLabel responsetotrafficcontrolslabel = new JLabel("Response To Traffic Controls: ");
        responsetotrafficcontrolslabel = new JLabel("Response To Traffic Controls: ");
        responsetotrafficcontrolslabel.setForeground(Color.YELLOW);
        responsetotrafficcontrolslabel.setBounds(525,110,250,25);
        responsetotrafficcontrolslabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(responsetotrafficcontrolslabel);

//        final JFormattedTextField responsetotrafficcontrolstext = new JFormattedTextField(formatter);
        responsetotrafficcontrolstext = new JFormattedTextField(formatter);
        responsetotrafficcontrolstext.setBounds(755, 110, 25, 25);
        mainpanel.add(responsetotrafficcontrolstext);
        responsetotrafficcontrolstext.setColumns(1);
        mainpanel.add(responsetotrafficcontrolstext);

//        final JLabel responsetootheruserslabel = new JLabel("Response To Other Users: ");
        responsetootheruserslabel = new JLabel("Response To Other Users: ");
        responsetootheruserslabel.setForeground(Color.YELLOW);
        responsetootheruserslabel.setBounds(525,135,250,25);
        responsetootheruserslabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(responsetootheruserslabel);

//        final JFormattedTextField responsetootheruserstext = new JFormattedTextField(formatter);
        responsetootheruserstext = new JFormattedTextField(formatter);
        responsetootheruserstext.setBounds(755, 135, 25, 25);
        mainpanel.add(responsetootheruserstext);
        responsetootheruserstext.setColumns(1);
        mainpanel.add(responsetootheruserstext);

//        final JLabel passinglabel = new JLabel("Passing: ");
        passinglabel = new JLabel("Passing: ");
        passinglabel.setForeground(Color.YELLOW);
        passinglabel.setBounds(525,160,250,25);
        passinglabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(passinglabel);

//        final JFormattedTextField passingtext = new JFormattedTextField(formatter);
        passingtext = new JFormattedTextField(formatter);
        passingtext.setBounds(755, 160, 25, 25);
        mainpanel.add(passingtext);
        passingtext.setColumns(1);
        mainpanel.add(passingtext);

//        final JLabel commentarydrivinglabel = new JLabel("Commentary Driving: ");
        commentarydrivinglabel = new JLabel("Commentary Driving: ");
        commentarydrivinglabel.setForeground(Color.YELLOW);
        commentarydrivinglabel.setBounds(525,185,250,25);
        commentarydrivinglabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(commentarydrivinglabel);

//        final JFormattedTextField commentarydrivingtext = new JFormattedTextField(formatter);
        commentarydrivingtext = new JFormattedTextField(formatter);
        commentarydrivingtext.setBounds(755, 185, 25, 25);
        mainpanel.add(commentarydrivingtext);
        commentarydrivingtext.setColumns(1);
        mainpanel.add(commentarydrivingtext);

//        final JLabel speedlabel = new JLabel("Speed: ");
        speedlabel = new JLabel("Speed: ");
        speedlabel.setForeground(Color.YELLOW);
        speedlabel.setBounds(525,210,250,25);
        speedlabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(speedlabel);

//        final JFormattedTextField speedtext = new JFormattedTextField(formatter);
        speedtext = new JFormattedTextField(formatter);
        speedtext.setBounds(755, 210, 25, 25);
        mainpanel.add(speedtext);
        speedtext.setColumns(1);
        mainpanel.add(speedtext);

//        final JLabel drivingappropriatelabel = new JLabel("Driving Appropriate Conditions: ");
        drivingappropriatelabel = new JLabel("Driving Appropriate Conditions: ");
        drivingappropriatelabel.setForeground(Color.YELLOW);
        drivingappropriatelabel.setBounds(525,235,250,25);
        drivingappropriatelabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(drivingappropriatelabel);

//        final JFormattedTextField drivingappropriatetext = new JFormattedTextField(formatter);
        drivingappropriatetext = new JFormattedTextField(formatter);
        drivingappropriatetext.setBounds(755, 235, 25, 25);
        mainpanel.add(drivingappropriatetext);
        drivingappropriatetext.setColumns(1);
        mainpanel.add(drivingappropriatetext);

//        final JLabel adverseweatherlabel = new JLabel("Adverse Weather: ");
        adverseweatherlabel = new JLabel("Adverse Weather: ");
        adverseweatherlabel.setForeground(Color.YELLOW);
        adverseweatherlabel.setBounds(525,260,250,25);
        adverseweatherlabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(adverseweatherlabel);

//        final JFormattedTextField adverseweathertext = new JFormattedTextField(formatter);
        adverseweathertext = new JFormattedTextField(formatter);
        adverseweathertext.setBounds(755, 260, 25, 25);
        mainpanel.add(adverseweathertext);
        adverseweathertext.setColumns(1);
        mainpanel.add(adverseweathertext);

//        final JLabel nightdrivinglabel = new JLabel("Night Driving: ");
        nightdrivinglabel = new JLabel("Night Driving: ");
        nightdrivinglabel.setForeground(Color.YELLOW);
        nightdrivinglabel.setBounds(525,285,250,25);
        nightdrivinglabel.setFont(new Font("Serif", Font.BOLD, 16));
        mainpanel.add(nightdrivinglabel);

//        final JFormattedTextField nightdrivingtext = new JFormattedTextField(formatter);
        nightdrivingtext = new JFormattedTextField(formatter);
        nightdrivingtext.setBounds(755, 285, 25, 25);
        mainpanel.add(nightdrivingtext);
        nightdrivingtext.setColumns(1);
        mainpanel.add(nightdrivingtext);

        finalevaluationlabel = new JLabel("Final Evaluation: ");
        finalevaluationlabel.setForeground(Color.YELLOW);
        finalevaluationlabel.setBounds(25,335,150,25);
        finalevaluationlabel.setFont(new Font("Serif",Font.BOLD,16));
        mainpanel.add(finalevaluationlabel);
        
        passlabel = new JLabel("Pass");
        passlabel.setForeground(Color.YELLOW);
        passlabel.setBounds(175,335,50,25);
        passlabel.setFont(new Font("Serif",Font.BOLD,16));
        mainpanel.add(passlabel);

        passbutton = new JRadioButton("Pass",true);
        passbutton.setBounds(225,335,50,25);

        faillabel = new JLabel("Fail");
        faillabel.setForeground(Color.YELLOW);
        faillabel.setBounds(275,335,50,25);
        faillabel.setFont(new Font("Serif",Font.BOLD,16));
        mainpanel.add(faillabel);

        failbutton = new JRadioButton("Fail");
        failbutton.setBounds(325,335,50,25);
        
        passfailbuttongroup = new ButtonGroup();
        passfailbuttongroup.add(passbutton);
        passfailbuttongroup.add(failbutton);

        mainpanel.add(passbutton);
        mainpanel.add(failbutton);
        
        final JPanel loginpanel = new JPanel();
        loginpanel.setLayout(null);
        loginpanel.setBackground(new Color(0, 0, 139));
        frame.setContentPane(loginpanel);

        JLabel usernamelabel = new JLabel("Username:");
        usernamelabel.setForeground(Color.YELLOW);
        usernamelabel.setBounds(210,10,100,25);
        usernamelabel.setFont(new Font("Serif", Font.BOLD, 16));
        loginpanel.add(usernamelabel);
       
        final JTextField usernametext = new JTextField();
        usernametext.setBounds(350, 10, 100, 25);
        loginpanel.add(usernametext);
        usernametext.setColumns(25);
       
        JLabel passwordlabel = new JLabel("Password:");
        passwordlabel.setForeground(Color.YELLOW);
        passwordlabel.setBounds(210,40,100,25);
        passwordlabel.setFont(new Font("Serif", Font.BOLD, 16));
        loginpanel.add(passwordlabel);
       
        final JPasswordField passwordfield = new JPasswordField();
        passwordfield.setBounds(350, 40, 100, 25);
        loginpanel.add(passwordfield);
       
        JButton loginbutton = new JButton("Login");
        loginbutton.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Login button pressed");
	            boolean isCorrect = false;
	            String cmd = e.getActionCommand();
	            char[] input = passwordfield.getPassword();
	            char[] correctPassword = { 't','e','s','t'  };
			    String username = usernametext.getText();
                System.out.println("username = " + username);
                if (username.equals("test")) {
                      if (input.length != correctPassword.length) {
                             isCorrect = false;
                      }
                      else {
                             isCorrect = Arrays.equals (input, correctPassword);
                      }
                }
               
                if (true == isCorrect) {
                      System.out.println("Login was successful");
                      loginpanel.setVisible(false);
                      frame.setContentPane(mainpanel);
                }
                else {
                      System.out.print("Login was not successful");
                }
			}
          });

        
        
        loginbutton.setBounds(350, 130, 100, 25);
        loginpanel.add(loginbutton);

        setWidgetVisibility(false);
        
        //Display the window.
        frame.setVisible(true);
    }
    
    public static void setWidgetVisibility(boolean value)
    {
    	preentrycheckslabel.setVisible(value);
    	preentrycheckstext.setVisible(value);
    	prestartlabel.setVisible(value);
    	prestarttext.setVisible(value);
    	movingforwardlabel.setVisible(value);
    	movingforwardtext.setVisible(value);
    	movingbackwardlabel.setVisible(value);
    	movingbackwardtext.setVisible(value);
    	enteringtrafficlabel.setVisible(value);
    	enteringtraffictext.setVisible(value);
    	rightturnslabel.setVisible(value);
    	rightturnstext.setVisible(value);
    	leftturnslabel.setVisible(value);
    	leftturnstext.setVisible(value);
    	intersectionslabel.setVisible(value);
    	intersectionstext.setVisible(value);
    	changinglaneslabel.setVisible(value);
    	changinglanestext.setVisible(value);
    	slowinglabel.setVisible(value);
    	slowingtext.setVisible(value);
    	parkingandsecuringlabel.setVisible(value);
    	parkingandsecuringtext.setVisible(value);
    	parkingongradeslabel.setVisible(value);
    	parkingongradestext.setVisible(value);
    	angleparkinglabel.setVisible(value);
    	angleparkingtext.setVisible(value);
    	parallelparkinglabel.setVisible(value);
    	parallelparkingtext.setVisible(value);
    	turnaboutslabel.setVisible(value);
    	turnaboutstext.setVisible(value);
    	assessinglabel.setVisible(value);
    	assessingtext.setVisible(value);
    	spacemanagementlabel.setVisible(value);
    	spacemanagementtext.setVisible(value);
    	responsetotrafficcontrolslabel.setVisible(value);
    	responsetotrafficcontrolstext.setVisible(value);
    	responsetootheruserslabel.setVisible(value);
    	responsetootheruserstext.setVisible(value);
    	passinglabel.setVisible(value);
    	passingtext.setVisible(value);
    	commentarydrivinglabel.setVisible(value);
    	commentarydrivingtext.setVisible(value);
    	speedlabel.setVisible(value);
    	speedtext.setVisible(value);
    	drivingappropriatelabel.setVisible(value);
    	drivingappropriatetext.setVisible(value);
    	adverseweatherlabel.setVisible(value);
    	adverseweathertext.setVisible(value);
    	nightdrivinglabel.setVisible(value);
    	nightdrivingtext.setVisible(value);
    	finalevaluationlabel.setVisible(value);
    	passlabel.setVisible(value);
    	faillabel.setVisible(value);
    	passbutton.setVisible(value);
    	failbutton.setVisible(value);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
        
    }
}
