import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TeacherGUI {
    public static void main(String[] args) {
        // Declaring the initial welcome frame
        JFrame welcomeFrame = new JFrame("Welcome Screen");
        JPanel welcomePanel = new JPanel(new BorderLayout());

        // Create the panel for the center
        JPanel midPanel = new JPanel();
        midPanel.setBackground(new Color(143,101,59));
        midPanel.setPreferredSize(new Dimension(600, 600));
        midPanel.setLayout(null);
        midPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        // Create panels for the surrounding regions
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(255, 238, 219));
        topPanel.setPreferredSize(new Dimension(400, 150)); // Set preferred size

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(255, 238, 219));
        bottomPanel.setPreferredSize(new Dimension(400,150)); // Set preferred size

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(new Color(255, 238, 219));
        leftPanel.setPreferredSize(new Dimension(100, 500)); // Set preferred size

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(new Color(255, 238, 219));
        rightPanel.setPreferredSize(new Dimension(100, 500)); // Set preferred size
        
        JLabel welcomeText=new JLabel("Welcome User,");
        welcomeText.setFont(new Font("Georgia", Font.PLAIN,60));
        welcomeText.setBounds(530, 120, 800, 100);
        welcomeText.setForeground(new Color(255, 255, 255));
        
        JLabel welcomeText1=new JLabel("Please press the button to move on to the information system");
        welcomeText1.setFont(new Font("Courier New", Font.ITALIC,22));
        welcomeText1.setBounds(350, 150, 1200, 200);
        welcomeText1.setForeground(new Color(255, 255, 255));
        
        JButton nextButton = new JButton(); //Button that allows to to the main panel
        nextButton.setBounds(620, 480, 250, 80);
        nextButton.setIcon(new ImageIcon("D:/Coursework/next.png"));
        nextButton.setBackground(new Color(255, 255, 255));
        nextButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        
        JButton exitbutton=new JButton("Exit");
        exitbutton.setBounds(1280,630,150,50);
        exitbutton.setForeground(Color.BLACK);
        exitbutton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        exitbutton.setFont(new Font("Courier New", Font.PLAIN,20));
        exitbutton.setBackground(Color.white);
        
        // Add panels to the welcome panel
        welcomePanel.add(topPanel, BorderLayout.NORTH);
        welcomePanel.add(bottomPanel, BorderLayout.SOUTH);
        welcomePanel.add(leftPanel, BorderLayout.WEST);
        welcomePanel.add(rightPanel, BorderLayout.EAST);
        welcomePanel.add(midPanel, BorderLayout.CENTER);
        midPanel.add(welcomeText);
        midPanel.add(welcomeText1);
        midPanel.add(nextButton);
        midPanel.add(exitbutton);

        // Add welcome panel to the frame
        welcomeFrame.add(welcomePanel);

        // Set frame properties
        welcomeFrame.setSize(800,800); // Pack components
        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeFrame.setVisible(true);
        welcomeFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        exitbutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent f)
            {
                welcomeFrame.dispose();
            }
        });
        // Adding an action event to the next button
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Declare all types of components of the GUI for proper code and readability
                welcomeFrame.setVisible(false);
                JFrame mainframe;
                JPanel headerpanel, mainPanelLeft, mainPanelRight, mainPanel;
                JComboBox<String> employmentStatusArea,workingTypeArea;
                JLabel headingText,teacherId, teacherName, teacherAddress, workingType, employmentStatus, workingHours, department, yearsOfExperience, gradedScore, salary, specialization, academicQualifications, performanceIndex;
                JTextArea teacherIdArea, teacherNameArea, teacherAddressArea, workingHoursArea, departmentArea, yearsOfExperienceArea,gradedScoreArea, salaryArea, specializationArea, academicQualificationsArea, performanceIndexArea;
                JButton addButton, removeButton, addLecturerButton, addTutorButton, gradeAssignmentButton, setSalaryButton, removeTutorButton, displayButton,goHomeButton,exitButton;
                // Declaring an arraylist of the Teacher Class
                ArrayList<Teacher> TeacherInfo = new ArrayList<>();
            
                mainframe = new JFrame("23050285 Sansraya Pradhanang");
                mainframe.setSize(1200, 1200);
                mainframe.setLayout(new BorderLayout());
                mainframe.setVisible(true);
                mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainframe.setExtendedState(JFrame.MAXIMIZED_BOTH);

                headerpanel = new JPanel();
                headerpanel.setPreferredSize(new Dimension(100,100));
                headerpanel.setBackground(new Color(143, 101, 59));
                headerpanel.setLayout(null);
                headerpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                
                headingText=new JLabel("Teacher Information");
                headingText.setForeground(new Color(255, 238, 219));
                headingText.setFont(new Font("Courier New", Font.PLAIN,35));
                headingText.setBounds(700,25,800,50);
                headerpanel.add(headingText);
                

                    /* Initializing all sorts of JLabel,JPanel, JTextArea
                    Adding them to the Panels, Setting their Size 
                    Setting the Layout , their font and so on.
                    */


                mainPanel = new JPanel(); // Adding mainPanel
                mainPanel.setLayout(new BorderLayout()); // Setting BorderLayout for mainPanel

                mainPanelLeft = new JPanel();
                mainPanelLeft.setPreferredSize(new Dimension(1150, 800)); // Adjusted size here
                mainPanelLeft.setBackground(new Color(255, 238, 219));
                mainPanelLeft.setLayout(null);
                
                teacherId=new JLabel("Teacher ID");
                teacherId.setBounds(100,70,300,25);
                teacherId.setFont(new Font("Courier",Font.ITALIC,15));
                
                teacherName=new JLabel("Teacher Name");
                teacherName.setBounds(100,140,300,25);
                teacherName.setFont(new Font("Courier",Font.ITALIC,15));;
                
                teacherAddress=new JLabel("Teacher Address");
                teacherAddress.setBounds(100,210,300,25);
                teacherAddress.setFont(new Font("Courier",Font.ITALIC,15));
                
                workingType=new JLabel("Working Type");
                workingType.setBounds(100,280,300,25);
                workingType.setFont(new Font("Courier",Font.ITALIC,15));
                
                employmentStatus=new JLabel("Employment Status");
                employmentStatus.setBounds(100,350,300,25);
                employmentStatus.setFont(new Font("Courier",Font.ITALIC,15));
                
                workingHours=new JLabel("Working Hours");
                workingHours.setBounds(100,420,300,25);
                workingHours.setFont(new Font("Courier",Font.ITALIC,15));
                
                department=new JLabel("Department");
                department.setBounds(100,490,300,25);
                department.setFont(new Font("Courier",Font.ITALIC,15));
                
                salary=new JLabel("Salary");
                salary.setBounds(600,70,300,25);
                salary.setFont(new Font("Courier",Font.ITALIC,15));
                
                gradedScore=new JLabel("Graded Score");
                gradedScore.setBounds(600,140,300,25);
                gradedScore.setFont(new Font("Courier",Font.ITALIC,15));
                
                yearsOfExperience=new JLabel("Years of Experience");
                yearsOfExperience.setBounds(600,210,300,25);
                yearsOfExperience.setFont(new Font("Courier",Font.ITALIC,15));
                
                specialization=new JLabel("Specialization");
                specialization.setBounds(600,280,300,25);
                specialization.setFont(new Font("Courier",Font.ITALIC,15));
                
                academicQualifications=new JLabel("Academic Qualifications");
                academicQualifications.setBounds(600,350,300,25);
                academicQualifications.setFont(new Font("Courier",Font.ITALIC,15));
                
                performanceIndex=new JLabel("Performance Index");
                performanceIndex.setBounds(600,420,300,20);
                performanceIndex.setFont(new Font("Courier",Font.ITALIC,15));
                
                teacherIdArea=new JTextArea();
                teacherIdArea.setBounds(250,70,150,30);
                teacherIdArea.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
                teacherIdArea.setBackground(new Color(255,255,255));
                
                teacherNameArea=new JTextArea();
                teacherNameArea.setBounds(250,140,150,30);
                teacherNameArea.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
                teacherNameArea.setBackground(new Color(255,255,255));
                
                teacherAddressArea=new JTextArea();
                teacherAddressArea.setBounds(250,210,150,30);
                teacherAddressArea.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
                teacherAddressArea.setBackground(new Color(255,255,255));
                //Initializing an array to be kept in the combobox
                String workingTypeArray[]={"Full Time","Part Time"};
                workingTypeArea=new JComboBox<String>(workingTypeArray);
                workingTypeArea.setBounds(250,280,150,30);
                workingTypeArea.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
                workingTypeArea.setFont(new Font("Georgia",Font.PLAIN,12));
                workingTypeArea.setBackground(new Color(255,255,255));

                //Initializing an array to be kept in the combobox
                String employArray[]={"Employed","Unemployed"};
                employmentStatusArea=new JComboBox<String>(employArray);
                employmentStatusArea.setBounds(250,350,150,30);
                employmentStatusArea.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
                employmentStatusArea.setFont(new Font("Georgia",Font.PLAIN,12));
                employmentStatusArea.setBackground(new Color(255,255,255));
                
            
                workingHoursArea=new JTextArea();
                workingHoursArea.setBounds(250,420,150,30);
                workingHoursArea.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
                workingHoursArea.setBackground(new Color(255,255,255));
                    
                departmentArea=new JTextArea();
                departmentArea.setBounds(250,490,150,30);
                departmentArea.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
                departmentArea.setBackground(new Color(255,255,255));
                
                salaryArea=new JTextArea();
                salaryArea.setBounds(800,70,150,30);
                salaryArea.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
                salaryArea.setBackground(new Color(255,255,255));
                
                gradedScoreArea=new JTextArea();
                gradedScoreArea.setBounds(800,140,150,30);
                gradedScoreArea.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
                gradedScoreArea.setBackground(new Color(255,255,255));
                
                yearsOfExperienceArea=new JTextArea();
                yearsOfExperienceArea.setBounds(800,210,150,30);
                yearsOfExperienceArea.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
                yearsOfExperienceArea.setBackground(new Color(255,255,255));
                
                specializationArea=new JTextArea();
                specializationArea.setBounds(800,280,150,30);
                specializationArea.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
                specializationArea.setBackground(new Color(255,255,255));
                
                academicQualificationsArea=new JTextArea();
                academicQualificationsArea.setBounds(800,350,150,30);
                academicQualificationsArea.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
                academicQualificationsArea.setBackground(new Color(255,255,255));
                
                performanceIndexArea=new JTextArea();
                performanceIndexArea.setBounds(800,420,150,30);
                performanceIndexArea.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
                performanceIndexArea.setBackground(new Color(255,255,255));
                
                addButton=new JButton();
                addButton.setBounds(100,580,120,45);
                addButton.setBackground(new Color(255,255,255));
                addButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                addButton.setIcon(new ImageIcon("D:/Coursework/add.png")); // Adding an image to the remove button by giving file location
                
                removeButton=new JButton();
                removeButton.setBounds(270,580,120,45);
                removeButton.setBackground(new Color(255,255,255));
                removeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                removeButton.setIcon(new ImageIcon("D:/Coursework/remove.png")); // Adding an image to the remove button by giving file location
                
                goHomeButton=new JButton("Home");
                goHomeButton.setBounds(200,800,250,50);
                goHomeButton.setForeground(Color.WHITE);
                goHomeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                goHomeButton.setFont(new Font("Courier New", Font.PLAIN,25));
                goHomeButton.setBackground(new Color(143, 101, 59));
                
                exitButton=new JButton("Exit");
                exitButton.setBounds(640,800,250,50);
                exitButton.setForeground(Color.WHITE);
                exitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                exitButton.setFont(new Font("Courier New", Font.PLAIN,25));
                exitButton.setBackground(new Color(143, 101, 59));
                
                
                mainPanelLeft.add(teacherId);       
                mainPanelLeft.add(teacherIdArea);
                mainPanelLeft.add(teacherName);
                mainPanelLeft.add(teacherNameArea);
                mainPanelLeft.add(teacherAddress);
                mainPanelLeft.add(teacherAddressArea);
                mainPanelLeft.add(workingType);
                mainPanelLeft.add(workingTypeArea);
                mainPanelLeft.add(employmentStatus);
                mainPanelLeft.add(employmentStatusArea);
                mainPanelLeft.add(workingHours);
                mainPanelLeft.add(workingHoursArea);
                mainPanelLeft.add(department);
                mainPanelLeft.add(departmentArea);
                mainPanelLeft.add(salary);
                mainPanelLeft.add(salaryArea);
                mainPanelLeft.add(gradedScore);
                mainPanelLeft.add(gradedScoreArea);
                mainPanelLeft.add(yearsOfExperience);
                mainPanelLeft.add(yearsOfExperienceArea);
                mainPanelLeft.add(specialization);
                mainPanelLeft.add(specializationArea);
                mainPanelLeft.add(academicQualifications);
                mainPanelLeft.add(academicQualificationsArea);
                mainPanelLeft.add(performanceIndex);
                mainPanelLeft.add(performanceIndexArea);
                mainPanelLeft.add(addButton);
                mainPanelLeft.add(removeButton);
                mainPanelLeft.add(goHomeButton);
                mainPanelLeft.add(exitButton);
                
                
                
                // Defining an action event for add button
                addButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Exception Handling
            try {
                    int teacherID = Integer.parseInt(teacherIdArea.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid teacher ID.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                String teacherName = teacherNameArea.getText();
                if (teacherName.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the teacher's name.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                String teacherAddress = teacherAddressArea.getText();
                if (teacherAddress.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the teacher's address.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                String workingType=workingTypeArea.getItemAt(workingTypeArea.getSelectedIndex());
                if (workingType == null || workingType.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please select the working type.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                String employmentStatus = employmentStatusArea.getItemAt(employmentStatusArea.getSelectedIndex());
                if (employmentStatus == null || employmentStatus.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please select the employment status.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                String department = departmentArea.getText();
                if (department.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the department.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                try {
                    double salary = Double.parseDouble(salaryArea.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid salary.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                try {
                    int workingHours = Integer.parseInt(workingHoursArea.getText());
                    if (workingHours > 1000) {
                        JOptionPane.showMessageDialog(null, "Working hours must be between 5 and 100.", "Error", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number of working hours.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                try {
                    int gradedScore = Integer.parseInt(gradedScoreArea.getText());
                    if (gradedScore > 100) {
                        JOptionPane.showMessageDialog(null, "Graded score must be between 5 and 10.", "Error", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid graded score.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                try {
                    int yearsOfExperience = Integer.parseInt(yearsOfExperienceArea.getText());
                    if (yearsOfExperience > 90) {
                        JOptionPane.showMessageDialog(null, "Years of experience cannot exceed 90.", "Error", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number of years of experience.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                
                String specialization = specializationArea.getText();
                if (specialization.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the specialization.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                String academicQualifications = academicQualificationsArea.getText();
                if (academicQualifications.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the academic qualifications.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                try {
                    int performanceIndex = Integer.parseInt(performanceIndexArea.getText());
                    if (performanceIndex <=5 || performanceIndex>=10) {
                        JOptionPane.showMessageDialog(null, "Performance index must be between 5 and 10.", "Error", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid performance index.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                int teacherID= Integer.parseInt(teacherIdArea.getText());            
                int workingHours=Integer.parseInt(workingHoursArea.getText()); 
                double salary=Double.parseDouble(salaryArea.getText());
                int yearsOfExperience=Integer.parseInt(yearsOfExperienceArea.getText());
                int performanceIndex=Integer.parseInt(performanceIndexArea.getText()); 
                int gradedScore=Integer.parseInt(gradedScoreArea.getText());
                //Initializing only tutor and Lecturer object as they call super class constructor on their own 
                Tutor tutorObject = new Tutor(teacherID, teacherName, teacherAddress, workingType, employmentStatus, workingHours, salary, specialization, academicQualifications, performanceIndex);
                Lecturer lecturerObject = new Lecturer(teacherID, teacherName, teacherAddress, workingType, employmentStatus, department, yearsOfExperience, workingHours);
                lecturerObject.setGradedScore(gradedScore);
                TeacherInfo.add(tutorObject);
                TeacherInfo.add(lecturerObject);
                JOptionPane.showMessageDialog(null, "All information has been stored successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        
                    
                }
                }); 
                // Defining an action event for remove button
            removeButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all fields?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                    teacherIdArea.setText(" ");
                    teacherNameArea.setText(" ");
                    teacherAddressArea.setText(" ");
                    workingHoursArea.setText(" ");
                    departmentArea.setText(" ");
                    salaryArea.setText(" ");
                    gradedScoreArea.setText(" ");
                    yearsOfExperienceArea.setText(" ");
                    specializationArea.setText(" ");
                    academicQualificationsArea.setText(" ");
                    performanceIndexArea.setText(" ");
                }
                }
            });

            goHomeButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent f)
                {
                    welcomeFrame.setVisible(true);
                    mainframe.setVisible(false);
                }
            });
            exitButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent f)
                {
                    welcomeFrame.dispose();
                    mainframe.dispose();
                }
            });
                
                /* Intializing all buttons and setting size, background 
                font and colors to them*/

                addLecturerButton=new JButton("ADD LECTURER");
                addLecturerButton.setBounds(90,70,400,80);
                addLecturerButton.setBackground(new Color(255, 238, 219));
                addLecturerButton.setFont(new Font("Calibri",Font.ITALIC,27));
                addLecturerButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
                
                addTutorButton=new JButton("ADD TUTOR");
                addTutorButton.setBounds(90,200,400,80);
                addTutorButton.setBackground(new Color(255, 238, 219));
                addTutorButton.setFont(new Font("Calibri",Font.ITALIC,27));
                addTutorButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
                
                gradeAssignmentButton=new JButton("GRADE ASSIGNMENT");
                gradeAssignmentButton.setBounds(90,330,400,80);
                gradeAssignmentButton.setBackground(new Color(255, 238, 219));
                gradeAssignmentButton.setFont(new Font("Calibri",Font.ITALIC,27));
                gradeAssignmentButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
                
                setSalaryButton=new JButton("SET SALARY");
                setSalaryButton.setBounds(90,460,400,80);
                setSalaryButton.setBackground(new Color(255, 238, 219));
                setSalaryButton.setFont(new Font("Calibri",Font.ITALIC,27));
                setSalaryButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
            
                removeTutorButton=new JButton("REMOVE TUTOR");
                removeTutorButton.setBounds(90,590,400,80);
                removeTutorButton.setBackground(new Color(255, 238, 219));
                removeTutorButton.setFont(new Font("Calibri",Font.ITALIC,27));
                removeTutorButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
                
    
                displayButton=new JButton("DISPLAY");
                displayButton.setBounds(90,720,400,80);
                displayButton.setBackground(new Color(255, 238, 219));
                displayButton.setFont(new Font("Calibri",Font.ITALIC,27));
                displayButton.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

                // Defining an action event for add lecturer button
            addLecturerButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                                 // Exception Handling
            try {
                int teacherID = Integer.parseInt(teacherIdArea.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid teacher ID.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String teacherName = teacherNameArea.getText();
            if (teacherName.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the teacher's name.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String teacherAddress = teacherAddressArea.getText();
            if (teacherAddress.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the teacher's address.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String workingType=workingTypeArea.getItemAt(workingTypeArea.getSelectedIndex());
            if (workingType == null || workingType.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please select the working type.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String employmentStatus = employmentStatusArea.getItemAt(employmentStatusArea.getSelectedIndex());
            if (employmentStatus == null || employmentStatus.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please select the employment status.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String department = departmentArea.getText();
            if (department.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the department.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            try {
                double salary = Double.parseDouble(salaryArea.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid salary.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            try {
                int workingHours = Integer.parseInt(workingHoursArea.getText());
                if (workingHours > 1000) {
                    JOptionPane.showMessageDialog(null, "Working hours must be between 5 and 100.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number of working hours.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            try {
                int gradedScore = Integer.parseInt(gradedScoreArea.getText());
                if (gradedScore > 100) {
                    JOptionPane.showMessageDialog(null, "Graded score must be between 5 and 10.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid graded score.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            try {
                int yearsOfExperience = Integer.parseInt(yearsOfExperienceArea.getText());
                if (yearsOfExperience > 50) {
                    JOptionPane.showMessageDialog(null, "Years of experience cannot exceed 50.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number of years of experience.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            
            String specialization = specializationArea.getText();
            if (specialization.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the specialization.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String academicQualifications = academicQualificationsArea.getText();
            if (academicQualifications.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the academic qualifications.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            try {
                int performanceIndex = Integer.parseInt(performanceIndexArea.getText());
                if (performanceIndex<5 || performanceIndex>10) {
                    JOptionPane.showMessageDialog(null, "Performance index must be between 5 and 10.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid performance index.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
                    int teacherID = Integer.parseInt(teacherIdArea.getText());
                    int workingHours = Integer.parseInt(workingHoursArea.getText());
                    int yearsOfExperience = Integer.parseInt(yearsOfExperienceArea.getText());
                    int gradedScore = Integer.parseInt(gradedScoreArea.getText());
                    Lecturer objectLecturer = new Lecturer(teacherID, teacherName, teacherAddress, workingType, employmentStatus, department, yearsOfExperience, workingHours);
            
                    boolean lecturerExists = false;
            
                    for (Teacher objectTeacher : TeacherInfo) {
                        while(objectTeacher instanceof Lecturer){ // Checking if the object is instance of lecturer
                        objectLecturer=(Lecturer)objectTeacher;
                        if (objectLecturer.getTeacherID() == teacherID && objectLecturer instanceof Teacher) {
                            lecturerExists = true;
                            break; // The loop is exited early when the same ID is found as no further need to iterate is found 
                        }
                    }
                    }

                    if (lecturerExists==true) {
                        JOptionPane.showMessageDialog(null, "This lecturer already exists", "Message", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        // The lecturer object is added only if it doesn't exist in the list
                        try {
                            objectLecturer.setGradedScore(gradedScore);
                            TeacherInfo.add(objectLecturer);
                            JOptionPane.showMessageDialog(null, "Lecturer information has been stored successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Please fill all the information correctly", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }  // If the list is empty automatically add the object
                    if(TeacherInfo.isEmpty()){
                        try{
                            TeacherInfo.add(objectLecturer);
                            objectLecturer.setGradedScore(gradedScore);
                            JOptionPane.showMessageDialog(null,"All information has been stored sucessfully","Message",JOptionPane.INFORMATION_MESSAGE);
                        }
                        catch(NumberFormatException exp){

                                JOptionPane.showMessageDialog(null,"Please fill all the information correctly","Error",JOptionPane.ERROR_MESSAGE);
                                
                        }

                    }
    
                    }
                });
                // Defining an action event for add Tutor Button
                addTutorButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Exception Handling
                                     // Exception Handling
            try {
                int teacherID = Integer.parseInt(teacherIdArea.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid teacher ID.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String teacherName = teacherNameArea.getText();
            if (teacherName.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the teacher's name.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String teacherAddress = teacherAddressArea.getText();
            if (teacherAddress.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the teacher's address.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String workingType=workingTypeArea.getItemAt(workingTypeArea.getSelectedIndex());
            if (workingType == null || workingType.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please select the working type.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String employmentStatus = employmentStatusArea.getItemAt(employmentStatusArea.getSelectedIndex());
            if (employmentStatus == null || employmentStatus.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please select the employment status.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String department = departmentArea.getText();
            if (department.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the department.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            try {
                double salary = Double.parseDouble(salaryArea.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid salary.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            try {
                int workingHours = Integer.parseInt(workingHoursArea.getText());
                if (workingHours > 1000) {
                    JOptionPane.showMessageDialog(null, "Working hours must be between 5 and 100.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number of working hours.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            try {
                int gradedScore = Integer.parseInt(gradedScoreArea.getText());
                if (gradedScore > 100) {
                    JOptionPane.showMessageDialog(null, "Graded score must be between 5 and 10.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid graded score.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            try {
                int yearsOfExperience = Integer.parseInt(yearsOfExperienceArea.getText());
                if (yearsOfExperience > 50) {
                    JOptionPane.showMessageDialog(null, "Years of experience cannot exceed 50.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number of years of experience.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            
            String specialization = specializationArea.getText();
            if (specialization.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the specialization.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            String academicQualifications = academicQualificationsArea.getText();
            if (academicQualifications.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the academic qualifications.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            try {
                int performanceIndex = Integer.parseInt(performanceIndexArea.getText());
                if (performanceIndex <5 || performanceIndex>10) {
                    JOptionPane.showMessageDialog(null, "Performance index must be between 5 and 10.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid performance index.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
                        int teacherID = Integer.parseInt(teacherIdArea.getText());
                        int workingHours = Integer.parseInt(workingHoursArea.getText());
                        double salary = Double.parseDouble(salaryArea.getText());
                        int performanceIndex = Integer.parseInt(performanceIndexArea.getText());
                
                        Tutor objectTutor = new Tutor(teacherID, teacherName, teacherAddress, workingType, employmentStatus, workingHours, salary, specialization, academicQualifications, performanceIndex);
                    
                        boolean tutorExists = false;
                
                        for (Teacher objectTeacher : TeacherInfo) {
                            while(objectTeacher instanceof Tutor){// Checking if the object is instanec of Tutor
                            objectTutor=(Tutor)objectTeacher;
                            
                            if (objectTutor.getTeacherID() == teacherID && objectTutor instanceof Teacher)
                             {
                                tutorExists = true;
                                break; // Leave the loop since, a duplicate lecturer is found 
                            }
                        }
                            
                        }
                 
                        if (tutorExists==true) {
                            JOptionPane.showMessageDialog(null, "This tutor already exists", "Message", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            // Add the tutor object only if it doesn't exist in the list
                            try {
                                TeacherInfo.add(objectTutor);
                                JOptionPane.showMessageDialog(null, "Tutor information has been stored successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Please fill all the information correctly", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                
                        // If TeacherInfo list is empty , object is added to the list 
                        if (TeacherInfo.isEmpty()) {
                            try {
                                TeacherInfo.add(objectTutor);
                                JOptionPane.showMessageDialog(null, "All information has been stored successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
                            } catch (NumberFormatException exp) {
                                JOptionPane.showMessageDialog(null, "Please fill all the information correctly", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                });

                // Defining an action event for gradeAssignment Button
                gradeAssignmentButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
    
                            try {
                                int teacherID = Integer.parseInt(teacherIdArea.getText());
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Please enter a valid teacher ID.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            
                            String teacherName = teacherNameArea.getText();
                            if (teacherName.trim().isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Please enter the teacher's name.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            
                            String teacherAddress = teacherAddressArea.getText();
                            if (teacherAddress.trim().isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Please enter the teacher's address.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            
                            String workingType=workingTypeArea.getItemAt(workingTypeArea.getSelectedIndex());
                            if (workingType == null || workingType.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Please select the working type.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            
                            String employmentStatus = employmentStatusArea.getItemAt(employmentStatusArea.getSelectedIndex());
                            if (employmentStatus == null || employmentStatus.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Please select the employment status.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            
                            String department = departmentArea.getText();
                            if (department.trim().isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Please enter the department.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            
                            try {
                                double salary = Double.parseDouble(salaryArea.getText());
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Please enter a valid salary.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            
                            try {
                                int workingHours = Integer.parseInt(workingHoursArea.getText());
                                if (workingHours > 1000) {
                                    JOptionPane.showMessageDialog(null, "Working hours must be between 5 and 100.", "Error", JOptionPane.WARNING_MESSAGE);
                                    return;
                                }
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Please enter a valid number of working hours.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            
                            try {
                                int gradedScore = Integer.parseInt(gradedScoreArea.getText());
                                if (gradedScore > 100) {
                                    JOptionPane.showMessageDialog(null, "Graded score must be between 5 and 10.", "Error", JOptionPane.WARNING_MESSAGE);
                                    return;
                                }
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Please enter a valid graded score.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            
                            try {
                                int yearsOfExperience = Integer.parseInt(yearsOfExperienceArea.getText());
                                if (yearsOfExperience > 90) {
                                    JOptionPane.showMessageDialog(null, "Years of experience cannot exceed 90.", "Error", JOptionPane.WARNING_MESSAGE);
                                    return;
                                }
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Please enter a valid number of years of experience.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            
                            
                            String specialization = specializationArea.getText();
                            if (specialization.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Please enter the specialization.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            
                            String academicQualifications = academicQualificationsArea.getText();
                            if (academicQualifications.trim().isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Please enter the academic qualifications.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            
                            try {
                                int performanceIndex = Integer.parseInt(performanceIndexArea.getText());
                                if (performanceIndex <5 || performanceIndex>10) {
                                    JOptionPane.showMessageDialog(null, "Performance index must be between 5 and 10.", "Error", JOptionPane.WARNING_MESSAGE);
                                    return;
                                }
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Please enter a valid performance index.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                            
                    try{
                        int teacherID= Integer.parseInt(teacherIdArea.getText());
                        int workingHours=Integer.parseInt(workingHoursArea.getText());
                        int yearsOfExperience=Integer.parseInt(yearsOfExperienceArea.getText());
                        int gradedScore=Integer.parseInt(gradedScoreArea.getText());
                        
                        boolean LecturerExists=false;
                        Lecturer lecturerObject=null;
                        
                            
                            for(Teacher teacherObject:TeacherInfo){
                                while(teacherObject instanceof Lecturer){// Checking if the object is instance of lecturer
                                lecturerObject=(Lecturer)teacherObject; //Downcasting
                                if(lecturerObject.getTeacherID() == teacherID && lecturerObject instanceof Teacher){
                        
                                LecturerExists=true;
                                break;
                                }
                            }
                            }
                            if(LecturerExists){
                                //Calling method from lecturer
                                lecturerObject.gradeAssignment(gradedScore,department,yearsOfExperience);
                                    
                                    JOptionPane.showMessageDialog(null,"The assignment has been graded","Information",JOptionPane.INFORMATION_MESSAGE);
                                    
                                }else{
                                    JOptionPane.showMessageDialog(null, "No lecturer found with the given teacher ID", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                                for (Teacher teacherObject : TeacherInfo) {
                                    String displayMessage = "";
                                if (teacherObject instanceof Lecturer) { // Checking if the object is instanec of lecturer
                                    Lecturer lecturer = (Lecturer) teacherObject;
                                    displayMessage += "For Lecturer\n";
                                    displayMessage += "Teacher ID: " + lecturer.getTeacherID() + "\n";
                                    displayMessage += "Teacher Name: " + lecturer.getTeacherName() + "\n";
                                    displayMessage += "Address: " + lecturer.getTeacherAddress() + "\n";
                                    displayMessage += "Working Type: " + lecturer.getWorkingType() + "\n";
                                    displayMessage += "Employment Status: " + lecturer.getEmploymentStatus() + "\n";
                                    displayMessage += "Graded Score: " + lecturer.getGradedScore() + "\n";
                                    displayMessage += "Years of Experience: " + lecturer.getYearsOfExperience() + "\n";
                                    JOptionPane.showMessageDialog(null,displayMessage,"Teacher Information",JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            }catch(NumberFormatException ex){
                            
                            JOptionPane.showMessageDialog(null,"Please enter all the information correctly","Error",JOptionPane.WARNING_MESSAGE);
                            }
                        }
                        });
                
            
                // Defining an action event for set salary button
                setSalaryButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //Exception Handling 
                        try {
                            int teacherID = Integer.parseInt(teacherIdArea.getText());
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Please enter a valid teacher ID.", "Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        String teacherName = teacherNameArea.getText();
                        if (teacherName.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please enter the teacher's name.", "Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        String teacherAddress = teacherAddressArea.getText();
                        if (teacherAddress.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please enter the teacher's address.", "Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        String workingType=workingTypeArea.getItemAt(workingTypeArea.getSelectedIndex());
                        if (workingType == null || workingType.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please select the working type.", "Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        String employmentStatus = employmentStatusArea.getItemAt(employmentStatusArea.getSelectedIndex());
                        if (employmentStatus == null || employmentStatus.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please select the employment status.", "Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        String department = departmentArea.getText();
                        if (department.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please enter the department.", "Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        try {
                            double salary = Double.parseDouble(salaryArea.getText());
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Please enter a valid salary.", "Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        try {
                            int workingHours = Integer.parseInt(workingHoursArea.getText());
                            if (workingHours > 1000) {
                                JOptionPane.showMessageDialog(null, "Working hours must be between 5 and 100.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Please enter a valid number of working hours.", "Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        try {
                            int gradedScore = Integer.parseInt(gradedScoreArea.getText());
                            if (gradedScore > 100) {
                                JOptionPane.showMessageDialog(null, "Graded score must be between 5 and 10.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Please enter a valid graded score.", "Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        try {
                            int yearsOfExperience = Integer.parseInt(yearsOfExperienceArea.getText());
                            if (yearsOfExperience > 90) {
                                JOptionPane.showMessageDialog(null, "Years of experience cannot exceed 90.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Please enter a valid number of years of experience.", "Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        String specialization = specializationArea.getText();
                        if (specialization.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please enter the specialization.", "Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        String academicQualifications = academicQualificationsArea.getText();
                        if (academicQualifications.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Please enter the academic qualifications.", "Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        try {
                            int performanceIndex = Integer.parseInt(performanceIndexArea.getText());
                            if (performanceIndex <5 || performanceIndex>10) {
                                JOptionPane.showMessageDialog(null, "Performance index must be between 5 and 10.", "Error", JOptionPane.WARNING_MESSAGE);
                                return;
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Please enter a valid performance index.", "Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        
                        // Taking all input from respective fields 
                        int teacherID= Integer.parseInt(teacherIdArea.getText());
                        int workingHours=Integer.parseInt(workingHoursArea.getText());
                        double salary=Double.parseDouble(salaryArea.getText());
                        int performanceIndex=Integer.parseInt(performanceIndexArea.getText());
                        boolean tutorExists=false;
                        Tutor tutorObject = null;
                        try{
                        for (Teacher teacherObject1 : TeacherInfo) 
                        while(teacherObject1 instanceof Tutor){   //Checking if the object made is an instance of tutor
                            
                            tutorObject=(Tutor)teacherObject1; //Downcasting
                            if (tutorObject.getTeacherID() == teacherID && tutorObject instanceof Teacher) {
                            
                                tutorExists=true;
                                break;
                            }
                        }
                        
            
                        if (tutorExists) {
                            // Set the new salary  for the found tutor
                            tutorObject.setSalary(salary,performanceIndex);
                            
                            JOptionPane.showMessageDialog(null, "New salary have been set for the tutor", "Information", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No tutor found with the given teacher ID", "Error", JOptionPane.ERROR_MESSAGE);
                        }
            
                        // Display all entered data in an information dialog
                        for (Teacher teacher : TeacherInfo) {
                            
                        if (teacher instanceof Tutor) {
                            String displayMessage = "";
                            Tutor tutor = (Tutor) teacher;
                            displayMessage += "For Tutor\n";
                            displayMessage += "Teacher ID: " + tutor.getTeacherID() + "\n";
                            displayMessage += "Teacher Name: " + tutor.getTeacherName() + "\n";
                            displayMessage += "Address: " + tutor.getTeacherAddress() + "\n";
                            displayMessage += "Working Type: " + tutor.getWorkingType() + "\n";
                            displayMessage += "Employment Status: " + tutor.getEmploymentStatus() + "\n";
                            displayMessage += "Working Hours: " + tutor.getWorkingHours() + "\n";
                            displayMessage += "Salary: " + tutor.getSalary() + "\n";
                            displayMessage += "Specialization: " + tutor.getSpecialization() + "\n";
                            displayMessage += "Academic Qualifications: " + tutor.getAcademicQualification() + "\n";
                            displayMessage += "Performance Index: " + tutor.getPerformanceIndex() + "\n";
                            JOptionPane.showMessageDialog(null, displayMessage, "Teacher Information", JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                    }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please enter all the information correctly", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            // Defining an action event for remove tutor button
                removeTutorButton.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        try {
                            int teacherID = Integer.parseInt(teacherIdArea.getText());
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Please enter a valid teacher ID.", "Error", JOptionPane.WARNING_MESSAGE);
                            return;
                        }
                        try{
                        int teacherID= Integer.parseInt(teacherIdArea.getText());
                        boolean tutorExists=false;
                        Tutor tutorObject = null;
                        
                        for (Teacher teacherObject1 : TeacherInfo) {
                            while(teacherObject1 instanceof Tutor){ // Checking if the object is instance of tutor
                            tutorObject=(Tutor)teacherObject1;
                            if (tutorObject.getTeacherID() == teacherID && tutorObject instanceof Teacher) {
    
                                tutorExists=true;
                                break;
                            }
                         }
                        }
            
                        if (tutorExists) {
                            // Set the new salary and performance index for the found tutor
                            tutorObject.removeTutor();
                            
                            JOptionPane.showMessageDialog(null, "The tutor has been removed", "Information", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "No tutor found with the given teacher ID", "Error", JOptionPane.ERROR_MESSAGE);
                        }
            
                        }  catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please enter all the information correctly", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                        }
                }); 
                // Defining an action event for display button
                displayButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                        if (TeacherInfo.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No information available to display", "Error", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                try{
                    for (Teacher teacher : TeacherInfo) {
                        String displayMessage = "";
                    if (teacher instanceof Lecturer) {
                        Lecturer lecturer = (Lecturer) teacher;
                        displayMessage += "For Lecturer\n";
                        displayMessage += "Teacher ID: " + lecturer.getTeacherID() + "\n";
                        displayMessage += "Teacher Name: " + lecturer.getTeacherName() + "\n";
                        displayMessage += "Address: " + lecturer.getTeacherAddress() + "\n";
                        displayMessage += "Working Type: " + lecturer.getWorkingType() + "\n";
                        displayMessage += "Employment Status: " + lecturer.getEmploymentStatus() + "\n";
                        displayMessage += "Graded Score: " + lecturer.getGradedScore() + "\n";
                        displayMessage += "Years of Experience: " + lecturer.getYearsOfExperience() + "\n";
                    } else if (teacher instanceof Tutor) {
                        Tutor tutor = (Tutor) teacher;
                        displayMessage += "For Tutor\n";
                        displayMessage += "Teacher ID: " + tutor.getTeacherID() + "\n";
                        displayMessage += "Teacher Name: " + tutor.getTeacherName() + "\n";
                        displayMessage += "Address: " + tutor.getTeacherAddress() + "\n";
                        displayMessage += "Working Type: " + tutor.getWorkingType() + "\n";
                        displayMessage += "Employment Status: " + tutor.getEmploymentStatus() + "\n";
                        displayMessage += "Working Hours: " + tutor.getWorkingHours() + "\n";
                        displayMessage += "Salary: " + tutor.getSalary() + "\n";
                        displayMessage += "Specialization: " + tutor.getSpecialization() + "\n";
                        displayMessage += "Academic Qualifications: " + tutor.getAcademicQualification() + "\n";
                        displayMessage += "Performance Index: " + tutor.getPerformanceIndex() + "\n";
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Information has not been filled", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                    }
                    displayMessage+=("\n");
                    // Display information dialog
                    JOptionPane.showMessageDialog(null, displayMessage,"Information",JOptionPane.INFORMATION_MESSAGE);
                }
                }catch(NumberFormatException ex){
                     JOptionPane.showMessageDialog(null, "Please enter all the information correctly", "Error", JOptionPane.ERROR_MESSAGE);
                        
                 }
                
            }
                });  
                
                // The panel towards the right of the screen is initialized and its font is set, added , size is defined z
                mainPanelRight = new JPanel();
                mainPanelRight.setPreferredSize(new Dimension(400, 800)); 
                mainPanelRight.setBackground(new Color(240, 206, 168));
                mainPanelRight.setLayout(null);
                mainPanelRight.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                mainPanelRight.add(addLecturerButton);
                mainPanelRight.add(addTutorButton);
                mainPanelRight.add(gradeAssignmentButton);
                mainPanelRight.add(setSalaryButton);
                mainPanelRight.add(removeTutorButton);
                mainPanelRight.add(displayButton);

                // Adding all the panels using border layotu 
                mainPanel.add(mainPanelLeft, BorderLayout.WEST); 
                mainPanel.add(mainPanelRight, BorderLayout.CENTER); 


                mainframe.add(headerpanel, BorderLayout.NORTH);
                mainframe.add(mainPanel, BorderLayout.CENTER); 
            }
        });
    }
}
