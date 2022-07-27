package padrao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Sarah Jandozza
 */
public class Bhaskara extends JFrame
{
    JLabel formula, titulo, rotulo1, rotulo2, rotulo3, x1, x2;
    JTextField texto1, texto2, texto3, resultx1, resultx2;
    JButton calcular;
    
    public Bhaskara()
    {
        super("Fórmula de Bhaskára");
        
        Container tela = getContentPane();
        setLayout(null);
        
        titulo = new JLabel("Fórmula de Bhaskára");
        formula = new JLabel("ax² + bx + c = 0");
        
        rotulo1 = new JLabel("Valor do a:");
        rotulo2 = new JLabel("Valor do b:");
        rotulo3 = new JLabel("Valor de c:");
        
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        
        calcular = new JButton("Calcular");
        
        x1 = new JLabel("x¹:");
        x2 = new JLabel("x²:");
        
        resultx1= new JTextField("");
        resultx2= new JTextField("");

        
        titulo.setBounds(115, 10, 300, 20);
        titulo.setFont(new Font("Arial",Font.BOLD,16));
        formula.setBounds(150, 30, 200, 20);
        
        rotulo1.setBounds(100, 80, 100, 20);
        texto1.setBounds(200, 80, 100, 20);
        
        rotulo2.setBounds(100, 120, 100, 20);
        texto2.setBounds(200, 120, 100, 20);
        
        rotulo3.setBounds(100, 160, 100, 20);
        texto3.setBounds(200, 160, 100, 20);
        
        calcular.setBounds(100, 200, 200, 20);
        
        x1.setBounds(200, 230, 80, 20);
        resultx1.setBounds(220, 230, 80, 20);
        
        x2.setBounds(200, 260, 80, 20);
        resultx2.setBounds(220, 260, 80, 20);
        
        calcular.addActionListener
        (
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                       double a, b, c, delta, X1, X2, d = 0;

                       a = Double.parseDouble(texto1.getText());
                       b = Double.parseDouble(texto2.getText());
                       c = Double.parseDouble(texto3.getText());

                       delta = (b * b) - (4 * (a * c));
                       d = Math.sqrt(delta);

                        X1 = ((- (b) + Math.sqrt(delta)) / ( 2 * a));
                        X2 = ((- (b) - Math.sqrt(delta)) / ( 2 * a));

                        if(delta >=0){
                            x1.setVisible(true);
                            x2.setVisible(true);
                            resultx1.setText("" + X1);
                            resultx2.setText("" + X2);
                        }else{
                           x1.setVisible(false);
                           x2.setVisible(false);
                            resultx1.setText("O Delta é negativo");
                            resultx2.setText("A equação não possui raizes reais");
                            
                            
                        }
                    }
                }
            );
        
        texto1.requestFocus();
 
        //tela.add
        tela.add(titulo);
        tela.add(formula);
        tela.add(rotulo1);
        tela.add(texto1);
        tela.add(rotulo2);
        tela.add(texto2);
        tela.add(rotulo3);
        tela.add(texto3);
        
        tela.add(calcular);
        
        tela.add(x1);
        tela.add(x2);
        
        tela.add(resultx1);
        tela.add(resultx2);
        
        tela.setBackground(new Color(240,230,140));
        
        setSize(400, 350);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(true);
    }
    
    public static void main(String[] args) 
    {
        Bhaskara app = new Bhaskara();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}