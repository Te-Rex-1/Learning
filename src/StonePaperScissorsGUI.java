import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StonePaperScissorsGUI {
    private JFrame frame;
    private JLabel userChoiceLabel, computerChoiceLabel, resultLabel, scoreLabel;
    private int userScore = 0, computerScore = 0;

    public StonePaperScissorsGUI() {
        // Set up main frame
        frame = new JFrame("Stone Paper Scissors Game");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Title and instructions
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
        JLabel welcomeLabel = new JLabel("Stone Paper Scissors Game!", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titlePanel.add(welcomeLabel);

        JLabel instructionLabel = new JLabel("Choose your move:", JLabel.CENTER);
        instructionLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        instructionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titlePanel.add(instructionLabel);
        frame.add(titlePanel, BorderLayout.NORTH);

        // Choice and result display area
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new GridLayout(3, 1));
        userChoiceLabel = new JLabel("Your Choice: ", JLabel.CENTER);
        computerChoiceLabel = new JLabel("Computer's Choice: ", JLabel.CENTER);
        resultLabel = new JLabel("Result: ", JLabel.CENTER);

        displayPanel.add(userChoiceLabel);
        displayPanel.add(computerChoiceLabel);
        displayPanel.add(resultLabel);

        frame.add(displayPanel, BorderLayout.CENTER);

        // Buttons with icons for user choices
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton stoneButton = createButton("Stone", "🪨", Color.LIGHT_GRAY);
        JButton paperButton = createButton("Paper", "📄", Color.WHITE);
        JButton scissorsButton = createButton("Scissors", "✂️", Color.PINK);

        stoneButton.addActionListener(e -> playRound(1));
        paperButton.addActionListener(e -> playRound(2));
        scissorsButton.addActionListener(e -> playRound(3));

        buttonPanel.add(stoneButton);
        buttonPanel.add(paperButton);
        buttonPanel.add(scissorsButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Score Panel
        scoreLabel = new JLabel("Score - You: 0 | Computer: 0", JLabel.CENTER);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(scoreLabel, BorderLayout.NORTH);

        // Make frame visible
        frame.setVisible(true);
    }

    private JButton createButton(String text, String emoji, Color color) {
        JButton button = new JButton(emoji + " " + text);
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.setPreferredSize(new Dimension(130, 50));
        button.setBackground(color);
        button.setFocusPainted(false);
        return button;
    }

    private void playRound(int userChoice) {
        String[] choices = {"Stone", "Paper", "Scissors"};
        int computerChoice = (int) (Math.random() * 3) + 1;

        // Set user and computer choices with colors
        userChoiceLabel.setText("Your Choice: " + choices[userChoice - 1]);
        computerChoiceLabel.setText("Computer's Choice: " + choices[computerChoice - 1]);

        // Determine the result
        if (userChoice == computerChoice) {
            resultLabel.setText("Result: It's a Tie!");
            resultLabel.setForeground(Color.ORANGE);
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            resultLabel.setText("Result: You Win!");
            resultLabel.setForeground(Color.GREEN);
            userScore++;
        } else {
            resultLabel.setText("Result: Computer Wins!");
            resultLabel.setForeground(Color.RED);
            computerScore++;
        }

        // Update the score with animation effect
        updateScoreLabel();
    }

    private void updateScoreLabel() {
        scoreLabel.setText("Score - You: " + userScore + " | Computer: " + computerScore);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 20));
        scoreLabel.setForeground(Color.BLUE);
    }

    // Static method to launch the GUI
    public static void launchGame() {
        SwingUtilities.invokeLater(StonePaperScissorsGUI::new);
    }

    public static void main(String[] args) {
        launchGame();  // Launches the GUI if running this class directly
    }
}
