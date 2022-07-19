import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Robot {
    static Set<String> usedNames = new HashSet();

    String name;

    public Robot() {
        setName(generateName());
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String generateName() {
        Random random = new Random();

        String generatedName = "";

        generatedName += (char) (random.nextInt(26) + 'A');
        generatedName += (char) (random.nextInt(26) + 'A');
        generatedName += ThreadLocalRandom.current().nextInt(100, 1000);

        if (usedNames.contains(generatedName)) {
            while(usedNames.contains(generatedName)) {
                generatedName = "";
                generatedName += (char) (random.nextInt(26) + 'A');
                generatedName += (char) (random.nextInt(26) + 'A');
                generatedName += ThreadLocalRandom.current().nextInt(100, 1000);
            }
        }
        else {
            usedNames.add(generatedName);
        }
        
        return generatedName;
    }

    void reset() {
        name = generateName();
    }
}
