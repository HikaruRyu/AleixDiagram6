package diagram;

import java.sql.Date;

public class Payment {
    private float amount;

    public Payment(float amount) {
        this.amount = amount;
    }



public class Cash extends Payment {
    private float cashTendred;

    public Cash(float amount, float cashTendred) {
        super(amount);
        this.cashTendred = cashTendred;
    }

}

public class Check extends Payment {
    private String name;
    private String bankID;

    public Check(float amount, String name, String bankID) {
        super(amount);
        this.name = name;
        this.bankID = bankID;
    }


    public void authorized() {
    	
    }
}

public class Credit extends Payment{
	private String type;
	private String number;
	private Date expDate;
	
	public Credit(String type,String number,Date expDate) {
        super(amount);
        this.type=type;
        this.number=number;
        this.expDate=expDate;
	}
	
    public void authorized() {
    	
    }
}

}
