import java.util.ArrayList;

public class Task {
    private int id;
    private String name;
    private String description;
}

class Label {
    private int id;
    private String value;
}

class LabelTask extends Task{
    private ArrayList<Label> labels;
}

class BoundingBoxTask extends Task{

}
