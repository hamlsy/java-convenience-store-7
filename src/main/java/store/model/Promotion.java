package store.model;

import java.time.LocalDateTime;

public class Promotion {
    private String name;
    private int buyAmount;
    private int getAmount;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Promotion(String name, int buy, int get, LocalDateTime startDate, LocalDateTime endDate) {
        this.name = name;
        this.buyAmount = buy;
        this.getAmount = get;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public int getBuyAmount() {
        return buyAmount;
    }

    public int getGetAmount() {
        return getAmount;
    }

}
