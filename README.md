# Productivity Challenge

### This project arose with the intention of motivating me and my friends to be more productives!

So, I created a competition, calculating the points in the following way:
- Who has less social media time on the week; 📱
- Who missed the least number of days at the gym during the week; 🦾
- Who read at least 50 pages of any book on the week; 📘

The calc:
```java
    public double getPoints() {
        return socialMediaTime - whatsappTime + 2*workoutAbsences + readBook;
    }
```

