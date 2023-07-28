public class Books implements Publication{

    private String title;
    private String autor;
    private int totalPages;
    private int currentPage = 0;
    private boolean opened;
    private Person reader;

    public Books(String title, String autor, int totalPages, Person reader) {
        this.title = title;
        this.autor = autor;
        this.totalPages = totalPages;
        this.reader = reader;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public Person getReader() {
        return reader;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }

    public String details(){
        return "Book: " + '\n' +
                "title = " + title + '\n' +
                "autor =  " + autor + '\n' +
                "totalPages = " + totalPages +  '\n' +
                "currentPage = " + currentPage +  '\n' +
                "opened = " + opened +  '\n' +
                "reader = " + reader.getName() +  '\n' +
                "  age = " + reader.getAge() + '\n' +
                "  gender = " + reader.getGender();
    }


    @Override
    public void open() {
        this.setOpened(true);

    }

    @Override
    public void close() {
        this.setOpened(false);

    }

    @Override
    public void nextPage() {
        if(this.getTotalPages() > this.getCurrentPage()) {
            this.setCurrentPage(this.getCurrentPage() + 1);
        }else{
            System.out.println("You finished this book.");
        }

    }

    @Override
    public void backPage() {
        this.setCurrentPage(this.getCurrentPage() - 1);

    }

    @Override
    public void leafThrough(int page) {
        if(page <= this.getTotalPages()) {
            this.setOpened(true);
            this.setCurrentPage(page);
        }else{
            this.setOpened(true);
            this.setCurrentPage(336);
            System.out.println("This book only has " + this.getTotalPages() + " pages.");
        }

    }
}
