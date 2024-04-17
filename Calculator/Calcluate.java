public class Calcluate {
    protected int a;
    protected int b;
    protected int res;
    protected String act;

    Dialog dialog = new Dialog();

    /**
     * Программа калькулятора, возвращает String
     * @return
     */
    public String runCalculate(){
        a = dialog.invaiteForEnterNum();
        act = dialog.inviteForEnterAction();
        b = dialog.invaiteForEnterNum();
        switch (act) {
            case "+":
                this.res = a + b;
                break; 
            case "-":
                this.res = a - b;
                break;
            case "*":
                this.res = a * b;
                break;
            case "/":
                this.res = a / b;
                break;
            default:
                this.res = -2198345;
                break;
        }
        dialog.closeScan();
        if(res == -2198345) return "До свидания";
        else return String.format("%d %s %d %s %d", a,act,b,"=",res); 
    }
}
