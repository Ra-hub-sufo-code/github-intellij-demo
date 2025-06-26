package SetDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;

class BankAccount {
    String accHolderName;
    int bal;
    double accNumber;

    public BankAccount(String accHolderName, int bal, double accNumber) {
        this.accHolderName = accHolderName;
        this.bal = bal;
        this.accNumber = accNumber;
    }

    public BankAccount () { }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accHolderName='" + accHolderName + '\'' +
                ", bal=" + bal +
                ", accNumber=" + accNumber +
                '}';
    }
}
public class LikedHashSetDemo {
    public static void main(String[] args) {
        BankAccount accHolder1 = new BankAccount("Raushan",
                                        100000,92839);
        BankAccount accHolder2 = new BankAccount("Abhishek",
                99000, 928309);
        BankAccount accHolder3 = new BankAccount("Bipin",
                89000, 902839);
        BankAccount accHolder4 = new BankAccount("Sonu",
                87000, 912839);

        Set<BankAccount> set =new LinkedHashSet<>();
        set.add(accHolder1);
        set.add(accHolder2);
        set.add(accHolder3);
        set.add(accHolder4);

        BankAccount obj = new BankAccount();
        Iterator<BankAccount> it = set.iterator();
        while (it.hasNext()) {
            obj = it.next();
            if (obj.equals(accHolder4)) {
                it.remove();
                System.out.println("Remove the accHolder4");
            }
            else {
                System.out.println(obj);
            }
        }
    }
}
