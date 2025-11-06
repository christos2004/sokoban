package sokoban;

import java.util.Objects;

public class Position {
    public final int row;
    public final int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    // Returns a new position after moving by (dr, dc)
    public Position move(int dr, int dc) {
        return new Position(row + dr, col + dc);
    }

    // Checks if two positions are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return row == position.row && col == position.col;
    }

    // Needed for use in hash-based data structures (HashSet, HashMap)
    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }

    // String representation for debugging
    @Override
    public String toString() {
        return "(" + row + "," + col + ")";
    }
}
