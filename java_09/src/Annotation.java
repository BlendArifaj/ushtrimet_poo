public class Annotation {
    private int id;
    private Assignment assignment;
    private boolean merged;
}

class LabelAnnotation extends Annotation{
    private Label result;
}

class BoundingBoxAnnotation extends Annotation {
    private int x;
    private int y;
    private int width;
    private int height;

}

class DotAnnotation extends Annotation{
    private int x;
    private int y;
    private Label label;
}