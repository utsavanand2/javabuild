package model;

import java.util.*;

public class DearnessAllowance {
    private String designationCode;
    private String designation;
    private int da;

    public DearnessAllowance() {}

    private DearnessAllowance(
        String designationCode,
        String designation,
        int da
    ) {
        this.designationCode = designationCode;
        this.designation = designation;
        this.da = da;
    }

    public String getDesgCode() {
        return this.designationCode;
    }

    public String getDesg() {
        return this.designation;
    }

    public int getDA() {
        return this.da;
    }

    public static DearnessAllowance getDaByCode(String designationCode) {
        DearnessAllowance da = new DearnessAllowance();
        switch(designationCode) {
            case "e": da = new DearnessAllowance("e", "Engineer", 20000);
            break;
            
            case "k": da = new DearnessAllowance("k", "Clerk", 12000);
            break;

            case "r": da = new DearnessAllowance("r", "Receptionist", 15000);
            break;

            case "m": da = new DearnessAllowance("m", "Manager", 40000);
            break;
        }
        
        return da;
    }
}