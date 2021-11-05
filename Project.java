/**
 * Project
 */
public class Project {

    public String name;
    public String description;
    public Project(String nameParam, String descriptionParam){
        this.name = nameParam;
        this.description = descriptionParam;
    }
    public String pitch(String name, String description){
        return ("Name: " + name + ", Description: " + description);
    }
}