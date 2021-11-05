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
        this.name = "none";
        this.description = "none";
    }
    public Project(String nameParam, String descriptionParam){
        this.name = nameParam;
        this.description = descriptionParam;
    }

}