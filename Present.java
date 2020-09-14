/**
 * Adventure time!
 * 
 * @author (Bryan Xu) 
 * @version (11/7/16)
 */
import java.util.*;
public class Present
{
    String name;
    String last;
    boolean female;
    int selection = 0;
    String fname;
    String flast;
    boolean ffemale;
    String date;
    String message;
    public Present(String Name, String Last, boolean gender,String NAME, String LAST, boolean GENDERR)
    {
        name = Name;
        last = Last;
        female = gender;
        fname = NAME;
        flast = LAST;
        ffemale = GENDERR;
        if((getFullName().equalsIgnoreCase("Cat Nguyen "))||
        getFullName().equalsIgnoreCase("Catherine Nguyen ")){
            date = "12/26/16";
            message = "Happy 17th birthday";
        } else{
            date = "12/25/16";
            message = "Merry Chirstmas";
        }
    }

    public String getMessage(){
        return message;
    }

    public String getDate(){
        return date;
    }

    public String getFirstName(){
        return name +" ";
    }

    public String getLastName(){
        return last +" ";
    }

    public String getFullName(){
        return name +" " +last +" ";
    }

    public String fgetFirstName(){
        return fname +" ";
    }

    public String fgetLastName(){
        return flast +" ";
    }

    public String fgetFullName(){
        return fname +" " +flast +" ";
    }

    public String heShe(boolean cap){
        if(female == true){
            if(cap==false){
                return "she ";} 
            else{return "She " ;}
        } else {
            if(cap==false){
                return "he ";}
            else{return "He ";}
        } 
    }

    public String hisHer(boolean cap){
        if(female == true){
            if(cap==false){return "her ";} 
            else{return "Her ";}
        }else{
            if(cap==false){return "his ";}
            else{return "His ";}
        }
    }

    public String himHer(boolean cap){
        if(female==true){
            if(cap==false){return "her ";}
            return "Her ";} else{
            if(cap==false){return "him ";}else {
                return "Him ";}}
    }

    public String himselfHerself(boolean cap){
        if(female==true){
            if(cap==false){return "herself ";}
            return "Herself ";} else{
            if(cap==false){return "himself ";}else {
                return "Himself ";}}
    }

    public String fheShe(boolean cap){
        if(ffemale == true){
            if(cap==false){
                return "she ";} 
            else{return "She " ;}
        } else {
            if(cap==false){
                return "he ";}
            else{return "He ";}
        } 
    }

    public String fhisHer(boolean cap){
        if(ffemale == true){
            if(cap==false){return "her ";} 
            else{return "Her ";}
        }else{
            if(cap==false){return "his ";}
            else{return "His ";}
        }
    }

    public String fhimHer(boolean cap){
        if(ffemale==true){
            if(cap==false){return "her ";}
            return "Her ";} else{
            if(cap==false){return "him ";}else {
                return "Him ";}}
    }

    public String fhimselfHerself(boolean cap){
        if(ffemale==true){
            if(cap==false){return "herself ";}
            return "Herself ";} else{
            if(cap==false){return "himself ";}else {
                return "Himself ";}}
    }

    public void zero(){
        System.out.println();
        System.out.println("Answer key to ending (fastest route):");
        System.out.println("You should probably write this down");
        System.out.println("1,3,7,11,16,17,30,33,35,39,41,42,44,45");
        System.out.println();
    }

    public void one(){
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Hello "+getFullName() +"and welcome to your journey!");
        System.out.println();
        System.out.println("One day, " +getFirstName() +"and " +hisHer(false) +"companion were walking down ");
        System.out.println("a street when they saw a mysterious fellow in the shadows. ");
        System.out.println("Alarmed, they: ");
        System.out.println();
        System.out.println("(3) Kick the stranger ");
        System.out.println("(4) Run away from the stranger");
        System.out.println("(5) Ignore the stranger");
        System.out.println();
    }

    public void three(){
        System.out.println();
        System.out.println("Alarmed, they kick the stranger! ");
        System.out.println();
        System.out.println("The stranger grunts and crumples to the floor.");
        System.out.println(fgetFirstName() +"approaches the stranger and searches his pockets.");
        System.out.println(fheShe(true)+"finds a map that says: ");
        System.out.println("777 Devil Lane");
        System.out.println();
        System.out.println("(6) Go to address");
        System.out.println("(7) Don't go to address");
        System.out.println();
    }

