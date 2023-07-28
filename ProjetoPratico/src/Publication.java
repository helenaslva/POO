public interface Publication {

    void open();
    void close();
    void nextPage();
    void backPage();
    void leafThrough(int page);

}
