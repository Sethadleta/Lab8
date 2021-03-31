import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GuessingGame implements ActionListener {
  JTextField guess;
  JButton guessButton, playAgainButton;
  JLabel guess, highLowResponse, lastGuess;
  Random r = new Random();
  int randomNum = r.nextInt(100)+1;

  GuessingGame() {
    JFrame frame = new JFrame("Guessing Game");

    frame.setLayout(new FlowLayout());

    frame.setSize(240,120);

    userGuess = new JTextField(10);

    guess.setActionCommand("myTF");

    guessButton = new JButton("Guess");

    playAgainButton = new JButton("Play Again");

    guess.addActionListner(this);
    guessButton.addActionListner(this);
    playAgainButton.addActionListener(this);

    guess = new JLabel("Enter your guess: ");
    highLowResponse = new JLabel("");
    lastGuess = new JLabel("");

    frame.add(guess);
    frame.add(userGuess);
    frame.add(guessButton);
    frame.add(highLowResponse);
    frame.add(lastGuess);
    frame.add(playAgainButton);

    frame.setVisible(true);

    public void actionPerformed (ActionEvent ae) {
      if(ae.getActionCommand().equals("Guess")) {
        
        int guess = Integer.parseInt(userGuess.getText());
        String orgStr = userGuess.getText();
        String gusStr = "";

        int originalRand = randomNum;


        //randomNum < userGuess = highLowResponse.setText("Too Low!");
        //randomNum > userGuess = highLowResponse.setText("Too High!");

        for (int i = orgStr.length()-1; i >= 0; i--)
        gusStr += orgStr.charAt(i);

        //userGuess.setText(gusStr);
        lastGuess.setText("Last guess was " + userGuess.getText());
       }
       else {
         if (ae.getActionCommand().equals("Play Again")) {
          int randomNum = r.nextInt(100)+1;

          guess = new JLabel("Enter your guess: ");
          highLowResponse = new JLabel("");
          lastGuess = new JLabel("");
        }
        else {
          
        }
       }
    }
  }
}