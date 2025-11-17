abstract class Printer{
    String model;
    int printedCount;
    int availableCount;
    public abstract boolean print();
}

class InkjetPrinter extends Printer{
    InkjetPrinter(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
    }
    @Override
    public boolean print(){
        if(availableCount == 0){
            printedCount++;
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족.\n", model, printedCount);
            return false;
        }
        else {
            printedCount ++;
            availableCount --;
            return true;
        }
    }
}

class LaserPrinter extends Printer{
    LaserPrinter(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
    }
    @Override
    public boolean print(){
        if(availableCount == 0){
            printedCount++;
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족.\n", model, printedCount);
            return false;
        }
        else{
            printedCount ++;
            availableCount --;
            return true;
        }
    }
}

public class Homework7 {
    public static void main(String[] args){
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Cannon MFC643Cdw", 1500);
        while(inkjet.print());
        while(laser.print());
    }
}
