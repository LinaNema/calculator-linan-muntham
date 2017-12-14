package com.example.exam.final_project;


import java.awt.EventQueue;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Lina Nema & Muntha Mahmod
 * @param Nedan har vi skapat en miniräknare, med hjälp av olika funktioner.
 * @param Miniräknaren hjälper oss att få fram resultat av olika räknesätt. 
 *
 */
public class MainFrame {

    private JFrame frmCalculator;
    private JTextField tfFirstNumber;
    private JTextField tfSecondNumber;
    JLabel lblResult = new JLabel("Result: ");
    BasicCalculator bc = new BasicCalculator();
    AdvancedCalculator ac = new AdvancedCalculator();
   
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrame window = new MainFrame();
                    window.frmCalculator.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public MainFrame() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
   
    private void initialize() {
        frmCalculator = new JFrame();
        frmCalculator.setTitle("Calculator");
        frmCalculator.setBounds(100, 100, 332, 300);
        frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCalculator.getContentPane().setLayout(null);
       
        JLabel lblFirstnumber = new JLabel("firstNumber");
        lblFirstnumber.setBounds(23, 27, 93, 15);
        frmCalculator.getContentPane().add(lblFirstnumber);
       
        JLabel lblSecondnumber = new JLabel("secondNumber");
        lblSecondnumber.setBounds(19, 54, 120, 15);
        frmCalculator.getContentPane().add(lblSecondnumber);
       
        tfFirstNumber = new JTextField();
        tfFirstNumber.setBounds(157, 25, 114, 19);
        frmCalculator.getContentPane().add(tfFirstNumber);
        tfFirstNumber.setColumns(10);
       
        JComboBox<Object> comboBox = new JComboBox<Object>();
        comboBox.setBounds(223, 60, 2, -18);
        frmCalculator.getContentPane().add(comboBox);
       
        tfSecondNumber = new JTextField();
        tfSecondNumber.setBounds(157, 56, 114, 19);
        frmCalculator.getContentPane().add(tfSecondNumber);
        tfSecondNumber.setColumns(10);
       
        JButton btnAddition = new JButton("+");
        btnAddition.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
                double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());
               
                double result = bc.add(firstNumber,secondNumber);
                lblResult.setText("Result: "+result);
                tfFirstNumber.setText("");
                tfSecondNumber.setText("");
                
                /**
                 * @param 
                 * Vi skapade en funktion för additions räknesätt. 
                 */
               
            }
        });
        btnAddition.setBounds(101, 141, 48, 25);
        frmCalculator.getContentPane().add(btnAddition);
       
        JButton btnSubtraction = new JButton("-");
        btnSubtraction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
                double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());
               
                double result = bc.subtrackt(firstNumber,secondNumber);
                lblResult.setText("Result: "+result);
                tfFirstNumber.setText("");
                tfSecondNumber.setText("");
                
                /**
                 * @param 
                 * Vi skapade en funktion för subtracktions räknesätt. 
                 */
               
            }
        });   
           
           
       
        btnSubtraction.setBounds(41, 141, 48, 25);
        frmCalculator.getContentPane().add(btnSubtraction);
       
        JButton btnMultiplication = new JButton("*");
        btnMultiplication.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
                double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());
               
                double result = bc.multiply(firstNumber,secondNumber);
                lblResult.setText("Result: "+result);
                tfFirstNumber.setText("");
                tfSecondNumber.setText("");
                
                /**
                 * @param 
                 * Vi skapade en funktion för multiplikations räknesätt. 
                 */
               
            }
        });
       
       
        btnMultiplication.setBounds(161, 141, 48, 25);
        frmCalculator.getContentPane().add(btnMultiplication);
       
        JButton btnDivision = new JButton("/");
        btnDivision.setBounds(223, 141, 48, 25);
        frmCalculator.getContentPane().add(btnDivision);
        btnDivision.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
                double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());
               
                double result = bc.divide(firstNumber,secondNumber);
                lblResult.setText("Result: "+result);
                tfFirstNumber.setText("");
                tfSecondNumber.setText("");
                
                /**
                 * @param 
                 * Vi skapade en funktion för divisions räknesätt. 
                 */
               
            }
        });
       
       
        JButton btnSin = new JButton("sin");
        btnSin.setBounds(12, 175, 55, 25);
        frmCalculator.getContentPane().add(btnSin);
        btnSin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
                //double secondNumber = Double.parseDouble(textField_1.getText().toString());
               
                double result = ac.sin(firstNumber);
                lblResult.setText("Result: "+result);
                tfFirstNumber.setText("");
                tfSecondNumber.setText("");
                
                /**
                 * @param 
                 * Vi skapade en funktion för sin räknesätt. 
                 */
               
            }
        });
       
        JButton btnCos = new JButton("cos");
        btnCos.setBounds(81, 175, 58, 25);
        frmCalculator.getContentPane().add(btnCos);
        btnCos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
                //double secondNumber = Double.parseDouble(textField_1.getText().toString());
               
                double result = ac.cos(firstNumber);
                lblResult.setText("Result: "+result);
                tfFirstNumber.setText("");
                tfSecondNumber.setText("");
               
                /**
                 * @param 
                 * Vi skapade en funktion för cos räknesätt. 
                 */
            }
        });
       
        JButton btnPi = new JButton("Pi");
        btnPi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double result = ac.pi();
                lblResult.setText("Result: "+result);
                tfFirstNumber.setText("");
                tfSecondNumber.setText("");
                
                /**
                 * @param 
                 * Vi skapade en funktion för hur man får fram PI räknesätt. 
                 */
               
            }
        });
        btnPi.setBounds(154, 175, 55, 25);
        frmCalculator.getContentPane().add(btnPi);
   
       
        JButton btnPow = new JButton("Pow");
        btnPow.setFont(new Font("Dialog", Font.BOLD, 10));
        btnPow.setBounds(223, 175, 58, 25);
        frmCalculator.getContentPane().add(btnPow);
        btnPow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString());
                double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());
               
                double result = ac.pow(firstNumber, secondNumber);
                lblResult.setText("Result: "+result);
                tfFirstNumber.setText("");
                tfSecondNumber.setText("");
                
                /**
                 * @param 
                 * Vi skapade en funktion för Pow räknesätt. 
                 */
               
            }
        });
       
        JButton btnProcent = new JButton("%");
        btnProcent.setBounds(12, 212, 104, 25);
        frmCalculator.getContentPane().add(btnProcent);
        btnProcent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double firstNumber = Double.parseDouble(tfFirstNumber.getText().toString()); 
               
                double result = ac.procent(firstNumber);
                lblResult.setText("Result: "+result);
                tfFirstNumber.setText("");
        
                /**
                 * @param 
                 * Vi skapade en funktion för hur man får fram procents räknesätt. 
                 */
               }
        });
       
        JButton btnE = new JButton("e");
        btnE.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
            double secondNumber = Double.parseDouble(tfSecondNumber.getText().toString());
            double result = ac.eulers(secondNumber);
            lblResult.setText("Result: "+result);
            tfSecondNumber.setText("");
              }
        });
        btnE.setBounds(139, 212, 55, 25);
        frmCalculator.getContentPane().add(btnE);
       
       
        lblResult.setBounds(46, 81, 193, 15);
        frmCalculator.getContentPane().add(lblResult);
        
        /**
         * @param 
         * Vi skapade en funktion för hur man kan få fram eulers räknesätt. 
         */
    }
}