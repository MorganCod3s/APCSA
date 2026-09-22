package Unit1;

public class U1T2Freestyle {
    public static void main(String[] args) {
        // This program is centered around a party!!
        int partyGuests;
        partyGuests = 34;
        System.out.println("Number of people at the party: " +  partyGuests);
        double partyLength = 3.5;
        System.out.println("The party lasts " + partyLength + " hours!");
        int cakeSlices = 52;
        System.out.print("");
        System.out.println("Number of slices of cake: " + cakeSlices);
        System.out.println("There are 36 party bags!");
        /* 8 more guests are coming!
        Will we have enough cake? */
        partyGuests = 34 + 8;
        // I want to take some cake to save before the party, so I will take 4 slices of cakke with me.
        cakeSlices = 52 - 4;
        final int MAXIMUM_VENUE_CAPACITY = 50;
        if(MAXIMUM_VENUE_CAPACITY < partyGuests) {
            System.out.println("There;s no room for our guests.");
        } else {
            System.out.println("We have space for everyone here.");
        }
        Boolean enoughCake = false;
        if(cakeSlices < partyGuests) {
            enoughCake = false;
        } else {
            enoughCake = true;
        }
        System.out.println("True or false? There's enough slices of cake at the party: " + enoughCake);
        }

    }
