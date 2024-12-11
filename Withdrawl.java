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
}
