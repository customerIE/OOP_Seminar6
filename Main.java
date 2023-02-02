import java.util.logging.*;

public class Main {
        private static final Logger logger = Logger.getLogger(Main.class.getName());
        public static void main(String[] args) {
        
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sf = new SimpleFormatter();
        ch.setFormatter(sf);

        Menu.mainMenu();
        logger.info("Программа выполнена.");
      
    }


}