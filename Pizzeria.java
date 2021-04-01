
/**
 * 
 */
import java.util.*;
public class Pizzeria//start of class
{
    Scanner s= new Scanner(System.in);
    String MainMenu[] = {"1.Soups","2.Garlic Bread","3.Pasta","4.Vegetarian Pizza","5.Non-Vegetarian Pizza","6.Soft Drinks","7.Desserts","8.Exit"};
    String SoupMenu[] = {"1.Sweet Corn..........100/120","2.Tomato..............80","3.Manchow.............120/140","4.Back"};
    String PastaMenu[] = {"1.Red Sauce...........150/170","3.Green Sauce.........150/170","3.White Sauce.........150/170","4.Back"};
    String GarlicBreadMenu[] = {"1.With Cheese.........100","2.Without Cheese......80","3.Back"};
    String VegpizzaMenu[] = {"1.Farm House..........250/300/350","2.Deluxe Veggie.......220/270/320","3.Margerita...........200/250/300","4.Back"};
    String NonvegpizzaMenu[] = {"1.Chicken Dominator........350/400/450","2.Barbeque Chicken.........300/350/400","3.Chicken Pepperoni........320/370/420","4.Back"};
    String SoftDrinkMenu[] = {"1.Pespi/Fanta/Sprite.......50","2.Lemonade.................70","3.Chocolate Smoothie.......90","4.Back"};
    String DessertMenu[] = {"1.ChocoLava Cake...........75","2.Ice-Cream Sandwich.......25","3.Butterscotch Mousse......100","4.Back"};
    String CustomerChoice[] = new String[100];
    int CustomerQuantity[] = new int[100];
    double CustomerAmount[] = new double[100];
    double amt=0.0;
    int j=0,k=0,l=0,i;

    public void main()
    {
        Pizzeria o = new Pizzeria();
        int c=0; 
        System.out.println("\u000c");
        System.out.println("===============Khushee's Pizzeria===============");
        for(i=0;i<8;i++)
        { System.out.println(MainMenu[i]); }
        System.out.println("Enter your choice: ");
        c = s.nextInt();
        switch(c)
        {
            case 1: o.soups();
            break;
            case 2: o.garlicbread();
            break;
            case 3: o.pasta();
            break;
            case 4: o.vegpizza();
            break;
            case 5: o.nonvegpizza();
            break;
            case 6: o.softdrinks();
            break;
            case 7: o.desserts();
            break;
            case 8: o.bill();
            break;
        }
    }

