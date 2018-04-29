package helpers;

public class FasterScannerImpl {
    public static void main(String[] args) {
        FasterScanner scan=new FasterScanner(System.in);
        OutputWriter outputWriter=new OutputWriter(System.out);
        int i=scan.nextInt();
        String str=scan.nextLine();
        String str1=scan.nextString();
        if(scan.isSpaceChar(scan.nextInt())){
            outputWriter.print("SPACE");
            outputWriter.flush();
        }
        if(scan.isEndOfLine('\0')){
            outputWriter.print("EOF");
            outputWriter.flush();
        }
        Long de=scan.nextLong();

    }
}
