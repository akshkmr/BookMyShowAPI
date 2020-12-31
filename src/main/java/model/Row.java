package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Row {
    private Integer id;
    private Integer availableCount;

    public Row(int id, int availableCount){
        this.id = id;
        this.availableCount = availableCount;
    }

    public Row(int id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public Integer getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
    }

    public void incrementAvailableCount(int numOfSeats){
        this.setAvailableCount(this.getAvailableCount() + numOfSeats);
    }

    public void decrementAvailableCount(int numOfSeats){
        this.setAvailableCount(this.getAvailableCount() - numOfSeats);
    }
}
