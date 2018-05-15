package generics.cake;

public abstract class Cake {

    private int portions;

    public Cake(int portions) {
        this.portions = portions;
    }

    public int getPortions() {
        return portions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cake cake = (Cake) o;

        return portions == cake.portions;
    }

    @Override
    public int hashCode() {
        return portions;
    }
}
