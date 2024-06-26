package exercise;

// BEGIN
public class LabelTag implements TagInterface {
    private String text;
    private TagInterface child;

    public LabelTag(String text, TagInterface child) {
        this.text = text;
        this.child = child;
    }

    public String render() {
        return "<label>" + text + child.render() + "</label>";
    }

    @Override
    public String toString() {
        return render();
    }
}
// END
