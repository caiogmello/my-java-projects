public class Player implements Comparable<Player> {

    private final String name;
    private double socialMediaTime;
    private double whatsappTime;
    private int workoutAbsences;
    private int readBook = 1;

    public Player(String name) {
        this.name = name;
    }


    public static boolean isNumeric(String s)
    {
        if (s == null || s.equals("")) {
            return false;
        }

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public boolean setSocialMediaTime(String socialMediaTime) {
        String hours = "";
        String minutes = "";

        if(socialMediaTime.length() >= 5) {
            hours = socialMediaTime.substring(0, 2);
            minutes = socialMediaTime.substring(3, 5);
        }

        if(isNumeric(hours) && isNumeric(minutes)) {
            int h = Integer.parseInt(hours);
            double m = Double.parseDouble(minutes)/60;

            this.socialMediaTime = h + m;
            return true;
        }

        System.out.println("Incorrect hour time");
        return false;
    }

    public boolean setWhatsappTime(String whatsappTime) {
        String hours = "";
        String minutes = "";

        if(whatsappTime.length() >= 5) {
            hours = whatsappTime.substring(0, 2);
            minutes = whatsappTime.substring(3, 5);
        }

        if(isNumeric(hours) && isNumeric(minutes)) {
            int h = Integer.parseInt(hours);
            double m = Double.parseDouble(minutes)/60;

            this.whatsappTime = h + m;

            return true;
        }

        System.out.println("Incorrect hour time");
        return false;
    }

    public boolean setWorkoutAbsences(int workoutAbsences) {
        if(workoutAbsences <= 7 && workoutAbsences >= 0) {
            this.workoutAbsences = workoutAbsences;
            return true;
        } else {
            System.out.println("Wrong number");
            return false;
        }

    }

    public void setReadBook(String readBook) {
        if(readBook.toUpperCase().charAt(0) == 'S') {
            this.readBook = -1;
        }
    }

    public String getName() {
        return name;
    }

    public double getPoints() {
        return socialMediaTime - whatsappTime + 2*workoutAbsences + readBook;
    }

    @Override
    public int compareTo(Player player) {
        if(this.getPoints() > player.getPoints()) {
            return 1;
        } else if (this.getPoints() < player.getPoints()) {
            return -1;
        } else {
            return 0;
        }
    }
}
