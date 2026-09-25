public class Domino {
    private int ladoA, ladoB;

    public Domino(int a, int b) { setLadoA(a); setLadoB(b); }

    public int getLadoA() { return ladoA; }
    public void setLadoA(int a) { if (a >= 0 && a <= 6) ladoA = a; }
    public int getLadoB() { return ladoB; }
    public void setLadoB(int b) { if (b >= 0 && b <= 6) ladoB = b; }

    public boolean validarJuncao(Domino d) {
        return ladoA == d.ladoA || ladoA == d.ladoB || ladoB == d.ladoA || ladoB == d.ladoB;
    }

    @Override
    public String toString() { return "[" + ladoA + ", " + ladoB + "]"; }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Domino)) return false;
        Domino d = (Domino) o;
        return (ladoA == d.ladoA && ladoB == d.ladoB) || (ladoA == d.ladoB && ladoB == d.ladoA);
    }
}
