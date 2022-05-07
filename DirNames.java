
public enum DirNames {
    SRC("src"),
    RES("res"),
    SAVEGAMES("savegames"),
    TEMP("temp"),
    MAIN("main"),
    TEST("test"),
    DRAWABLES("drawables"),
    VECTORS("vectors"),
    ICONS("icons");

    String description;

    DirNames(String description) {

        this.description = description;
    }
}