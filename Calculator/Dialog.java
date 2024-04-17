import java.util.Scanner;

public class Dialog {

Scanner scanner;
/**
* Метод ввода с консоли - возвращает Integer
* @param prompt
* @return
*/
public int invaiteForEnterNum(){
    System.out.print("Введите целое число: ");
            int num = 0;
            scanner = new Scanner(System.in);
        try {   
            num = Integer.parseInt(scanner.nextLine());
          
        }catch (Exception e) {
            System.out.println("Введено не корректное значение.");
            }  
           
    return num;

}
/**
 * Метод ввода с консоли, возвращает String
 * @return
 */
public String inviteForEnterAction(){
   String strAct = "";
    System.out.print("Введите арифметическое действие (+, -, *, /): ");
   scanner = new Scanner(System.in, "cp866");
try {   

 strAct = scanner.nextLine(); 

}catch (Exception e) {
    System.out.println("");
}  

return strAct;
}

public void closeScan(){
    scanner.close();
}
}