    public void four(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName() +"run away from the stranger! ");
        System.out.println("Afterwards, they spend a peaceful and fun day together. ");
        System.out.println("However, " +fgetFirstName() +"didn't get to give " +getFirstName());
        System.out.println(fhisHer(false) +"present...");
        System.out.println("Wrong path! ");
        System.out.println();
        System.out.println("(1) Restart");
        System.out.println();
    }

    public void five(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName()+"ignore the stranger.");
        System.out.println("The stranger pulls out a knife and assaults " +fgetFirstName());
        System.out.println("and " +getFirstName());
        System.out.println("Wrong path! ");
        System.out.println();
        System.out.println("(1) Restart");
        System.out.println();
    }

    public void six(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName() +"go to the place on the map. ");
        System.out.println("There, they see a dark warehouse with many shadows moving inside. ");
        System.out.println();
        System.out.println("(8) Break into the warehouse");
        System.out.println("(9) Sneak into the warehouse");
        System.out.println("(10) Scout around the building");
        System.out.println();
    }

    public void seven(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName() +"decide to play it safe.");
        System.out.println("They return home and watch many movies together.");
        System.out.println("While waiting for "+fgetFirstName() +"to return from the bathroom, ");
        System.out.println(getFirstName() +"finds a key on the desk of " +fgetFirstName());
        System.out.println("Curious, " +getFirstName() +"asks " +fgetFirstName() +"about it.");
        System.out.println(fheShe(true) +"replies that " +fhisHer(false) +"grandma gave it to "+fhimHer(false));
        System.out.println("but, " +fheShe(false) +"doesn't know where it leads to.");
        System.out.println();
        System.out.println("(11) Explore the house with the key! ");
        System.out.println();
    }

    public void eight(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName() +"bust into the building!");
        System.out.println("However, the meet many people with many weapons...");
        System.out.println("Wrong path! ");
        System.out.println();
        System.out.println("(1) Restart!");
        System.out.println();
    }

    public void nine(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName() +"cautiously enter the building.");
        System.out.println("Making sure they aren't spotted, they sneak around the wall. ");
        System.out.println("Finally, " +getFirstName() +"and " +fgetFirstName() +"reach a door.");
        System.out.println();
        System.out.println("(12) Go in");
        System.out.println();
    }

    public void ten(){
        System.out.println();
        System.out.println(fgetFirstName() +"finds a handgun in the bushes by the door!");
        System.out.println(getFirstName() +"finds a knife, which " +heShe(false) +"puts away.");
        System.out.println(getFirstName() +"and " +fgetFirstName() +"bust into the building!");
        System.out.println("With " +fhisHer(false) +"amazing skills, all the guards fall dead. ");
        System.out.println(getFirstName() +"sees a door...");
        System.out.println();
        System.out.println("(12) Go in");
        System.out.println();
    }

    public void eleven(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName() +"decide to split up.");
        System.out.println();
        System.out.println("(15) Search the bedroom");
        System.out.println("(16) Search the bathroom");
        System.out.println();
    }

    public void twelve(){
        System.out.println();
        System.out.println("Inside, they find a map, with the address of: ");
        System.out.print("666 Angel Street ");
        System.out.println("circled in red. ");
        System.out.println();
        System.out.println("(13) Go to address");
        System.out.println("(14) Don't go to address and return tomorrow");
        System.out.println();
    }

    public void thirteen(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName() +"go to the address. ");
        System.out.println("There they find two gnomes and a riddle, saying: ");
        System.out.println("Of these two gnomes, one always lies, one always tells the truth");
        System.out.println("You may have one question, and one question only. ");
        System.out.println("You must choose the correct door to enter. ");
        System.out.println("If you choose wrong, grave consequences will occur");
        System.out.println("Which gnome do you ask? ");
        System.out.println();
        System.out.println("(18) Gnome on the left");
        System.out.println("(19) Gnome on the right");
        System.out.println();
    }

    public void fourteen(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName() +"decide to come back tomorrow. ");
        System.out.println("When " +getFirstName() +"comes home, " +hisHer(false) +"mom asks where");
        System.out.println(heShe(false) +"had been all day.");
        System.out.println("Unable to tell a lie, " +getFirstName() +"is grounded... ");
        System.out.println();
        System.out.println("(1) Restart!");
        System.out.println();        
    }

    public void fifteen(){
        System.out.println();
        System.out.println(getFirstName() +"searches the bedroom and " +heShe(false) +"finds");
        System.out.println("some dirty magazines. ");
        System.out.println();
        System.out.println("(16) Search the bathroom");
        System.out.println();
    }

    public void sixteen(){
        System.out.println();
        System.out.println(getFirstName() +"decides to go number two. ");
        System.out.println("After, while " +heShe(false) +"is washing " +hisHer(false) +"hands, ");
        System.out.println(heShe(false) +"realizes that " +heShe(false) +"didn't flush.");
        System.out.println("But to " +hisHer(false)+"surprise, the flushing mechanism");
        System.out.println("wouldn't work! " +heShe(true) +"pulled out the plunger and starting pumping.");
        System.out.println("While doing this, " +heShe(false) +"discovered that there was a trapdoor!");
        System.out.println();
        System.out.println("(17) Try the key");
        System.out.println();
    }

    public void seventeen(){
        System.out.println();
        System.out.println(getFirstName() +"calls " +fgetFirstName() +"into the room. ");
        System.out.println("Together, they open the trapdoor. Inside, they find a tunnel...");
        System.out.println();
        System.out.println("(30) Crawl in");
        System.out.println();
    }

    public void eighteen(){
        System.out.println();
        System.out.println(getFirstName() +"asks the gnome on the left ");
        System.out.println("What question does " +getFirstName() +"ask? ");
        System.out.println();
        System.out.println("(20) What door is the correct one?");
        System.out.println("(21) What door is the correct one according to the other gnome? ");
        System.out.println();
    }

    public void nineteen(){
        System.out.println();
        System.out.println(getFirstName() +"asks the gnome on the right ");
        System.out.println("What question does " +getFirstName() +"ask? ");
        System.out.println();
        System.out.println("(22) What door is the correct one?");
        System.out.println("(23) What door is the correct one according to the other gnome? ");
        System.out.println();
    }

    public void twenty(){
        System.out.println();
        System.out.println("The left gnome answers the left door. ");
        System.out.println("Which door does " +getFirstName() +"choose? ");
        System.out.println();
        System.out.println("(24) Left door");
        System.out.println("(25) Right door");
        System.out.println();
    }

    public void twentyone(){
        System.out.println();
        System.out.println("The left gnome answers the right door. ");
        System.out.println("Which door does " +getFirstName() +"choose? ");
        System.out.println();
        System.out.println("(24) Left door");
        System.out.println("(25) Right door");
        System.out.println();
    }

    public void twentytwo(){
        System.out.println();
        System.out.println("The right gnome answers the right door. ");
        System.out.println("Which door does " +getFirstName() +"choose? ");
        System.out.println();
        System.out.println("(24) Left door");
        System.out.println("(25) Right door");
        System.out.println();
    }

    public void twentythree(){
        System.out.println();
        System.out.println("The right gnome answers the right door. ");
        System.out.println("Which door does " +getFirstName() +"choose? ");
        System.out.println();
        System.out.println("(24) Left door");
        System.out.println("(25) Right door");
        System.out.println();
    }

    public void twentyfour(){
        System.out.println();
        System.out.println(getFirstName() +"enters the left door.");
        System.out.println("Alarms start blaring and " +getFirstName() +"and " +fgetFirstName());
        System.out.println("start shaking with fear...");
        System.out.println();
        System.out.println("(26) Continue");
        System.out.println();
    }

    public void twentyfive(){
        System.out.println();
        System.out.println(getFirstName() +"enters the right door.");
        System.out.println("As " +getFirstName() +"looks around, " +heShe(false) +"is ");
        System.out.println("shot in the chest by an arrow...");
        System.out.println(heShe(true) +"collapses");
        System.out.println();
        System.out.println("(1) Restart!");
        System.out.println("(13) Restart at gnomes!");
        System.out.println();
    }

    public void twentysix(){
        System.out.println();
        System.out.println("On the other side, a blinding light appears!");
        System.out.println("They discover three doors this time and the following sentences.");
        System.out.println("The first contains a gas chamber which constantly leaks gas slowly.");
        System.out.println("The second contains 300 lions who have been starved for 30 days.");
        System.out.println("The third contains a huge mob of armed angsty teens.");
        System.out.println("Which door does " +getFirstName() +"choose? ");
        System.out.println();
        System.out.println("(27) The first door");
        System.out.println("(28) The second door");
        System.out.println("(29) The third door");
        System.out.println();
    }

    public void twentyseven(){
        System.out.println();
        System.out.println(getFirstName() +"enters the first door. ");
        System.out.println(heShe(true) +"starts to get really dizzy and falls to the ground...");
        System.out.println();
        System.out.println("(1) Restart!");
        System.out.println();
    }

    public void twentyeight(){
        System.out.println();
        System.out.println(getFirstName() +"enters the second door. ");
        System.out.println("Inside, they find many skeletons of lions.");
        System.out.println("They continue walking and find a map on the wall, with");
        System.out.println("12345 Count lane circled with a big circle");
        System.out.println();
        System.out.println("(31) Follow address");
        System.out.println("(32) Go home");
        System.out.println();
    }

    public void twentynine(){
        System.out.println();
        System.out.println(getFirstName() +"enters the third door. ");
        System.out.println(heShe(true) +"is face to face with many dangerous teens");
        System.out.println(getFirstName() +"and " +fgetFirstName() +"are attacked and killed...");
        System.out.println();
        System.out.println("(1) Restart!");
        System.out.println();
    }

    public void thirty(){
        System.out.println();
        System.out.println("Together, " +getFirstName() +"and " +fgetFirstName() +"crawl into the tunnel. ");
        System.out.println(getFirstName() +"gets embarrassed because " +fgetFirstName() +"is looking at");
        System.out.println(hisHer(false) +"butt. They continue on and discover a cave. ");
        System.out.println();
        System.out.println("(33) Explore cave");
        System.out.println("(34) Turn back");
        System.out.println();
    }

    public void thirtyone(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName() +"arrive at a spooky cave. ");
        System.out.println();
        System.out.println("(33) Explore cave");
        System.out.println("(34) Turn back");
        System.out.println();
    }

    public void thirtytwo(){
        System.out.println();
        System.out.println(getFirstName() +"wants to go home. So,");
        System.out.println(getFirstName() +"and " +fgetFirstName() +"decide to call it a day");
        System.out.println("They return home, exhausted from their journey");
        System.out.println(fgetFirstName() +"and " +getFirstName() +"end up sleeping together ");
        System.out.println(getFirstName() +"thinks: Maybe we'll explore again another day!");
        System.out.println();
        System.out.println("(1) Restart!");
        System.out.println();
    }

    public void thirtythree(){
        System.out.println();
        System.out.println(getFirstName() +"is really scared of the dark so " +heShe(false) +"clings onto");
        System.out.println((fgetFirstName().substring(0,fgetFirstName().length()-1))+". They proceed onwards.");
        System.out.println("Then, they encounter a puzzle!");
        System.out.println();
        System.out.println("(35) Continue");
        System.out.println();
    }

    public void thirtyfour(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName() +"turn back from the cave. ");
        System.out.println("After making their way back home, " +fgetFirstName() +"falls asleep on");
        System.out.print((getFirstName().substring(0,getFirstName().length()-1))+"'s lap. Exhausted, ");
        System.out.println(getFirstName() +"also falls asleep. ");
        System.out.println();
        System.out.println("(1) Restart!");
        System.out.println();
    }

    public void thirtyfive(){
        System.out.println();
        System.out.println("Sudoku, with numbers 1-4");
        System.out.println("   A  B   C  D");
        System.out.println("1 [ ][ ]|[3][ ]");
        System.out.println("2 [1][ ]|[ ][4]");
        System.out.println("  -------------         ");
        System.out.println("3 [ ][ ]|[4][ ]");
        System.out.println("4 [3][ ]|[ ][2]");
        System.out.println("Which number goes in A1?");
        System.out.println();
        System.out.println("(36) Enter One");
        System.out.println("(37) Enter Two");
        System.out.println("(38) Enter Three");
        System.out.println("(39) Enter Four");
        System.out.println();
    }

    public void thirtysix(){
        System.out.println();
        System.out.println(getFirstName()+"enters 1.");
        System.out.println();
        System.out.println("(40) Continue");
        System.out.println();
    }

    public void thirtyseven(){
        System.out.println();
        System.out.println(getFirstName()+"enters 2.");
        System.out.println();
        System.out.println("(40) Continue");
        System.out.println();
    }

    public void thirtyeight(){
        System.out.println();
        System.out.println(getFirstName()+"enters 3.");
        System.out.println();
        System.out.println("(40) Continue");
        System.out.println();
    }

    public void thirtynine(){
        System.out.println();
        System.out.println(getFirstName()+"enters 4.");
        System.out.println();
        System.out.println("(41) Continue");
        System.out.println();
    }

    public void forty(){
        System.out.println();
        System.out.println(getFirstName()+"and " +fgetFirstName() +"fall through the ground!");
        System.out.println();
        System.out.println("(1) Restart!");
        System.out.println("(35) Restart from sudoku!");
        System.out.println();
    }

    public void fortyone(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName() +"look up and watch as a ladder");
        System.out.println("drops down from the ceiling, almost hitting " +fgetFirstName());
        System.out.println("Yelping, " +fgetFirstName() +"jumps back. " +getFirstName() +"props up the ladder");
        System.out.println("underneath a newly formed hole in the ceiling. ");
        System.out.println();
        System.out.println("(42) Climb up");
        System.out.println();
    }

    public void fortytwo(){
        System.out.println();
        System.out.println("After " +getFirstName() +"and " +fgetFirstName() +"climb up, they encounter a treasure chest!");
        System.out.println("Inside is a ring with the following message inscribed on it:");
        System.out.println("128 Goddess Lane");
        System.out.println();
        System.out.println("(43) Go to address");
        System.out.println("(44) Don't go to address");
    }

    public void fortythree(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName() +"end up at a temple");
        System.out.println("<| The Temple Of Nike |> is written on the top of the temple");
        System.out.println(getFirstName() +"and " +fgetFirstName() +"stare at it in awe for a couple minutes");
        System.out.println("The temple had a welcoming aura, so welcoming, that they walk right" );
        System.out.println("into it. Inside, they see a statue of a woman and " +fgetFirstName() +"says...");
        System.out.println("\"Mom?\"");
        System.out.println();
        System.out.println("(46) Continue");
        System.out.println();
    }

    public void fortyfour(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName() +"hear a thump behind them.");
        System.out.println("They both black out...");
        System.out.println();
        System.out.println("(45) Continue");
    }

    public void fortyfive(){
        System.out.println();
        System.out.println(getFirstName() +"wakes up, but finds that " +heShe(false) +"is in a blindfold!");
        System.out.println(heShe(true) +"then hears: \"1 2 3\" and " +hisHer(false) +"blindfold comes off!");
        System.out.println(getFirstName() +"sees " +fgetFirstName() +"standing there, with " +fhisHer(false));
        System.out.println("arms wide open, inviting " +getFirstName() +"in. " +heShe(true) +"accepts!");
        System.out.println(getFirstName() +"sees a banner behind " +(fgetFirstName().substring(0,fgetFirstName().length()-1))+", saying:");
        System.out.println(getMessage() +" " +(getFirstName().substring(0,getFirstName().length()-1) +"! The date was actually " +getDate() +"!"));
        System.out.println(fgetFirstName() +"had planned this out all for " +(himHer(false).substring(0,himHer(false).length()-1) +"! " +getFirstName() +"says:"));
        System.out.println("\"I love you " +(fgetFirstName().substring(0,fgetFirstName().length()-1)) +"!\" " +fheShe(true) +"says,\"I love you too!\"" );
        System.out.println("The End");
    }

    public void fortysix(){
        System.out.println();
        System.out.println(getFirstName() +"looks at " +fgetFirstName() +"in shock.");
        System.out.println("What? " +heShe(true) +"says,\"I thought your mom was a soldier!\"");
        System.out.println(fgetFirstName() +"says,\"She was, which is probably why I only saw her 2-3"); 
        System.out.println("times in my life.\" " +fgetFirstName() +"stutters,\"M-M-Maybe it's just");
        System.out.println("a coinci-cidence.\" " +fgetFirstName() +"checks the statue closer. \"It-it's");
        System.out.println("actually her...\" " +getFirstName() +"says,\"Woahhhh! No wonder you always");
        System.out.println("won bets! That's amaz-\" Before " +getFirstName() +"could finish,");        
        System.out.println("a pack of werewolves appeared... One of them lunges at " +(getFirstName().substring(0,getFirstName().length()-1)) +".");
        System.out.println((getFirstName().substring(0,getFirstName().length()-1))+"...");
        System.out.println();
        System.out.println("(47) Dodge rolls");
        System.out.println("(48) Punches the werewolf ");    
    }

    public void fortyseven(){
        System.out.println();
        System.out.println(getFirstName() +"dodge rolls and calls for " +(fgetFirstName().substring(0,fgetFirstName().length()-1))+", who comes");
        System.out.println("to " +hisHer(false) +"side. " +fgetFirstName() +"picks up a rock, and chucks");
        System.out.println("it into the air. The rock hits the ceiling and breaks into pieces, which ");
        System.out.println("then comes raining down on the werewolves, killing them instantly. ");
        System.out.println(fgetFirstName()+"does a victory dance, which " +getFirstName() +"laughs at. ");
        System.out.println();
        System.out.println("(49) Continue");
        System.out.println();
    }

    public void fortyeight(){
        System.out.println();
        System.out.println(getFirstName() +"punches the werewolf. But, " +heShe(false)+"punches the");
        System.out.println("werewolf's jaws! The werewolf notices " +hisHer(false)+"fist, and bites it off...");
        System.out.println(getFirstName() +"screams in pain and passes out...");
        System.out.println();
        System.out.println("(1) Restart!");
        System.out.println();
    }

    public void fortynine(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName() +"wander farther into the temple. They");
        System.out.println("see many tapestries on the wall, with many vegetables on them. ");
        System.out.println("There were potatoes, potatoes, and even more potatoes. " +fgetFirstName());
        System.out.println("stared at the potatoes in awe. \"Potatoes...\" " +fheShe(false) +"said.");
        System.out.println("As " +fheShe(false) +"said that, " +getFirstName() +"suddenly felt an urge to eat");
        System.out.println("potatoes. " +getFirstName() +"said, \"there must be a spell here, because");
        System.out.println("I'm starting to want to eat potatoes.\" " +fgetFirstName() +"said,");
        System.out.println("\"You always want to eat potatoes.\" " +getFirstName() +"countered, \"But this");
        System.out.println("doesn't feel natural, it-it's really strong this time.\" They see a sack");
        System.out.println("of potatoes in the corner...");
        System.out.println();
        System.out.println("(50) Go to sack");
        System.out.println("(51) Don't go to sack");
        System.out.println();
    }

    public void fifty(){
        System.out.println();
        System.out.println(getFirstName() +"opens up the sack. Inside, " +heShe(false) +"finds");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("potatoes. " +getFirstName() +"dives in, and gives some to " +fgetFirstName().substring(0,fgetFirstName().length()-1) +".");
        System.out.println("They both take a bite out of the potatoes. " +getFirstName() +"starts feeling");
        System.out.println("warm all over " +hisHer(false) +"body. " +heShe(true) +"sees a light and looks over");
        System.out.println("at " +fgetFirstName() +"and notices that " +fheShe(false) +"is in bliss as well. ");
        System.out.println(getFirstName() +"looks up and down, just noticing that " +heShe(false) +"is now floating");
        System.out.println("higher and higher. " +heShe(true) +"tries controlling the flight, and little ");
        System.out.println("by little, " +getFirstName() +"gets the hang of it! " +getFirstName() +"and " +fgetFirstName());
        System.out.println("soar through the skies, higher and higher, till they become gods together! ");
        System.out.println(getFirstName() +"gives " +fgetFirstName() +"the sack of magical potatoes!");
        System.out.println(fgetFirstName() +"is really happy, and gives " +getFirstName() +"a hug!");
        System.out.println();
        System.out.println("(52) Continue");
        System.out.println();
    }

    public void fiftyone(){
        System.out.println();
        System.out.println(getFirstName() +"and " +fgetFirstName() +"decide to ignore the sack of potatoes.");
        System.out.println(getFirstName() +"notices " +himselfHerself(false) +"get hungrier and hungrier, but");
        System.out.println(heShe(false) +"doesn't say anything. They continue exploring the rest of the temple.");
        System.out.println("Pretty soon though, " +getFirstName() +"collapses. " +heShe(true) +"feels awfully hungry. " +fgetFirstName());
        System.out.println("collapses as well. \"We should have eaten those potatoes\" "+getFirstName() +"says.");
        System.out.println();
        System.out.println("(1) Restart!");
        System.out.println();
    }

    public void fiftytwo(){
        System.out.println();
        System.out.println("So, the moral of the story is:");
        System.out.println();
        System.out.println("Potatoes are an amazing present! ");
        System.out.println();
        System.out.println("Congratulations! You reached the end!");
        System.out.println();
    }

    public static void main(String[] args){
        System.out.println("What is your full name? ");
        Scanner input = new Scanner(System.in);
        String namee = input.next();
        String Last = input.next();
        System.out.println("Are you male or female? (m/f)");
        String male = input.next();
        boolean Female = true;
        boolean cont = true;
        if(male.equals("male")||male.equals("m")){
            Female = false;
        }
        int selection=0;
        System.out.println("What is your companion's full name? ");
        String friendF = input.next();
        String friendL = input.next();
        System.out.println("Is your friend male or female? (m/f)");
        String GENDER = input.next();
        boolean fFemale= true;
        if(GENDER.equals("male")||GENDER.equals("m")){
            fFemale = false;
        }
        Present poop = new Present(namee,Last,Female,friendF,friendL,fFemale);
        System.out.println();
        System.out.println("What do you want to do? ");
        System.out.println();
        System.out.println("(1) Start story");
        System.out.println("(2) Exit program (press this at anytime to exit the program)");
        System.out.println();
        while(cont==true){
            try
            {
                selection=input.nextInt();
            } 
            catch ( InputMismatchException e)
            {
                System.exit(0);
            }
            switch(selection)
            {
                case 0: poop.zero();
                break;
                case 1: poop.one();
                break;
                case 2: System.exit(0);
                break;
                case 3: poop.three();
                break;
                case 4: poop.four();
                break;
                case 5: poop.five();
                break;
                case 6: poop.six();
                break;
                case 7: poop.seven();
                break;
                case 8: poop.eight();
                break;
                case 9: poop.nine();
                break;
                case 10: poop.ten();
                break;
                case 11: poop.eleven();
                break;
                case 12: poop.twelve();
                break;
                case 13: poop.thirteen();
                break;
                case 14: poop.fourteen();
                break;
                case 15: poop.fifteen();
                break;
                case 16: poop.sixteen();
                break;
                case 17: poop.seventeen();
                break;
                case 18: poop.eighteen();
                break;
                case 19:poop.nineteen();
                break;
                case 20: poop.twenty();
                break;
                case 21: poop.twentyone();
                break;
                case 22: poop.twentytwo();
                break;
                case 23: poop.twentythree();
                break;
                case 24: poop.twentyfour();
                break;
                case 25: poop.twentyfive();
                break;
                case 26: poop.twentysix();
                break;
                case 27: poop.twentyseven();
                break;
                case 28: poop.twentyeight();
                break;
                case 29: poop.twentynine();
                break;
                case 30: poop.thirty();
                break;
                case 31: poop.thirtyone();
                break;
                case 32: poop.thirtytwo();
                break;
                case 33: poop.thirtythree();
                break;
                case 34: poop.thirtyfour();
                break;
                case 35: poop.thirtyfive();
                break;
                case 36: poop.thirtysix();
                break;
                case 37: poop.thirtyseven();
                break;
                case 38: poop.thirtyeight();
                break;
                case 39: poop.thirtynine();
                break;
                case 40: poop.forty();
                break;
                case 41: poop.fortyone();
                break;
                case 42: poop.fortytwo();
                break;
                case 43: poop.fortythree();
                break;
                case 44: poop.fortyfour();
                break;
                case 45: poop.fortyfive();
                cont = false;
                break;
                case 46: poop.fortysix();
                break;
                case 47: poop.fortyseven();
                break;
                case 48: poop.fortyeight();
                break;
                case 49: poop.fortynine();
                break;
                case 50: poop.fifty();
                break;
                case 51: poop.fiftyone();
                break;
                case 52: poop.fiftytwo();
                cont = false;
                break;
            }
        }
    }
}
