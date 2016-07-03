
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    private int count = 0;
    private JLabel countLabel;
    private JButton one, two, three, four, five, six, seven, eight,
            nine, zero, plus, minus, deter, multi, equal,
            point, percent, radical, clean, invert, octot;
    static Color backgroundColor = new Color(202,164,138);
    double numberStatic = 0, numberGet = 0, deg = 10;
    int zn = 0; Boolean isPoint = false;

    public Calculator() {
        super("My calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setInterface();
        calculate();
    }

    private void setInterface () {
        Font font = new Font("Verdana", Font.PLAIN, 25);
        Color inFrameColor = new Color(251,244,202);
        Color labelTextColor = new Color(157,106,72);
        countLabel = new JLabel("" + count, 10);
        countLabel.setHorizontalAlignment(JLabel.RIGHT);
        countLabel.setFont(font);
        countLabel.setForeground(labelTextColor);
        setButtons();

        JPanel buttonsPanel = new JPanel(new GridLayout(4,5,0,0));
        JPanel countPanel = new JPanel(new FlowLayout((FlowLayout.RIGHT), 10, 20));
        buttonsPanel.setBackground(backgroundColor);
        buttonsPanel.setMaximumSize(new Dimension(350,350));
        countPanel.setBackground(inFrameColor);
        countPanel.setMaximumSize(new Dimension(286,150));

        Box box = Box.createVerticalBox();
        countPanel.add(countLabel);
        addButtons(buttonsPanel);
        buttonsPanel.setBorder(new CompoundBorder(new EmptyBorder(0,0,0,0), null));
        countPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(-10, 10, -20, 10, inFrameColor),
                BorderFactory.createEmptyBorder(10, 10, -50, 10)));
        box.add(countPanel);
        box.add(buttonsPanel);
        setContentPane(box);
    }

    private void setButtons() {
        one = new JButton("1");
        setButtonNumbView(one);
        two = new JButton("2");
        setButtonNumbView(two);
        three = new JButton("3");
        setButtonNumbView(three);
        four = new JButton("4");
        setButtonNumbView(four);
        five = new JButton("5");
        setButtonNumbView(five);
        six = new JButton("6");
        setButtonNumbView(six);
        seven = new JButton("7");
        setButtonNumbView(seven);
        eight = new JButton("8");
        setButtonNumbView(eight);
        nine = new JButton("9");
        setButtonNumbView(nine);
        zero = new JButton("0");
        setButtonNumbView(zero);
        plus = new JButton("+");
        setButtonView(plus);
        minus = new JButton("-");
        setButtonView(minus);
        deter = new JButton("/");
        setButtonView(deter);
        multi = new JButton("*");
        setButtonView(multi);
        equal = new JButton("=");
        setButtonNumbView(equal);
        point = new JButton(".");
        setButtonNumbView(point);
        radical = new JButton("" + '\u221A');
        setButtonView(radical);
        percent = new JButton("%");
        setButtonView(percent);
        clean = new JButton("C");
        setButtonView(clean);
        invert = new JButton("1/x");
        setButtonView(invert);
        octot = new JButton("" + '\u00B1');
        setButtonView(octot);
    }

    private void addButtons(JPanel buttonsPanel) {
        buttonsPanel.add(one);
        buttonsPanel.add(two);
        buttonsPanel.add(three);
        buttonsPanel.add(plus);
        buttonsPanel.add(percent);
        buttonsPanel.add(four);
        buttonsPanel.add(five);
        buttonsPanel.add(six);
        buttonsPanel.add(minus);
        buttonsPanel.add(radical);
        buttonsPanel.add(seven);
        buttonsPanel.add(eight);
        buttonsPanel.add(nine);
        buttonsPanel.add(multi);
        buttonsPanel.add(invert);
        buttonsPanel.add(point);
        buttonsPanel.add(zero);
        buttonsPanel.add(equal);
        buttonsPanel.add(deter);
        buttonsPanel.add(clean);
    }

    private void setButtonView (JButton button) {
        Color textColor = new Color(248,240,180);
        Font buttonsFont = new Font("Georgia", Font.PLAIN, 20);
        Color buttonsColor = new Color(157,106,72);
        button.setFont(buttonsFont);
        button.setBackground(buttonsColor);
        button.setBorder(new CompoundBorder(null, null));
        button.setForeground(textColor);
    }

    private void setButtonNumbView (JButton button) {
        Color textColor = new Color(250,243,197);
        Font buttonsFont = new Font("Georgia", Font.PLAIN, 20);
        Color buttonsColor = new Color(184,133,99);
        button.setFont(buttonsFont);
        button.setBackground(buttonsColor);
        button.setBorder(new CompoundBorder(null, null));
        button.setForeground(textColor);
    }

    public void calculate() {
        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionButton(1);
            }
        });
        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionButton(2);
            }
        });
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionButton(3);
            }
        });
        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionButton(4);
            }
        });
        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionButton(5);
            }
        });
        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionButton(6);
            }
        });
        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionButton(7);
            }
        });
        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionButton(8);
            }
        });
        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionButton(9);
            }
        });
        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionButton(0);
            }
        });

        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionButtonZn('+');
            }
        });
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionButtonZn('-');
            }
        });
        multi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionButtonZn('*');
            }
        });
        deter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionButtonZn('/');
            }
        });
        equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkSymbol();
                if (zn == '/' && numberGet != 0) printNumb(numberStatic);
                else if (zn != '/') printNumb(numberStatic);
                numberGet = 0;
                zn = '=';
            }
        });
        invert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkSymbol();
                numberStatic = 1 / numberStatic;
                printNumb(numberStatic);
                numberGet = 0;
                zn = 0;
            }
        });
        clean.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberStatic = 0;
                numberGet = 0;
                zn = 0;
                isPoint = false;
                printNumb(numberStatic);
            }
        });
        percent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numberGet = (numberStatic * numberGet) / 100;
                actionButtonZn(0);
                printNumb(numberStatic);
            }
        });
        radical.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actionButtonZn('=');
                if (numberStatic >= 0) {
                    numberStatic = Math.sqrt(numberStatic);
                    printNumb(numberStatic);
                }
                else {
                    countLabel.setText("I cannot do it :(");
                    numberStatic = 0;
                    numberGet = 0;
                    zn = 0;
                }
            }
        });
        point.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isPoint = true;
                countLabel.setText((int)numberGet + ",");
                deg = 0.1;
            }
        });
    }

    public void actionButton (int a) {
        if(numberGet / 1 == 0)
            if (isPoint)
                numberGet = 0.1;
            else
                numberGet = a;
        else
        if (isPoint) {
            numberGet = numberGet + (a * deg);
            deg *= 0.1;
        }
        else
            numberGet = numberGet * 10 + a;
        if(zn != 0 && zn != '=') {
            printNumbers();
        }
        else {
            printNumb(numberGet);
        }
    }

    public void actionButtonZn(int a){

        isPoint = false;
        if(zn != 0)
            checkSymbol();
        else
            numberStatic = numberGet;
        if(zn != '/') {
            zn = a;
            printZn(numberStatic);
        }
        else
        if (numberGet != 0) {
            zn = a;
            printZn(numberStatic);
        }
        numberGet = 0;
    }

    public void printZn(double numb){
        if (numb % 1 == 0)
            countLabel.setText("" + (int)numb + (char)zn);
        else
            countLabel.setText("" + CHECK(numb) + (char)zn);

    }

    private void printNumb(double numb) {
        if (numb % 1 == 0)
            countLabel.setText("" + (int)numb);
        else
            countLabel.setText("" + CHECK(numb));
    }

    private String CHECK (double numb) {
        if ((((numb - (int)numb) * 1000) % 10) == 0) {
            if ((((numb - (int)numb) * 1000) % 100) == 0)
                return String.format("%.1f",numb);
            else
                return String.format("%.2f",numb);
        }
        else
            return String.format("%.3f",numb);
    }

    private void printNumbers() {
        if (numberStatic % 1 == 0 && numberGet % 1 == 0) {
            countLabel.setText("" + (int)numberStatic + (char)zn + (int)numberGet);
        }
        else {
            if (numberStatic % 1 == 0)
                countLabel.setText("" + (int)numberStatic + (char)zn + CHECK(numberGet));
            if (numberGet % 1 == 0)
                countLabel.setText("" + CHECK(numberStatic) + (char)zn + (int)numberGet);
            if (numberStatic % 1 != 0 && numberGet % 1 != 0)
                countLabel.setText("" + CHECK(numberStatic) + (char)zn + CHECK(numberGet));
        }
    }

    private void checkSymbol(){
        switch(zn) {
            case '+' : numberStatic = numberStatic + numberGet;
                break;
            case '-' : numberStatic = numberStatic - numberGet;
                break;
            case '*' : numberStatic = numberStatic * numberGet;
                break;
            case '/' :  if(numberGet == 0) {
                numberStatic = 0;
                countLabel.setText("I cannot do it :(");
            }
            else
                numberStatic = numberStatic / numberGet;
                break;
            case  0  : numberStatic = numberGet;
            case '=' : break;
        }
    }

    public static void main(String[] args) {
        Calculator app = new Calculator();
        app.setVisible(true);
        app.setBackground(backgroundColor);
        app.setLocation(500,200);
        app.setSize(286,328);
    }
}