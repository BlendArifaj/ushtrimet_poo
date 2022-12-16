import java.util.ArrayList;

public class Task {
    private int id;
    private String name;
    private String description;

    public void generateDescription(){
        // TODO: think about it!!!
    }

    public String getAnnotation(){
        return "";
    }
}

class LabelMixin extends Task {
    private ArrayList<Label> labels;
}

class LabelTask extends LabelMixin {
    public String getAnnotation(){
        return "LabelAnnotation";
    }
}

class BoundingBoxTask extends Task {
    private int max_number;
    public String getAnnotation(){
        return "BoundingBoxAnnotation";
    }
}

class DotTask extends LabelMixin {
    private int max_number;
    public String getAnnotation(){
        return "DotAnnotation";
    }
}

