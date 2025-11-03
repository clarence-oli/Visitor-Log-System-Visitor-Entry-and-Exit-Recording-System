import javax.swing.*;
import java.awt.*;

public class VisitorLogGUI {
    public static void main(String[] args) {
        // Create main frame (window)
        JFrame frame = new JFrame("Visitor Log System");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center window

        // Main panel (background)
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(230, 240, 255)); // light blue

        // Title section
        JLabel title = new JLabel("Visitor Log System", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setForeground(Color.DARK_GRAY);
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        mainPanel.add(title, BorderLayout.NORTH);

        // Button section (center)
        JPanel buttonPanel = new JPanel(new GridLayout(4, 2, 15, 15));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 100, 20, 100));
        buttonPanel.setBackground(new Color(230, 240, 255));

        // Buttons
        JButton addVisitorBtn = new JButton("Add Visitor Entry");
        JButton exitVisitorBtn = new JButton("Log Visitor Exit");
        JButton viewAllBtn = new JButton("View All Records");
        JButton searchNameBtn = new JButton("Search by Name");
        JButton searchIdBtn = new JButton("Search by ID");
        JButton currentVisitorsBtn = new JButton("Current Visitors");
        JButton summaryBtn = new JButton("Visitors Summary");
        JButton aboutBtn = new JButton("About Us");

        // Add buttons to panel
        buttonPanel.add(addVisitorBtn);
        buttonPanel.add(exitVisitorBtn);
        buttonPanel.add(viewAllBtn);
        buttonPanel.add(searchNameBtn);
        buttonPanel.add(searchIdBtn);
        buttonPanel.add(currentVisitorsBtn);
        buttonPanel.add(summaryBtn);
        buttonPanel.add(aboutBtn);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // Footer / Exit
        JButton exitBtn = new JButton("Exit System");
        exitBtn.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(exitBtn, BorderLayout.SOUTH);

        // Add everything to frame
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}