/**
 * Project
 */
public class Project {
    // Attributes
    private String name;
    private String description;
    
    // Methods
    public String pitch(){
        return ("Name: " + this.name + ", Description: " + this.description);
    }

    // Constructors
    Project(){
        this.name = "no name";
        this.description = "no description";
    }
    Project(String name){
        this.name = name;
        this.description = "no description";
    }
    Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    //getters
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }

}