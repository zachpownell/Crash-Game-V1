package me.Zach.RyanHomework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Example {

    private static double STARTING_MONEY = 100,
                          money = STARTING_MONEY,
                          winningMoney = 0,
                          multiplier = 1;

    private static Color randomColor = Color.GREEN,
                         randomColor2 = Color.LIGHT_GRAY,
                         randomColor3 = Color.RED;

    private static boolean crash = false,
                           inProgress = true;
    private static double bet = 0;


    public static void main(String[] args) throws InterruptedException {

        // Create JFrame
        JFrame frame = new JFrame();
        JLabel displayLabel = new JLabel("|  Crash  |", SwingConstants.CENTER);
        JLabel multiplierLabel = new JLabel("", SwingConstants.CENTER);
        JLabel inputLabel = new JLabel();
        JLabel profitLabel = new JLabel("", SwingConstants.CENTER);
        JLabel betButtonLabel = new JLabel();
        JLabel autoBetLabel = new JLabel();
        JLabel withdrawButtonLabel = new JLabel();
        JLabel moneyLabel = new JLabel("$" + (String.format("%.2f", money)), SwingConstants.CENTER);
        JLabel historyLabel = new JLabel("", SwingConstants.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0,1));
        frame.pack();
        frame.setSize(1100,700);

        // Create Labels


        // Sizing labels
        //betButtonLabel.setSize(120,40);
        //withdrawButtonLabel.setSize(80,30);

        // Add fonts to labels
        displayLabel.setFont(displayLabel.getFont().deriveFont(24.0f));
        multiplierLabel.setFont(multiplierLabel.getFont().deriveFont(96.0f));
        profitLabel.setFont(profitLabel.getFont().deriveFont(34.0f));
        moneyLabel.setFont(moneyLabel.getFont().deriveFont(64.0f));
        historyLabel.setFont(historyLabel.getFont().deriveFont(24.0f));

        // Create things inside of Labels
        JTextField inputField = new JTextField();
        JButton betButton = new JButton("Bet");
        JRadioButton autoBetButton = new JRadioButton("Auto Bet with $");
        JRadioButton autoWithdrawButton = new JRadioButton("Auto Withdraw at ");
        JButton withdrawButton = new JButton("Withdraw");
        //JButton randomButton = new JButton("I'm Gay lol");
        //JButton normalButton = new JButton("I'm Straight xd");
        JTextField autoWithdrawField = new JTextField();
        JTextField autoBetField = new JTextField();

        // Add things to Labels and set sizes
        inputLabel.add(inputField);
        betButtonLabel.add(betButton);
        autoBetLabel.add(autoBetButton);
        autoBetLabel.add(autoWithdrawField);
        autoBetLabel.add(autoWithdrawButton);
        autoBetLabel.add(autoBetField);
        //autoBetLabel.add(randomButton);
        withdrawButtonLabel.add(withdrawButton);
        inputField.setBounds(440,0,220,50);
        betButton.setBounds(440,0,220,50);
        autoBetButton.setBounds(450,0,130,20);
        autoWithdrawField.setBounds(590,20,50,20);
        autoWithdrawButton.setBounds(450,20,150,20);
        autoBetField.setBounds(580,0,60,20);
        withdrawButton.setBounds(490,0,120,40);
        //randomButton.setBounds(520,50,60,20);
        //normalButton.setBounds(600,50,60,20);

        // Add Labels to Frame
        frame.add(displayLabel);
        frame.add(multiplierLabel);
        frame.add(profitLabel);
        frame.add(inputLabel);
        frame.add(autoBetLabel);
        frame.add(betButtonLabel);
        frame.add(withdrawButtonLabel);
        frame.add(moneyLabel);
        frame.add(historyLabel);

        // Set background of frame to black
        Container container = frame.getContentPane();
        container.setBackground(Color.BLACK);

        // Set other colors
        autoWithdrawButton.setForeground(Color.WHITE);
        autoBetButton.setForeground(Color.WHITE);
        displayLabel.setForeground(Color.LIGHT_GRAY);
        moneyLabel.setForeground(Color.YELLOW);
        profitLabel.setForeground(Color.YELLOW);
        historyLabel.setForeground(Color.DARK_GRAY);

        // Finally, make frame visible
        frame.setLocationRelativeTo(null);
        //frame.setResizable(false);
        frame.setVisible(true);

        historyLabel.setText("0.00x  0.00x  0.00x  0.00x  0.00x  0.00x  0.00x  0.00x  0.00x  0.00x  ");


        /*randomButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = Color.WHITE;
                Random random = new Random();
                int num = random.nextInt(6);
                if (num==0) color = Color.RED;
                if (num==1) color = Color.YELLOW;
                if (num==2) color = Color.GREEN;
                if (num==3) color = Color.ORANGE;
                if (num==4) color = Color.BLUE;
                if (num==5) color = Color.PINK;
                if (num==6) color = Color.MAGENTA;
                randomColor = color;
                int num5 = random.nextInt(6);
                if (num5==0) color = Color.RED;
                if (num5==1) color = Color.YELLOW;
                if (num5==2) color = Color.GREEN;
                if (num5==3) color = Color.ORANGE;
                if (num5==4) color = Color.BLUE;
                if (num5==5) color = Color.PINK;
                if (num5==6) color = Color.MAGENTA;
                randomColor3 = color;
                int num4 = random.nextInt(6);
                if (num4==0) color = Color.RED;
                if (num4==1) color = Color.YELLOW;
                if (num4==2) color = Color.GREEN;
                if (num4==3) color = Color.ORANGE;
                if (num4==4) color = Color.BLUE;
                if (num4==5) color = Color.PINK;
                if (num4==6) color = Color.MAGENTA;
                randomColor2 = color;
                int num2 = random.nextInt(6);
                if (num2==0) color = Color.RED;
                if (num2==1) color = Color.YELLOW;
                if (num2==2) color = Color.GREEN;
                if (num2==3) color = Color.ORANGE;
                if (num2==4) color = Color.BLUE;
                if (num2==5) color = Color.PINK;
                if (num2==6) color = Color.MAGENTA;
                moneyLabel.setForeground(color);
                int num3 = random.nextInt(6);
                if (num3==0) color = Color.RED;
                if (num3==1) color = Color.YELLOW;
                if (num3==2) color = Color.GREEN;
                if (num3==3) color = Color.ORANGE;
                if (num3==4) color = Color.BLUE;
                if (num3==5) color = Color.PINK;
                if (num3==6) color = Color.MAGENTA;
                autoBetButton.setForeground(color);
                autoWithdrawButton.setForeground(color);
                int num6 = random.nextInt(6);
                if (num6==0) color = Color.RED;
                if (num6==1) color = Color.YELLOW;
                if (num6==2) color = Color.GREEN;
                if (num6==3) color = Color.ORANGE;
                if (num6==4) color = Color.BLUE;
                if (num6==5) color = Color.PINK;
                if (num6==6) color = Color.MAGENTA;
                container.setBackground(color);



            }
        });*/
        // Add Action Listener to button
        betButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double requestedBet = 0;

                try {

                    requestedBet = Double.parseDouble(inputField.getText());

                    if (!inProgress) {

                        if (money >= requestedBet) {

                            if (requestedBet != 0) {

                                money -= requestedBet;
                                moneyLabel.setText("$" + (String.format("%.2f", money)));
                                bet += requestedBet;
                                profitLabel.setForeground(Color.YELLOW);
                                profitLabel.setText("$" + (String.format("%.2f", bet)));
                                System.out.println("Placed/added to bet $" + (String.format("%.2f", bet)));

                            } else {

                                System.out.println("Did not place bet. Bet cannot equal 0.");
                                profitLabel.setForeground(Color.RED);
                                profitLabel.setText("Bet cannot equal 0.");

                            }

                        } else {

                            System.out.println("Cannot place bet. Not enough money.");

                            if (bet == 0) {

                                profitLabel.setForeground(Color.RED);
                                profitLabel.setText("Not enough money.");

                            }

                        }

                    } else {

                        System.out.println("Cannot place bet. Game in progress.");

                        if (bet == 0) {

                            profitLabel.setForeground(Color.RED);
                            profitLabel.setText("Cannot bet while game is in progress.");

                        }

                    }

                } catch (NumberFormatException ex) {

                    System.out.println("Requested bet is not a double value.");

                    if (bet == 0) {

                        profitLabel.setForeground(Color.RED);
                        profitLabel.setText("Please enter a number.");

                    }

                }

            }
        });


        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (inProgress) {

                    if (bet != 0) {

                        winningMoney = bet * multiplier;
                        profitLabel.setForeground(Color.GREEN);
                        profitLabel.setText("+ $" + (String.format("%.2f", winningMoney)) + " @" + (String.format("%.2f", multiplier)) + "x");
                        System.out.println("Withdraw bet $" + (String.format("%.2f", ((bet * multiplier) - bet))) + " @" + (String.format("%.2f", multiplier)) + "x");
                        bet = 0;

                    }

                } else {

                    System.out.println("Attempted withdraw bet. Game not in progress.");

                }

            }
        });

        long timer = 160;
        int ccounter = 0;


        while (true) {

            multiplierLabel.setForeground(randomColor);
            profitLabel.setForeground(Color.YELLOW);
            inProgress = true;
            profitLabel.setText("");
            ccounter = 0;
            System.out.println("Beginning game.");

            Random randomCrash = new Random();
            int randomCrashOdds = randomCrash.nextInt(24);
            //double exponential = 1;
            if (randomCrashOdds == 1) {

                multiplier = 0;

            } else {

                Random crashOdds = new Random();
                int crashOddsInt = 3 + crashOdds.nextInt(600);
                System.out.println("Odds crash this round: " + (crashOddsInt) + ".");

                while (!crash) {

                    Random random = new Random();
                    int odds = random.nextInt(crashOddsInt);
                    if (odds == 1) crash = true;
                    multiplier += (0.01);
                    //exponential += 0.0004;
                    multiplierLabel.setText((String.format("%.2f", multiplier)) + "x");
                    multiplierLabel.setForeground(randomColor);
                    if (bet != 0) profitLabel.setText("$" + (String.format("%.2f", (bet * multiplier))));
                    Thread.sleep(timer);
                    ccounter ++;
                    if (ccounter == 3) {
                        ccounter = 0;
                        if (timer > 30) {
                            timer -= 1;
                        }
                    }

                    if (autoWithdrawButton.isSelected()) {

                        String text = autoWithdrawField.getText() + "x";
                        if (multiplierLabel.getText().equals(text)) {

                            if (bet != 0) {

                                winningMoney = bet * multiplier;
                                profitLabel.setForeground(Color.GREEN);
                                profitLabel.setText("+ $" + (String.format("%.2f", winningMoney)) + " @" + (String.format("%.2f", multiplier)) + "x");
                                System.out.println("Withdraw bet $" + (String.format("%.2f", ((bet * multiplier) - bet))) + " @" + (String.format("%.2f", multiplier)) + "x");
                                bet = 0;

                            }

                        }

                    }

                }

            }

            timer = 160;
            multiplierLabel.setForeground(randomColor3);
            multiplierLabel.setText("Crashed @" + (String.format("%.2f", multiplier)) + "x!");
            if (bet != 0) profitLabel.setForeground(Color.RED);
            bet = 0;
            String historyText = ((String.format("%.2f", multiplier)) + "x  " + historyLabel.getText());
            historyLabel.setText(historyText.substring(0, historyText.length() - 7));
            Thread.sleep(4000);
            inProgress = false;
            profitLabel.setText("");
            profitLabel.setForeground(Color.YELLOW);
            if (bet == 0) profitLabel.setText("");
            System.out.println("Place your bets.");

            money += winningMoney;
            moneyLabel.setText("$" + (String.format("%.2f", money)));
            winningMoney = 0;


            double counter = 9.0;
            multiplierLabel.setForeground(randomColor2);

            if (autoBetButton.isSelected()) {

                double requestedBet = 0;

                try {

                    requestedBet = Double.parseDouble(autoBetField.getText());

                    //if (!inProgress) {

                    if (money >= requestedBet) {

                        if (requestedBet != 0) {

                            money -= requestedBet;
                            moneyLabel.setText("$" + (String.format("%.2f", money)));
                            bet += requestedBet;
                            profitLabel.setForeground(Color.YELLOW);
                            profitLabel.setText("$" + (String.format("%.2f", bet)));
                            System.out.println("Placed/added to bet $" + (String.format("%.2f", bet)));

                        } else {

                            System.out.println("Did not place bet. Bet cannot equal 0.");
                            profitLabel.setForeground(Color.RED);
                            profitLabel.setText("Bet cannot equal 0.");

                        }

                    } else {

                        System.out.println("Cannot place bet. Not enough money.");

                        if (bet == 0) {

                            profitLabel.setForeground(Color.RED);
                            profitLabel.setText("Not enough money.");

                        }

                    }


                } catch (NumberFormatException ex) {

                    System.out.println("Requested bet is not a double value.");

                    if (bet == 0) {

                        profitLabel.setForeground(Color.RED);
                        profitLabel.setText("Please enter a number.");

                    }

                }

            }

            while (counter > 1) {

                counter -= 0.1;
                Thread.sleep(100);
                multiplierLabel.setText("" + (String.format("%.1f", counter)));

            }

            multiplierLabel.setForeground(Color.GREEN);
            multiplier = 1;
            crash = false;

        }


    }

}