    public void soups()
    {
        Pizzeria o1 = new Pizzeria();
        char chr;
        do
        {System.out.println("\u000c");
            System.out.println("YOU HAVE CHOSEN SOUPS");
            System.out.println("Choose from the following:");
            for(i=0;i<4;i++)
            { System.out.println(SoupMenu[i]);}
            System.out.println("Enter your choice: ");
            int c = s.nextInt();
            int ch,q;

            switch(c)
            {
                case 1: System.out.println("Enter Veg(1) or Non-Veg(2): ");
                ch = s.nextInt();
                if(ch==1)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(100*q);
                    CustomerAmount[j] = 100*q;
                    j++;
                    CustomerChoice[k] = "Sweet Corn Veg Soup";
                    k++;
                }
                if(ch==2)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(120*q);
                    CustomerAmount[j] = 120*q;
                    j++;
                    CustomerChoice[k] = "Sweet Corn Non-Veg Soup";
                    k++;
                }
                break;
                case 2: System.out.println("Enter quantity: ");
                q=s.nextInt();
                CustomerQuantity[l] = q;
                l++;
                amt = amt+(80*q);
                CustomerAmount[j] = 80*q;
                j++;
                CustomerChoice[k] = "Tomato Soup";
                k++;
                break;
                case 3: System.out.println("Enter Veg(1) or Non-Veg(2): ");
                ch = s.nextInt();
                if(ch==1)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(120*q);
                    CustomerAmount[j] = 120*q;
                    j++;
                    CustomerChoice[k] = "Manchow Veg Soup";
                    k++;
                }
                if(ch==2)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(140*q);
                    CustomerAmount[j] = 140*q;
                    j++;
                    CustomerChoice[k] = "Manchow Non-Veg Soup";     
                    k++;
                }
                break;
                case 4: o1.main();
                break;
            }
            System.out.println("Go back to main menu? yes(y) or no(n): ");
            chr = s.next().charAt(0);
        }while(chr=='n');
        o1.main();
        System.out.println("\u000c");
    }

    public void garlicbread()
    {
        Pizzeria o2 = new Pizzeria();
        char chr;
        do
        {
            System.out.println("\u000c");
            System.out.println("YOU HAVE CHOSEN GARLIC BREAD");
            System.out.println("Choose from the following:");
            for(i=0;i<3;i++)
            { System.out.println(GarlicBreadMenu[i]);}
            System.out.println("Enter your choice: ");
            int c = s.nextInt();
            int q;

            switch(c)
            {
                case 1: 
                System.out.println("Enter quantity: ");
                q=s.nextInt();
                CustomerQuantity[l] = q;
                l++;
                amt = amt+(100*q);
                CustomerAmount[j] = 100*q;
                j++;
                CustomerChoice[k] = "Garlic Bread with cheese";
                k++;
                break;
                case 2: System.out.println("Enter quantity: ");
                q=s.nextInt();
                CustomerQuantity[l] = q;
                l++;
                amt = amt+(80*q);
                CustomerAmount[j] = 80*q;
                j++;
                CustomerChoice[k] = "Garlic Bread without cheese";
                k++;
                break;
                case 3: o2.main();
                break;
            }
            System.out.println("Go back to main menu? yes(y) or no(n): ");
            chr = s.next().charAt(0);
        }while(chr=='n');
        o2.main();
        System.out.println("\u000c");
    }

    public void pasta()
    {
        Pizzeria o3 = new Pizzeria();
        char chr;
        do
        {
            System.out.println("\u000c");
            System.out.println("YOU HAVE CHOSEN PASTA");
            System.out.println("Choose from the following:");
            for(i=0;i<4;i++)
            { System.out.println(PastaMenu[i]);}
            System.out.println("Enter your choice: ");
            int c = s.nextInt();
            int ch,q;

            switch(c)
            {
                case 1: System.out.println("Enter Veg(1) or Non-Veg(2): ");
                ch = s.nextInt();
                if(ch==1)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(150*q);
                    CustomerAmount[j] = 150*q;
                    j++;
                    CustomerChoice[k] = "Red Sauce Pasta Veg";
                    k++;
                }
                if(ch==2)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(170*q);
                    CustomerAmount[j] = 170*q;
                    j++;
                    CustomerChoice[k] = "Red Sauce Pasta Non-Veg";
                    k++;
                }
                break;
                case 2: System.out.println("Enter Veg(1) or Non-Veg(2): ");
                ch = s.nextInt();
                if(ch==1)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(150*q);
                    CustomerAmount[j] = 150*q;
                    j++;
                    CustomerChoice[k] = "Green Sauce Pasta Veg";
                    k++;
                }
                if(ch==2)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(170*q);
                    CustomerAmount[j] = 170*q;
                    j++;
                    CustomerChoice[k] = "Green Sauce Pasta Non-Veg";
                    k++;
                }
                break;
                case 3: System.out.println("Enter Veg(1) or Non-Veg(2): ");
                ch = s.nextInt();
                if(ch==1)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(150*q);
                    CustomerAmount[j] = 150*q;
                    j++;
                    CustomerChoice[k] = "White Sauce Pasta Veg";
                    k++;
                }
                if(ch==2)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(170*q);
                    CustomerAmount[j] = 170*q;
                    j++;
                    CustomerChoice[k] = "White Sauce Pasta Non-Veg";
                    k++;
                }
                break;
                case 4: o3.main();
            }
            System.out.println("Go back to main menu? yes(y) or no(n): ");
            chr = s.next().charAt(0);
        }while(chr=='n');
        o3.main();
        System.out.println("\u000c");
    }

    public void vegpizza()
    {
        Pizzeria o4 = new Pizzeria();
        char chr;
        do
        {
            System.out.println("\u000c");
            System.out.println("YOU HAVE CHOSEN VEGETARIAN PIZZA");
            System.out.println("Choose from the following:");
            for(i=0;i<4;i++)
            { System.out.println(VegpizzaMenu[i]);}
            System.out.println("Enter your choice: ");
            int c = s.nextInt();
            int ch,q;

            switch(c)
            {
                case 1: System.out.println("Enter Size: Small(1) / Medium(2) / Large(3): ");
                ch = s.nextInt();
                if(ch==1)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(250*q);
                    CustomerAmount[j] = 250*q;
                    j++;
                    CustomerChoice[k] = "Farm House Small";
                    k++;
                }
                if(ch==2)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(300*q);
                    CustomerAmount[j] = 300*q;
                    j++;
                    CustomerChoice[k] = "Farm House Medium";
                    k++;
                }
                if(ch==3)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(350*q);
                    CustomerAmount[j] = 350*q;
                    j++;
                    CustomerChoice[k] = "Farm House Large";
                    k++;
                }
                break;
                case 2: System.out.println("Enter Size: Small(1) / Medium(2) / Large(3): ");
                ch = s.nextInt();
                if(ch==1)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(220*q);
                    CustomerAmount[j] = 220*q;
                    j++;
                    CustomerChoice[k] = "Deluxe Veggie Small";
                    k++;
                }
                if(ch==2)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(270*q);
                    CustomerAmount[j] = 270*q;
                    j++;
                    CustomerChoice[k] = "Deluxe Veggie Medium";
                    k++;
                }
                if(ch==3)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(320*q);
                    CustomerAmount[j] = 320*q;
                    j++;
                    CustomerChoice[k] = "Deluxe Veggie Large";
                    k++;
                }
                break;
                case 3: System.out.println("Enter Size: Small(1) / Medium(2) / Large(3): ");
                ch = s.nextInt();
                if(ch==1)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(200*q);
                    CustomerAmount[j] = 200*q;
                    j++;
                    CustomerChoice[k] = "Margerita Small";
                    k++;
                }
                if(ch==2)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(250*q);
                    CustomerAmount[j] = 250*q;
                    j++;
                    CustomerChoice[k] = "Margerita Medium";
                    k++;
                }
                if(ch==3)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(300*q);
                    CustomerAmount[j] = 300*q;
                    j++;
                    CustomerChoice[k] = "Margerita Large";
                    k++;
                }
                break;
                case 4: o4.main();
                break;
            }
            System.out.println("Go back to main menu? yes(y) or no(n): ");
            chr = s.next().charAt(0);
        }while(chr=='n');
        o4.main();
        System.out.println("\u000c");
    }

    public void nonvegpizza()
    {
        Pizzeria o5 = new Pizzeria();
        char chr;
        do
        {
            System.out.println("\u000c");
            System.out.println("YOU HAVE CHOSEN NON-VEGETARIAN PIZZA");
            System.out.println("Choose from the following:");
            for(i=0;i<4;i++)
            { System.out.println(NonvegpizzaMenu[i]);}
            System.out.println("Enter your choice: ");
            int c = s.nextInt();
            int ch=0,q;

            switch(c)
            {
                case 1: 
                System.out.println("Enter Size: Small(1) / Medium(2) / Large(3): ");
                ch = s.nextInt();

                    
                if(ch==1)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(350*q);
                    CustomerAmount[j] = 350*q;
                    j++;
                    CustomerChoice[k] = "Chicken Dominator Small";
                    k++;
                }
                if(ch==2)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(400*q);
                    CustomerAmount[j] = 400*q;
                    j++;
                    CustomerChoice[k] = "Chicken Dominator Medium";
                    k++;
                }
                if(ch==3)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(450*q);
                    CustomerAmount[j] = 450*q;
                    j++;
                    CustomerChoice[k] = "Chicken Dominator Large";
                    k++;
                }
                break;
                case 2: System.out.println("Enter Size: Small(1) / Medium(2) / Large(3): ");
                ch = s.nextInt();
                if(ch==1)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(300*q);
                    CustomerAmount[j] = 300*q;
                    j++;
                    CustomerChoice[k] = "Barbeque Chicken Small";
                    k++;
                }
                if(ch==2)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(350*q);
                    CustomerAmount[j] = 350*q;
                    j++;
                    CustomerChoice[k] = "Barbeque Chicken Medium";
                    k++;
                }
                if(ch==3)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(400*q);
                    CustomerAmount[j] = 400*q;
                    j++;
                    CustomerChoice[k] = "Barbeque Chicken Large";
                    k++;
                }
                break;
                case 3: System.out.println("Enter Size: Small(1) / Medium(2) / Large(3): ");
                ch = s.nextInt();
                if(ch==1)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(320*q);
                    CustomerAmount[j] = 320*q;
                    j++;
                    CustomerChoice[k] = "Chicken Pepperoni Small";
                    k++;
                }
                if(ch==2)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(370*q);
                    CustomerAmount[j] = 370*q;
                    j++;
                    CustomerChoice[k] = "Chicken Pepperoni Medium";
                    k++;
                }
                if(ch==3)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(420*q);
                    CustomerAmount[j] = 420*q;
                    j++;
                    CustomerChoice[k] = "Chicken Pepperoni Large";
                    k++;
                }
                break;
                case 4: o5.main();
                break;
            }
            System.out.println("Go back to main menu? yes(y) or no(n): ");
            chr = s.next().charAt(0);
        }while(chr=='n');
        o5.main();
        System.out.println("\u000c");
    }

    public void softdrinks()
    {
        Pizzeria o6 = new Pizzeria();
        char chr;
        do
        {
            System.out.println("\u000c");
            System.out.println("YOU HAVE CHOSEN SOFT DRINKS");
            System.out.println("Choose from the following:");
            for(i=0;i<4;i++)
            { System.out.println(SoftDrinkMenu[i]);}
            System.out.println("Enter your choice: ");
            int c = s.nextInt();
            int q,ch;

            switch(c)
            {
                case 1: System.out.println("Enter from: Pepsi(1) / Fanta(2) / Sprite(3): ");
                ch = s.nextInt();
                if(ch==1)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(50*q);
                    CustomerAmount[j] = 50*q;
                    j++;
                    CustomerChoice[k] = "Pepsi";
                    k++;
                }
                if(ch==2)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(50*q);
                    CustomerAmount[j] = 50*q;
                    j++;
                    CustomerChoice[k] = "Fanta";
                    k++;
                }
                if(ch==3)
                {
                    System.out.println("Enter quantity: ");
                    q=s.nextInt();
                    CustomerQuantity[l] = q;
                    l++;
                    amt = amt+(50*q);
                    CustomerAmount[j] = 50*q;
                    j++;
                    CustomerChoice[k] = "Sprite";
                    k++;
                }
                break;
                case 2: System.out.println("Enter quantity: ");
                q=s.nextInt();
                CustomerQuantity[l] = q;
                l++;
                amt = amt+(70*q);
                CustomerAmount[j] = 70*q;
                j++;
                CustomerChoice[k] = "Lemonade";
                k++;
                break;
                case 3: System.out.println("Enter quantity: ");
                q=s.nextInt();
                CustomerQuantity[l] = q;
                l++;
                amt = amt+(90*q);
                CustomerAmount[j] = 90*q;
                j++;
                CustomerChoice[k] = "Chocolate Smoothie";
                k++;
                break;
                case 4: o6.main();
                break;
            }
            System.out.println("Go back to main menu? yes(y) or no(n): ");
            chr = s.next().charAt(0);
        }while(chr=='n');
        o6.main();
        System.out.println("\u000c");
    }

    public void desserts()
    {
        Pizzeria o7 = new Pizzeria();
        char chr;
        do
        {
            System.out.println("\u000c");
            System.out.println("YOU HAVE CHOSEN DESSERTS");
            System.out.println("Choose from the following:");
            for(i=0;i<4;i++)
            { System.out.println(DessertMenu[i]);}
            System.out.println("Enter your choice: ");
            int c = s.nextInt();
            int q,ch;

            switch(c)
            {
                case 1: System.out.println("Enter quantity: ");
                q=s.nextInt();
                CustomerQuantity[l] = q;
                l++;
                amt = amt+(75*q);
                CustomerAmount[j] = 75*q;
                j++;
                CustomerChoice[k] = "ChocoLava Cake";
                k++;
                break;
                case 2: System.out.println("Enter quantity: ");
                q=s.nextInt();
                CustomerQuantity[l] = q;
                l++;
                amt = amt+(25*q);
                CustomerAmount[j] = 25*q;
                j++;
                CustomerChoice[k] = "Ice-Cream Sandwich";
                k++;
                break;
                case 3: System.out.println("Enter quantity: ");
                q=s.nextInt();
                CustomerQuantity[l] = q;
                l++;
                amt = amt+(100*q);
                CustomerAmount[j] = 100*q;
                j++;
                CustomerChoice[k] = "Butterscotch Mousse";
                k++;
                break;
                case 4: o7.main();
                break;
            }
            System.out.println("Go back to main menu? yes(y) or no(n): ");
            chr = s.next().charAt(0);
        }while(chr=='n');
        o7.main();
        System.out.println("\u000c");
    }

    public void bill()
    {
        System.out.println("\u000c");
        System.out.println("Take Away(1) / Home Delivery(2)");
        System.out.println("Enter your choice: ");
        int c = s.nextInt();
        double phone=0;
        int p=0;
        if(c==1)
        { System.out.println("Please enter your phone number: ");
            phone = s.nextDouble(); 
            System.out.println("Please take your order in 30 minutes.");
            System.out.println("Adress: Khushee's Pizzeria, Big Shopping Mall, Ghodbunder Road, Thane(W)");
        }
        if(c==2)
        {System.out.println("Please enter your phone number: ");
            phone = s.nextDouble(); s.nextLine();
            System.out.println("Please enter your address: ");
            String ad = s.nextLine();
            System.out.println("Your order will be delivered within 30-45 minutes");
        }
        System.out.println("===========================Bill===========================");
        System.out.println("Sr No.\tItem Name\tQuantity\tAmount");
        System.out.println("*********************************************************");
        for(i=0;i<j;i++)
        { System.out.println((p+1)+"\t"+CustomerChoice[i]+"\t\t"+CustomerQuantity[i]+"\t\t"+CustomerAmount[i]);
          p++;
        }
        System.out.println("*********************************************************");
        System.out.println("Total amount: "+amt);
        System.out.println("*********************************************************");
        System.out.println("Thank you!");
        for(i=-1000000000;i<=1000000000;i++)
        {
            ;
        }
        System.exit(0);

    }
}//end of class

    
