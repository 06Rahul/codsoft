import java.util.Scanner;

public class StudentCalculator {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your marks in Hindi");
        int Hindi = scr.nextInt();
        if (Hindi>100){
            System.out.println("you Entred wrong marks");
            System.exit(0);
        }
        System.out.println("Enter your marks in English");
        int English = scr.nextInt();
        if (English>100){
            System.out.println("you Entred wrong marks");
            System.exit(0);
        }
        System.out.println("Enter your marks in Maths");
        int Maths = scr.nextInt();
        if (Maths>100){
            System.out.println("you Entred wrong marks");
            System.exit(0);
        }
        System.out.println("Enter your marks in Physics");
        int Physics = scr.nextInt();
        if (Physics>100){
            System.out.println("you Entred wrong marks");
            System.exit(0);
        }
        System.out.println("Enter your marks in Chemistry");
        int Chemistry = scr.nextInt();
        if (Chemistry>100){
            System.out.println("you Entred wrong marks");
            System.exit(0);
        }
        int total = Hindi + English + Physics + Maths + Chemistry;
        if (total>500){
            System.out.println("you hava Entred wrong marks");
        } else {
            System.out.println("Total Marks: " + total);
            double percentage = ((double) total / 500) * 100;
            System.out.println("Percentage: " + percentage + "%");

            if (Hindi < 33) {
                System.out.println("You failed in Hindi");
            }
            if (English < 33) {
                System.out.println("You failed in English");
            }
            if (Maths < 33) {
                System.out.println("You failed in Maths");
            }
            if (Physics < 33) {
                System.out.println("You failed in Physics");
            }
            if (Chemistry < 33) {
                System.out.println("You failed in Chemistry");
            }
            if (Hindi >= 33 && English >= 33 && Maths >= 33 && Physics >= 33 && Chemistry >= 33) {
                System.out.println("Congratulations! You passed all subjects.");
            }

            if (percentage >= 90) {
                System.out.println("Grade A");
            } else if (percentage >= 75) {
                System.out.println("Grade B");
            } else if (percentage >= 60) {
                System.out.println("Grade C");
            } else if (percentage >= 45) {
                System.out.println("Grade D");
            } else {
                System.out.println("Fail");
            }
        }

    }
}
//Studentcalculator using J frame and awt.
/*import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StudentCalculatorAWT extends JFrame {
    private JTextField hindiField, englishField, mathsField, physicsField, chemistryField;
    private JLabel resultLabel;

    public StudentCalculatorAWT() {
        setTitle("Student Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        panel.add(new JLabel("Enter marks in Hindi:"));
        hindiField = new JTextField();
        panel.add(hindiField);

        panel.add(new JLabel("Enter marks in English:"));
        englishField = new JTextField();
        panel.add(englishField);

        panel.add(new JLabel("Enter marks in Maths:"));
        mathsField = new JTextField();
        panel.add(mathsField);

        panel.add(new JLabel("Enter marks in Physics:"));
        physicsField = new JTextField();
        panel.add(physicsField);

        panel.add(new JLabel("Enter marks in Chemistry:"));
        chemistryField = new JTextField();
        panel.add(chemistryField);

        JButton calculateButton = new JButton("Calculate");
        panel.add(calculateButton);

        resultLabel = new JLabel();
        panel.add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResults();
            }
        });

        add(panel);
    }

    private void calculateResults() {
        int hindi = Integer.parseInt(hindiField.getText());
        int english = Integer.parseInt(englishField.getText());
        int maths = Integer.parseInt(mathsField.getText());
        int physics = Integer.parseInt(physicsField.getText());
        int chemistry = Integer.parseInt(chemistryField.getText());

        int total = hindi + english + maths + physics + chemistry;
        double percentage = ((double) total / 500) * 100;

        StringBuilder resultText = new StringBuilder("Total Marks: " + total + "\n");
        resultText.append("Percentage: " + percentage + "%\n");

        if (hindi < 33) {
            resultText.append("You failed in Hindi\n");
        }
        if (english < 33) {
            resultText.append("You failed in English\n");
        }
        if (maths < 33) {
            resultText.append("You failed in Maths\n");
        }
        if (physics < 33) {
            resultText.append("You failed in Physics\n");
        }
        if (chemistry < 33) {
            resultText.append("You failed in Chemistry\n");
        }

        if (percentage >= 90) {
            resultText.append("Grade A\n");
        } else if (percentage >= 75) {
            resultText.append("Grade B\n");
        } else if (percentage >= 60) {
            resultText.append("Grade C\n");
        } else if (percentage >= 45) {
            resultText.append("Grade D\n");
        } else {
            resultText.append("Fail\n");
        }

        resultLabel.setText(resultText.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                StudentCalculatorAWT calculator = new StudentCalculatorAWT();
                calculator.setVisible(true);
            }
        });
    }
}
*/
