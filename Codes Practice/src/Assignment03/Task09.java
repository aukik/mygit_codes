<<<<<<< HEAD
package Assignment03;

public class Task09
{
    public static void main(String[] args)
    {
        System.out.println(Account.interestRate);
        Account a1 = new Account();
        System.out.println(a1.nameKi());
        System.out.println(a1.balanceKi());
        a1.nameBoshao("Mashrafe Murtaza");
        a1.balanceBoshao(5000);
        System.out.println(a1.nameKi());
        System.out.println(a1.balanceKi());
        Account a2 = new Account("Mustafizur Rahman",50);
        System.out.println(a2.nameKi());
        System.out.println(a2.balanceKi());
        a1.withdraw(4900);
        a2.withdraw(25);
        a1.withdraw(4899);
    }
}
=======
package Lab05;

public class Task09 {

        public static void main(String[] args)
        {
            System.out.println(Account.interestRate);
            Account a1 = new Account();
            System.out.println(a1.nameKi());
            System.out.println(a1.balanceKi());
            a1.nameBoshao("Mashrafe Murtaza");
            a1.balanceBoshao(5000);
            System.out.println(a1.nameKi());
            System.out.println(a1.balanceKi());
            Account a2 = new Account("Mustafizur Rahman",50);
            System.out.println(a2.nameKi());
            System.out.println(a2.balanceKi());
            a1.withdraw(4900);
            a2.withdraw(25);
            a1.withdraw(4899);
        }

    }
>>>>>>> 4cc45273a9fa08ef998ee68df5880d34a68caa4c
