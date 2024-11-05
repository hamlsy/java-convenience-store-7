package store.model;

import java.time.LocalDateTime;

public class Promotion {
    private String name;
    private int get;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Promotion(String name, int get, LocalDateTime startDate, LocalDateTime endDate) {
        this.name = name;
        this.get = get;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
