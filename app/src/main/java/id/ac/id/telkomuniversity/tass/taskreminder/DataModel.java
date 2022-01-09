package id.ac.id.telkomuniversity.tass.taskreminder;

public class DataModel {
    int id;
    private String title;
    private String date;
    private String time;

    DataModel(int id, String title, String date, String time) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.time = time;
    }

    int getId() {
        return id;
    }

    String getTitle() {
        return title;
    }

    String getDate() {
        return date;
    }

    String getTime() {
        return time;
    }

}
