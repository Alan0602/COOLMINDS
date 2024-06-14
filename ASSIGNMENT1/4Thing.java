public abstract class Thing {
    protected int serialNumber;
    protected String title;

    public Thing(int serialNumber, String title) {
        this.serialNumber = serialNumber;
        this.title = title;
    }

    public abstract String getDescription();
}

 class Audio extends Thing {
    protected String singer;

    public Audio(int serialNumber, String title, String singer) {
        super(serialNumber, title);
        this.singer = singer;
    }

    @Override
    public String getDescription() {
        return "Audio: " + "Serial Number: " + serialNumber + " \nTitle: " + title + " \nSinger: " + singer;
    }
}

class Video extends Thing {
    protected String director;

    public Video(int serialNumber, String title, String director) {
        super(serialNumber, title);
        this.director = director;
    }

    @Override
    public String getDescription() {
        return "Video: " + "Serial Number: " + serialNumber + " \nTitle: " + title + " \nDirector: " + director;
    }
}

class Books extends Thing {
    protected String author;

    public Books(int serialNumber, String title, String author) {
        super(serialNumber, title);
        this.author = author;
    }

    @Override
    public String getDescription() {
        return "Books: " + "Serial Number: " + serialNumber + " \nTitle: " + title + " \nAuthor: " + author;
    }
}
