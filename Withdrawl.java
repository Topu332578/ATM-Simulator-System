public class Withdrawl {
    String pin;
    TextField textField;

    JButton b1, b2;
}
Withdrawl(String pin) {
    this.pin = pin;
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
    Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel l3 = new JLabel(i3);
    l3.setBounds(0, 0, 1550, 830);
    add(l3);

    JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS Tk.10,000");
    label1.setForeground(Color.WHITE);
    label1.setFont(new Font("System", Font.BOLD, 16));
    label1.setBounds(460,180,700,35);
    l3.add(label1);

    JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
    label2.setForeground(Color.WHITE);
    label2.setFont(new Font("System", Font.BOLD, 16));
    label2.setBounds(460,220,400,35);
    l3.add(label2);
}