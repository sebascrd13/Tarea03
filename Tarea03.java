import javax.swing.JOptionPane;

public class Tarea03 {
    public static void main(String[] args) {
//===========================WHILE================================== 
        boolean flag = true;
        byte num1;
        byte num2;

        while (flag) {
            num1 = Byte.parseByte(JOptionPane.showInputDialog(
                "Digite un número: "));
            num2 = Byte.parseByte(JOptionPane.showInputDialog(
                "Digite otro número: "));
            if (num1 == num2){
                flag=false;
                JOptionPane.showMessageDialog(null,
                "Los números son iguales!!");
            }else{
                JOptionPane.showMessageDialog(null,
                "Los números son diferentes");
            }
        }

//==========================DO WHILE===============================

        byte Num1;
        byte Num2;
        
        do {
            
            Num1 = Byte.parseByte(JOptionPane.showInputDialog(
            "Ingrese un número: "));
            
            Num2 = Byte.parseByte(JOptionPane.showInputDialog(
            "Ingrese un número: "));
            
        } while ( Num1 != Num2 );
        
        JOptionPane.showMessageDialog(null, 
                "Los números ingresados son iguales");
        
//===============================FOR=================================

    }
}
