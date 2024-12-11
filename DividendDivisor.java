import java.util.*;

class subClass {
    public int QResult (int iDividend, int iDivisor) {
        
        int iQ = iDividend / iDivisor;
        return iQ;

    }
    public int RResult (int iDividend, int iDivisor) {

        int iR = iDividend % iDivisor;
        return iR;
    }
    
}

class First {
    public static void main(String args[]) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Dividend");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter Divisor");
        int iValue2 = sobj.nextInt();
        if (iValue2 == 0) {
            System.out.println("Divisor can not be Zero");
        }
        else {

        subClass scobj = new subClass();

        int Quotient = scobj.QResult(iValue1, iValue2);
        int Remainder = scobj.RResult(iValue1, iValue2);

        System.out.println("Quotient : "+Quotient);
        System.out.println("Remainder : "+Remainder);

        }
        sobj.close();
    }
}
