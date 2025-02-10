class Building {
    private int sqft, stories;

    Building(int sqft, int stories) {
        this.sqft = sqft;
        this.stories = stories;
    }

    int getSqft() {
        return sqft;
    }

    int getStories() {
        return stories;
    }

    void setSqft(int sqft) {
        this.sqft = sqft;
    }

    void setStories(int stories) {
        this.stories = stories;
    }
}

class House extends Building {
    private int bedrooms, baths;

    House(int sqft, int stories, int bedrooms, int baths) {
        super(sqft, stories);
        this.bedrooms = bedrooms;
        this.baths = baths;
    }

    int getBedrooms() {
        return bedrooms;
    }

    int getBaths() {
        return baths;
    }

    void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    void setBaths(int baths) {
        this.baths = baths;
    }
}

class School extends Building {
    private int classrooms;
    private String gradeLevel;

    School(int sqft, int stories, int classrooms, String gradeLevel) {
        super(sqft, stories);
        this.classrooms = classrooms;
        this.gradeLevel = gradeLevel;
    }

    int getClassrooms() {
        return classrooms;
    }

    String getGradeLevel() {
        return gradeLevel;
    }

    void setClassrooms(int classrooms) {
        this.classrooms = classrooms;
    }

    void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}

public class Main2 {
    public static void main(String[] args) {
        House h = new House(2500, 2, 4, 3);
        School s = new School(10000, 3, 30, "Elementary");

        System.out.println("House: " + h.getSqft() + " sqft, " + h.getStories() + " stories, " + 
                           h.getBedrooms() + " bedrooms, " + h.getBaths() + " baths");
        
        System.out.println("School: " + s.getSqft() + " sqft, " + s.getStories() + " stories, " + 
                           s.getClassrooms() + " classrooms, " + s.getGradeLevel() + " grade level");
    }
}