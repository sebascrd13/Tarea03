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
       int contador_positivo = 0;
       int contador_negativo = 0;
       int a;
        
       for (int i=0; i<10; i++) {
            a = Integer.parseInt(JOptionPane.showInputDialog( "Ingrese un número"));
            if(a>=0){
                contador_positivo++;
            }
            if (a<0){
               contador_negativo ++;
            }   
        }
        JOptionPane.showMessageDialog(null, " Total de números positivos = " +contador_positivo);
        JOptionPane.showMessageDialog(null, " Total de números negativos = " +contador_negativo);
    }
}    
