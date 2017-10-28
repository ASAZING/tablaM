
package tabladem;

public class data {
    public data (){
    }
    Integer num=0;
    public void capture(){
    num=Integer.parseInt(ventana.numm.getText());

    
        String numer=String.valueOf(num);
        ventana.jLabel22.setText(numer);
        String numer1=String.valueOf(num);
        ventana.jLabel23.setText(numer1);
        String numer2=String.valueOf(num);
        ventana.jLabel24.setText(numer2);
        String numer3=String.valueOf(num);
        ventana.jLabel25.setText(numer3);
        String numer4=String.valueOf(num);
        ventana.jLabel26.setText(numer4);
        String numer5=String.valueOf(num);
        ventana.jLabel27.setText(numer5);
        String numer6=String.valueOf(num);
        ventana.jLabel28.setText(numer6);
        String numer7=String.valueOf(num);
        ventana.jLabel29.setText(numer7);
        String numer8=String.valueOf(num);
        ventana.jLabel30.setText(numer8);
        String numer9=String.valueOf(num);
        ventana.jLabel31.setText(numer9);
        // Resultado
        String resul=String.valueOf(num*7);
        ventana.jLabel42.setText(resul);
        String resul1=String.valueOf(num*6);
        ventana.jLabel43.setText(resul1);
        String resul2=String.valueOf(num*9);
        ventana.jLabel44.setText(resul2);
        String resul3=String.valueOf(num*10);
        ventana.jLabel45.setText(resul3);
        String resul4=String.valueOf(num*8);
        ventana.jLabel46.setText(resul4);
        String resul5=String.valueOf(num*2);
        ventana.jLabel47.setText(resul5);
        String resul6=String.valueOf(num*1);
        ventana.jLabel48.setText(resul6);
        String resul7=String.valueOf(num*4);
        ventana.jLabel49.setText(resul7);
        String resul8=String.valueOf(num*5);
        ventana.jLabel50.setText(resul8);
        String resul9=String.valueOf(num*3);
        ventana.jLabel51.setText(resul9);
    }
    
    public void mult(){
    Integer num1,num2;
    num1=Integer.parseInt(ventana.Mnum1.getText());
    num2 = Integer.parseInt(ventana.Mnum2.getText());
    
    String resul9=String.valueOf(num1*num2);
        ventana.resultado.setText(resul9);
    }
}
