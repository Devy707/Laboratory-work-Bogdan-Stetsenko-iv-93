import java.util.Objects;

public class Letter {
    private char symbol;
    public Letter(char symbol){
        this.symbol = symbol;
    }
    public String toString(){
        return "" + symbol;
    }
    //Object базовый класс

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return symbol == letter.symbol;
    }
}